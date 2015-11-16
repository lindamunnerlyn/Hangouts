// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gnj
    implements gms
{

    static final gnz b = new gnz();
    private final SharedPreferences c;
    private List d;
    private final List e;
    private final List f;
    private List g;
    private final Context h;
    private boolean i;
    private boolean j;
    private final SparseArray k;
    private final Runnable l;

    gnj(Context context)
    {
        this(context, context.getSharedPreferences("accounts", 0));
    }

    private gnj(Context context, SharedPreferences sharedpreferences)
    {
        e = new ArrayList();
        f = new ArrayList();
        i = true;
        k = new SparseArray();
        l = new gnk(this);
        h = context;
        c = sharedpreferences;
        d = null;
    }

    static void a(gnj gnj1)
    {
        gnj1.h();
    }

    static void a(gnj gnj1, int i1)
    {
        gnj1.i(i1);
    }

    static void a(gnj gnj1, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        String s = (new StringBuilder(12)).append(i1).append(".").toString();
        String s1 = (new StringBuilder(12)).append(j1).append(".").toString();
        Iterator iterator = gnj1.c.getAll().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            String s2 = (String)((java.util.Map.Entry) (obj)).getKey();
            if (s2.startsWith(s))
            {
                gnj1 = String.valueOf(s1);
                s2 = String.valueOf(s2.substring(s.length()));
                if (s2.length() != 0)
                {
                    gnj1 = gnj1.concat(s2);
                } else
                {
                    gnj1 = new String(gnj1);
                }
                obj = ((java.util.Map.Entry) (obj)).getValue();
                if (obj instanceof String)
                {
                    editor.putString(gnj1, (String)obj);
                } else
                if (obj instanceof Boolean)
                {
                    editor.putBoolean(gnj1, ((Boolean)obj).booleanValue());
                } else
                if (obj instanceof Integer)
                {
                    editor.putInt(gnj1, ((Integer)obj).intValue());
                } else
                if (obj instanceof Long)
                {
                    editor.putLong(gnj1, ((Long)obj).longValue());
                } else
                if (obj instanceof Float)
                {
                    editor.putFloat(gnj1, ((Float)obj).floatValue());
                } else
                if (obj instanceof Set)
                {
                    editor.putStringSet(gnj1, (Set)obj);
                }
            }
        } while (true);
    }

    static SharedPreferences b(gnj gnj1)
    {
        return gnj1.c;
    }

    static void b(gnj gnj1, int i1)
    {
        gnj1.h(i1);
    }

    static List c(gnj gnj1)
    {
        return gnj1.d();
    }

    private void c()
    {
        boolean flag = false;
        if (!j)
        {
            j = true;
            if (d == null)
            {
                d = hgx.c(h, gmx);
            }
            Object obj = f;
            ((List) (obj)).add(new gnl(this));
            ((List) (obj)).add(new gnm(this));
            ((List) (obj)).add(new gnn(this));
            ((List) (obj)).add(new gno(this));
            ((List) (obj)).add(new gnp(this));
            ((List) (obj)).add(new gnq(this));
            for (obj = d.iterator(); ((Iterator) (obj)).hasNext(); ((gmx)((Iterator) (obj)).next()).a(f)) { }
            if (!c.contains("AccountStore#upgradeAccountCreated"))
            {
                obj = c.edit();
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("AccountStore#upgradeAccountCreated", true);
                int i2 = c.getInt("count", 0);
                for (int i1 = 0; i1 < i2; i1++)
                {
                    SharedPreferences sharedpreferences = c;
                    String s1 = String.valueOf("gaia_id");
                    if (sharedpreferences.contains((new StringBuilder(String.valueOf(s1).length() + 12)).append(i1).append(".").append(s1).toString()))
                    {
                        String s = String.valueOf("created");
                        ((android.content.SharedPreferences.Editor) (obj)).putBoolean((new StringBuilder(String.valueOf(s).length() + 12)).append(i1).append(".").append(s).toString(), true);
                    }
                }

                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
            g();
            obj = c.edit();
            SparseArray sparsearray = new SparseArray();
            int j1;
            for (Iterator iterator = a().iterator(); iterator.hasNext(); sparsearray.put(j1, new gnr(this, j1)))
            {
                j1 = ((Integer)iterator.next()).intValue();
            }

            Iterator iterator1 = f.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                String s2 = ((gmz)iterator1.next()).a();
                if (c.contains(s2))
                {
                    for (int k1 = 0; k1 < sparsearray.size(); k1++)
                    {
                        ((gnr)sparsearray.valueAt(k1)).c(s2, true);
                    }

                    ((android.content.SharedPreferences.Editor) (obj)).remove(s2);
                }
            } while (true);
            int j2 = 0;
            int l1;
            do
            {
                l1 = ((flag) ? 1 : 0);
                if (j2 >= sparsearray.size())
                {
                    break;
                }
                gnr gnr1 = (gnr)sparsearray.valueAt(j2);
                Iterator iterator2 = f.iterator();
                do
                {
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    gmz gmz1 = (gmz)iterator2.next();
                    String s3 = gmz1.a();
                    if (!gnr1.a(s3))
                    {
                        gmz1.a(h, gnr1);
                        gnr1.c(s3, true);
                    }
                } while (true);
                j2++;
            } while (true);
            for (; l1 < sparsearray.size(); l1++)
            {
                int k2 = sparsearray.keyAt(l1);
                ((gnr)sparsearray.valueAt(l1)).a(k2, ((android.content.SharedPreferences.Editor) (obj)));
            }

            ((android.content.SharedPreferences.Editor) (obj)).apply();
            g();
        }
    }

    static int d(gnj gnj1)
    {
        return gnj1.e();
    }

    private List d()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        if (g == null)
        {
            g = hgx.c(h, gmr);
        }
        list = g;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    private int e()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = c.getInt("count", 0);
        c.edit().putInt("count", i1 + 1).apply();
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    static void e(gnj gnj1)
    {
        gnj1.g();
    }

    private void f()
    {
        if (!i)
        {
            return;
        }
        c();
        int j1 = c.getInt("count", 0);
        k.clear();
        for (int i1 = 0; i1 < j1; i1++)
        {
            SharedPreferences sharedpreferences = c;
            String s = String.valueOf("created");
            if (sharedpreferences.contains((new StringBuilder(String.valueOf(s).length() + 12)).append(i1).append(".").append(s).toString()))
            {
                k.put(i1, new gns(this, i1));
            }
        }

        i = false;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        i = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void g(int i1)
    {
        android.content.SharedPreferences.Editor editor = c.edit();
        Iterator iterator = c.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s.startsWith("key.") && c.getInt(s, -1) == i1)
            {
                editor.remove(s);
            }
        } while (true);
        editor.apply();
    }

    private void h()
    {
        if (!g.v())
        {
            g.b(l);
        } else
        {
            int j1 = e.size();
            gmy agmy[] = (gmy[])e.toArray(new gmy[j1]);
            int i1 = 0;
            while (i1 < j1) 
            {
                agmy[i1].F_();
                i1++;
            }
        }
    }

    private void h(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("AccountStore", 3))
        {
            (new StringBuilder(28)).append("Removing account ").append(i1);
        }
        j(i1);
        g(i1);
        i(i1);
        g();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void i(int i1)
    {
        String s = (new StringBuilder(12)).append(i1).append(".").toString();
        android.content.SharedPreferences.Editor editor = c.edit();
        Iterator iterator = c.getAll().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)((java.util.Map.Entry)iterator.next()).getKey();
            if (s1.startsWith(s))
            {
                editor.remove(s1);
            }
        } while (true);
        editor.apply();
    }

    private void j(int i1)
    {
        boolean flag1 = true;
        boolean flag = false;
        Object obj;
        String as[];
        try
        {
            obj = new File(new File(h.getFilesDir(), "account-blobs"), String.format("account-%d", new Object[] {
                Integer.valueOf(i1)
            }));
        }
        catch (IOException ioexception)
        {
            return;
        }
        i1 = ((flag1) ? 1 : 0);
        if (!((File) (obj)).isDirectory())
        {
            if (((File) (obj)).mkdirs())
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = String.valueOf(obj);
        throw new IOException((new StringBuilder(String.valueOf(obj).length() + 35)).append("Could not create account blob dir: ").append(((String) (obj))).toString());
        as = ((File) (obj)).list();
        i1 = ((flag) ? 1 : 0);
_L2:
        if (i1 >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        (new File(((File) (obj)), as[i1])).delete();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        ((File) (obj)).delete();
        return;
    }

    public gmu a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        f();
        obj = (gmu)k.get(i1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new gmv((new StringBuilder(28)).append("No such account: ").append(i1).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((gmu) (obj));
    }

    public gmw a(String s)
    {
        return a(s, ((String) (null)));
    }

    public gmw a(String s, String s1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        gnr gnr1;
        c();
        gnr1 = new gnr(this, -1);
        gnr1.c("created", true);
        gnr1.c("account_name", s);
        gnr1.c("effective_gaia_id", s1);
        if (s1 == null)
        {
            flag = false;
        }
        gnr1.c("is_managed_account", flag);
        for (s = d.iterator(); s.hasNext(); ((gmx)s.next()).a(h, gnr1)) { }
        break MISSING_BLOCK_LABEL_120;
        s;
        throw s;
        for (s = f.iterator(); s.hasNext(); gnr1.c(((gmz)s.next()).a(), true)) { }
        this;
        JVM INSTR monitorexit ;
        return gnr1;
    }

    public List a()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int j1;
        f();
        j1 = k.size();
        arraylist = new ArrayList(j1);
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Integer.valueOf(k.keyAt(i1)));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        return arraylist;
        Exception exception;
        exception;
        throw exception;
    }

    public transient List a(String as[])
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int k1;
        f();
        k1 = k.size();
        arraylist = new ArrayList(k1);
        int i1 = 0;
_L5:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        gmu gmu1 = (gmu)k.valueAt(i1);
        int j1 = 0;
_L3:
        if (j1 > 0)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (gmu1.d(as[j1]))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        for (j1 = 0; j1 == 0; j1 = 1)
        {
            break MISSING_BLOCK_LABEL_96;
        }

        arraylist.add(Integer.valueOf(k.keyAt(i1)));
        i1++;
        continue; /* Loop/switch isn't completed */
        j1++;
        if (true) goto _L3; else goto _L2
_L2:
        return arraylist;
        continue; /* Loop/switch isn't completed */
        as;
        throw as;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(gmy gmy1)
    {
        this;
        JVM INSTR monitorenter ;
        g.w();
        e.add(gmy1);
        this;
        JVM INSTR monitorexit ;
        return;
        gmy1;
        throw gmy1;
    }

    public void a(String s, int i1)
    {
        if (i1 != -1 && !c(i1))
        {
            throw new gmv((new StringBuilder(35)).append("Account does not exist: ").append(i1).toString());
        }
        android.content.SharedPreferences.Editor editor = c.edit();
        String s1 = String.valueOf("key.");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        editor.putInt(s, i1).apply();
        h();
    }

    public int b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = b(s, ((String) (null)));
        this;
        JVM INSTR monitorexit ;
        return i1;
        s;
        throw s;
    }

    public int b(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        SparseArray sparsearray;
        f();
        sparsearray = k;
        int i1 = 0;
_L8:
        if (i1 >= sparsearray.size()) goto _L2; else goto _L1
_L1:
        gmu gmu1 = (gmu)sparsearray.valueAt(i1);
        if (!TextUtils.equals(gmu1.b("account_name"), s) || !TextUtils.equals(gmu1.b("effective_gaia_id"), s1)) goto _L4; else goto _L3
_L3:
        i1 = sparsearray.keyAt(i1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return i1;
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = -1;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public gmw b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c(i1))
        {
            throw new gmv((new StringBuilder(28)).append("No such account: ").append(i1).toString());
        }
        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        gnr gnr1 = new gnr(this, i1);
        this;
        JVM INSTR monitorexit ;
        return gnr1;
    }

    public String b()
    {
        return (new gny(this)).a();
    }

    public void b(gmy gmy1)
    {
        this;
        JVM INSTR monitorenter ;
        g.w();
        e.remove(gmy1);
        this;
        JVM INSTR monitorexit ;
        return;
        gmy1;
        throw gmy1;
    }

    public int c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SparseArray sparsearray;
        f();
        sparsearray = k;
        int i1 = 0;
_L8:
        if (i1 >= sparsearray.size()) goto _L2; else goto _L1
_L1:
        gmu gmu1 = (gmu)sparsearray.valueAt(i1);
        if (!TextUtils.equals(gmu1.b("gaia_id"), s) || gmu1.d("is_managed_account")) goto _L4; else goto _L3
_L3:
        i1 = sparsearray.keyAt(i1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return i1;
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = -1;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        f();
        obj = k.get(i1);
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public int d(String s)
    {
        SharedPreferences sharedpreferences = c;
        String s1 = String.valueOf("key.");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return sharedpreferences.getInt(s, -1);
    }

    public boolean d(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c(i1)) goto _L2; else goto _L1
_L1:
        boolean flag = a(i1).a();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean e(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c(i1)) goto _L2; else goto _L1
_L1:
        boolean flag = a(i1).b();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public void f(int i1)
    {
        for (Iterator iterator = d().iterator(); iterator.hasNext(); ((gmr)iterator.next()).c(i1)) { }
        h(i1);
        h();
    }

}
