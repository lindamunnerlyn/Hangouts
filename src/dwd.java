// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dwd
    implements dxl
{

    private dvy a;

    dwd(dvy dvy1)
    {
        a = dvy1;
    }

    void a()
    {
        a = null;
    }

    public void a(boolean flag, boolean flag1)
    {
        g.w();
        if (a != null)
        {
            byte byte0;
            if (flag)
            {
                if (flag1)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 1;
                }
            } else
            {
                byte0 = 3;
            }
            dvy.b(a, byte0);
        }
    }
}
