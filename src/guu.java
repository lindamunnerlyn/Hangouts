// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.ResponseTooLargeException;

public abstract class guu extends hcv
    implements hbg, HttpUrlRequestListener
{

    private long A;
    private String B;
    private String C;
    private String D;
    private String E;
    private int F;
    public final gvb a;
    private gux k;
    private HttpUrlRequest l;
    private String m;
    private File n;
    private boolean o;
    private hbm p;
    private long q;
    private long r;
    private String s;
    private long t;
    private long u;
    private String v;
    private String w;
    private int x;
    private String y;
    private int z;

    public guu(gvb gvb1, guy guy1)
    {
        super(gvb1, guy1);
        z = -1;
        F = 0;
        a = gvb1;
    }

    private static int a(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return bitmap.getAllocationByteCount();
        } else
        {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    static hcx a(guu guu1)
    {
        return guu1.c;
    }

    private String a(String s1, boolean flag)
    {
        try
        {
            String s2 = String.valueOf(s1);
            String s4 = String.valueOf("u");
            if (s4.length() != 0)
            {
                s2 = s2.concat(s4);
            } else
            {
                s2 = new String(s2);
            }
            return hkv.a(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return a();
        }
        catch (IOException ioexception)
        {
            a("Cannot obtain download URL for partial file", ((Throwable) (ioexception)));
        }
        if (flag)
        {
            n.delete();
            s1 = String.valueOf(s1);
            String s3 = String.valueOf("u");
            if (s3.length() != 0)
            {
                s1 = s1.concat(s3);
            } else
            {
                s1 = new String(s1);
            }
            (new File(s1)).delete();
        }
        return a();
    }

    private void a(String s1, ByteBuffer bytebuffer, boolean flag, boolean flag1)
    {
        if (flag && !b(s1, flag1))
        {
            return;
        }
        guh guh1;
        if (flag1)
        {
            guh1 = a.c();
        } else
        {
            guh1 = a.b();
        }
        guh1.a(s1, bytebuffer);
    }

    private void b(ByteBuffer bytebuffer)
    {
        Object obj;
        boolean flag;
        obj = (guy)c;
        if (e != 2 && e != 1)
        {
            if (z())
            {
                bytebuffer = String.valueOf(c);
                obj = String.valueOf(x());
                (new StringBuilder(String.valueOf(bytebuffer).length() + 53 + String.valueOf(obj).length())).append("Resource no longer needed, not delivering: ").append(bytebuffer).append(", status: ").append(((String) (obj)));
            }
            return;
        }
        if ((((guy) (obj)).b & 2) != 0)
        {
            if (z())
            {
                bytebuffer = String.valueOf(c);
                obj = String.valueOf(h());
                (new StringBuilder(String.valueOf(bytebuffer).length() + 48 + String.valueOf(obj).length())).append("Completing a download-only request: ").append(bytebuffer).append(" file name: ").append(((String) (obj)));
            }
            a.a(this, 1, h());
            return;
        }
        if ((((guy) (obj)).b & 8) != 0)
        {
            if (z())
            {
                obj = String.valueOf(c);
                (new StringBuilder(String.valueOf(obj).length() + 56)).append("Image decoding disabled. Delivering bytes to consumers: ").append(((String) (obj)));
            }
            a.a(this, 1, g.a(bytebuffer));
            return;
        }
        try
        {
            flag = guo.a(bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            if (z())
            {
                bytebuffer = String.valueOf(c);
                (new StringBuilder(String.valueOf(bytebuffer).length() + 36)).append("Out of memory while decoding image: ").append(bytebuffer);
            }
            g.a(new guv(this));
            a.a(this, 6, null);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        h = 2;
        if ((((guy) (obj)).b & 4) != 0 && (((guy) (obj)).b & 0x20) == 0 && gur.a(bytebuffer))
        {
            c(new gur(FrameSequence.decodeByteBuffer(bytebuffer)));
            return;
        }
        if ((((guy) (obj)).b & 4) == 0 || !flag)
        {
            break MISSING_BLOCK_LABEL_402;
        }
        c(new guo(bytebuffer));
        return;
        if ((((guy)c).b & 0x40) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bytebuffer = ((ByteBuffer) (a(bytebuffer, flag)));
        if (bytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        if (z())
        {
            String s1 = String.valueOf(c);
            (new StringBuilder(String.valueOf(s1).length() + 31)).append("Delivering image to consumers: ").append(s1);
        }
        c(bytebuffer);
        return;
        if (z())
        {
            bytebuffer = String.valueOf(c);
            (new StringBuilder(String.valueOf(bytebuffer).length() + 26)).append("Bad image; cannot decode: ").append(bytebuffer);
        }
        bytebuffer = h();
        if (bytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        bytebuffer.delete();
        a.a(this, 5);
        return;
    }

    private boolean b(String s1, boolean flag)
    {
        guh guh1;
        String s2;
        String s3;
        if (flag)
        {
            guh1 = a.c();
        } else
        {
            guh1 = a.b();
        }
        s2 = String.valueOf(s1);
        s3 = String.valueOf("u");
        if (s3.length() != 0)
        {
            s2 = s2.concat(s3);
        } else
        {
            s2 = new String(s2);
        }
        s2 = guh1.b(s2);
        try
        {
            hkv.a(s2, m);
        }
        catch (IOException ioexception)
        {
            a("Cannot save download URL", ioexception);
            (new File(guh1.b(s1))).delete();
            return false;
        }
        return true;
    }

    private static boolean t()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    protected Object a(ByteBuffer bytebuffer, boolean flag)
    {
        bytebuffer = ((ByteBuffer) (a.a(this, bytebuffer)));
        if (k != null)
        {
            return k.a((guy)c, bytebuffer);
        } else
        {
            return bytebuffer;
        }
    }

    public abstract String a();

    public void a(int i1)
    {
        l();
        super.a(i1);
    }

    public void a(int i1, String s1)
    {
        l();
        super.a(i1, s1);
    }

    public void a(long l1, long l2)
    {
    }

    public void a(long l1, String s1, int i1, int j1, int k1, Bitmap bitmap)
    {
        u = SystemClock.currentThreadTimeMillis() - l1;
        l1 = u;
        v = (new StringBuilder(23)).append(l1).append(" ms").toString();
        w = s1;
        x = i1;
        if (z())
        {
            String s2;
            if (bitmap == null)
            {
                bitmap = "null";
            } else
            {
                int i2 = bitmap.getWidth();
                int j2 = bitmap.getHeight();
                bitmap = (new StringBuilder(25)).append("[").append(i2).append("x").append(j2).append("]").toString();
            }
            s2 = v;
            (new StringBuilder(String.valueOf(s1).length() + 80 + String.valueOf(bitmap).length() + String.valueOf(s2).length())).append("Decoded ").append(i1).append(" byte ").append(s1).append(" from source [").append(j1).append("x").append(k1).append("] into bitmap ").append(bitmap).append(" in ").append(s2);
        }
        B = null;
        C = null;
        D = null;
        E = null;
    }

    public void a(gux gux1)
    {
        k = gux1;
    }

    public void a(Object obj)
    {
        Object obj1 = (guy)c;
        if ((((guy) (obj1)).b & 2) != 0)
        {
            l();
            if (o)
            {
                obj = n;
                String s2 = n.getName();
                boolean flag;
                if ((((guy) (obj1)).b & 0x400) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b(s2, flag);
            } else
            {
                obj = h();
                n.renameTo(((File) (obj)));
            }
            if (z())
            {
                obj1 = String.valueOf(c);
                s2 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(obj1).length() + 48 + String.valueOf(s2).length())).append("Completing a download-only request: ").append(((String) (obj1))).append(" file name: ").append(s2);
            }
            a.a(this, 1, obj);
            return;
        }
        obj = (ByteBuffer)obj;
        if (z())
        {
            int i1 = ((ByteBuffer) (obj)).remaining();
            String s1 = String.valueOf(c);
            (new StringBuilder(String.valueOf(s1).length() + 47)).append("Delivering data: ").append(s1).append("; buffer has ").append(i1).append(" bytes");
        }
        a(((ByteBuffer) (obj)));
    }

    protected void a(StringBuilder stringbuilder)
    {
        stringbuilder.append("\n  Size:").append(q());
    }

    public void a(ByteBuffer bytebuffer)
    {
        boolean flag1 = false;
        if (bytebuffer != null)
        {
            Object obj = (guy)c;
            l();
            if (n != null)
            {
                n.delete();
            }
            if (e == 2 || bytebuffer.remaining() != 0)
            {
                String s1;
                boolean flag;
                if (t == -1L && e != 2)
                {
                    flag = true;
                } else
                if (t > 0L && (long)bytebuffer.remaining() < t)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    s1 = g();
                } else
                {
                    s1 = f();
                }
                if ((((guy) (obj)).b & 0x400) != 0)
                {
                    flag1 = true;
                }
                if ((((guy) (obj)).b & 2) != 0)
                {
                    a(s1, bytebuffer, flag, flag1);
                    if (z())
                    {
                        s1 = String.valueOf(c);
                        obj = String.valueOf(h());
                        if (flag1)
                        {
                            bytebuffer = "; long-term cache";
                        } else
                        {
                            bytebuffer = "";
                        }
                        (new StringBuilder(String.valueOf(s1).length() + 48 + String.valueOf(obj).length() + String.valueOf(bytebuffer).length())).append("Completing a download-only request: ").append(s1).append(" file name: ").append(((String) (obj))).append(bytebuffer);
                    }
                    a.a(this, 1, h());
                    return;
                }
                if (!flag)
                {
                    b(bytebuffer);
                }
                if ((((guy) (obj)).b & 1) == 0)
                {
                    if (z())
                    {
                        String s3 = String.valueOf(c);
                        String s2;
                        if (flag1)
                        {
                            s2 = "; long-term cache";
                        } else
                        {
                            s2 = "";
                        }
                        (new StringBuilder(String.valueOf(s3).length() + 40 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("Saving image in file cache: ").append(s3).append(" file name: ").append(s1).append(s2);
                    }
                    a(s1, bytebuffer, flag, flag1);
                    return;
                }
            }
        }
    }

    public void a(HttpUrlRequest httpurlrequest)
    {
        A = System.currentTimeMillis();
        y = httpurlrequest.k();
        if (p != null)
        {
            p.a(httpurlrequest.a());
        }
    }

    public int b(Object obj)
    {
        if (obj instanceof Bitmap)
        {
            return ((Bitmap)obj).getWidth();
        }
        if (obj instanceof gup)
        {
            return ((gup)obj).b;
        } else
        {
            return 0;
        }
    }

    public abstract String b();

    public void b(HttpUrlRequest httpurlrequest)
    {
        this;
        JVM INSTR monitorenter ;
        if (httpurlrequest == l)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l = null;
        this;
        JVM INSTR monitorexit ;
        l();
        F = F + 1;
        Object obj = httpurlrequest.d();
        int i1;
        if (obj instanceof ResponseTooLargeException)
        {
            String s1 = String.valueOf(c);
            (new StringBuilder(String.valueOf(s1).length() + 20)).append("Response too large: ").append(s1);
            long l1;
            if ((((guy)c).b & 0x800) != 0)
            {
                o = true;
                obj = null;
                i1 = 1;
            } else
            {
                i1 = 1;
            }
        } else
        {
            i1 = 0;
        }
        if (obj != null)
        {
            if (Log.isLoggable("ImageResource", 3))
            {
                httpurlrequest = String.valueOf(c);
                (new StringBuilder(String.valueOf(httpurlrequest).length() + 25)).append("Network Exception: Id is:").append(httpurlrequest);
            }
            httpurlrequest = String.valueOf(((IOException) (obj)).getMessage());
            if (httpurlrequest.length() != 0)
            {
                httpurlrequest = "Network exception: ".concat(httpurlrequest);
            } else
            {
                httpurlrequest = new String("Network exception: ");
            }
            a(httpurlrequest, ((Throwable) (obj)));
            if (i1 != 0)
            {
                i1 = 5;
            } else
            {
                i1 = 4;
            }
            a(i1);
            return;
        }
        break MISSING_BLOCK_LABEL_230;
        httpurlrequest;
        this;
        JVM INSTR monitorexit ;
        throw httpurlrequest;
        i1 = httpurlrequest.b();
        if (i1 != 200)
        {
            if (n != null)
            {
                n.delete();
            }
            a(i1, ((String) (null)));
            return;
        }
        if (e != 2)
        {
            o = true;
        }
        l1 = httpurlrequest.a();
        if (l1 == -1L)
        {
            t = -1L;
        } else
        {
            t = l1 + t;
        }
        obj = (guy)c;
        if (p != null)
        {
            httpurlrequest = ((ChunkedWritableByteChannel)p.a()).a();
        } else
        if ((((guy) (obj)).b & 2) == 0)
        {
            httpurlrequest = httpurlrequest.e();
        } else
        {
            httpurlrequest = null;
        }
        a.a(this, httpurlrequest);
        return;
    }

    public void c()
    {
        Object obj1;
        obj1 = (guy)c;
        if ((((guy) (obj1)).b & 0x80) != 0)
        {
            if (z())
            {
                String s1 = String.valueOf(c);
                obj1 = String.valueOf(h());
                (new StringBuilder(String.valueOf(s1).length() + 34 + String.valueOf(obj1).length())).append("Loading disabled for: ").append(s1).append(" file name: ").append(((String) (obj1)));
            }
            a.a(this, 3, null);
            return;
        }
        if ((((guy) (obj1)).b & 2) != 0)
        {
            File file = i();
            if (file != null)
            {
                if (z())
                {
                    obj1 = String.valueOf(c);
                    String s6 = String.valueOf(file);
                    (new StringBuilder(String.valueOf(obj1).length() + 46 + String.valueOf(s6).length())).append("Returning file name to consumers: ").append(((String) (obj1))).append(" file name: ").append(s6);
                }
                a.a(this, 1, file);
                return;
            }
        }
        if ((((guy) (obj1)).b & 1) != 0) goto _L2; else goto _L1
_L1:
        Object obj2 = i();
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        if (z())
        {
            String s2 = String.valueOf(c);
            String s7 = String.valueOf(obj2);
            (new StringBuilder(String.valueOf(s2).length() + 37 + String.valueOf(s7).length())).append("Loading image from file: ").append(s2).append(" file name: ").append(s7);
        }
        Object obj = g.a(((File) (obj2)), true);
_L5:
        if (obj != null)
        {
            b(((ByteBuffer) (obj)));
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        obj2 = String.valueOf(obj2);
        a((new StringBuilder(String.valueOf(obj2).length() + 18)).append("Cannot load file: ").append(((String) (obj2))).toString(), ((Throwable) (obj)));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
        if ((((guy) (obj1)).b & 0x40000) != 0)
        {
            if (z())
            {
                String s3 = String.valueOf(c);
                String s5 = String.valueOf(h());
                (new StringBuilder(String.valueOf(s3).length() + 38 + String.valueOf(s5).length())).append("Downloading disabled for: ").append(s3).append(" file name: ").append(s5);
            }
            a.a(this, 3, null);
            return;
        }
        if (z())
        {
            String s4 = String.valueOf(c);
            (new StringBuilder(String.valueOf(s4).length() + 21)).append("Requesting download: ").append(s4);
        }
        j();
        return;
    }

    public gvb d()
    {
        return a;
    }

    public boolean e()
    {
        return F <= 3;
    }

    public String f()
    {
        return b();
    }

    public String g()
    {
        String s1 = f();
        return (new StringBuilder(String.valueOf(s1).length() + 1)).append(s1).append('~').toString();
    }

    public File h()
    {
        Object obj = (guy)c;
        if ((((guy) (obj)).b & 1) != 0)
        {
            return null;
        }
        if ((((guy) (obj)).b & 0x400) != 0)
        {
            obj = a.c();
        } else
        {
            obj = a.b();
        }
        return new File(((guh) (obj)).b(f()));
    }

    public File i()
    {
        String s1 = f();
        File file = a.b().a(s1);
        if (file != null)
        {
            return file;
        } else
        {
            return a.c().a(s1);
        }
    }

    public void j()
    {
        Object obj;
        boolean flag = false;
        obj = null;
        k();
        m = a();
        if (m == null)
        {
            if (Log.isLoggable("ImageResource", 3))
            {
                String s1 = String.valueOf(c);
                (new StringBuilder(String.valueOf(s1).length() + 35)).append("Unable to download null image url: ").append(s1);
            }
            a(5);
        }
        if ((((guy)c).b & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        guy guy1 = (guy)c;
        String s2 = g();
        if ((guy1.b & 0x400) != 0)
        {
            obj = a.c();
        } else
        {
            obj = a.b();
        }
        obj = ((guh) (obj)).b(s2);
        n = new File(((String) (obj)));
        if (n.exists())
        {
            m = a(((String) (obj)), false);
        }
        if (z())
        {
            obj = m;
            String s3 = String.valueOf(v());
            (new StringBuilder(String.valueOf(obj).length() + 34 + String.valueOf(s3).length())).append("Downloading using URL: ").append(((String) (obj))).append(" resource: ").append(s3);
        }
        obj = n.getParentFile();
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        try
        {
            obj = (new FileOutputStream(n, true)).getChannel();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Cannot open cache file", ((Throwable) (obj)));
            a(4);
            return;
        }
        if (m == null)
        {
            obj = String.valueOf(this);
            throw new NullPointerException((new StringBuilder(String.valueOf(obj).length() + 22)).append("Download URL is null: ").append(((String) (obj))).toString());
        }
        obj = hbl.a(a.j(), m, 0, null, ((java.nio.channels.WritableByteChannel) (obj)), this);
        ((HttpUrlRequest) (obj)).a(n.length());
        long l1;
        if ((guy1.b & 0x2000) != 0)
        {
            l1 = a.g();
        } else
        {
            l1 = a.h();
        }
        if ((guy1.b & 0x800) == 0)
        {
            flag = true;
        }
        ((HttpUrlRequest) (obj)).a(l1, flag);
        this;
        JVM INSTR monitorenter ;
        l = ((HttpUrlRequest) (obj));
        this;
        JVM INSTR monitorexit ;
        ((HttpUrlRequest) (obj)).h();
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        long l2 = a.h();
        t = 0L;
        Object obj1 = g();
        n = a.b().a(((String) (obj1)));
        if (n != null)
        {
            m = a(n.getPath(), true);
            if (!n.exists())
            {
                n = null;
            }
        }
        if (z())
        {
            String s4 = m;
            String s7 = String.valueOf(v());
            (new StringBuilder(String.valueOf(s4).length() + 34 + String.valueOf(s7).length())).append("Downloading using URL: ").append(s4).append(" resource: ").append(s7);
        }
        p = new hbm(new ChunkedWritableByteChannel(), this);
        if (n != null)
        {
            try
            {
                if (z())
                {
                    long l3 = t;
                    String s5 = String.valueOf(v());
                    (new StringBuilder(String.valueOf(obj1).length() + 68 + String.valueOf(s5).length())).append("Continuing download to file ").append(((String) (obj1))).append(" (").append(l3).append(" bytes) resource: ").append(s5);
                }
                obj1 = g.a(n, true);
                p.write(((ByteBuffer) (obj1)));
                t = n.length();
            }
            catch (IOException ioexception)
            {
                p = null;
                t = 0L;
            }
        }
        obj1 = (gut)hgx.b(a.j(), gut);
        if (obj1 != null)
        {
            obj1 = ((gut) (obj1)).a();
            obj = obj1;
            if (z())
            {
                obj = obj1;
                if (!((Map) (obj1)).isEmpty())
                {
                    obj = String.valueOf(obj1);
                    String s6 = String.valueOf(v());
                    (new StringBuilder(String.valueOf(obj).length() + 33 + String.valueOf(s6).length())).append("Adding image headers: ").append(((String) (obj))).append(" resource: ").append(s6);
                    obj = obj1;
                }
            }
        }
        if (p != null)
        {
            obj = hbl.a(a.j(), m, 2, ((Map) (obj)), p, this);
            ((HttpUrlRequest) (obj)).a(t);
        } else
        {
            obj = hbl.a(a.j(), m, 2, ((Map) (obj)), this);
        }
        ((HttpUrlRequest) (obj)).a(l2, true);
        this;
        JVM INSTR monitorenter ;
        l = ((HttpUrlRequest) (obj));
        this;
        JVM INSTR monitorexit ;
        ((HttpUrlRequest) (obj)).h();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void k()
    {
        f = true;
        q = System.currentTimeMillis();
        a.a(this);
    }

    protected void l()
    {
        f = false;
        r = System.currentTimeMillis();
        long l1 = r;
        long l2 = q;
        s = (new StringBuilder(23)).append(l1 - l2).append(" ms").toString();
        a.b(this);
        if (z())
        {
            String s1 = s;
            String s2 = String.valueOf(c);
            (new StringBuilder(String.valueOf(s1).length() + 24 + String.valueOf(s2).length())).append("Download completed in ").append(s1).append("; ").append(s2);
        }
    }

    public void m()
    {
        if (f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        this;
        JVM INSTR monitorenter ;
        HttpUrlRequest httpurlrequest = l;
        this;
        JVM INSTR monitorexit ;
        if (httpurlrequest == null) goto _L1; else goto _L3
_L3:
        httpurlrequest.i();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void n()
    {
        if ((((guy)c).b & 0x10) != 0) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = null;
        if (!(d instanceof Bitmap)) goto _L4; else goto _L3
_L3:
        bitmap = (Bitmap)d;
_L6:
        if (bitmap != null)
        {
            a.a(bitmap);
        }
_L2:
        super.n();
        return;
_L4:
        if (d instanceof gup)
        {
            bitmap = ((gup)d).a;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int o()
    {
        if (d instanceof Bitmap)
        {
            return ((Bitmap)d).getHeight();
        }
        if (d instanceof gup)
        {
            return ((gup)d).c;
        } else
        {
            return 0;
        }
    }

    public boolean p()
    {
        if (e == 5)
        {
            return false;
        }
        if ((((guy)c).b & 0xa) != 0)
        {
            return false;
        }
        if (d instanceof Bitmap)
        {
            return !t() || ((Bitmap)d).getConfig() != null;
        }
        if (d instanceof gup)
        {
            return !t() || ((gup)d).a.getConfig() != null;
        } else
        {
            return true;
        }
    }

    public int q()
    {
        if (z != -1) goto _L2; else goto _L1
_L1:
        if (d == null) goto _L4; else goto _L3
_L3:
        if (!(d instanceof Bitmap)) goto _L6; else goto _L5
_L5:
        z = a((Bitmap)d);
_L2:
        return z;
_L6:
        if (d instanceof gup)
        {
            z = a(((gup)d).a);
            continue; /* Loop/switch isn't completed */
        }
        if (d instanceof guo)
        {
            z = ((guo)d).a();
            continue; /* Loop/switch isn't completed */
        }
        if (d instanceof guz)
        {
            z = ((guz)d).f;
            continue; /* Loop/switch isn't completed */
        }
        if (d instanceof byte[])
        {
            z = ((byte[])d).length;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        z = 0x7fffffff;
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void r()
    {
        if (e == 1 && (((guy)c).b & 0x10) == 0 && ((d instanceof Bitmap) || (d instanceof gup)) && t())
        {
            Object obj;
            android.graphics.Bitmap.Config config;
            int i1;
            int j1;
            if (d instanceof Bitmap)
            {
                obj = (Bitmap)d;
                i1 = ((Bitmap) (obj)).getWidth();
                j1 = ((Bitmap) (obj)).getHeight();
            } else
            {
                gup gup1 = (gup)d;
                obj = gup1.a;
                i1 = gup1.b;
                j1 = gup1.c;
            }
            config = ((Bitmap) (obj)).getConfig();
            if (config != null)
            {
                try
                {
                    guz guz1 = new guz();
                    guz1.a = config;
                    guz1.d = ((Bitmap) (obj)).getWidth();
                    guz1.e = ((Bitmap) (obj)).getHeight();
                    guz1.b = i1;
                    guz1.c = j1;
                    guz1.f = ((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight();
                    guz1.g = ByteBuffer.allocate(guz1.f);
                    ((Bitmap) (obj)).copyPixelsToBuffer(guz1.g);
                    a.a(((Bitmap) (obj)));
                    d = guz1;
                    e = 8;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    e = 6;
                }
                return;
            }
        }
    }

    public void s()
    {
        guz guz1;
        if (e != 8 || !(d instanceof guz))
        {
            return;
        }
        if (!t())
        {
            e = 1;
            return;
        }
        guz1 = (guz)d;
        Bitmap bitmap;
        bitmap = Bitmap.createBitmap(guz1.d, guz1.e, guz1.a);
        guz1.g.rewind();
        bitmap.copyPixelsFromBuffer(guz1.g);
        if (guz1.b == guz1.d && guz1.c == guz1.e)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        d = new gup(bitmap, guz1.b, guz1.c);
_L1:
        OutOfMemoryError outofmemoryerror;
        e = 1;
        return;
        try
        {
            d = bitmap;
        }
        // Misplaced declaration of an exception variable
        catch (OutOfMemoryError outofmemoryerror)
        {
            d = null;
            e = 6;
            return;
        }
          goto _L1
    }
}
