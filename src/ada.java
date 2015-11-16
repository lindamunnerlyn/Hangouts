// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ada
{

    private final hm a = new hm();

    protected ada()
    {
    }

    public Object a(Object obj)
    {
        if (obj != null)
        {
            obj = (adb)a.get(obj);
            if (obj != null)
            {
                obj.a = ((adb) (obj)).a + 1;
                return ((adb) (obj)).b;
            }
        }
        return null;
    }

    public void a()
    {
        a.clear();
    }

    public boolean a(Object obj, Object obj1)
    {
        while (a.size() >= 500 || obj == null) 
        {
            return false;
        }
        adb adb1 = new adb();
        adb1.b = obj1;
        a.put(obj, adb1);
        return true;
    }

    public Object b(Object obj)
    {
        obj = (adb)a.remove(obj);
        if (obj != null)
        {
            return ((adb) (obj)).b;
        } else
        {
            return null;
        }
    }
}
