// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gdc
{

    public float a;
    public float b;
    public float c;
    public float d;

    public gdc()
    {
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        obj = (gdc)obj;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (a == ((gdc) (obj)).a)
            {
                flag = flag1;
                if (b == ((gdc) (obj)).b)
                {
                    flag = flag1;
                    if (d == ((gdc) (obj)).d)
                    {
                        flag = flag1;
                        if (c == ((gdc) (obj)).c)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(32);
        stringbuilder.append("FloatRect(");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append(b);
        stringbuilder.append(" - ");
        stringbuilder.append(d);
        stringbuilder.append(", ");
        stringbuilder.append(c);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
