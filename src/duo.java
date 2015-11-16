// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class duo
    implements Runnable
{

    final dun a;

    duo(dun dun1)
    {
        a = dun1;
        super();
    }

    public void run()
    {
        ebw.g("Babel_telephony", "TeleHandoffController, handoff timed out");
        a.a = true;
        a.h();
    }
}
