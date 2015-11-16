// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class btv
    implements bpf
{

    final bpe a;
    final btp b;

    btv(btp btp1, bpe bpe1)
    {
        b = btp1;
        a = bpe1;
        super();
    }

    public void a(bpm bpm)
    {
        a.b(b.a(bpm));
    }

    public void a(gmt gmt1)
    {
        if (gmt1.g())
        {
            btp.b(b, a);
        }
    }
}
