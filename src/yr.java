// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class yr extends ViewGroup
    implements jl, jv
{

    private static final Interpolator an = new yu();
    private static final boolean h;
    private static final Class i[];
    private boolean A;
    private int B;
    private boolean C;
    private final boolean D;
    private final AccessibilityManager E;
    private List F;
    private boolean G;
    private int H;
    private or I;
    private or J;
    private or K;
    private or L;
    private int M;
    private int N;
    private VelocityTracker O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private final int U;
    private final int V;
    private float W;
    final zj a;
    private final zp aa;
    private zh ab;
    private List ac;
    private zb ad;
    private boolean ae;
    private zr af;
    private a ag;
    private final int ah[];
    private final jm ai;
    private final int aj[];
    private final int ak[];
    private final int al[];
    private Runnable am;
    wh b;
    xd c;
    za d;
    final zo e;
    boolean f;
    boolean g;
    private final zk j;
    private zl k;
    private boolean l;
    private final Runnable m;
    private final Rect n;
    private yx o;
    private ze p;
    private a q;
    private final ArrayList r;
    private final ArrayList s;
    private zg t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public yr(Context context)
    {
        this(context, null);
    }

    public yr(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public yr(Context context, AttributeSet attributeset, int i1)
    {
        Object obj;
        Object obj1;
        Class class1;
        super(context, attributeset, i1);
        j = new zk(this);
        a = new zj(this);
        m = new ys(this);
        n = new Rect();
        r = new ArrayList();
        s = new ArrayList();
        G = false;
        H = 0;
        d = new xg();
        M = 0;
        N = -1;
        W = 1.401298E-45F;
        aa = new zp(this);
        e = new zo();
        f = false;
        g = false;
        ad = new zc(this);
        ae = false;
        ah = new int[2];
        aj = new int[2];
        ak = new int[2];
        al = new int[2];
        am = new yt(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        Object aobj[];
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        D = flag;
        obj = ViewConfiguration.get(context);
        T = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        U = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        V = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        if (kb.a(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        d.a(ad);
        a();
        c = new xd(new yv(this));
        if (kb.e(this) == 0)
        {
            kb.c(this, 1);
        }
        E = (AccessibilityManager)getContext().getSystemService("accessibility");
        a(new zr(this));
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        obj = context.obtainStyledAttributes(attributeset, vq.F, i1, 0);
        obj1 = ((TypedArray) (obj)).getString(vq.G);
        ((TypedArray) (obj)).recycle();
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj = ((String) (obj1)).trim();
        if (((String) (obj)).length() == 0) goto _L2; else goto _L4
_L4:
        if (((String) (obj)).charAt(0) == '.')
        {
            obj = (new StringBuilder()).append(context.getPackageName()).append(((String) (obj))).toString();
        } else
        if (!((String) (obj)).contains("."))
        {
            obj = (new StringBuilder()).append(yr.getPackage().getName()).append('.').append(((String) (obj))).toString();
        }
_L9:
        if (!isInEditMode()) goto _L6; else goto _L5
_L5:
        obj1 = getClass().getClassLoader();
_L7:
        class1 = ((ClassLoader) (obj1)).loadClass(((String) (obj))).asSubclass(ze);
        obj1 = class1.getConstructor(i);
        aobj = new Object[4];
        aobj[0] = context;
        aobj[1] = attributeset;
        aobj[2] = Integer.valueOf(i1);
        aobj[3] = Integer.valueOf(0);
        context = ((Context) (aobj));
_L8:
        NoSuchMethodException nosuchmethodexception;
        try
        {
            ((Constructor) (obj1)).setAccessible(true);
            a((ze)((Constructor) (obj1)).newInstance(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Unable to find LayoutManager ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Cannot access non-public constructor ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Class is not a LayoutManager ").append(((String) (obj))).toString(), context);
        }
_L2:
        ai = new jm(this);
        setNestedScrollingEnabled(true);
        return;
_L6:
        obj1 = context.getClassLoader();
          goto _L7
        context;
        obj1 = class1.getConstructor(new Class[0]);
        context = null;
          goto _L8
        nosuchmethodexception;
        nosuchmethodexception.initCause(context);
        throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error creating LayoutManager ").append(((String) (obj))).toString(), nosuchmethodexception);
          goto _L9
    }

    private void A()
    {
        m.run();
    }

    private void B()
    {
        aa.b();
        if (p != null)
        {
            p.s();
        }
    }

    private void C()
    {
        if (O != null)
        {
            O.clear();
        }
        stopNestedScroll();
        boolean flag1 = false;
        if (I != null)
        {
            flag1 = I.c();
        }
        boolean flag = flag1;
        if (J != null)
        {
            flag = flag1 | J.c();
        }
        flag1 = flag;
        if (K != null)
        {
            flag1 = flag | K.c();
        }
        flag = flag1;
        if (L != null)
        {
            flag = flag1 | L.c();
        }
        if (flag)
        {
            kb.d(this);
        }
    }

    private void D()
    {
        C();
        e(0);
    }

    private void E()
    {
        H = H + 1;
    }

    private void F()
    {
        H = H - 1;
        if (H <= 0)
        {
            H = 0;
            int i1 = B;
            B = 0;
            if (i1 != 0 && n())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                mj.a(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    private boolean G()
    {
        return d != null && d.i();
    }

    private void H()
    {
        if (!ae && u)
        {
            kb.a(this, am);
            ae = true;
        }
    }

    private void I()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (G)
        {
            b.a();
            u();
        }
        zo zo1;
        if (d != null && p.f())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (f && !g || f || g && G())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zo1 = e;
        if (w && d != null && (G || flag || ze.a(p)) && (!G || o.b))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zo1.k = flag1;
        zo1 = e;
        if (!e.k || !flag || G) goto _L2; else goto _L1
_L1:
        if (d != null && p.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        flag1 = flag2;
_L5:
        zo1.l = flag1;
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = jg.b(motionevent);
        if (jg.b(motionevent, i1) == N)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            N = jg.b(motionevent, i1);
            j1 = (int)(jg.c(motionevent, i1) + 0.5F);
            R = j1;
            P = j1;
            i1 = (int)(jg.d(motionevent, i1) + 0.5F);
            S = i1;
            Q = i1;
        }
    }

    private void a(gz gz1)
    {
        List list = e.e;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            zq zq1 = b(view);
            zd zd1 = (zd)e.b.remove(zq1);
            if (!e.a())
            {
                e.c.remove(zq1);
            }
            if (gz1.remove(view) != null)
            {
                p.a(view, a);
            } else
            if (zd1 != null)
            {
                a(zd1);
            } else
            {
                a(new zd(zq1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i1--;
        }
        list.clear();
    }

    static void a(yr yr1, int i1)
    {
        yr1.detachViewFromParent(i1);
    }

    static void a(yr yr1, int i1, int j1)
    {
        yr1.f(i1, j1);
    }

    static void a(yr yr1, View view)
    {
        b(view);
        if (yr1.F != null)
        {
            for (int i1 = yr1.F.size() - 1; i1 >= 0; i1--)
            {
                yr1.F.get(i1);
            }

        }
    }

    static void a(yr yr1, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        yr1.attachViewToParent(view, i1, layoutparams);
    }

    private void a(zd zd1)
    {
        View view = zd1.a.a;
        b(zd1.a);
        int i1 = zd1.b;
        int j1 = zd1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (!zd1.a.n() && (i1 != k1 || j1 != l1))
        {
            zd1.a.a(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (d.a(zd1.a, i1, j1, k1, l1))
            {
                H();
            }
            return;
        } else
        {
            zd1.a.a(false);
            d.a(zd1.a);
            H();
            return;
        }
    }

    static boolean a(yr yr1)
    {
        return yr1.w;
    }

    static zq b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((zf)view.getLayoutParams()).a;
        }
    }

    static void b(yr yr1, int i1)
    {
        yr1.e(i1);
    }

    static void b(yr yr1, int i1, int j1)
    {
        yr1.g(i1, j1);
    }

    static void b(yr yr1, View view)
    {
        yr1.e(view);
    }

    private void b(zq zq1)
    {
        View view = zq1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (zq1.p())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view);
            return;
        } else
        {
            c.e(view);
            return;
        }
    }

    static boolean b(yr yr1)
    {
        return yr1.G;
    }

    public static void c(yr yr1, int i1)
    {
        if (yr1.p != null)
        {
            yr1.p.b(i1);
            yr1.awakenScrollBars();
        }
    }

    static boolean c(yr yr1)
    {
        return yr1.y;
    }

    static boolean c(yr yr1, View view)
    {
        yr1.e();
        boolean flag = yr1.c.f(view);
        if (flag)
        {
            view = b(view);
            yr1.a.b(view);
            yr1.a.a(view);
        }
        yr1.a(false);
        return flag;
    }

    static boolean d(yr yr1)
    {
        yr1.ae = false;
        return false;
    }

    static ze e(yr yr1)
    {
        return yr1.p;
    }

    private void e(int i1)
    {
        if (i1 == M)
        {
            return;
        }
        M = i1;
        if (i1 != 2)
        {
            B();
        }
        w();
    }

    private void e(View view)
    {
        b(view);
        if (F != null)
        {
            for (int i1 = F.size() - 1; i1 >= 0; i1--)
            {
                F.get(i1);
            }

        }
    }

    private void f(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (I != null)
        {
            flag = flag1;
            if (!I.a())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = I.c();
                }
            }
        }
        flag1 = flag;
        if (K != null)
        {
            flag1 = flag;
            if (!K.a())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | K.c();
                }
            }
        }
        flag = flag1;
        if (J != null)
        {
            flag = flag1;
            if (!J.a())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | J.c();
                }
            }
        }
        flag1 = flag;
        if (L != null)
        {
            flag1 = flag;
            if (!L.a())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | L.c();
                }
            }
        }
        if (flag1)
        {
            kb.d(this);
        }
    }

    static void f(yr yr1)
    {
        yr1.A();
    }

    static yx g(yr yr1)
    {
        return yr1.o;
    }

    private void g(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        switch (l1)
        {
        default:
            i1 = kb.m(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = kb.n(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    static void h(yr yr1)
    {
        yr1.E();
    }

    private boolean h(int i1, int j1)
    {
        int l1;
        boolean flag1;
        flag1 = false;
        l1 = c.b();
        if (l1 != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (i1 == 0)
            {
                flag = flag1;
                if (j1 == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        int k1 = 0;
        do
        {
            flag = flag1;
            if (k1 >= l1)
            {
                continue;
            }
            zq zq1 = b(c.b(k1));
            if (!zq1.c())
            {
                int i2 = zq1.d();
                if (i2 < i1 || i2 > j1)
                {
                    return true;
                }
            }
            k1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean i(yr yr1)
    {
        return yr1.G();
    }

    static void j(yr yr1)
    {
        yr1.F();
    }

    static ArrayList k(yr yr1)
    {
        return yr1.r;
    }

    static boolean l(yr yr1)
    {
        return yr1.awakenScrollBars();
    }

    static boolean m(yr yr1)
    {
        return yr1.D;
    }

    static boolean n(yr yr1)
    {
        return yr1.v;
    }

    static boolean o(yr yr1)
    {
        return yr1.u;
    }

    static Runnable p(yr yr1)
    {
        return yr1.m;
    }

    static boolean q(yr yr1)
    {
        yr1.C = true;
        return true;
    }

    static zr r(yr yr1)
    {
        return yr1.af;
    }

    static a s(yr yr1)
    {
        return yr1.q;
    }

    public static zp t(yr yr1)
    {
        return yr1.aa;
    }

    static Interpolator y()
    {
        return an;
    }

    static boolean z()
    {
        return h;
    }

    long a(zq zq1)
    {
        if (o.b)
        {
            return zq1.d;
        } else
        {
            return (long)zq1.b;
        }
    }

    public zq a(View view)
    {
        ViewParent viewparent = view.getParent();
        if (viewparent != null && viewparent != this)
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a direct child of ").append(this).toString());
        } else
        {
            return b(view);
        }
    }

    void a()
    {
        b = new wh(new yw(this));
    }

    public void a(int i1)
    {
        if (z)
        {
            return;
        }
        g();
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            p.b(i1);
            awakenScrollBars();
            return;
        }
    }

    public void a(int i1, int j1)
    {
        boolean flag = false;
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!z)
        {
            if (!p.c())
            {
                i1 = 0;
            }
            if (!p.d())
            {
                j1 = ((flag) ? 1 : 0);
            }
            if (i1 != 0 || j1 != 0)
            {
                aa.b(i1, j1);
                return;
            }
        }
    }

    void a(int i1, int j1, Object obj)
    {
        int l1 = c.c();
        for (int k1 = 0; k1 < l1; k1++)
        {
            View view = c.c(k1);
            zq zq1 = b(view);
            if (zq1 == null || zq1.c() || zq1.b < i1 || zq1.b >= i1 + j1)
            {
                continue;
            }
            zq1.a(2);
            zq1.a(obj);
            if (G())
            {
                zq1.a(64);
            }
            ((zf)view.getLayoutParams()).c = true;
        }

        a.c(i1, j1);
    }

    void a(int i1, int j1, boolean flag)
    {
        int l1 = c.c();
        int k1 = 0;
        while (k1 < l1) 
        {
            zq zq1 = b(c.c(k1));
            if (zq1 != null && !zq1.c())
            {
                if (zq1.b >= i1 + j1)
                {
                    zq1.a(-j1, flag);
                    e.i = true;
                } else
                if (zq1.b >= i1)
                {
                    zq1.a(i1 - 1, -j1, flag);
                    e.i = true;
                }
            }
            k1++;
        }
        a.a(i1, j1, flag);
        requestLayout();
    }

    void a(String s1)
    {
        if (o())
        {
            if (s1 == null)
            {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s1);
            }
        } else
        {
            return;
        }
    }

    public void a(yx yx1)
    {
        f();
        if (o != null)
        {
            o.b(j);
        }
        if (d != null)
        {
            d.d();
        }
        if (p != null)
        {
            p.c(a);
            p.b(a);
        }
        a.a();
        b.a();
        yx yx2 = o;
        o = yx1;
        if (yx1 != null)
        {
            yx1.a(j);
        }
        a.a(yx2, o, false);
        e.i = true;
        u();
        requestLayout();
    }

    public void a(ze ze1)
    {
        if (ze1 == p)
        {
            return;
        }
        if (p != null)
        {
            if (u)
            {
                p.b(this, a);
            }
            p.a(null);
        }
        a.a();
        c.a();
        p = ze1;
        if (ze1 != null)
        {
            if (ze1.i != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(ze1).append(" is already attached to a RecyclerView: ").append(ze1.i).toString());
            }
            p.a(this);
            if (u)
            {
                p.h();
            }
        }
        requestLayout();
    }

    public void a(zg zg1)
    {
        s.add(zg1);
    }

    public void a(zh zh1)
    {
        ab = zh1;
    }

    public void a(zr zr1)
    {
        af = zr1;
        kb.a(this, af);
    }

    void a(boolean flag)
    {
        if (x)
        {
            if (flag && y && !z && p != null && o != null)
            {
                p();
            }
            x = false;
            if (!z)
            {
                y = false;
            }
        }
    }

    boolean a(int i1, int j1, MotionEvent motionevent)
    {
        int l1 = 0;
        boolean flag4 = false;
        int j2 = 0;
        boolean flag2 = false;
        int k2 = 0;
        int k1 = 0;
        int i2 = 0;
        boolean flag3 = false;
        A();
        if (o != null)
        {
            e();
            E();
            g.a("RV Scroll");
            l1 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = p.a(i1, a, e);
                l1 = i1 - k1;
            }
            i2 = ((flag3) ? 1 : 0);
            j2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = p.b(j1, a, e);
                j2 = j1 - i2;
            }
            g.a();
            if (G())
            {
                int l2 = c.b();
                k2 = 0;
                while (k2 < l2) 
                {
                    View view = c.b(k2);
                    Object obj = a(view);
                    if (obj == null || ((zq) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((zq) (obj)).h;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((zq) (obj)).a;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    i3 = view.getLeft();
                    j3 = view.getTop();
                    if (i3 != ((View) (obj)).getLeft() || j3 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i3, j3, ((View) (obj)).getWidth() + i3, ((View) (obj)).getHeight() + j3);
                    }
                    k2++;
                }
            }
            F();
            a(false);
            k2 = k1;
        }
        if (!r.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k2, i2, l1, j2, aj))
        {
            R = R - aj[0];
            S = S - aj[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(aj[0], aj[1]);
            }
            motionevent = al;
            motionevent[0] = motionevent[0] + aj[0];
            motionevent = al;
            motionevent[1] = motionevent[1] + aj[1];
        } else
        if (kb.a(this) != 2)
        {
            if (motionevent != null)
            {
                float f1 = motionevent.getX();
                float f2 = l1;
                float f3 = motionevent.getY();
                float f4 = j2;
                boolean flag1 = false;
                boolean flag;
                if (f2 < 0.0F)
                {
                    h();
                    flag = flag1;
                    if (I.a(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
                    {
                        flag = true;
                    }
                } else
                {
                    flag = flag1;
                    if (f2 > 0.0F)
                    {
                        i();
                        flag = flag1;
                        if (K.a(f2 / (float)getWidth(), f3 / (float)getHeight()))
                        {
                            flag = true;
                        }
                    }
                }
                if (f4 < 0.0F)
                {
                    j();
                    flag1 = flag;
                    if (J.a(-f4 / (float)getHeight(), f1 / (float)getWidth()))
                    {
                        flag1 = true;
                    }
                } else
                {
                    flag1 = flag;
                    if (f4 > 0.0F)
                    {
                        k();
                        flag1 = flag;
                        if (L.a(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                        {
                            flag1 = true;
                        }
                    }
                }
                if (flag1 || f2 != 0.0F || f4 != 0.0F)
                {
                    kb.d(this);
                }
            }
            f(i1, j1);
        }
        if (k2 != 0 || i2 != 0)
        {
            v();
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k2 != 0 || i2 != 0;
    }

    boolean a(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (o())
        {
            int i1;
            if (accessibilityevent != null)
            {
                i1 = mj.b(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            B = i1 | B;
            flag1 = true;
        }
        return flag1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    zq b(int i1)
    {
        int k1 = c.c();
        for (int j1 = 0; j1 < k1; j1++)
        {
            zq zq1 = b(c.c(j1));
            if (zq1 != null && !zq1.n() && zq1.b == i1)
            {
                return zq1;
            }
        }

        return null;
    }

    public void b()
    {
        v = true;
    }

    public boolean b(int i1, int j1)
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L4:
        return false;
_L2:
        int k1;
        boolean flag;
        boolean flag1;
label0:
        {
            if (z)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = p.c();
            flag1 = p.d();
            if (flag)
            {
                k1 = i1;
                if (Math.abs(i1) >= U)
                {
                    break label0;
                }
            }
            k1 = 0;
        }
        if (flag1)
        {
            i1 = j1;
            if (Math.abs(j1) >= U)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = 0;
        if (k1 == 0 && i1 == 0 || dispatchNestedPreFling(k1, i1)) goto _L4; else goto _L3
_L3:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(k1, i1, flag);
        if (flag)
        {
            j1 = Math.max(-V, Math.min(k1, V));
            i1 = Math.max(-V, Math.min(i1, V));
            aa.a(j1, i1);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public int c(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.d();
        } else
        {
            return -1;
        }
    }

    public yx c()
    {
        return o;
    }

    public void c(int i1)
    {
        int k1 = c.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            c.b(j1).offsetTopAndBottom(i1);
        }

    }

    void c(int i1, int j1)
    {
        if (i1 < 0)
        {
            h();
            I.a(-i1);
        } else
        if (i1 > 0)
        {
            i();
            K.a(i1);
        }
        if (j1 < 0)
        {
            j();
            J.a(-j1);
        } else
        if (j1 > 0)
        {
            k();
            L.a(j1);
        }
        if (i1 != 0 || j1 != 0)
        {
            kb.d(this);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof zf) && p.a((zf)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (p.c())
        {
            return p.c(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (p.c())
        {
            return p.a(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (p.c())
        {
            return p.e(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (p.d())
        {
            return p.d(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (p.d())
        {
            return p.b(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (p.d())
        {
            return p.f(e);
        } else
        {
            return 0;
        }
    }

    Rect d(View view)
    {
        zf zf1 = (zf)view.getLayoutParams();
        if (!zf1.c)
        {
            return zf1.b;
        }
        Rect rect = zf1.b;
        rect.set(0, 0, 0, 0);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            n.set(0, 0, 0, 0);
            ((g)r.get(i1)).a(n, view);
            rect.left = rect.left + n.left;
            rect.top = rect.top + n.top;
            rect.right = rect.right + n.right;
            rect.bottom = rect.bottom + n.bottom;
        }

        zf1.c = false;
        return rect;
    }

    public ze d()
    {
        return p;
    }

    public void d(int i1)
    {
        int k1 = c.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            c.b(j1).offsetLeftAndRight(i1);
        }

    }

    void d(int i1, int j1)
    {
        int j2 = c.c();
        byte byte0;
        int k1;
        int l1;
        int i2;
        if (i1 < j1)
        {
            byte0 = -1;
            k1 = j1;
            l1 = i1;
        } else
        {
            byte0 = 1;
            k1 = i1;
            l1 = j1;
        }
        i2 = 0;
        while (i2 < j2) 
        {
            zq zq1 = b(c.c(i2));
            if (zq1 != null && zq1.b >= l1 && zq1.b <= k1)
            {
                if (zq1.b == i1)
                {
                    zq1.a(j1 - i1, false);
                } else
                {
                    zq1.a(byte0, false);
                }
                e.i = true;
            }
            i2++;
        }
        a.a(i1, j1);
        requestLayout();
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return ai.a(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return ai.a(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
        return ai.a(i1, j1, ai1, ai2);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        return ai.a(i1, j1, k1, l1, ai1);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        boolean flag1 = false;
        super.draw(canvas);
        int k1 = r.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            r.get(i1);
        }

        int j1;
        if (I != null && !I.a())
        {
            int l1 = canvas.save();
            int i2;
            if (l)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (I != null && I.a(canvas))
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            canvas.restoreToCount(l1);
        } else
        {
            k1 = 0;
        }
        j1 = k1;
        if (J != null)
        {
            j1 = k1;
            if (!J.a())
            {
                l1 = canvas.save();
                if (l)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (J != null && J.a(canvas))
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        k1 = j1;
        if (K != null)
        {
            k1 = j1;
            if (!K.a())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (l)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (K != null && K.a(canvas))
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                k1 = j1 | k1;
                canvas.restoreToCount(l1);
            }
        }
        j1 = k1;
        if (L != null)
        {
            j1 = k1;
            if (!L.a())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (l)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (L != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (L.a(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && d != null && r.size() > 0 && d.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            kb.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    void e()
    {
        if (!x)
        {
            x = true;
            if (!z)
            {
                y = false;
            }
        }
    }

    void e(int i1, int j1)
    {
        int l1 = c.c();
        for (int k1 = 0; k1 < l1; k1++)
        {
            zq zq1 = b(c.c(k1));
            if (zq1 != null && !zq1.c() && zq1.b >= i1)
            {
                zq1.a(j1, false);
                e.i = true;
            }
        }

        a.b(i1, j1);
        requestLayout();
    }

    public void f()
    {
        if (z)
        {
            a("Do not setLayoutFrozen in layout or scroll");
            z = false;
            if (y && p != null && o != null)
            {
                requestLayout();
            }
            y = false;
        }
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (o != null)
            {
                view1 = view2;
                if (p != null)
                {
                    view1 = view2;
                    if (!o())
                    {
                        view1 = view2;
                        if (!z)
                        {
                            e();
                            view1 = p.c(i1, a, e);
                            a(false);
                        }
                    }
                }
            }
        }
        if (view1 != null)
        {
            return view1;
        } else
        {
            return super.focusSearch(view, i1);
        }
    }

    public void g()
    {
        e(0);
        B();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a(getContext(), attributeset);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (p != null)
        {
            return -1;
        } else
        {
            return super.getBaseline();
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (ag == null)
        {
            return super.getChildDrawingOrder(i1, j1);
        } else
        {
            return ag.b();
        }
    }

    void h()
    {
        if (I != null)
        {
            return;
        }
        I = new or(getContext());
        if (l)
        {
            I.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            I.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public boolean hasNestedScrollingParent()
    {
        return ai.b();
    }

    void i()
    {
        if (K != null)
        {
            return;
        }
        K = new or(getContext());
        if (l)
        {
            K.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            K.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public boolean isAttachedToWindow()
    {
        return u;
    }

    public boolean isNestedScrollingEnabled()
    {
        return ai.a();
    }

    void j()
    {
        if (J != null)
        {
            return;
        }
        J = new or(getContext());
        if (l)
        {
            J.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            J.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    void k()
    {
        if (L != null)
        {
            return;
        }
        L = new or(getContext());
        if (l)
        {
            L.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            L.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    void l()
    {
        L = null;
        J = null;
        K = null;
        I = null;
    }

    public void m()
    {
        if (d != null)
        {
            d.d();
            d.a(null);
        }
        d = null;
        if (d != null)
        {
            d.a(ad);
        }
    }

    boolean n()
    {
        return E != null && E.isEnabled();
    }

    public boolean o()
    {
        return H > 0;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        H = 0;
        u = true;
        w = false;
        if (p != null)
        {
            p.h();
        }
        ae = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.d();
        }
        w = false;
        g();
        u = false;
        if (p != null)
        {
            p.b(this, a);
        }
        removeCallbacks(am);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            r.get(i1);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (p != null && !z && (jg.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (p.d())
            {
                f1 = -jg.e(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (p.c())
            {
                f2 = jg.e(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (W == 1.401298E-45F)
                    {
                        TypedValue typedvalue = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                        {
                            break label0;
                        }
                        W = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = W;
                }
                a((int)(f2 * f3), (int)(f1 * f3), motionevent);
                return false;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        byte byte0;
        boolean flag;
        byte0 = -1;
        flag = true;
        if (!z) goto _L2; else goto _L1
_L1:
        flag = false;
_L15:
        return flag;
_L2:
        int i1;
        int j1;
        int l1;
        j1 = motionevent.getAction();
        if (j1 == 3 || j1 == 0)
        {
            t = null;
        }
        l1 = s.size();
        i1 = 0;
_L5:
        zg zg1;
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        zg1 = (zg)s.get(i1);
        if (!zg1.a(motionevent) || j1 == 3) goto _L4; else goto _L3
_L3:
        t = zg1;
        i1 = 1;
_L6:
        if (i1 != 0)
        {
            D();
            return true;
        }
        break MISSING_BLOCK_LABEL_115;
_L4:
        i1++;
          goto _L5
        i1 = 0;
          goto _L6
        boolean flag1;
        boolean flag2;
        if (p == null)
        {
            return false;
        }
        flag1 = p.c();
        flag2 = p.d();
        if (O == null)
        {
            O = VelocityTracker.obtain();
        }
        O.addMovement(motionevent);
        j1 = jg.a(motionevent);
        i1 = jg.b(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 220
    //                   0 230
    //                   1 651
    //                   2 401
    //                   3 665
    //                   4 220
    //                   5 344
    //                   6 643;
           goto _L7 _L8 _L9 _L10 _L11 _L7 _L12 _L13
_L11:
        break MISSING_BLOCK_LABEL_665;
_L7:
        break; /* Loop/switch isn't completed */
_L8:
        break; /* Loop/switch isn't completed */
_L16:
        if (M != 1)
        {
            return false;
        }
        if (true) goto _L15; else goto _L14
_L14:
        if (A)
        {
            A = false;
        }
        N = jg.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        R = i1;
        P = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        S = i1;
        Q = i1;
        if (M == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            e(1);
        }
        int k1;
        int i2;
        int j2;
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = i1;
        if (flag2)
        {
            k1 = i1 | 2;
        }
        startNestedScroll(k1);
          goto _L16
_L12:
        N = jg.b(motionevent, i1);
        k1 = (int)(jg.c(motionevent, i1) + 0.5F);
        R = k1;
        P = k1;
        i1 = (int)(jg.d(motionevent, i1) + 0.5F);
        S = i1;
        Q = i1;
          goto _L16
_L10:
        k1 = jg.a(motionevent, N);
        if (k1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(N).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i1 = (int)(jg.c(motionevent, k1) + 0.5F);
        k1 = (int)(jg.d(motionevent, k1) + 0.5F);
        if (M != 1)
        {
            i1 -= P;
            i2 = k1 - Q;
            if (flag1 && Math.abs(i1) > T)
            {
                k1 = P;
                j2 = T;
                if (i1 < 0)
                {
                    i1 = -1;
                } else
                {
                    i1 = 1;
                }
                R = i1 * j2 + k1;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            k1 = i1;
            if (flag2)
            {
                k1 = i1;
                if (Math.abs(i2) > T)
                {
                    k1 = Q;
                    j2 = T;
                    if (i2 < 0)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 1;
                    }
                    S = k1 + i1 * j2;
                    k1 = 1;
                }
            }
            if (k1 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                e(1);
            }
        }
          goto _L16
_L13:
        a(motionevent);
          goto _L16
_L9:
        O.clear();
        stopNestedScroll();
          goto _L16
        D();
          goto _L16
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        e();
        g.a("RV OnLayout");
        p();
        g.a();
        a(false);
        w = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (C)
        {
            e();
            I();
            if (e.l)
            {
                e.j = true;
            } else
            {
                b.e();
                e.j = false;
            }
            C = false;
            a(false);
        }
        if (o != null)
        {
            e.f = o.a();
        } else
        {
            e.f = 0;
        }
        if (p == null)
        {
            g(i1, j1);
        } else
        {
            p.b(i1, j1);
        }
        e.j = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        k = (zl)parcelable;
        super.onRestoreInstanceState(k.getSuperState());
        if (p != null && k.a != null)
        {
            p.a(k.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        zl zl1 = new zl(super.onSaveInstanceState());
        if (k != null)
        {
            zl.a(zl1, k);
            return zl1;
        }
        if (p != null)
        {
            zl1.a = p.b();
            return zl1;
        } else
        {
            zl1.a = null;
            return zl1;
        }
    }

    public void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            l();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (!z && !A) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = motionevent.getAction();
        if (t == null) goto _L4; else goto _L3
_L3:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        t = null;
_L4:
        int j1;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        j1 = s.size();
        i1 = 0;
_L10:
        Object obj;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = (zg)s.get(i1);
        if (!((zg) (obj)).a(motionevent)) goto _L8; else goto _L7
_L7:
        t = ((zg) (obj));
        i1 = 1;
_L9:
        if (i1 != 0)
        {
            D();
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        t.a(this, motionevent);
        if (i1 == 3 || i1 == 1)
        {
            t = null;
        }
        i1 = 1;
          goto _L9
_L8:
        i1++;
          goto _L10
        i1 = 0;
          goto _L9
        if (p == null) goto _L1; else goto _L11
_L11:
        int k1;
        boolean flag1;
        boolean flag2;
        flag1 = p.c();
        flag2 = p.d();
        if (O == null)
        {
            O = VelocityTracker.obtain();
        }
        obj = MotionEvent.obtain(motionevent);
        k1 = jg.a(motionevent);
        j1 = jg.b(motionevent);
        if (k1 == 0)
        {
            int ai1[] = al;
            al[1] = 0;
            ai1[0] = 0;
        }
        ((MotionEvent) (obj)).offsetLocation(al[0], al[1]);
        i1 = ((flag) ? 1 : 0);
        k1;
        JVM INSTR tableswitch 0 6: default 308
    //                   0 333
    //                   1 962
    //                   2 492
    //                   3 1070
    //                   4 312
    //                   5 425
    //                   6 950;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L17:
        break; /* Loop/switch isn't completed */
_L12:
        i1 = ((flag) ? 1 : 0);
_L21:
        if (i1 == 0)
        {
            O.addMovement(((MotionEvent) (obj)));
        }
        ((MotionEvent) (obj)).recycle();
        return true;
_L13:
        N = jg.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        R = i1;
        P = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        S = i1;
        Q = i1;
        float f1;
        float f2;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (flag2)
        {
            j1 = i1 | 2;
        }
        startNestedScroll(j1);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L18:
        N = jg.b(motionevent, j1);
        i1 = (int)(jg.c(motionevent, j1) + 0.5F);
        R = i1;
        P = i1;
        i1 = (int)(jg.d(motionevent, j1) + 0.5F);
        S = i1;
        Q = i1;
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = jg.a(motionevent, N);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(N).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l2 = (int)(jg.c(motionevent, i1) + 0.5F);
        i3 = (int)(jg.d(motionevent, i1) + 0.5F);
        i2 = R - l2;
        l1 = S - i3;
        i1 = l1;
        j1 = i2;
        if (dispatchNestedPreScroll(i2, l1, ak, aj))
        {
            j1 = i2 - ak[0];
            i1 = l1 - ak[1];
            ((MotionEvent) (obj)).offsetLocation(aj[0], aj[1]);
            motionevent = al;
            motionevent[0] = motionevent[0] + aj[0];
            motionevent = al;
            motionevent[1] = motionevent[1] + aj[1];
        }
        l1 = i1;
        i2 = j1;
        if (M != 1)
        {
            if (flag1 && Math.abs(j1) > T)
            {
                if (j1 > 0)
                {
                    j1 -= T;
                } else
                {
                    j1 += T;
                }
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            j2 = i1;
            k2 = l1;
            if (flag2)
            {
                j2 = i1;
                k2 = l1;
                if (Math.abs(i1) > T)
                {
                    if (i1 > 0)
                    {
                        j2 = i1 - T;
                    } else
                    {
                        j2 = i1 + T;
                    }
                    k2 = 1;
                }
            }
            l1 = j2;
            i2 = j1;
            if (k2 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                e(1);
                i2 = j1;
                l1 = j2;
            }
        }
        i1 = ((flag) ? 1 : 0);
        if (M == 1)
        {
            R = l2 - aj[0];
            S = i3 - aj[1];
            if (!flag1)
            {
                i2 = 0;
            }
            if (!flag2)
            {
                l1 = 0;
            }
            i1 = ((flag) ? 1 : 0);
            if (a(i2, l1, ((MotionEvent) (obj))))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                i1 = ((flag) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L19:
        a(motionevent);
        i1 = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L14:
        O.addMovement(((MotionEvent) (obj)));
        O.computeCurrentVelocity(1000, V);
        if (flag1)
        {
            f1 = -jx.a(O, N);
        } else
        {
            f1 = 0.0F;
        }
        if (flag2)
        {
            f2 = -jx.b(O, N);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F || !b((int)f1, (int)f2))
        {
            e(0);
        }
        C();
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L16:
        D();
        i1 = ((flag) ? 1 : 0);
        if (true) goto _L21; else goto _L20
_L20:
    }

    void p()
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L19:
        return;
_L2:
        Object obj;
        int j3;
        if (p == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        e.e.clear();
        e();
        E();
        I();
        Object obj2 = e;
        int i1;
        int k1;
        if (e.k && g && G())
        {
            obj = new gz();
        } else
        {
            obj = null;
        }
        obj2.d = ((gz) (obj));
        g = false;
        f = false;
        e.j = e.l;
        e.f = o.a();
        obj = ah;
        j3 = c.b();
        if (j3 != 0) goto _L4; else goto _L3
_L3:
        obj[0] = 0;
        obj[1] = 0;
_L8:
        if (e.k)
        {
            e.b.clear();
            e.c.clear();
            k1 = c.b();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = b(c.b(i1));
                if (!((zq) (obj)).c() && (!((zq) (obj)).j() || o.b))
                {
                    obj2 = ((zq) (obj)).a;
                    e.b.put(obj, new zd(((zq) (obj)), ((View) (obj2)).getLeft(), ((View) (obj2)).getTop(), ((View) (obj2)).getRight(), ((View) (obj2)).getBottom()));
                }
            }

        }
          goto _L5
_L4:
        int j1;
        int i2;
        int k2;
        j1 = 0x7fffffff;
        i2 = 0x80000000;
        k2 = 0;
_L7:
        int l1;
        int j2;
        if (k2 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        zq zq1 = b(c.b(k2));
        j2 = j1;
        if (zq1.c())
        {
            break MISSING_BLOCK_LABEL_1990;
        }
        int i3 = zq1.d();
        l1 = j1;
        if (i3 < j1)
        {
            l1 = i3;
        }
        j2 = l1;
        if (i3 <= i2)
        {
            break MISSING_BLOCK_LABEL_1990;
        }
        j1 = i3;
_L22:
        k2++;
        i2 = j1;
        j1 = l1;
        if (true) goto _L7; else goto _L6
_L6:
        obj[0] = j1;
        obj[1] = i2;
          goto _L8
_L5:
        if (!e.l) goto _L10; else goto _L9
_L9:
        Object obj3;
        r();
        if (e.d != null)
        {
            l1 = c.b();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj = b(c.b(j1));
                if (((zq) (obj)).l() && !((zq) (obj)).n() && !((zq) (obj)).c())
                {
                    long l3 = a(((zq) (obj)));
                    e.d.put(Long.valueOf(l3), obj);
                    e.b.remove(obj);
                }
            }

        }
        boolean flag = e.i;
        e.i = false;
        p.a(a, e);
        e.i = flag;
        obj3 = new gz();
        j1 = 0;
_L17:
        if (j1 >= c.b()) goto _L12; else goto _L11
_L11:
        obj = c.b(j1);
        if (b(((View) (obj))).c()) goto _L14; else goto _L13
_L13:
        l1 = 0;
_L18:
        if (l1 >= e.b.size())
        {
            break MISSING_BLOCK_LABEL_1984;
        }
        if (((zq)e.b.b(l1)).a != obj) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L21:
        if (l1 == 0)
        {
            ((gz) (obj3)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L14:
        j1++;
          goto _L17
_L16:
        l1++;
          goto _L18
_L12:
        s();
        b.c();
_L20:
        e.f = o.a();
        e.h = 0;
        e.j = false;
        p.a(a, e);
        e.i = false;
        k = null;
        zo zo1 = e;
        boolean flag1;
        if (e.k && d != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zo1.k = flag1;
        if (e.k)
        {
            Object obj1;
            if (e.d != null)
            {
                obj1 = new gz();
            } else
            {
                obj1 = null;
            }
            l1 = c.b();
            j1 = 0;
            while (j1 < l1) 
            {
                zq zq2 = b(c.b(j1));
                if (!zq2.c())
                {
                    View view1 = zq2.a;
                    long l4 = a(zq2);
                    if (obj1 != null && e.d.get(Long.valueOf(l4)) != null)
                    {
                        ((gz) (obj1)).put(Long.valueOf(l4), zq2);
                    } else
                    {
                        e.c.put(zq2, new zd(zq2, view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom()));
                    }
                }
                j1++;
            }
            a(((gz) (obj3)));
            for (j1 = e.b.size() - 1; j1 >= 0; j1--)
            {
                zq zq3 = (zq)e.b.b(j1);
                if (!e.c.containsKey(zq3))
                {
                    zd zd1 = (zd)e.b.c(j1);
                    e.b.d(j1);
                    View view2 = zd1.a.a;
                    a.b(zd1.a);
                    a(zd1);
                }
            }

            j1 = e.c.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    zq zq5 = (zq)e.c.b(j1);
                    Object obj4 = (zd)e.c.c(j1);
                    if (e.b.isEmpty() || !e.b.containsKey(zq5))
                    {
                        e.c.d(j1);
                        Rect rect;
                        if (obj3 != null)
                        {
                            rect = (Rect)((gz) (obj3)).get(zq5.a);
                        } else
                        {
                            rect = null;
                        }
                        l1 = ((zd) (obj4)).b;
                        i2 = ((zd) (obj4)).c;
                        obj4 = zq5.a;
                        if (rect != null && (rect.left != l1 || rect.top != i2))
                        {
                            zq5.a(false);
                            if (d.a(zq5, rect.left, rect.top, l1, i2))
                            {
                                H();
                            }
                        } else
                        {
                            zq5.a(false);
                            d.b(zq5);
                            H();
                        }
                    }
                    j1--;
                }
            }
            l1 = e.c.size();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj3 = (zq)e.c.b(j1);
                zd zd2 = (zd)e.c.c(j1);
                zd zd3 = (zd)e.b.get(obj3);
                if (zd3 == null || zd2 == null || zd3.b == zd2.b && zd3.c == zd2.c)
                {
                    continue;
                }
                ((zq) (obj3)).a(false);
                if (d.a(((zq) (obj3)), zd3.b, zd3.c, zd2.b, zd2.c))
                {
                    H();
                }
            }

            if (e.d != null)
            {
                j1 = e.d.size();
            } else
            {
                j1 = 0;
            }
            j1--;
            while (j1 >= 0) 
            {
                long l5 = ((Long)e.d.b(j1)).longValue();
                obj3 = (zq)e.d.get(Long.valueOf(l5));
                View view = ((zq) (obj3)).a;
                if (!((zq) (obj3)).c() && a.b != null && a.b.contains(obj3))
                {
                    zq zq4 = (zq)((gz) (obj1)).get(Long.valueOf(l5));
                    ((zq) (obj3)).a(false);
                    b(((zq) (obj3)));
                    obj3.g = zq4;
                    a.b(((zq) (obj3)));
                    j2 = ((zq) (obj3)).a.getLeft();
                    int l2 = ((zq) (obj3)).a.getTop();
                    if (zq4 == null || zq4.c())
                    {
                        i2 = l2;
                        l1 = j2;
                    } else
                    {
                        l1 = zq4.a.getLeft();
                        i2 = zq4.a.getTop();
                        zq4.a(false);
                        zq4.h = ((zq) (obj3));
                    }
                    d.a(((zq) (obj3)), zq4, j2, l2, l1, i2);
                    H();
                }
                j1--;
            }
        }
        a(false);
        p.b(a);
        e.g = e.f;
        G = false;
        e.k = false;
        e.l = false;
        F();
        ze.b(p);
        if (a.b != null)
        {
            a.b.clear();
        }
        e.d = null;
        if (h(ah[0], ah[1]))
        {
            v();
            return;
        }
          goto _L19
_L10:
        s();
        b.e();
        if (e.d != null)
        {
            l1 = c.b();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj1 = b(c.b(j1));
                if (((zq) (obj1)).l() && !((zq) (obj1)).n() && !((zq) (obj1)).c())
                {
                    l4 = a(((zq) (obj1)));
                    e.d.put(Long.valueOf(l4), obj1);
                    e.b.remove(obj1);
                }
            }

        }
        obj3 = null;
          goto _L20
        l1 = 0;
          goto _L21
        j1 = i2;
        l1 = j2;
          goto _L22
    }

    void q()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((zf)c.c(i1).getLayoutParams()).c = true;
        }

        a.g();
    }

    void r()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            zq zq1 = b(c.c(i1));
            if (!zq1.c())
            {
                zq1.b();
            }
        }

    }

    protected void removeDetachedView(View view, boolean flag)
    {
        zq zq1 = b(view);
        if (zq1 != null)
        {
            if (zq1.p())
            {
                zq1.i();
            } else
            if (!zq1.c())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(zq1).toString());
            }
        }
        e(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        if (!p.c(this) && view1 != null)
        {
            n.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof zf)
            {
                obj = (zf)obj;
                if (!((zf) (obj)).c)
                {
                    obj = ((zf) (obj)).b;
                    Rect rect = n;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = n;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = n;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = n;
                    int i1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i1;
                }
            }
            offsetDescendantRectToMyCoords(view1, n);
            offsetRectIntoDescendantCoords(view, n);
            obj = n;
            boolean flag;
            if (!w)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            requestChildRectangleOnScreen(view, ((Rect) (obj)), flag);
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        return p.a(this, view, rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            s.get(i1);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!x && !z)
        {
            super.requestLayout();
            return;
        } else
        {
            y = true;
            return;
        }
    }

    void s()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            zq zq1 = b(c.c(i1));
            if (!zq1.c())
            {
                zq1.a();
            }
        }

        a.f();
    }

    public void scrollBy(int i1, int j1)
    {
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!z)
        {
            boolean flag = p.c();
            boolean flag1 = p.d();
            if (flag || flag1)
            {
                if (!flag)
                {
                    i1 = 0;
                }
                if (!flag1)
                {
                    j1 = 0;
                }
                a(i1, j1, ((MotionEvent) (null)));
                return;
            }
        }
    }

    public void scrollTo(int i1, int j1)
    {
        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        if (a(accessibilityevent))
        {
            return;
        } else
        {
            super.sendAccessibilityEventUnchecked(accessibilityevent);
            return;
        }
    }

    public void setClipToPadding(boolean flag)
    {
        if (flag != l)
        {
            l();
        }
        l = flag;
        super.setClipToPadding(flag);
        if (w)
        {
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        ai.a(flag);
    }

    public boolean startNestedScroll(int i1)
    {
        return ai.a(i1);
    }

    public void stopNestedScroll()
    {
        ai.c();
    }

    void t()
    {
        int i1;
        int j1;
        j1 = c.b();
        i1 = 0;
_L2:
        zq zq1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        zq1 = b(c.b(i1));
        if (zq1 != null && !zq1.c())
        {
            if (!zq1.n() && !zq1.j())
            {
                break; /* Loop/switch isn't completed */
            }
            requestLayout();
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!zq1.k()) goto _L4; else goto _L3
_L3:
label0:
        {
            int k1 = o.a(zq1.b);
            if (zq1.e != k1)
            {
                break label0;
            }
            if (!zq1.l() || !G())
            {
                o.c(zq1, zq1.b);
            } else
            {
                requestLayout();
            }
        }
          goto _L4
        requestLayout();
    }

    void u()
    {
        int j1 = c.c();
        for (int i1 = 0; i1 < j1; i1++)
        {
            zq zq1 = b(c.c(i1));
            if (zq1 != null && !zq1.c())
            {
                zq1.a(6);
            }
        }

        q();
        a.e();
    }

    void v()
    {
        int i1 = getScrollX();
        int k1 = getScrollY();
        onScrollChanged(i1, k1, i1, k1);
        if (ac != null)
        {
            for (int j1 = ac.size() - 1; j1 >= 0; j1--)
            {
                ac.get(j1);
            }

        }
    }

    void w()
    {
        if (ab != null)
        {
            ab.a(this);
        }
        if (ac != null)
        {
            for (int i1 = ac.size() - 1; i1 >= 0; i1--)
            {
                ((zh)ac.get(i1)).a(this);
            }

        }
    }

    public boolean x()
    {
        return !w || G || b.d();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        i = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }
}
