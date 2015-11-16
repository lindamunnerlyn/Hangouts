// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jre
    implements jrg
{

    int a;
    int b;
    int c;
    boolean d;
    final jgb e;
    final jrg f;
    final jrd g;

    jre(jrd jrd1, jrg jrg1)
    {
        g = jrd1;
        f = jrg1;
        super();
        a = 0;
        b = 0;
        c = 0;
        d = false;
        e = g.a();
    }

    public int a()
    {
        byte byte0 = -1;
        int i;
label0:
        do
        {
            char c1;
            do
            {
                i = f.a();
                if (i == -1)
                {
                    i = byte0;
                    if (!d)
                    {
                        i = byte0;
                        if (!jrd.a(g).a(c))
                        {
                            throw new jrc((new StringBuilder("Invalid input length ")).append(c).toString());
                        }
                    }
                    break label0;
                }
                c = c + 1;
                c1 = (char)i;
                if (!e.b(c1))
                {
                    break;
                }
                if (!d && (c == 1 || !jrd.a(g).a(c - 1)))
                {
                    throw new jrc((new StringBuilder("Padding cannot start at index ")).append(c).toString());
                }
                d = true;
            } while (true);
            if (d)
            {
                throw new jrc((new StringBuilder("Expected padding character but found '")).append(c1).append("' at index ").append(c).toString());
            }
            a = a << jrd.a(g).r;
            i = a;
            a = jrd.a(g).c(c1) | i;
            b = b + jrd.a(g).r;
            if (b < 8)
            {
                continue;
            }
            b = b - 8;
            i = a >> b & 0xff;
            break;
        } while (true);
        return i;
    }
}
