// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.android.ex.photo.PhotoViewPager;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class aam
    implements aaj, aaz, br, lg, pq
{

    public static int a;
    public static int b;
    private final android.view.View.OnSystemUiVisibilityChangeListener A;
    private String B;
    private String C;
    private int D;
    private String E;
    private String F[];
    private final Map G = new HashMap();
    private final Set H = new HashSet();
    private boolean I;
    private boolean J;
    private final AccessibilityManager K;
    private long L;
    private final Runnable M = new aao(this);
    final aav c;
    int d;
    public int e;
    public boolean f;
    public View g;
    public View h;
    public PhotoViewPager i;
    public ImageView j;
    public abd k;
    public boolean l;
    public boolean m;
    public float n;
    public String o;
    public String p;
    boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public aaw y;
    public final Handler z = new Handler();

    public aam(aav aav1)
    {
        e = -1;
        m = true;
        c = aav1;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            A = null;
        } else
        {
            A = new aan(this);
        }
        K = (AccessibilityManager)aav1.i().getSystemService("accessibility");
    }

    private static int a(int i1, int j1, int k1, float f1)
    {
        return i1 - Math.round(((float)k1 - (float)k1 * f1) / 2.0F) - Math.round(((float)k1 * f1 - (float)j1) / 2.0F);
    }

    private static final String a(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        return s2;
    }

    static void a(aam aam1)
    {
        aam1.c.finish();
        aam1.c.overridePendingTransition(0, 0);
    }

    private void a(Cursor cursor)
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = H.iterator(); iterator.hasNext(); ((aak)iterator.next()).a(cursor)) { }
        break MISSING_BLOCK_LABEL_44;
        cursor;
        throw cursor;
        this;
        JVM INSTR monitorexit ;
    }

    private void u()
    {
        z.postDelayed(M, L);
    }

    private void v()
    {
        z.removeCallbacks(M);
    }

    public int a(float f1, float f2)
    {
        Iterator iterator = G.values().iterator();
        boolean flag = false;
        boolean flag1;
        boolean flag2;
        for (flag2 = false; iterator.hasNext(); flag2 = flag1)
        {
            aal aal1 = (aal)iterator.next();
            flag1 = flag2;
            if (!flag2)
            {
                flag1 = aal1.d();
            }
            if (!flag)
            {
                flag = aal1.e();
            }
        }

        if (flag2)
        {
            if (flag)
            {
                return aay.d;
            } else
            {
                return aay.b;
            }
        }
        if (flag)
        {
            return aay.c;
        } else
        {
            return aay.a;
        }
    }

    public abd a(Context context, ap ap, float f1)
    {
        return new abd(context, ap, null, f1, x);
    }

    public em a(int i1, String s1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return new abg(c.i(), s1);
        }
    }

    public void a()
    {
        boolean flag;
        if (!l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, true);
    }

    public void a(int i1)
    {
        D = i1;
        e(i1);
    }

    public void a(int i1, float f1, int j1)
    {
        if ((double)f1 < 0.0001D)
        {
            aal aal1 = (aal)G.get(Integer.valueOf(i1 - 1));
            if (aal1 != null)
            {
                aal1.c();
            }
            aal1 = (aal)G.get(Integer.valueOf(i1 + 1));
            if (aal1 != null)
            {
                aal1.c();
            }
        }
    }

    public void a(int i1, aal aal1)
    {
        G.put(Integer.valueOf(i1), aal1);
    }

    public final void a(aaf aaf1)
    {
        if (aaf1 == null)
        {
            return;
        } else
        {
            aaf1.a(a(o));
            aaf1.b(a(p));
            return;
        }
    }

    public void a(aak aak1)
    {
        this;
        JVM INSTR monitorenter ;
        H.add(aak1);
        this;
        JVM INSTR monitorexit ;
        return;
        aak1;
        throw aak1;
    }

    public void a(abe abe1, boolean flag)
    {
        if (j.getVisibility() != 8 && TextUtils.equals(abe1.q(), E))
        {
            j.setVisibility(8);
            i.setVisibility(0);
            c.f().a(2);
        }
    }

    public void a(Bundle bundle)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        if (b == 0)
        {
            obj = new DisplayMetrics();
            WindowManager windowmanager = (WindowManager)c.i().getSystemService("window");
            int i1 = abl.a;
            windowmanager.getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
            switch (aau.a[i1 - 1])
            {
            default:
                b = Math.min(((DisplayMetrics) (obj)).heightPixels, ((DisplayMetrics) (obj)).widthPixels);
                break;

            case 1: // '\001'
                break MISSING_BLOCK_LABEL_725;
            }
        }
_L1:
        a = ((ActivityManager)c.getApplicationContext().getSystemService("activity")).getMemoryClass();
        obj = c.getIntent();
        if (((Intent) (obj)).hasExtra("photos_uri"))
        {
            B = ((Intent) (obj)).getStringExtra("photos_uri");
        }
        if (((Intent) (obj)).getBooleanExtra("scale_up_animation", false))
        {
            r = true;
            s = ((Intent) (obj)).getIntExtra("start_x_extra", 0);
            t = ((Intent) (obj)).getIntExtra("start_y_extra", 0);
            u = ((Intent) (obj)).getIntExtra("start_width_extra", 0);
            v = ((Intent) (obj)).getIntExtra("start_height_extra", 0);
        }
        boolean flag;
        if (((Intent) (obj)).getBooleanExtra("action_bar_hidden_initially", false) && !h.a(K))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w = flag;
        x = ((Intent) (obj)).getBooleanExtra("display_thumbs_fullscreen", false);
        if (((Intent) (obj)).hasExtra("projection"))
        {
            F = ((Intent) (obj)).getStringArrayExtra("projection");
        } else
        {
            F = null;
        }
        n = ((Intent) (obj)).getFloatExtra("max_scale", 1.0F);
        E = null;
        D = -1;
        if (((Intent) (obj)).hasExtra("photo_index"))
        {
            D = ((Intent) (obj)).getIntExtra("photo_index", -1);
        }
        if (((Intent) (obj)).hasExtra("initial_photo_uri"))
        {
            C = ((Intent) (obj)).getStringExtra("initial_photo_uri");
            E = C;
        }
        f = true;
        if (bundle != null)
        {
            C = bundle.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            E = bundle.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            D = bundle.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            if (bundle.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !h.a(K))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            l = flag;
            o = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            p = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            q = bundle.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else
        {
            l = w;
        }
        c.setContentView(g.cf);
        k = a(c.i(), c.t_(), n);
        bundle = c.getResources();
        g = d(g.bX);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            g.setOnSystemUiVisibilityChangeListener(t());
        }
        h = d(g.bW);
        j = (ImageView)d(g.bY);
        i = (PhotoViewPager)d(g.cc);
        i.a(k);
        i.a(this);
        i.a(this);
        i.c(bundle.getDimensionPixelSize(g.bR));
        y = new aaw(this);
        if (!r || q)
        {
            c.f().a(100, null, this);
            h.setVisibility(0);
        } else
        {
            i.setVisibility(8);
            Bundle bundle1 = new Bundle();
            bundle1.putString("image_uri", C);
            c.f().a(2, bundle1, y);
        }
        L = bundle.getInteger(g.ce);
        bundle = c.j();
        if (bundle != null)
        {
            bundle.a();
            bundle.a(this);
            bundle.b();
            a(((aaf) (bundle)));
        }
        if (!r)
        {
            b(l);
            return;
        } else
        {
            b(false);
            return;
        }
        b = (Math.min(((DisplayMetrics) (obj)).heightPixels, ((DisplayMetrics) (obj)).widthPixels) * 800) / 1000;
          goto _L1
    }

    public void a(em em1, Cursor cursor)
    {
        if (em1.o() != 100) goto _L2; else goto _L1
_L1:
        if (cursor != null && cursor.getCount() != 0) goto _L4; else goto _L3
_L3:
        f = true;
        k.a(null);
_L2:
        return;
_L4:
        e = cursor.getCount();
        if (E == null) goto _L6; else goto _L5
_L5:
        int i1;
        int j1 = cursor.getColumnIndex("uri");
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            em1 = Uri.parse(E).buildUpon().clearQuery().build();
        } else
        {
            em1 = Uri.parse(E).buildUpon().query(null).build();
        }
        cursor.moveToPosition(-1);
        i1 = 0;
_L11:
        if (!cursor.moveToNext()) goto _L6; else goto _L7
_L7:
        Object obj = cursor.getString(j1);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = Uri.parse(((String) (obj))).buildUpon().clearQuery().build();
        } else
        {
            obj = Uri.parse(((String) (obj))).buildUpon().query(null).build();
        }
        if (em1 == null || !em1.equals(obj)) goto _L9; else goto _L8
_L8:
        D = i1;
_L6:
        if (m)
        {
            I = true;
            k.a(null);
            return;
        }
        break; /* Loop/switch isn't completed */
_L9:
        i1++;
        if (true) goto _L11; else goto _L10
_L10:
        boolean flag = f;
        f = false;
        k.a(cursor);
        if (i.b() == null)
        {
            i.a(k);
        }
        a(cursor);
        if (D < 0)
        {
            D = 0;
        }
        i.a(D, false);
        if (flag)
        {
            e(D);
            return;
        }
        if (true) goto _L2; else goto _L12
_L12:
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            v();
            return;
        } else
        {
            u();
            return;
        }
    }

    protected void a(boolean flag, boolean flag1)
    {
        if (h.a(K))
        {
            flag1 = false;
            flag = false;
        }
        Iterator iterator;
        boolean flag2;
        if (flag != l)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        l = flag;
        if (!l) goto _L2; else goto _L1
_L1:
        b(true);
        v();
_L4:
        if (flag2)
        {
            for (iterator = G.values().iterator(); iterator.hasNext(); ((aal)iterator.next()).a()) { }
        }
        break; /* Loop/switch isn't completed */
_L2:
        b(false);
        if (flag1)
        {
            u();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(ad ad)
    {
        while (i == null || k == null || i.c() != k.c(ad)) 
        {
            return false;
        }
        return true;
    }

    public boolean a(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            c.finish();
            break;
        }
        return true;
    }

    public abd b()
    {
        return k;
    }

    public void b(int i1)
    {
    }

    public void b(aak aak1)
    {
        this;
        JVM INSTR monitorenter ;
        H.remove(aak1);
        this;
        JVM INSTR monitorexit ;
        return;
        aak1;
        throw aak1;
    }

    public void b(Bundle bundle)
    {
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", C);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", E);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", D);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", l);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", o);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", p);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", q);
    }

    protected void b(boolean flag)
    {
        c(flag);
    }

    public boolean b(ad ad)
    {
        if (i == null || k == null || k.b() == 0)
        {
            return l;
        }
        return l || i.c() != k.c(ad);
    }

    public aav c()
    {
        return c;
    }

    public void c(int i1)
    {
        G.remove(Integer.valueOf(i1));
    }

    public void c(boolean flag)
    {
        boolean flag1;
        int j1;
        boolean flag2;
        int k1;
        flag2 = false;
        j1 = 0;
        k1 = android.os.Build.VERSION.SDK_INT;
        if (k1 < 16)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || q() && !r())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        if (k1 > 19) goto _L2; else goto _L1
_L1:
        if (k1 != 19) goto _L4; else goto _L3
_L3:
        int i1;
        if (android.os.Build.VERSION.SDK_INT != 19)
        {
            throw new IllegalStateException("kitkatIsSecondary user is only callable on KitKat");
        }
        if (Process.myUid() > 0x186a0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L4; else goto _L2
_L2:
        i1 = 3846;
_L5:
        j1 = i1;
        if (flag1)
        {
            p();
            j1 = i1;
        }
_L6:
        if (k1 >= 11)
        {
            d = j1;
            s().setSystemUiVisibility(j1);
        }
        return;
_L4:
        if (k1 >= 16)
        {
            i1 = 1285;
        } else
        if (k1 >= 14)
        {
            i1 = 1;
        } else
        {
            i1 = j1;
            if (k1 >= 11)
            {
                i1 = 1;
            }
        }
          goto _L5
        char c1;
        if (k1 >= 19)
        {
            c1 = '\u0700';
        } else
        if (k1 >= 16)
        {
            c1 = '\u0500';
        } else
        {
            c1 = flag2;
            if (k1 < 14)
            {
                c1 = flag2;
                if (k1 >= 11)
                {
                    c1 = flag2;
                }
            }
        }
        j1 = c1;
        if (flag1)
        {
            o();
            j1 = c1;
        }
          goto _L6
    }

    protected View d(int i1)
    {
        return c.findViewById(i1);
    }

    public void d()
    {
    }

    public void e()
    {
        a(l, false);
        m = false;
        if (I)
        {
            I = false;
            c.f().a(100, null, this);
        }
    }

    public void e(int i1)
    {
        Object obj = (aal)G.get(Integer.valueOf(i1));
        if (obj != null)
        {
            ((aal) (obj)).b();
        }
        obj = l();
        D = i1;
        E = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("uri"));
        j();
        if (!K.isEnabled()) goto _L2; else goto _L1
_L1:
        String s1 = k();
        if (s1 == null) goto _L2; else goto _L3
_L3:
        AccessibilityManager accessibilitymanager1;
        View view;
        view = g;
        accessibilitymanager1 = K;
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L5; else goto _L4
_L4:
        view.announceForAccessibility(s1);
_L2:
        v();
        u();
        return;
_L5:
        Context context = view.getContext().getApplicationContext();
        AccessibilityManager accessibilitymanager = accessibilitymanager1;
        if (accessibilitymanager1 == null)
        {
            accessibilitymanager = (AccessibilityManager)context.getSystemService("accessibility");
        }
        if (accessibilitymanager.isEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain(8);
            accessibilityevent.getText().add(s1);
            accessibilityevent.setEnabled(view.isEnabled());
            accessibilityevent.setClassName(view.getClass().getName());
            accessibilityevent.setPackageName(context.getPackageName());
            mj.a(accessibilityevent).a(view);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                view.getParent().requestSendAccessibilityEvent(view, accessibilityevent);
            } else
            {
                accessibilitymanager.sendAccessibilityEvent(accessibilityevent);
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void f()
    {
        m = true;
    }

    public void g()
    {
    }

    public void h()
    {
        J = true;
    }

    public boolean i()
    {
        boolean flag = false;
        if (!l || w) goto _L2; else goto _L1
_L1:
        a();
_L6:
        flag = true;
_L4:
        return flag;
_L2:
        if (!r) goto _L4; else goto _L3
_L3:
        c.getIntent();
        int i1 = g.getMeasuredWidth();
        int j1 = g.getMeasuredHeight();
        float f1 = Math.max((float)u / (float)i1, (float)v / (float)j1);
        i1 = a(s, u, i1, f1);
        j1 = a(t, v, j1, f1);
        int k1 = android.os.Build.VERSION.SDK_INT;
        if (k1 >= 14)
        {
            h.animate().alpha(0.0F).setDuration(250L).start();
            h.setVisibility(0);
            aar aar1 = new aar(this);
            ViewPropertyAnimator viewpropertyanimator;
            if (j.getVisibility() == 0)
            {
                viewpropertyanimator = j.animate().scaleX(f1).scaleY(f1).translationX(i1).translationY(j1).setDuration(250L);
            } else
            {
                viewpropertyanimator = i.animate().scaleX(f1).scaleY(f1).translationX(i1).translationY(j1).setDuration(250L);
            }
            if (!C.equals(E))
            {
                viewpropertyanimator.alpha(0.0F);
            }
            if (k1 >= 16)
            {
                viewpropertyanimator.withEndAction(aar1);
            } else
            {
                z.postDelayed(aar1, 250L);
            }
            viewpropertyanimator.start();
        } else
        {
            Object obj = new AlphaAnimation(1.0F, 0.0F);
            ((Animation) (obj)).setDuration(250L);
            h.startAnimation(((Animation) (obj)));
            h.setVisibility(0);
            obj = new ScaleAnimation(1.0F, 1.0F, f1, f1);
            ((Animation) (obj)).setDuration(250L);
            ((Animation) (obj)).setAnimationListener(new aas(this));
            if (j.getVisibility() == 0)
            {
                j.startAnimation(((Animation) (obj)));
            } else
            {
                i.startAnimation(((Animation) (obj)));
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void j()
    {
        int i1 = i.c() + 1;
        Cursor cursor;
        boolean flag;
        if (e >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cursor = l();
        if (cursor != null)
        {
            o = cursor.getString(cursor.getColumnIndex("_display_name"));
        } else
        {
            o = null;
        }
        if (f || !flag || i1 <= 0)
        {
            p = null;
        } else
        {
            p = c.getResources().getString(g.ci, new Object[] {
                Integer.valueOf(i1), Integer.valueOf(e)
            });
        }
        a(c.j());
    }

    protected String k()
    {
        String s1 = o;
        if (p != null)
        {
            s1 = c.i().getResources().getString(g.cj, new Object[] {
                o, p
            });
        }
        return s1;
    }

    public Cursor l()
    {
        if (i != null)
        {
            int i1 = i.c();
            Cursor cursor = k.e();
            if (cursor != null)
            {
                cursor.moveToPosition(i1);
                return cursor;
            }
        }
        return null;
    }

    public void m()
    {
        q = true;
        i.setVisibility(0);
        b(l);
    }

    void n()
    {
        int i1 = g.getMeasuredWidth();
        int j1 = g.getMeasuredHeight();
        j.setVisibility(0);
        float f1 = Math.max((float)u / (float)i1, (float)v / (float)j1);
        i1 = a(s, u, i1, f1);
        j1 = a(t, v, j1, f1);
        int k1 = android.os.Build.VERSION.SDK_INT;
        if (k1 >= 14)
        {
            h.setAlpha(0.0F);
            h.animate().alpha(1.0F).setDuration(250L).start();
            h.setVisibility(0);
            j.setScaleX(f1);
            j.setScaleY(f1);
            j.setTranslationX(i1);
            j.setTranslationY(j1);
            aap aap1 = new aap(this);
            ViewPropertyAnimator viewpropertyanimator = j.animate().scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setDuration(250L);
            if (k1 >= 16)
            {
                viewpropertyanimator.withEndAction(aap1);
            } else
            {
                z.postDelayed(aap1, 250L);
            }
            viewpropertyanimator.start();
            return;
        } else
        {
            Object obj = new AlphaAnimation(0.0F, 1.0F);
            ((Animation) (obj)).setDuration(250L);
            h.startAnimation(((Animation) (obj)));
            h.setVisibility(0);
            obj = new TranslateAnimation(i1, j1, 0.0F, 0.0F);
            ((Animation) (obj)).setDuration(250L);
            ScaleAnimation scaleanimation = new ScaleAnimation(f1, f1, 0.0F, 0.0F);
            scaleanimation.setDuration(250L);
            AnimationSet animationset = new AnimationSet(true);
            animationset.addAnimation(((Animation) (obj)));
            animationset.addAnimation(scaleanimation);
            animationset.setAnimationListener(new aaq(this));
            j.startAnimation(animationset);
            return;
        }
    }

    public void o()
    {
        c.j().c();
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        if (i1 == 100)
        {
            return new abj(c.i(), Uri.parse(B), F);
        } else
        {
            return null;
        }
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (Cursor)obj);
    }

    public void onLoaderReset(em em1)
    {
        if (!J)
        {
            k.a(null);
        }
    }

    public void p()
    {
        c.j().d();
    }

    public boolean q()
    {
        return r;
    }

    public boolean r()
    {
        return q;
    }

    public View s()
    {
        return g;
    }

    public android.view.View.OnSystemUiVisibilityChangeListener t()
    {
        return A;
    }
}
