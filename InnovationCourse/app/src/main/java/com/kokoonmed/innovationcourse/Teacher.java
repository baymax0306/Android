package com.kokoonmed.innovationcourse;

/**
 * Created by Administrator on 2017/3/10.
 */
import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name;
    private int imageid;
    private String desc;


    private Teacher(String name, int imageid, String desc)
    {
        this.name = name;
        this.imageid = imageid;
        this.desc = desc;
    }

    public static List<Teacher> getAllTeachers()
    {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("黄湘波", R.drawable.hxb, "黄湘波, 大神"));
        teachers.add(new Teacher("潘桂林", R.drawable.pgl, "潘桂林, 喜欢发黄图"));
        teachers.add(new Teacher("陈子文", R.drawable.czw, "陈子文, 这小伙儿可以哦"));
        teachers.add(new Teacher("唐飞", R.drawable.tf, "唐飞, 老司机"));
        teachers.add(new Teacher("钟惟昌", R.drawable.zwc, "会喊666的菜鸟"));

        return teachers;
    }




    //以下是访问内部属性的getter和setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getImageid()
    {
        return imageid;
    }

    public void setImageid(int imageid)
    {
        this.imageid = imageid;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}



















