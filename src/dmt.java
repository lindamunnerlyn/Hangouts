// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class dmt extends dlp
{

    private static final boolean c = false;
    private static gkb d;
    private static final Object e = new Object();
    final Object b = new Object();
    private final ExecutorService f = Executors.newSingleThreadExecutor();
    private final HashSet g = new HashSet();
    private final LinkedList h = new LinkedList();

    public dmt()
    {
    }

    private static int a(long l, long l1)
    {
        if (l > 0L && l1 > 0L)
        {
            return (int)((l - l1) / 0xf4240L);
        } else
        {
            return -1;
        }
    }

    static void a(dmt dmt1, String s)
    {
        dmt1.f(s);
    }

    static void a(dmt dmt1, byte abyte0[], String s, dnc dnc1, boolean flag)
    {
        Object obj;
        Object obj1;
        gbh.b();
        obj1 = dnc1.j();
        obj = s;
        if (e(s)) goto _L2; else goto _L1
_L1:
        s = dnc1.d;
        obj = s;
        if (e(s)) goto _L2; else goto _L3
_L3:
        dmt1.a(dnc1);
_L13:
        return;
_L2:
        s = ean.a(((File) (obj1)), ((String) (obj)), dnc1.b.r());
        if (TextUtils.isEmpty(s))
        {
            dmt1.a(dnc1);
            ebw.g("Babel_medialoader", "could not create save name");
            return;
        }
        if (!((File) (obj1)).exists() && !((File) (obj1)).mkdir()) goto _L5; else goto _L4
_L4:
        Object obj2 = new File(((File) (obj1)), s);
        if (((File) (obj2)).exists())
        {
            break MISSING_BLOCK_LABEL_629;
        }
        obj1 = new FileOutputStream(((File) (obj2)));
        obj = obj1;
        s = ((String) (obj1));
        ((OutputStream) (obj1)).write(abyte0);
        obj = obj1;
        s = ((String) (obj1));
        ((OutputStream) (obj1)).flush();
        abyte0 = ((byte []) (obj1));
_L21:
        obj = abyte0;
        s = abyte0;
        obj1 = Uri.fromFile(((File) (obj2)));
        obj = abyte0;
        s = abyte0;
        dnc1.b.a(((Uri) (obj1)).getPath());
        obj = abyte0;
        s = abyte0;
        dnc1.a(((Uri) (obj1)).getPath());
        obj = abyte0;
        s = abyte0;
        if (!TextUtils.isEmpty(dnc1.b.r()))
        {
            break MISSING_BLOCK_LABEL_242;
        }
        obj = abyte0;
        s = abyte0;
        obj1 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", ((Uri) (obj1)));
        obj = abyte0;
        s = abyte0;
        g.nS.sendBroadcast(((Intent) (obj1)));
        obj = abyte0;
        s = abyte0;
        if (!c) goto _L7; else goto _L6
_L6:
        obj = abyte0;
        s = abyte0;
        obj1 = String.valueOf(dnc1.toString());
        obj = abyte0;
        s = abyte0;
        if (((String) (obj1)).length() == 0) goto _L9; else goto _L8
_L8:
        obj = abyte0;
        s = abyte0;
        obj1 = "Successful save ".concat(((String) (obj1)));
_L14:
        obj = abyte0;
        s = abyte0;
        dmt1.f(((String) (obj1)));
_L7:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        s = abyte0;
        dmt1.d(dnc1);
        obj = abyte0;
        s = abyte0;
        obj1 = dmt1.b(dnc1.c());
        if (obj1 != null) goto _L11; else goto _L10
_L10:
        obj = abyte0;
        s = abyte0;
        if (!c)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        s = abyte0;
        ebw.b("Babel_medialoader", "null requests");
        if (abyte0 == null) goto _L13; else goto _L12
_L12:
        try
        {
            abyte0.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dmt dmt1)
        {
            Log.e("Babel_medialoader", "exception closing file while trying to save", dmt1);
        }
        return;
_L9:
        obj = abyte0;
        s = abyte0;
        obj1 = new String("Successful save ");
          goto _L14
        abyte0;
_L20:
        s = ((String) (obj));
        dmt1.a(dnc1);
        s = ((String) (obj));
        ebw.e("Babel_medialoader", "exception writing bytes to file while trying to save", abyte0);
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (dmt dmt1)
            {
                Log.e("Babel_medialoader", "exception closing file while trying to save", dmt1);
            }
            return;
        }
          goto _L13
_L11:
        obj = abyte0;
        s = abyte0;
        obj1 = ((List) (obj1)).iterator();
_L17:
        obj = abyte0;
        s = abyte0;
        if (!((Iterator) (obj1)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        s = abyte0;
        obj2 = (dlt)((Iterator) (obj1)).next();
        obj = abyte0;
        s = abyte0;
        gbh.a(obj2 instanceof dnc);
        obj = abyte0;
        s = abyte0;
        obj2 = (dnc)obj2;
        obj = abyte0;
        s = abyte0;
        if (!((dnc) (obj2)).a) goto _L16; else goto _L15
_L15:
        obj = abyte0;
        s = abyte0;
        dmt1.a(((Runnable) (new dmx(dmt1, ((dnc) (obj2))))));
          goto _L17
        dmt1;
_L19:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e("Babel_medialoader", "exception closing file while trying to save", abyte0);
            }
        }
        throw dmt1;
_L16:
        obj = abyte0;
        s = abyte0;
        ((dnc) (obj2)).h();
          goto _L17
        if (abyte0 == null) goto _L13; else goto _L18
_L18:
        try
        {
            abyte0.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dmt dmt1)
        {
            Log.e("Babel_medialoader", "exception closing file while trying to save", dmt1);
        }
        return;
_L5:
        Log.e("Babel_medialoader", "could not create save directory.");
        return;
        dmt1;
        s = null;
          goto _L19
        abyte0;
        obj = null;
          goto _L20
        abyte0 = null;
          goto _L21
    }

    private static void a(dnc dnc1, String s)
    {
        if (dnc1.e != null)
        {
            if (dnc1.e.h == null)
            {
                dnc1 = dnc1.e;
            } else
            {
                dnc1 = dnc1.e;
                String s1 = String.valueOf(((dnd) (dnc1)).h);
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = s1.concat(s);
                } else
                {
                    s = new String(s1);
                }
            }
            dnc1.h = s;
        }
    }

    public static void a(PrintWriter printwriter)
    {
label0:
        {
            synchronized (e)
            {
                if (d != null)
                {
                    break label0;
                }
            }
            return;
        }
        SimpleDateFormat simpledateformat;
        printwriter.println("loadTime              w-e   a-e   dec-a del-dec del-e key extras");
        simpledateformat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        int i = 0;
_L3:
        if (i >= d.a()) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        String s1;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        obj = (dnd)d.a(i);
        s = simpledateformat.format(Long.valueOf(((dnd) (obj)).a));
        j = a(((dnd) (obj)).c, ((dnd) (obj)).b);
        k = a(((dnd) (obj)).d, ((dnd) (obj)).b);
        l = a(((dnd) (obj)).e, ((dnd) (obj)).d);
        i1 = a(((dnd) (obj)).f, ((dnd) (obj)).e);
        j1 = a(((dnd) (obj)).f, ((dnd) (obj)).b);
        s1 = ((dnd) (obj)).g;
        if (((dnd) (obj)).h == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj = ((dnd) (obj)).h;
_L4:
        printwriter.println(String.format("%s %5d %5d %5d %5d %5d %s %s", new Object[] {
            s, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j1), s1, obj
        }));
        i++;
          goto _L3
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
        printwriter;
        obj1;
        JVM INSTR monitorexit ;
        throw printwriter;
        obj = "";
          goto _L4
    }

    private void c(dnc dnc1)
    {
        if (c)
        {
            Object obj = String.valueOf(dnc1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "startGetBytes on ".concat(((String) (obj)));
            } else
            {
                obj = new String("startGetBytes on ");
            }
            f(((String) (obj)));
        }
        if (dnc1.e != null)
        {
            dnc1.e.d = System.nanoTime();
        }
        obj = dnc1.c_();
        if (obj != null && ((dms) (obj)).a() != null)
        {
            a(dnc1, ((dms) (obj)));
        }
    }

    static boolean c()
    {
        return c;
    }

    private void d(dnc dnc1)
    {
        if (dnc1.e != null)
        {
            dnc1.e.f = System.nanoTime();
        }
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = false;
        if (!dnc1.a()) goto _L2; else goto _L1
_L1:
        boolean flag1 = g.remove(dnc1);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ebw.g("Babel_medialoader", String.valueOf(toString()).concat(" removeFromActive for a request that isn't in the active."));
        flag = flag1;
        if (!c) goto _L2; else goto _L3
_L3:
        dnc1 = String.valueOf(dnc1.toString());
        if (dnc1.length() == 0) goto _L5; else goto _L4
_L4:
        dnc1 = "removeFromActive: reference request =".concat(dnc1);
_L20:
        f(dnc1);
        flag = flag1;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (g.size() >= 8)
        {
            int i = g.size();
            ebw.g("Babel_medialoader", (new StringBuilder(77)).append("Number of active requests (").append(i).append(") greater than max active (8)").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        if (h.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        dnc1 = null;
_L19:
        dnc dnc2 = dnc1;
        if (dnc1 != null) goto _L7; else goto _L6
_L6:
        dnc2 = dnc1;
        if (h.size() <= 0) goto _L7; else goto _L8
_L8:
        dnc2 = (dnc)h.poll();
        if (!c) goto _L10; else goto _L9
_L9:
        dnc1 = String.valueOf(dnc2.toString());
        if (dnc1.length() == 0) goto _L12; else goto _L11
_L11:
        dnc1 = "transferrequest selected  on ".concat(dnc1);
_L21:
        f(dnc1);
_L10:
        if (!a(dnc2.c())) goto _L14; else goto _L13
_L13:
        if (!c) goto _L16; else goto _L15
_L15:
        dnc1 = String.valueOf(dnc2.toString());
        if (dnc1.length() == 0) goto _L18; else goto _L17
_L17:
        dnc1 = "mediaDecoded waiting to active request =".concat(dnc1);
_L22:
        f(dnc1);
_L16:
        g.add(dnc2);
        dnc1 = dnc2;
          goto _L19
        dnc1;
        obj;
        JVM INSTR monitorexit ;
        throw dnc1;
_L5:
        dnc1 = new String("removeFromActive: reference request =");
          goto _L20
_L12:
        dnc1 = new String("transferrequest selected  on ");
          goto _L21
_L18:
        dnc1 = new String("mediaDecoded waiting to active request =");
          goto _L22
_L14:
        if (!c) goto _L24; else goto _L23
_L23:
        dnc1 = String.valueOf(dnc2.toString());
        if (dnc1.length() == 0) goto _L26; else goto _L25
_L25:
        dnc1 = "mediaDecoded waiting to active skipped: request =".concat(dnc1);
_L27:
        f(dnc1);
          goto _L24
_L26:
        dnc1 = new String("mediaDecoded waiting to active skipped: request =");
          goto _L27
_L7:
        obj;
        JVM INSTR monitorexit ;
        if (dnc2 != null)
        {
            c(dnc2);
        }
        return;
_L24:
        dnc1 = null;
          goto _L19
        dnc2 = null;
          goto _L7
    }

    private static boolean e(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            boolean flag;
            if (s != null && s.endsWith("*"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }

    private void f(String s)
    {
        String s1 = toString();
        ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s).length())).append(s1).append(": ").append(s).toString());
    }

    protected String a()
    {
        return "MediaLoader";
    }

    public void a(dnc dnc1)
    {
        gbh.b();
        String s = String.valueOf(dnc1.n());
        ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 21)).append("Media failed to load:").append(s).toString());
        a(dnc1, " Failed");
        d(dnc1);
        b(dnc1.c());
        if (dnc1.a)
        {
            a(((Runnable) (new dmz(this, dnc1))));
            return;
        } else
        {
            dnc1.g();
            return;
        }
    }

    public void a(dnc dnc1, dms dms1)
    {
        byte abyte0[] = dms1.a();
        if (c)
        {
            String s;
            String s1;
            if (dms1 == null)
            {
                s = " null ";
            } else
            {
                int i = abyte0.length;
                s = (new StringBuilder(18)).append(" size=").append(i).append(" ").toString();
            }
            s1 = dnc1.toString();
            f((new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append("mediaDownloaded ").append(s).append(s1).toString());
        }
        if (dnc1.e != null)
        {
            dnc1.e.e = System.nanoTime();
        }
        if (dms1.c())
        {
            a(dnc1, " Volley Cache Hit");
        }
        if (abyte0 != null && abyte0.length > 0)
        {
            if (dnc1.n().r() != null && TextUtils.isEmpty(dnc1.n().q()))
            {
                f.execute(new dmu(this, dnc1, abyte0, dms1));
                return;
            }
            if (dnc1.n().p())
            {
                f.execute(new dmv(this, dnc1, abyte0, dms1));
                return;
            } else
            {
                f.execute(new dmw(this, dnc1, abyte0));
                return;
            }
        } else
        {
            b(dnc1);
            return;
        }
    }

    public void a(dnc dnc1, dnb dnb1)
    {
        gbh.b();
        Object obj;
        if (c)
        {
            obj = String.valueOf(dnc1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "mediaDecoded ".concat(((String) (obj)));
            } else
            {
                obj = new String("mediaDecoded ");
            }
            f(((String) (obj)));
        }
        d(dnc1);
        obj = b(dnc1.c());
        if (obj == null)
        {
            if (c)
            {
                ebw.b("Babel_medialoader", "null requests");
            }
            if (dnb1 != null)
            {
                dnb1.b();
            }
        } else
        if (dnb1 != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj1 = (dlt)((Iterator) (obj)).next();
                gbh.a(obj1 instanceof dnc);
                dnb1.a();
                obj1 = (dnc)obj1;
                if (((dnc) (obj1)).e != null && dnc1.e != null)
                {
                    if (obj1 != dnc1)
                    {
                        ((dnc) (obj1)).e.c = dnc1.e.c;
                        ((dnc) (obj1)).e.d = dnc1.e.d;
                        ((dnc) (obj1)).e.e = dnc1.e.e;
                        a(((dnc) (obj1)), " Secondary request");
                    }
                    ((dnc) (obj1)).e.f = System.nanoTime();
                }
                if (((dnc) (obj1)).a)
                {
                    a(((Runnable) (new dmy(this, ((dnc) (obj1)), dnb1))));
                } else
                {
                    ((dnc) (obj1)).a(dnb1);
                    dnb1.b();
                }
            }

            dnb1.b();
            return;
        }
    }

    protected void a(ArrayList arraylist)
    {
        if (arraylist.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = arraylist.iterator();
_L18:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        Object obj;
        arraylist = (String)iterator.next();
        obj = c(arraylist);
        if (obj == null)
        {
            if (c)
            {
                arraylist = String.valueOf(arraylist);
                if (arraylist.length() != 0)
                {
                    arraylist = "No MediaRequests for key: ".concat(arraylist);
                } else
                {
                    arraylist = new String("No MediaRequests for key: ");
                }
                f(arraylist);
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof dnc))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (dnc)obj;
        if (((dnc) (obj)).e != null)
        {
            ((dnc) (obj)).e.c = System.nanoTime();
        }
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        if (((dnc) (obj)).a()) goto _L5; else goto _L4
_L4:
        arraylist = ((ArrayList) (obj));
        if (!c) goto _L7; else goto _L6
_L6:
        arraylist = String.valueOf(((dnc) (obj)).toString());
        if (arraylist.length() == 0) goto _L9; else goto _L8
_L8:
        arraylist = "execute skip: reference request =".concat(arraylist);
_L10:
        f(arraylist);
        arraylist = ((ArrayList) (obj));
_L7:
        obj1;
        JVM INSTR monitorexit ;
        if (arraylist != null)
        {
            c(arraylist);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        arraylist = new String("execute skip: reference request =");
          goto _L10
        arraylist;
        obj1;
        JVM INSTR monitorexit ;
        throw arraylist;
_L5:
        if (g.size() >= 8)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        if (!c) goto _L12; else goto _L11
_L11:
        arraylist = String.valueOf(((dnc) (obj)).toString());
        if (arraylist.length() == 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        arraylist = "execute add to active: reference request =".concat(arraylist);
_L13:
        f(arraylist);
_L12:
        g.add(obj);
        arraylist = ((ArrayList) (obj));
          goto _L7
        arraylist = new String("execute add to active: reference request =");
          goto _L13
        if (!c) goto _L15; else goto _L14
_L14:
        arraylist = String.valueOf(((dnc) (obj)).toString());
        if (arraylist.length() == 0)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        arraylist = "execute add to waiting: reference request =".concat(arraylist);
_L16:
        f(arraylist);
_L15:
        h.add(obj);
        arraylist = null;
          goto _L7
        arraylist = new String("execute add to waiting: reference request =");
          goto _L16
_L2:
        return;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public boolean a(dlt dlt1)
    {
        return a(dlt1, false);
    }

    public boolean a(dlt dlt1, boolean flag)
    {
        dnc dnc1;
        boolean flag1;
        if (dlt1 == null || !(dlt1 instanceof dnc))
        {
            dlt1 = String.valueOf(dlt1);
            ebw.g("Babel_medialoader", (new StringBuilder(String.valueOf(dlt1).length() + 35)).append("MediaLoader.load: invalid request: ").append(dlt1).toString());
            return false;
        }
        dnc1 = (dnc)dlt1;
        if (c)
        {
            String s = dnc1.toString();
            f((new StringBuilder(String.valueOf(s).length() + 30)).append("load req=").append(s).append(" loadOnlyCached=").append(flag).toString());
        }
        if (ebw.b())
        {
            dnd dnd2 = new dnd();
            dnd2.a = System.currentTimeMillis();
            dnd2.b = System.nanoTime();
            dnd2.g = dnc1.c();
            synchronized (e)
            {
                if (d == null)
                {
                    d = new gkb(200);
                }
                d.a(dnd2);
                dnc1.e = dnd2;
            }
        } else
        if (d != null)
        {
            synchronized (e)
            {
                if (d != null)
                {
                    d = null;
                }
            }
        }
        if (dnc1.f() && dnc1.e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || flag)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            super.c(dlt1);
            return false;
        }
        break MISSING_BLOCK_LABEL_285;
        dlt1;
        obj;
        JVM INSTR monitorexit ;
        throw dlt1;
        dlt1;
        obj1;
        JVM INSTR monitorexit ;
        throw dlt1;
        if (c)
        {
            String s1 = String.valueOf(dnc1.toString());
            if (s1.length() != 0)
            {
                s1 = "no cache found, load req=".concat(s1);
            } else
            {
                s1 = new String("no cache found, load req=");
            }
            f(s1);
        }
        return super.a(dlt1);
        if (dnc1.e != null)
        {
            long l = System.nanoTime();
            dnc1.e.c = l;
            dnc1.e.d = l;
            dnc1.e.e = l;
            dnc1.e.f = l;
            dnd dnd1;
            if (flag1)
            {
                dlt1 = " Bitmap Cache Hit";
            } else
            {
                dlt1 = " Bitmap Cache Miss";
            }
            if (dnc1.e.h == null)
            {
                dnd1 = dnc1.e;
            } else
            {
                dnd1 = dnc1.e;
                String s2 = String.valueOf(dnd1.h);
                dlt1 = String.valueOf(dlt1);
                if (dlt1.length() != 0)
                {
                    dlt1 = s2.concat(dlt1);
                } else
                {
                    dlt1 = new String(s2);
                }
            }
            dnd1.h = dlt1;
            if (c)
            {
                dlt1 = String.valueOf(dnc1.e.toString());
                if (dlt1.length() != 0)
                {
                    dlt1 = "request history=".concat(dlt1);
                } else
                {
                    dlt1 = new String("request history=");
                }
                f(dlt1);
            }
        }
        return flag1;
    }

    public void b(dnc dnc1)
    {
        f.execute(new dna(this, dnc1));
    }

    public String toString()
    {
        int i = g.size();
        int j = h.size();
        return (new StringBuilder(51)).append("MediaLoader: active/waiting=").append(i).append("/").append(j).toString();
    }

    static 
    {
        hik hik = ebw.p;
    }
}
