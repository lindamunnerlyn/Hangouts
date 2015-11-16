// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dbx
    implements dij
{

    dbx()
    {
    }

    public void a(grd grd1, czm czm1)
    {
        boolean flag = false;
        if (czm1.k() == 1)
        {
            flag = czm1.p();
        }
        czm1 = String.valueOf(eev.b(grd1.b("account_name")));
        eev.c("Babel", (new StringBuilder(String.valueOf(czm1).length() + 87)).append("PstnUtilImpl.setAccountIsRegisteredForIncomingPstnCalls, account: ").append(czm1).append(", isRegistered: ").append(flag).toString());
        grd1.b("registered_for_incoming_pstn_calls", flag);
    }
}
