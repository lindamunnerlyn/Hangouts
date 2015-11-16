// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dxw
    implements Runnable
{

    final dxv a;

    dxw(dxv dxv1)
    {
        a = dxv1;
        super();
    }

    public void run()
    {
        eev.g("Babel_telephony", "TeleHandoffController, handoff timed out");
        a.a = true;
        a.h();
    }
}
