// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class hgx
{

    static final hij a = new hij("debug.binder.verification");
    private static final Object b = new Object();
    private static final hhc c = new hhc(new hhd());
    private Context d;
    private hgx e;
    private String f;
    private final Map g;
    private final Map h;
    private final HashSet i;
    private final ArrayList j;
    private boolean k;

    public hgx()
    {
        g = new HashMap();
        h = new HashMap();
        i = new HashSet();
        j = new ArrayList();
    }

    public hgx(Context context)
    {
        this(context, null);
    }

    public hgx(Context context, hgx hgx1)
    {
        g = new HashMap();
        h = new HashMap();
        i = new HashSet();
        j = new ArrayList();
        d = context;
        e = hgx1;
        f = context.getClass().getName();
    }

    public static hgx a(Context context, ad ad1)
    {
        for (; ad1 != null; ad1 = ad1.getParentFragment())
        {
            hgx hgx1 = a(ad1);
            if (hgx1 != null)
            {
                return hgx1;
            }
        }

        return b(context);
    }

    private static hgx a(Object obj)
    {
        hgx hgx1;
        if (obj instanceof hha)
        {
            hgx hgx2 = ((hha)obj).getBinder();
            hgx1 = hgx2;
            if (hgx2 == null)
            {
                obj = String.valueOf(obj);
                throw new IllegalStateException((new StringBuilder(String.valueOf(obj).length() + 43)).append("BinderContext must not return null Binder: ").append(((String) (obj))).toString());
            }
        } else
        {
            hgx1 = null;
        }
        return hgx1;
    }

    public static Object a(Context context, Class class1)
    {
        return b(context).a(class1);
    }

    private Object a(String s, Object obj)
    {
        hgx hgx1;
        hgx1 = this;
        if (d == null)
        {
            throw new IllegalStateException("Binder not initialized yet.");
        }
_L2:
        hgx1;
        JVM INSTR monitorenter ;
        Object obj1 = hgx1.g.get(s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        if (obj1 == b)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        hgx1;
        JVM INSTR monitorexit ;
        return obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        hgx1.g.put(s, b);
        hgx1;
        JVM INSTR monitorexit ;
        obj1 = hgx1.e;
        hgx1 = ((hgx) (obj1));
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return obj;
        s;
        hgx1;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static String a(Context context, String s)
    {
        return (String)b(context).a(s, null);
    }

    private void a(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        b();
        obj2 = g.get(obj);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (obj2 == b)
        {
            obj = String.valueOf(obj);
            throw new hgz((new StringBuilder(String.valueOf(obj).length() + 51)).append("Bind call too late - someone already tried to get: ").append(((String) (obj))).toString());
        }
        break MISSING_BLOCK_LABEL_75;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = String.valueOf(obj);
        obj1 = String.valueOf(obj2);
        throw new hgy((new StringBuilder(String.valueOf(obj).length() + 21 + String.valueOf(obj1).length())).append("Duplicate binding: ").append(((String) (obj))).append(", ").append(((String) (obj1))).toString());
        g.put(obj, obj1);
        this;
        JVM INSTR monitorexit ;
    }

    public static int b(Context context, String s)
    {
        return ((Integer)b(context).a(s, Integer.valueOf(300))).intValue();
    }

    public static hgx b(Context context)
    {
        Context context2 = context.getApplicationContext();
        boolean flag = false;
        Context context1 = context;
        do
        {
            context = a(context1);
            if (context != null)
            {
                return context;
            }
            boolean flag1;
            if (context1 == context2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag |= flag1;
            if (context1 instanceof ContextWrapper)
            {
                context1 = ((ContextWrapper)context1).getBaseContext();
                context = context1;
                if (context1 == null)
                {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else
            if (!flag)
            {
                context = context2;
            } else
            {
                context = null;
            }
            context1 = context;
        } while (context != null);
        return c(context2);
    }

    public static Object b(Context context, Class class1)
    {
        return b(context).b(class1);
    }

    private void b()
    {
        if (k)
        {
            throw new hgz("This binder is sealed for modification");
        } else
        {
            return;
        }
    }

    private void b(Object obj, Object obj1)
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        b();
        list = (List)h.get(obj);
        Object obj2;
        obj2 = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj2 = new ArrayList();
        h.put(obj, obj2);
        ((List) (obj2)).add(obj1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public static hgx c(Context context)
    {
        return c.a(context.getApplicationContext());
    }

    public static List c(Context context, Class class1)
    {
        return b(context).c(class1);
    }

    public static boolean c(Context context, String s)
    {
        return ((Boolean)b(context).a(s, Boolean.valueOf(true))).booleanValue();
    }

    private Object d(Class class1)
    {
        int l = 0;
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        break MISSING_BLOCK_LABEL_27;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        Object obj = g.get(class1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        class1 = ((Class) (b));
        if (obj == class1)
        {
            obj = null;
        }
_L3:
        this;
        JVM INSTR monitorexit ;
        return obj;
_L2:
        boolean flag;
        flag = k;
        k = false;
        int i1 = j.size();
_L5:
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        ((hhe)j.get(l)).a(d, class1, this);
        obj = g.get(class1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        k = flag;
          goto _L3
        Object obj1;
        k = flag;
        obj1 = g.get(class1);
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L4
_L4:
        g.put(class1, b);
        obj = obj1;
          goto _L3
        class1;
        k = flag;
        throw class1;
        l++;
          goto _L5
    }

    private List e(Class class1)
    {
        int l = 0;
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        break MISSING_BLOCK_LABEL_26;
        class1;
        this;
        JVM INSTR monitorexit ;
        throw class1;
        Object obj = (List)h.get(class1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = new ArrayList();
        h.put(class1, obj);
        boolean flag;
        if (i.contains(class1))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        i.add(class1);
        flag = k;
        k = false;
        int i1 = j.size();
_L2:
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((hhe)j.get(l)).a(d, class1, this);
        l++;
        if (true) goto _L2; else goto _L1
_L1:
        k = flag;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        class1;
        k = flag;
        throw class1;
    }

    public hgx a(hhe hhe1)
    {
        this;
        JVM INSTR monitorenter ;
        b();
        j.add(hhe1);
        this;
        JVM INSTR monitorexit ;
        return this;
        hhe1;
        throw hhe1;
    }

    public hgx a(Class class1, Object obj)
    {
        a(class1, obj);
        return this;
    }

    public transient hgx a(Class class1, Object aobj[])
    {
        for (int l = 0; l < aobj.length; l++)
        {
            b(class1, aobj[l]);
        }

        return this;
    }

    public hgx a(String s)
    {
        a(s, Integer.valueOf(3));
        return this;
    }

    public Object a(Class class1)
    {
        Object obj = b(class1);
        if (obj != null)
        {
            return obj;
        }
        obj = new StringBuilder();
        ((StringBuilder) (obj)).append("Unbound type: ").append(class1.getName()).append("\nSearched binders:\n");
        class1 = this;
        do
        {
            ((StringBuilder) (obj)).append(((hgx) (class1)).f);
            class1 = ((hgx) (class1)).e;
            if (class1 != null)
            {
                ((StringBuilder) (obj)).append(" ->\n");
            } else
            {
                class1 = ((StringBuilder) (obj)).toString();
                obj = new IllegalStateException(class1);
                Log.e("Binder", class1, ((Throwable) (obj)));
                throw obj;
            }
        } while (true);
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        k = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context)
    {
        d = context;
        if (f == null)
        {
            f = context.getClass().getName();
        }
    }

    public void a(hgx hgx1)
    {
        e = hgx1;
    }

    public hgx b(Class class1, Object obj)
    {
        b(class1, obj);
        return this;
    }

    public Object b(Class class1)
    {
        hgx hgx1 = this;
        Object obj;
        do
        {
            obj = hgx1.d(class1);
            if (obj != null)
            {
                return obj;
            }
            obj = hgx1.e;
            hgx1 = ((hgx) (obj));
        } while (obj != null);
        return null;
    }

    public void b(String s)
    {
        f = s;
    }

    public List c(Class class1)
    {
        ArrayList arraylist = new ArrayList();
        hgx hgx1 = this;
        hgx hgx2;
        do
        {
            arraylist.addAll(hgx1.e(class1));
            hgx2 = hgx1.e;
            hgx1 = hgx2;
        } while (hgx2 != null);
        return arraylist;
    }

}
