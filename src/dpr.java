// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dpr
    implements hfe
{

    final int a;
    final dpo b;

    dpr(dpo dpo1, int i)
    {
        b = dpo1;
        a = i;
        super();
    }

    public boolean a(hfa hfa, Object obj)
    {
        ((dns)hfa).a((String)obj);
        dpo.c(b).b(a).c("sms_notification_sound_key", (String)obj).d();
        return true;
    }
}
