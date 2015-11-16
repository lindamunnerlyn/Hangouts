// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxz extends cxr
{

    private static final long serialVersionUID = 1L;
    private String g[];

    private cxz(iyn iyn1)
    {
        super(iyn1.responseHeader, -1L);
        g = new String[iyn1.a.length];
        for (int i = 0; i < g.length; i++)
        {
            g[i] = iyn1.a[i].b;
        }

        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("DismissSuggestedContactsResponse debugUrl: ");
            iyn1 = String.valueOf(iyn1.responseHeader.c);
            if (iyn1.length() != 0)
            {
                iyn1 = s.concat(iyn1);
            } else
            {
                iyn1 = new String(s);
            }
            eev.d("Babel", iyn1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (iyn)kws.mergeFrom(new iyn(), abyte0);
        if (a(((iyn) (abyte0)).responseHeader))
        {
            return new cyd(((iyn) (abyte0)).responseHeader);
        } else
        {
            return new cxz(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        aow1.a();
        int j;
        dgk = g;
        j = dgk.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aow1.M(dgk[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aow1.b();
        aow1.c();
        aoc.b(g.nU, aow1.f().h(), "hash_people_you_hangout_with");
        aoc.b(g.nU, aow1.f().h(), "hash_favorites");
        return;
        dgk;
        aow1.c();
        throw dgk;
    }
}
