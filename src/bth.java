// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bth
    implements bpf
{

    final boolean a;
    final bpe b;
    final btf c;

    bth(btf btf, boolean flag, bpe bpe1)
    {
        c = btf;
        a = flag;
        b = bpe1;
        super();
    }

    public void a(bpm bpm)
    {
    }

    public void a(gmt gmt1)
    {
        boolean flag;
        if (!gmt1.n() && a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b.a() != flag)
        {
            b.a(flag);
        }
    }
}
