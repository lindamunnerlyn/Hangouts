// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class acy
{

    private final hm a = new hm();

    protected acy()
    {
    }

    public Object a(Object obj)
    {
        if (obj != null)
        {
            obj = (acz)a.get(obj);
            if (obj != null)
            {
                obj.a = ((acz) (obj)).a + 1;
                return ((acz) (obj)).b;
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
        acz acz1 = new acz();
        acz1.b = obj1;
        a.put(obj, acz1);
        return true;
    }

    public Object b(Object obj)
    {
        obj = (acz)a.remove(obj);
        if (obj != null)
        {
            return ((acz) (obj)).b;
        } else
        {
            return null;
        }
    }
}
