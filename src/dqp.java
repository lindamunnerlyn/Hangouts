// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class dqp
{

    public dqp()
    {
    }

    public abstract int a();

    public abstract long b();

    public abstract long c();

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof dqp))
        {
            if (a() == ((dqp) (obj = (dqp)obj)).a() && b() == ((dqp) (obj)).b())
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        String s = String.valueOf(Integer.toString(a()));
        String s1 = String.valueOf(Long.toString(b()));
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return s.hashCode();
    }
}
