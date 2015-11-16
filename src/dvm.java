// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dvm
    implements Runnable
{

    final dvl a;

    dvm(dvl dvl1)
    {
        a = dvl1;
        super();
    }

    public void run()
    {
        a.a();
    }
}
