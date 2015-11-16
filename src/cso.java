// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cso extends csm
{

    private static final long serialVersionUID = 1L;

    public cso()
    {
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        s = new hts();
        hsy hsy1 = new hsy();
        hsy1.a = s;
        return hsy1;
    }

    public void a(ani ani1, dbo dbo)
    {
        ani1 = String.valueOf(ebw.b(ani1.c()));
        if (ani1.length() != 0)
        {
            ani1 = "GetChatAclSettingsOperation failed for ".concat(ani1);
        } else
        {
            ani1 = new String("GetChatAclSettingsOperation failed for ");
        }
        ebw.e("Babel", ani1, dbo);
    }

    public String g()
    {
        return "getchatacls";
    }
}
