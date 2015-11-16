// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class jsv extends jth
{

    jsv()
    {
    }

    boolean I_()
    {
        return b().i();
    }

    abstract jso b();

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            Object obj1 = b().get(((java.util.Map.Entry) (obj)).getKey());
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    boolean e()
    {
        return false;
    }

    public int hashCode()
    {
        return b().hashCode();
    }

    public int size()
    {
        return b().size();
    }

    Object writeReplace()
    {
        return new jsw(b());
    }
}
