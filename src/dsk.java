// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dsk
    implements hjv
{

    final int a;
    final dsh b;

    dsk(dsh dsh1, int i)
    {
        b = dsh1;
        a = i;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        ((dql)hjr).a((String)obj);
        dsh.c(b).b(a).c("sms_notification_sound_key", (String)obj).d();
        return true;
    }
}
