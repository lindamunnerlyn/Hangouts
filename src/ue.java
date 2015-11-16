// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ue extends DataSetObservable
{

    private static final String a = ue.getSimpleName();
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private final Object d = new Object();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final Context g;
    private final String h;
    private Intent i;
    private ug j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private a p;

    private ue(Context context, String s)
    {
        j = new uh(this);
        k = 50;
        l = true;
        m = false;
        n = true;
        o = false;
        g = context.getApplicationContext();
        if (!TextUtils.isEmpty(s) && !s.endsWith(".xml"))
        {
            h = (new StringBuilder()).append(s).append(".xml").toString();
            return;
        } else
        {
            h = s;
            return;
        }
    }

    static Context a(ue ue1)
    {
        return ue1.g;
    }

    public static ue a(Context context, String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        ue ue2 = (ue)c.get(s);
        ue ue1;
        ue1 = ue2;
        if (ue2 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ue1 = new ue(context, s);
        c.put(s, ue1);
        obj;
        JVM INSTR monitorexit ;
        return ue1;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private boolean a(ui ui1)
    {
        boolean flag = f.add(ui1);
        if (flag)
        {
            n = true;
            g();
            if (!m)
            {
                throw new IllegalStateException("No preceding call to #readHistoricalData");
            }
            if (n)
            {
                n = false;
                if (!TextUtils.isEmpty(h))
                {
                    ui1 = new uj(this);
                    Object aobj[] = new Object[2];
                    aobj[0] = new ArrayList(f);
                    aobj[1] = h;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        ui1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
                    } else
                    {
                        ui1.execute(aobj);
                    }
                }
            }
            f();
            notifyChanged();
        }
        return flag;
    }

    static String b(ue ue1)
    {
        return ue1.h;
    }

    static boolean c(ue ue1)
    {
        ue1.l = true;
        return true;
    }

    static String d()
    {
        return a;
    }

    private void e()
    {
        boolean flag1 = true;
        boolean flag;
        if (o && i != null)
        {
            o = false;
            e.clear();
            List list = g.getPackageManager().queryIntentActivities(i, 0);
            int j1 = list.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ResolveInfo resolveinfo = (ResolveInfo)list.get(i1);
                e.add(new uf(this, resolveinfo));
            }

            flag = true;
        } else
        {
            flag = false;
        }
        if (l && n && !TextUtils.isEmpty(h))
        {
            l = false;
            m = true;
            h();
        } else
        {
            flag1 = false;
        }
        g();
        if (flag | flag1)
        {
            f();
            notifyChanged();
        }
    }

    private boolean f()
    {
        if (j != null && i != null && !e.isEmpty() && !f.isEmpty())
        {
            j.a(e, Collections.unmodifiableList(f));
            return true;
        } else
        {
            return false;
        }
    }

    private void g()
    {
        int j1 = f.size() - k;
        if (j1 > 0)
        {
            n = true;
            int i1 = 0;
            while (i1 < j1) 
            {
                f.remove(0);
                i1++;
            }
        }
    }

    private void h()
    {
        Object obj;
        Object obj1;
        Exception exception;
        List list;
        int i1;
        try
        {
            obj = g.openFileInput(h);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            return;
        }
        obj1 = Xml.newPullParser();
        ((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), "UTF-8");
        i1 = 0;
_L1:
        if (i1 == 1 || i1 == 2)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        i1 = ((XmlPullParser) (obj1)).next();
          goto _L1
        if (!"historical-records".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file does not start with historical-records tag.");
        }
          goto _L2
        obj1;
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        ((FileInputStream) (obj)).close();
_L6:
        return;
_L2:
        list = f;
        list.clear();
_L4:
        i1 = ((XmlPullParser) (obj1)).next();
        if (i1 == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 3 || i1 == 4) goto _L4; else goto _L3
_L3:
        if (!"historical-record".equals(((XmlPullParser) (obj1)).getName()))
        {
            throw new XmlPullParserException("Share records file not well-formed.");
        }
        break MISSING_BLOCK_LABEL_218;
        obj1;
        Log.e(a, (new StringBuilder("Error reading historical recrod file: ")).append(h).toString(), ((Throwable) (obj1)));
        if (obj == null) goto _L6; else goto _L5
_L5:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        list.add(new ui(((XmlPullParser) (obj1)).getAttributeValue(null, "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(null, "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(null, "weight"))));
          goto _L4
        exception;
        IOException ioexception;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw exception;
        if (obj == null) goto _L6; else goto _L7
_L7:
        try
        {
            ((FileInputStream) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return;
        }
        ioexception;
    }

    public int a()
    {
        int i1;
        synchronized (d)
        {
            e();
            i1 = e.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int a(ResolveInfo resolveinfo)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        List list;
        int j1;
        e();
        list = e;
        j1 = list.size();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (((uf)list.get(i1)).a != resolveinfo)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        obj;
        JVM INSTR monitorexit ;
        return i1;
        obj;
        JVM INSTR monitorexit ;
        return -1;
        resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        throw resolveinfo;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public ResolveInfo a(int i1)
    {
        ResolveInfo resolveinfo;
        synchronized (d)
        {
            e();
            resolveinfo = ((uf)e.get(i1)).a;
        }
        return resolveinfo;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Intent b(int i1)
    {
label0:
        {
            synchronized (d)
            {
                if (i != null)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj1;
        Intent intent;
        e();
        obj1 = (uf)e.get(i1);
        obj1 = new ComponentName(((uf) (obj1)).a.activityInfo.packageName, ((uf) (obj1)).a.activityInfo.name);
        intent = new Intent(i);
        intent.setComponent(((ComponentName) (obj1)));
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        new Intent(intent);
        if (!p.a())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        a(new ui(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
        obj;
        JVM INSTR monitorexit ;
        return intent;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public ResolveInfo b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        ResolveInfo resolveinfo;
        e();
        if (e.isEmpty())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        resolveinfo = ((uf)e.get(0)).a;
        return resolveinfo;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int c()
    {
        int i1;
        synchronized (d)
        {
            e();
            i1 = f.size();
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c(int i1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        uf uf1;
        uf uf2;
        e();
        uf1 = (uf)e.get(i1);
        uf2 = (uf)e.get(0);
        if (uf2 == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        float f1 = (uf2.b - uf1.b) + 5F;
_L1:
        a(new ui(new ComponentName(uf1.a.activityInfo.packageName, uf1.a.activityInfo.name), System.currentTimeMillis(), f1));
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        f1 = 1.0F;
          goto _L1
    }

}
