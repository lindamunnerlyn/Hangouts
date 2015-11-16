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

public class dpn extends don
{

    private static final boolean c = false;
    private static final efh d = efh.a("MediaLoader");
    private static gnd e;
    private static final Object f = new Object();
    final Object b = new Object();
    private final ExecutorService g = Executors.newSingleThreadExecutor();
    private final HashSet h = new HashSet();
    private final LinkedList i = new LinkedList();

    public dpn()
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

    static void a(dpn dpn1, String s)
    {
        dpn1.f(s);
    }

    static void a(dpn dpn1, byte abyte0[], String s, dpw dpw1, boolean flag)
    {
        Object obj;
        Object obj1;
        gdv.b();
        obj1 = dpw1.k();
        obj = s;
        if (e(s)) goto _L2; else goto _L1
_L1:
        s = dpw1.d;
        obj = s;
        if (e(s)) goto _L2; else goto _L3
_L3:
        dpn1.a(dpw1);
_L13:
        return;
_L2:
        s = edr.a(((File) (obj1)), ((String) (obj)), dpw1.b.r());
        if (TextUtils.isEmpty(s))
        {
            dpn1.a(dpw1);
            eev.g("Babel_medialoader", "could not create save name");
            return;
        }
        if (!((File) (obj1)).exists() && !((File) (obj1)).mkdir()) goto _L5; else goto _L4
_L4:
        Object obj2 = new File(((File) (obj1)), s);
        if (((File) (obj2)).exists())
        {
            break MISSING_BLOCK_LABEL_632;
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
        dpw1.b.a(((Uri) (obj1)).getPath());
        obj = abyte0;
        s = abyte0;
        dpw1.a(((Uri) (obj1)).getPath());
        obj = abyte0;
        s = abyte0;
        if (!TextUtils.isEmpty(dpw1.b.r()))
        {
            break MISSING_BLOCK_LABEL_242;
        }
        obj = abyte0;
        s = abyte0;
        obj1 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", ((Uri) (obj1)));
        obj = abyte0;
        s = abyte0;
        g.nU.sendBroadcast(((Intent) (obj1)));
        obj = abyte0;
        s = abyte0;
        if (!c) goto _L7; else goto _L6
_L6:
        obj = abyte0;
        s = abyte0;
        obj1 = String.valueOf(dpw1.toString());
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
        dpn1.f(((String) (obj1)));
_L7:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        s = abyte0;
        dpn1.d(dpw1);
        obj = abyte0;
        s = abyte0;
        obj1 = dpn1.b(dpw1.c());
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
        eev.b("Babel_medialoader", "null requests");
        if (abyte0 == null) goto _L13; else goto _L12
_L12:
        try
        {
            abyte0.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dpn dpn1)
        {
            Log.e("Babel_medialoader", "exception closing file while trying to save", dpn1);
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
        dpn1.a(dpw1);
        s = ((String) (obj));
        eev.e("Babel_medialoader", "exception writing bytes to file while trying to save", abyte0);
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (dpn dpn1)
            {
                Log.e("Babel_medialoader", "exception closing file while trying to save", dpn1);
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
        obj2 = (dor)((Iterator) (obj1)).next();
        obj = abyte0;
        s = abyte0;
        gdv.a("Expected condition to be true", obj2 instanceof dpw);
        obj = abyte0;
        s = abyte0;
        obj2 = (dpw)obj2;
        obj = abyte0;
        s = abyte0;
        if (!((dpw) (obj2)).a) goto _L16; else goto _L15
_L15:
        obj = abyte0;
        s = abyte0;
        dpn1.a(((Runnable) (new dpr(dpn1, ((dpw) (obj2))))));
          goto _L17
        dpn1;
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
        throw dpn1;
_L16:
        obj = abyte0;
        s = abyte0;
        ((dpw) (obj2)).h();
          goto _L17
        if (abyte0 == null) goto _L13; else goto _L18
_L18:
        try
        {
            abyte0.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (dpn dpn1)
        {
            Log.e("Babel_medialoader", "exception closing file while trying to save", dpn1);
        }
        return;
_L5:
        Log.e("Babel_medialoader", "could not create save directory.");
        return;
        dpn1;
        s = null;
          goto _L19
        abyte0;
        obj = null;
          goto _L20
        abyte0 = null;
          goto _L21
    }

    private static void a(dpw dpw1, String s)
    {
        if (dpw1.e != null)
        {
            if (dpw1.e.h == null)
            {
                dpw1 = dpw1.e;
            } else
            {
                dpw1 = dpw1.e;
                String s1 = String.valueOf(((dpx) (dpw1)).h);
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = s1.concat(s);
                } else
                {
                    s = new String(s1);
                }
            }
            dpw1.h = s;
        }
    }

    public static void a(PrintWriter printwriter)
    {
label0:
        {
            synchronized (f)
            {
                if (e != null)
                {
                    break label0;
                }
            }
            return;
        }
        SimpleDateFormat simpledateformat;
        printwriter.println("loadTime              w-e   a-e   dec-a del-dec del-e key extras");
        simpledateformat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        int j = 0;
_L3:
        if (j >= e.a()) goto _L2; else goto _L1
_L1:
        Object obj;
        String s;
        String s1;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        obj = (dpx)e.a(j);
        s = simpledateformat.format(Long.valueOf(((dpx) (obj)).a));
        k = a(((dpx) (obj)).c, ((dpx) (obj)).b);
        l = a(((dpx) (obj)).d, ((dpx) (obj)).b);
        i1 = a(((dpx) (obj)).e, ((dpx) (obj)).d);
        j1 = a(((dpx) (obj)).f, ((dpx) (obj)).e);
        k1 = a(((dpx) (obj)).f, ((dpx) (obj)).b);
        s1 = ((dpx) (obj)).g;
        if (((dpx) (obj)).h == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj = ((dpx) (obj)).h;
_L4:
        printwriter.println(String.format("%s %5d %5d %5d %5d %5d %s %s", new Object[] {
            s, Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1), s1, obj
        }));
        j++;
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

    static efh c()
    {
        return d;
    }

    private void c(dpw dpw1)
    {
        if (c)
        {
            Object obj = String.valueOf(dpw1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "startGetBytes on ".concat(((String) (obj)));
            } else
            {
                obj = new String("startGetBytes on ");
            }
            f(((String) (obj)));
        }
        if (dpw1.e != null)
        {
            dpw1.e.d = System.nanoTime();
        }
        obj = dpw1.d_();
        if (obj != null && ((dpm) (obj)).a() != null)
        {
            a(dpw1, ((dpm) (obj)));
        }
    }

    private void d(dpw dpw1)
    {
        if (dpw1.e != null)
        {
            dpw1.e.f = System.nanoTime();
        }
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = false;
        if (!dpw1.a()) goto _L2; else goto _L1
_L1:
        boolean flag1 = h.remove(dpw1);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        eev.g("Babel_medialoader", String.valueOf(toString()).concat(" removeFromActive for a request that isn't in the active."));
        flag = flag1;
        if (!c) goto _L2; else goto _L3
_L3:
        dpw1 = String.valueOf(dpw1.toString());
        if (dpw1.length() == 0) goto _L5; else goto _L4
_L4:
        dpw1 = "removeFromActive: reference request =".concat(dpw1);
_L20:
        f(dpw1);
        flag = flag1;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (h.size() >= 8)
        {
            int j = h.size();
            eev.g("Babel_medialoader", (new StringBuilder(77)).append("Number of active requests (").append(j).append(") greater than max active (8)").toString());
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        if (i.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        dpw1 = null;
_L19:
        dpw dpw2 = dpw1;
        if (dpw1 != null) goto _L7; else goto _L6
_L6:
        dpw2 = dpw1;
        if (i.size() <= 0) goto _L7; else goto _L8
_L8:
        dpw2 = (dpw)i.poll();
        if (!c) goto _L10; else goto _L9
_L9:
        dpw1 = String.valueOf(dpw2.toString());
        if (dpw1.length() == 0) goto _L12; else goto _L11
_L11:
        dpw1 = "transferrequest selected  on ".concat(dpw1);
_L21:
        f(dpw1);
_L10:
        if (!a(dpw2.c())) goto _L14; else goto _L13
_L13:
        if (!c) goto _L16; else goto _L15
_L15:
        dpw1 = String.valueOf(dpw2.toString());
        if (dpw1.length() == 0) goto _L18; else goto _L17
_L17:
        dpw1 = "mediaDecoded waiting to active request =".concat(dpw1);
_L22:
        f(dpw1);
_L16:
        h.add(dpw2);
        dpw1 = dpw2;
          goto _L19
        dpw1;
        obj;
        JVM INSTR monitorexit ;
        throw dpw1;
_L5:
        dpw1 = new String("removeFromActive: reference request =");
          goto _L20
_L12:
        dpw1 = new String("transferrequest selected  on ");
          goto _L21
_L18:
        dpw1 = new String("mediaDecoded waiting to active request =");
          goto _L22
_L14:
        if (!c) goto _L24; else goto _L23
_L23:
        dpw1 = String.valueOf(dpw2.toString());
        if (dpw1.length() == 0) goto _L26; else goto _L25
_L25:
        dpw1 = "mediaDecoded waiting to active skipped: request =".concat(dpw1);
_L27:
        f(dpw1);
          goto _L24
_L26:
        dpw1 = new String("mediaDecoded waiting to active skipped: request =");
          goto _L27
_L7:
        obj;
        JVM INSTR monitorexit ;
        if (dpw2 != null)
        {
            c(dpw2);
        }
        return;
_L24:
        dpw1 = null;
          goto _L19
        dpw2 = null;
          goto _L7
    }

    static boolean d()
    {
        return c;
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
        String s1 = String.valueOf(toString());
        eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s).length())).append(s1).append(": ").append(s).toString());
    }

    protected String a()
    {
        return "MediaLoader";
    }

    public void a(dpw dpw1)
    {
        gdv.b();
        String s = String.valueOf(dpw1.o());
        eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 21)).append("Media failed to load:").append(s).toString());
        a(dpw1, " Failed");
        d(dpw1);
        b(dpw1.c());
        if (dpw1.a)
        {
            a(((Runnable) (new dpt(this, dpw1))));
            return;
        } else
        {
            dpw1.g();
            return;
        }
    }

    public void a(dpw dpw1, dpm dpm1)
    {
        byte abyte0[] = dpm1.a();
        if (c)
        {
            String s;
            String s1;
            if (dpm1 == null)
            {
                s = " null ";
            } else
            {
                int j = abyte0.length;
                s = (new StringBuilder(18)).append(" size=").append(j).append(" ").toString();
            }
            s1 = String.valueOf(dpw1.toString());
            f((new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append("mediaDownloaded ").append(s).append(s1).toString());
        }
        if (dpw1.e != null)
        {
            dpw1.e.e = System.nanoTime();
        }
        if (dpm1.c())
        {
            a(dpw1, " Volley Cache Hit");
        }
        if (abyte0 != null && abyte0.length > 0)
        {
            if (dpw1.o().r() != null && TextUtils.isEmpty(dpw1.o().q()))
            {
                g.execute(new dpo(this, dpw1, abyte0, dpm1));
                return;
            }
            if (dpw1.o().p())
            {
                g.execute(new dpp(this, dpw1, abyte0, dpm1));
                return;
            } else
            {
                g.execute(new dpq(this, dpw1, abyte0));
                return;
            }
        } else
        {
            b(dpw1);
            return;
        }
    }

    public void a(dpw dpw1, dpv dpv1)
    {
        gdv.b();
        Object obj;
        if (c)
        {
            obj = String.valueOf(dpw1.toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "mediaDecoded ".concat(((String) (obj)));
            } else
            {
                obj = new String("mediaDecoded ");
            }
            f(((String) (obj)));
        }
        d(dpw1);
        obj = b(dpw1.c());
        if (obj == null)
        {
            if (c)
            {
                eev.b("Babel_medialoader", "null requests");
            }
            if (dpv1 != null)
            {
                dpv1.b();
            }
        } else
        if (dpv1 != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj1 = (dor)((Iterator) (obj)).next();
                gdv.a("Expected condition to be true", obj1 instanceof dpw);
                dpv1.a();
                obj1 = (dpw)obj1;
                if (((dpw) (obj1)).e != null && dpw1.e != null)
                {
                    if (obj1 != dpw1)
                    {
                        ((dpw) (obj1)).e.c = dpw1.e.c;
                        ((dpw) (obj1)).e.d = dpw1.e.d;
                        ((dpw) (obj1)).e.e = dpw1.e.e;
                        a(((dpw) (obj1)), " Secondary request");
                    }
                    ((dpw) (obj1)).e.f = System.nanoTime();
                }
                if (((dpw) (obj1)).a)
                {
                    a(((Runnable) (new dps(this, ((dpw) (obj1)), dpv1))));
                } else
                {
                    ((dpw) (obj1)).a(dpv1);
                    dpv1.b();
                }
            }

            dpv1.b();
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
        if (!(obj instanceof dpw))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (dpw)obj;
        if (((dpw) (obj)).e != null)
        {
            ((dpw) (obj)).e.c = System.nanoTime();
        }
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        if (((dpw) (obj)).a()) goto _L5; else goto _L4
_L4:
        arraylist = ((ArrayList) (obj));
        if (!c) goto _L7; else goto _L6
_L6:
        arraylist = String.valueOf(((dpw) (obj)).toString());
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
        if (h.size() >= 8)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        if (!c) goto _L12; else goto _L11
_L11:
        arraylist = String.valueOf(((dpw) (obj)).toString());
        if (arraylist.length() == 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        arraylist = "execute add to active: reference request =".concat(arraylist);
_L13:
        f(arraylist);
_L12:
        h.add(obj);
        arraylist = ((ArrayList) (obj));
          goto _L7
        arraylist = new String("execute add to active: reference request =");
          goto _L13
        if (!c) goto _L15; else goto _L14
_L14:
        arraylist = String.valueOf(((dpw) (obj)).toString());
        if (arraylist.length() == 0)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        arraylist = "execute add to waiting: reference request =".concat(arraylist);
_L16:
        f(arraylist);
_L15:
        i.add(obj);
        arraylist = null;
          goto _L7
        arraylist = new String("execute add to waiting: reference request =");
          goto _L16
_L2:
        return;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public boolean a(dor dor1)
    {
        return a(dor1, false);
    }

    public boolean a(dor dor1, boolean flag)
    {
        dpw dpw1;
        boolean flag1;
        if (dor1 == null || !(dor1 instanceof dpw))
        {
            dor1 = String.valueOf(dor1);
            eev.g("Babel_medialoader", (new StringBuilder(String.valueOf(dor1).length() + 35)).append("MediaLoader.load: invalid request: ").append(dor1).toString());
            return false;
        }
        dpw1 = (dpw)dor1;
        if (c)
        {
            String s = String.valueOf(dpw1.toString());
            f((new StringBuilder(String.valueOf(s).length() + 30)).append("load req=").append(s).append(" loadOnlyCached=").append(flag).toString());
        }
        if (eev.b())
        {
            dpx dpx2 = new dpx();
            dpx2.a = System.currentTimeMillis();
            dpx2.b = System.nanoTime();
            dpx2.g = dpw1.c();
            synchronized (f)
            {
                if (e == null)
                {
                    e = new gnd(200);
                }
                e.a(dpx2);
                dpw1.e = dpx2;
            }
        } else
        if (e != null)
        {
            synchronized (f)
            {
                if (e != null)
                {
                    e = null;
                }
            }
        }
        if (dpw1.f() && dpw1.e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || flag)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            super.c(dor1);
            return false;
        }
        break MISSING_BLOCK_LABEL_288;
        dor1;
        obj;
        JVM INSTR monitorexit ;
        throw dor1;
        dor1;
        obj1;
        JVM INSTR monitorexit ;
        throw dor1;
        if (c)
        {
            String s1 = String.valueOf(dpw1.toString());
            if (s1.length() != 0)
            {
                s1 = "no cache found, load req=".concat(s1);
            } else
            {
                s1 = new String("no cache found, load req=");
            }
            f(s1);
        }
        return super.a(dor1);
        if (dpw1.e != null)
        {
            long l = System.nanoTime();
            dpw1.e.c = l;
            dpw1.e.d = l;
            dpw1.e.e = l;
            dpw1.e.f = l;
            dpx dpx1;
            if (flag1)
            {
                dor1 = " Bitmap Cache Hit";
            } else
            {
                dor1 = " Bitmap Cache Miss";
            }
            if (dpw1.e.h == null)
            {
                dpx1 = dpw1.e;
            } else
            {
                dpx1 = dpw1.e;
                String s2 = String.valueOf(dpx1.h);
                dor1 = String.valueOf(dor1);
                if (dor1.length() != 0)
                {
                    dor1 = s2.concat(dor1);
                } else
                {
                    dor1 = new String(s2);
                }
            }
            dpx1.h = dor1;
            if (c)
            {
                dor1 = String.valueOf(dpw1.e.toString());
                if (dor1.length() != 0)
                {
                    dor1 = "request history=".concat(dor1);
                } else
                {
                    dor1 = new String("request history=");
                }
                f(dor1);
            }
        }
        return flag1;
    }

    public void b(dpw dpw1)
    {
        g.execute(new dpu(this, dpw1));
    }

    public String toString()
    {
        int j = h.size();
        int k = i.size();
        return (new StringBuilder(51)).append("MediaLoader: active/waiting=").append(j).append("/").append(k).toString();
    }

    static 
    {
        hnc hnc = eev.p;
    }
}
