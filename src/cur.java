// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cur extends cup
{

    private static final long serialVersionUID = 1L;

    public cur()
    {
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        s = new hyw();
        hyc hyc1 = new hyc();
        hyc1.a = s;
        return hyc1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        aoa1 = String.valueOf(eev.b(aoa1.c()));
        if (aoa1.length() != 0)
        {
            aoa1 = "GetChatAclSettingsOperation failed for ".concat(aoa1);
        } else
        {
            aoa1 = new String("GetChatAclSettingsOperation failed for ");
        }
        eev.e("Babel", aoa1, dcx);
    }

    public String f()
    {
        return "getchatacls";
    }
}
