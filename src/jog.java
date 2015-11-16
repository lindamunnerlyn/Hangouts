// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jog extends jnv
{

    private static final long serialVersionUID = 0L;
    private final Object a;

    jog(Object obj)
    {
        a = obj;
    }

    public Object a(Object obj)
    {
        n.b(obj, "use Optional.orNull() instead of Optional.or(null)");
        return a;
    }

    public boolean b()
    {
        return true;
    }

    public Object c()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof jog)
        {
            obj = (jog)obj;
            return a.equals(((jog) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return 0x598df91c + a.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(a);
        return (new StringBuilder(String.valueOf(s).length() + 13)).append("Optional.of(").append(s).append(")").toString();
    }
}
