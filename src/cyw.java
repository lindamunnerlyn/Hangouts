// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cyw extends cys
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final String b;
    public final List f;
    public final List g;
    public final List h;
    public final String i;
    public final int j;
    public final int k;
    public final int l[];
    public final cey m;
    public final czv n;
    public final boolean o;
    public final int p;
    public final int q;
    public final long r;
    public long s;
    public final byte t[];
    public final int u;
    public final Boolean v;
    public final boolean w;
    public final List x;
    public cry y;

    public cyw(irb irb1)
    {
        super(irb1.a.a, null, -1L);
        Object obj;
        ArrayList arraylist;
        int k1;
        try
        {
            obj = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception = null;
        }
        if (obj != null)
        {
            ((MessageDigest) (obj)).update(irb.toByteArray(irb1));
            t = ((MessageDigest) (obj)).digest();
        } else
        {
            t = null;
        }
        a = g.a(irb1.c, 0);
        b = irb1.d;
        obj = irb1.g;
        arraylist = new ArrayList();
        k1 = obj.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            arraylist.add(new czv(obj[i1]));
        }

        g = arraylist;
        h = crv.a(irb1.l);
        f = g.a(irb1.k, irb1.l);
        o = g.a(irb1.h, false);
        p = g.a(irb1.i, 0);
        q = g.a(irb1.j, 1);
        if (irb1.f != null)
        {
            irc irc1 = irb1.f;
            Object obj1;
            if (g.a(irc1.b, 0L) != 0L)
            {
                obj1 = aoe.a(g.a(irc1.b, 0L));
            } else
            {
                obj1 = null;
            }
            i = ((String) (obj1));
            j = g.a(irc1.c, 0);
            k = g.a(irc1.a, 0);
            if (irc1.d.length > 0)
            {
                obj1 = irc1.d;
            } else
            {
                obj1 = null;
            }
            l = ((int []) (obj1));
            m = g.a(irc1.e, null);
            if (irc1.g != null)
            {
                obj1 = new czv(irc1.g);
            } else
            {
                obj1 = null;
            }
            n = ((czv) (obj1));
            r = g.a(irc1.h, 0L);
            s = g.a(irc1.j, 0L);
            u = g.a(irc1.k, 0);
            if (g.a(irc1.l, false))
            {
                obj1 = Boolean.FALSE;
            } else
            {
                obj1 = null;
            }
            v = ((Boolean) (obj1));
            w = g.a(irb1.m, false);
            if (irc1.m.length == 1)
            {
                x = null;
                y = new cry(irc1.m[0].a);
                return;
            }
            if (irc1.m.length > 1)
            {
                x = new ArrayList(irc1.m.length);
                int j1 = 0;
                irb1 = null;
                for (; j1 < irc1.m.length; j1++)
                {
                    cry cry1 = new cry(irc1.m[j1].a);
                    x.add(cry1);
                    if (irb1 == null || g.a(irc1.m[j1].b, false))
                    {
                        irb1 = cry1;
                    }
                }

                y = irb1;
                return;
            } else
            {
                x = null;
                y = null;
                return;
            }
        } else
        {
            i = null;
            j = 30;
            k = 2;
            l = null;
            m = null;
            n = null;
            r = 0L;
            s = 0L;
            u = 2;
            v = null;
            w = false;
            x = null;
            y = null;
            return;
        }
    }

    public cyw(irb irb1, byte byte0)
    {
        this(irb1);
    }

    public void a(long l1)
    {
        s = l1;
    }

    public void a(String s1)
    {
        Object obj = h.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (TextUtils.isEmpty(((crv)((Iterator) (obj)).next()).b))
            {
                continue;
            }
            obj = new isa();
            obj.a = Integer.valueOf(2);
            obj.b = new jtj();
            ((isa) (obj)).b.a = s1;
            y = new cry(((isa) (obj)));
            break;
        } while (true);
    }

    public boolean a()
    {
        return s > 0L;
    }

    public String toString()
    {
        String s1 = String.valueOf(c);
        String s2;
        int i1;
        if (s1.length() != 0)
        {
            s1 = "C[".concat(s1);
        } else
        {
            s1 = new String("C[");
        }
        s1 = String.valueOf(s1);
        s2 = i;
        s1 = String.valueOf((new StringBuilder(String.valueOf(s1).length() + 18 + String.valueOf(s2).length())).append(s1).append("; clientGenerated=").append(s2).toString());
        i1 = j;
        return String.valueOf((new StringBuilder(String.valueOf(s1).length() + 31)).append(s1).append("; notificationLevel=").append(i1).toString()).concat("]");
    }
}
