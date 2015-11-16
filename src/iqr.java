// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iqr extends iql
{

    private final int a;

    iqr(int i)
    {
        a = i;
    }

    public int a()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof iql)
            {
                if (a != ((iql) (obj = (iql)obj)).a())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return 0xf4243 ^ a;
    }

    public String toString()
    {
        String s = String.valueOf("AccountId{id=");
        int i = a;
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(i).append("}").toString();
    }
}
