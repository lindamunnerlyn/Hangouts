// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzn
    implements eav
{

    private dzh a;

    dzn(dzh dzh1)
    {
        a = dzh1;
    }

    void a()
    {
        a = null;
    }

    public void a(boolean flag, boolean flag1)
    {
        g.v();
        if (a != null)
        {
            dzh dzh1;
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
            dzh1 = a;
            eev.e("Babel_telephony", (new StringBuilder(83)).append("TeleSetupController.performWifiChooserWithRoamingStatus, roamingStatus: ").append(byte0).toString());
            if (byte0 != 3)
            {
                dzh1.b.f().a(new dyq(dzh1.a, byte0));
            }
            dzh1.g = new dzm(dzh1);
            dxb.a(dzh1.a, dzh1.g);
        }
    }
}
