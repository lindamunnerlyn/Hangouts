// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gfq
{

    public float a;
    public float b;
    public float c;
    public float d;

    public gfq()
    {
    }

    public gfq(byte byte0)
    {
        a = 0.0F;
        b = 0.0F;
        d = 0.0F;
        c = 0.0F;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        obj = (gfq)obj;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (a == ((gfq) (obj)).a)
            {
                flag = flag1;
                if (b == ((gfq) (obj)).b)
                {
                    flag = flag1;
                    if (d == ((gfq) (obj)).d)
                    {
                        flag = flag1;
                        if (c == ((gfq) (obj)).c)
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
