// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.util.ByteArrayBuffer;

public final class lcn
{

    private static final ByteArrayBuffer a;
    private static final ByteArrayBuffer b;
    private static final ByteArrayBuffer c;
    private final String d;
    private final Charset e;
    private final String f;
    private final List g;
    private final int h;

    public lcn(String s, Charset charset, String s1, int i)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Multipart boundary may not be null");
        } else
        {
            d = s;
            e = lcq.a;
            f = s1;
            g = new ArrayList();
            h = i;
            return;
        }
    }

    private static ByteArrayBuffer a(Charset charset, String s)
    {
        charset = charset.encode(CharBuffer.wrap(s));
        s = new ByteArrayBuffer(charset.remaining());
        s.append(charset.array(), charset.position(), charset.remaining());
        return s;
    }

    private void a(int i, OutputStream outputstream, boolean flag)
    {
        ByteArrayBuffer bytearraybuffer;
        Iterator iterator;
        bytearraybuffer = a(e, f);
        iterator = g.iterator();
_L2:
        lcl lcl1;
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_248;
        }
        lcl1 = (lcl)iterator.next();
        a(c, outputstream);
        a(bytearraybuffer, outputstream);
        a(b, outputstream);
        obj = lcl1.b();
        switch (lco.a[i - 1])
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_198;
_L3:
        a(b, outputstream);
        if (flag)
        {
            lcl1.a().a(outputstream);
        }
        a(b, outputstream);
        if (true) goto _L2; else goto _L1
_L1:
        obj = ((lcm) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            lcr lcr1 = (lcr)((Iterator) (obj)).next();
            a(lcr1.a(), outputstream);
            a(a, outputstream);
            a(lcr1.b(), outputstream);
            a(b, outputstream);
        }
          goto _L3
        a(lcl1.b().a("Content-Disposition"), e, outputstream);
        if (lcl1.a().e() != null)
        {
            a(lcl1.b().a("Content-Type"), e, outputstream);
        }
          goto _L3
        a(c, outputstream);
        a(bytearraybuffer, outputstream);
        a(c, outputstream);
        a(b, outputstream);
        return;
    }

    private static void a(String s, OutputStream outputstream)
    {
        a(a(lcq.a, s), outputstream);
    }

    private static void a(String s, Charset charset, OutputStream outputstream)
    {
        a(a(charset, s), outputstream);
    }

    private static void a(lcr lcr1, Charset charset, OutputStream outputstream)
    {
        a(lcr1.a(), charset, outputstream);
        a(a, outputstream);
        a(lcr1.b(), charset, outputstream);
        a(b, outputstream);
    }

    private static void a(ByteArrayBuffer bytearraybuffer, OutputStream outputstream)
    {
        outputstream.write(bytearraybuffer.buffer(), 0, bytearraybuffer.length());
    }

    public List a()
    {
        return g;
    }

    public void a(OutputStream outputstream)
    {
        a(h, outputstream, true);
    }

    public void a(lcl lcl1)
    {
        if (lcl1 == null)
        {
            return;
        } else
        {
            g.add(lcl1);
            return;
        }
    }

    public long b()
    {
        Object obj = g.iterator();
        long l = 0L;
        while (((Iterator) (obj)).hasNext()) 
        {
            long l1 = ((lcl)((Iterator) (obj)).next()).a().d();
            if (l1 >= 0L)
            {
                l = l1 + l;
            } else
            {
                return -1L;
            }
        }
        obj = new ByteArrayOutputStream();
        int i;
        try
        {
            a(h, ((OutputStream) (obj)), false);
            i = ((ByteArrayOutputStream) (obj)).toByteArray().length;
        }
        catch (IOException ioexception)
        {
            return -1L;
        }
        return (long)i + l;
    }

    static 
    {
        a = a(lcq.a, ": ");
        b = a(lcq.a, "\r\n");
        c = a(lcq.a, "--");
    }
}
