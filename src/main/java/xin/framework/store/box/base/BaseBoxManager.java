/*
 * Copyright 2017  (王照鑫 xin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xin.framework.store.box.base;


import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;
import io.objectbox.query.QueryBuilder;
import xin.framework.configs.DBConfig;

/**
 * Box统一管理
 * <p>
 * 邮箱：ittfxin@126.com
 * <p>
 * https://github.com/wzx54321/XinFrameworkLib
 * <p>
 *
 * @param <T> 数据库表实体类
 * @author xin
 */
public abstract class BaseBoxManager<T> {


    private Box<T> mBox;

    /**
     * 使用默认的BoxStore
     * @param entityClazz
     */
    @SuppressWarnings("WeakerAccess")
    public BaseBoxManager(Class<T> entityClazz) {
        this(entityClazz, DBConfig.getBoxStore());

    }

    /**
     * 使用工程内自创建的BoxStore{@link MyObjectBox#builder()#androidContext(context)#build()}
     * MyObjectBox为自动生成，对应导入自定义的路径
     * @param entityClazz
     */
    @SuppressWarnings("WeakerAccess")
    public BaseBoxManager(Class<T> entityClazz, BoxStore boxStore) {
        mBox = boxStore.boxFor(entityClazz);

    }


    protected final void closeDatabase() {
        mBox.closeThreadResources();
    }

    /**
     * 插入一条记录
     *
     * @return The ID of the object within its box.
     */
    @SuppressWarnings("UnusedReturnValue")
    public long insert(T entity) {
        if (entity == null) return -1;

        return mBox.put(entity);


    }


    /**
     * 插入多条记录
     */
    public void insert(List<T> entities) {
        if (entities != null)

            mBox.put(entities);

    }


    /**
     * 删除所有数据
     */
    public void deleteAll() {
        mBox.removeAll();
    }


    /**
     * 根据条件删除数据库中的数据
     */
    public void delete(T object) {
        mBox.remove(object);
    }

    /**
     * 删除多条数据
     */
    public void deleteList(List<T> objects) {
        mBox.remove(objects);
    }


    /**
     * 更新一条记录
     */
    public long update(T object) {

        return mBox.put(object);
    }

    /**
     * 更新一条记录
     */
    public void update(List<T> objects) {
        mBox.put(objects);
    }

    /**
     * @return Returns a builder to create queries for Object matching supplied criteria.
     */
    public QueryBuilder<T> getQueryBuilder() {
        return mBox.query();
    }

    /**
     * 查询并返回所有对象的集合
     */
    public List<T> queryAll() {
        return getQueryBuilder().build().find();
    }

    /**
     * 查询并返回 第一个对象
     */
    public T QueryFirst() {
        return getQueryBuilder().build().findFirst();
    }


    /**
     * 获取对应的表名
     */
    public abstract String getTableName();


    /**
     * 获取真实的box
     */
    public Box<T> getRealBox() {
        return mBox;
    }


}
