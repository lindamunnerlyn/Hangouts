// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bsz
{

    bsz()
    {
    }

    static boolean a(int i)
    {
        aoa aoa = dcn.e(i);
        if (aoa == null)
        {
            eev.f("Babel_call_logs", "Account null.");
        }
        return aoa != null && g.c(aoa);
    }

    public bwk[] a()
    {
        return (new bwk[] {
            new bta(this)
        });
    }

    public bwl[] b()
    {
        return (new bwl[] {
            new btb(this)
        });
    }
}
