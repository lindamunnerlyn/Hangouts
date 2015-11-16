// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class drv
{

    private int a;
    private int b;

    public drv()
    {
    }

    public void a(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        a = i;
        b = 0;
    }

    public boolean a()
    {
        return a > 0;
    }

    public int b()
    {
        return b;
    }

    public void b(int i)
    {
        a = a - 1;
        i;
        JVM INSTR tableswitch -1 4: default 48
    //                   -1 64
    //                   0 48
    //                   1 48
    //                   2 69
    //                   3 48
    //                   4 69;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L3
_L1:
        i = 2;
_L5:
        if (i > b)
        {
            b = i;
        }
        return;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        i = 1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SendResult:");
        stringbuilder.append("Pending=").append(a).append(",");
        stringbuilder.append("HighestFailureLevel=").append(b);
        return stringbuilder.toString();
    }
}
