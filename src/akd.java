// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class akd
    implements ajr
{

    final akb a;
    final akc b;

    akd(akc akc1, akb akb)
    {
        b = akc1;
        a = akb;
        super();
    }

    public void a(ajo ajo)
    {
        b.a.runOnUiThread(new ake(this, ajo));
    }
}
