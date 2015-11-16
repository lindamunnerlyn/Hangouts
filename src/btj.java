// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class btj
    implements bpf
{

    final bpe a;
    final btf b;

    btj(btf btf, bpe bpe1)
    {
        b = btf;
        a = bpe1;
        super();
    }

    public void a(bpm bpm)
    {
    }

    public void a(gmt gmt1)
    {
        boolean flag;
        if (!gmt1.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.a() != flag)
        {
            a.a(flag);
        }
    }
}
