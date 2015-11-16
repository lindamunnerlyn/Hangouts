// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class aq extends ap
    implements iv
{

    static final Interpolator A = new DecelerateInterpolator(1.5F);
    static final Interpolator B = new AccelerateInterpolator(2.5F);
    static final Interpolator C = new AccelerateInterpolator(1.5F);
    static boolean a = false;
    static final boolean b;
    static final Interpolator z = new DecelerateInterpolator(2.5F);
    ArrayList c;
    Runnable d[];
    boolean e;
    ArrayList f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    ArrayList l;
    ArrayList m;
    int n;
    ao o;
    am p;
    ad q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w;
    SparseArray x;
    Runnable y;

    aq()
    {
        n = 0;
        w = null;
        x = null;
        y = new ar(this);
    }

    private ad a(Bundle bundle, String s1)
    {
        int i1 = bundle.getInt(s1, -1);
        if (i1 == -1)
        {
            bundle = null;
        } else
        {
            if (i1 >= f.size())
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
            }
            ad ad1 = (ad)f.get(i1);
            bundle = ad1;
            if (ad1 == null)
            {
                a(((RuntimeException) (new IllegalStateException((new StringBuilder("Fragment no longer exists for key ")).append(s1).append(": index ").append(i1).toString()))));
                return ad1;
            }
        }
        return bundle;
    }

    private static Animation a(float f1, float f2)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f1, f2);
        alphaanimation.setInterpolator(A);
        alphaanimation.setDuration(220L);
        return alphaanimation;
    }

    private static Animation a(float f1, float f2, float f3, float f4)
    {
        AnimationSet animationset = new AnimationSet(false);
        Object obj = new ScaleAnimation(f1, f2, f1, f2, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setInterpolator(z);
        ((ScaleAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(f3, f4);
        ((AlphaAnimation) (obj)).setInterpolator(A);
        ((AlphaAnimation) (obj)).setDuration(220L);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    private Animation a(ad ad1, int i1, boolean flag, int j1)
    {
        Animation animation = ad1.onCreateAnimation(i1, flag, ad1.Q);
        if (animation == null) goto _L2; else goto _L1
_L1:
        ad1 = animation;
_L4:
        return ad1;
_L2:
        if (ad1.Q == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        animation = AnimationUtils.loadAnimation(o.i(), ad1.Q);
        ad1 = animation;
        if (animation != null) goto _L4; else goto _L3
_L3:
        byte byte0;
        if (i1 == 0)
        {
            return null;
        }
        byte0 = -1;
        i1;
        JVM INSTR lookupswitch 3: default 96
    //                   4097: 105
    //                   4099: 133
    //                   8194: 119;
           goto _L5 _L6 _L7 _L8
_L5:
        i1 = byte0;
_L10:
        if (i1 < 0)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 4;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (flag)
        {
            i1 = 5;
        } else
        {
            i1 = 6;
        }
        if (true) goto _L10; else goto _L9
_L9:
        switch (i1)
        {
        default:
            i1 = j1;
            if (j1 == 0)
            {
                i1 = j1;
                if (o.e())
                {
                    i1 = o.f();
                }
            }
            if (i1 == 0)
            {
                return null;
            } else
            {
                return null;
            }

        case 1: // '\001'
            return a(1.125F, 1.0F, 0.0F, 1.0F);

        case 2: // '\002'
            return a(1.0F, 0.975F, 1.0F, 0.0F);

        case 3: // '\003'
            return a(0.975F, 1.0F, 0.0F, 1.0F);

        case 4: // '\004'
            return a(1.0F, 1.075F, 1.0F, 0.0F);

        case 5: // '\005'
            return a(0.0F, 1.0F);

        case 6: // '\006'
            return a(1.0F, 0.0F);
        }
    }

    private void a(int i1, t t1)
    {
        this;
        JVM INSTR monitorenter ;
        int k1;
        if (k == null)
        {
            k = new ArrayList();
        }
        k1 = k.size();
        int j1 = k1;
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        if (a)
        {
            (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(t1);
        }
        k.set(i1, t1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k.add(null);
        if (l == null)
        {
            l = new ArrayList();
        }
        if (!a);
        l.add(Integer.valueOf(j1));
        j1++;
        if (true) goto _L2; else goto _L3
_L3:
        if (a)
        {
            (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(t1);
        }
        k.add(t1);
          goto _L4
        t1;
        this;
        JVM INSTR monitorexit ;
        throw t1;
    }

    private void a(RuntimeException runtimeexception)
    {
        Log.e("FragmentManager", runtimeexception.getMessage());
        Log.e("FragmentManager", "Activity state:");
        Object obj = new PrintWriter(new hc("FragmentManager"));
        if (o != null)
        {
            try
            {
                o.a("  ", ((PrintWriter) (obj)), new String[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable) (obj)));
            }
        } else
        {
            try
            {
                a("  ", ((FileDescriptor) (null)), ((PrintWriter) (obj)), new String[0]);
            }
            catch (Exception exception)
            {
                Log.e("FragmentManager", "Failed dumping state", exception);
            }
        }
        throw runtimeexception;
    }

    static boolean a(View view, Animation animation)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (kb.h(view) != 0) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!kb.w(view)) goto _L2; else goto _L3
_L3:
        if (!(animation instanceof AlphaAnimation)) goto _L5; else goto _L4
_L4:
        int i1 = 1;
_L7:
        flag = flag1;
        if (i1 != 0)
        {
            flag = true;
        }
_L2:
        return flag;
_L5:
        if (animation instanceof AnimationSet)
        {
            view = ((AnimationSet)animation).getAnimations();
            i1 = 0;
            do
            {
                if (i1 >= view.size())
                {
                    break;
                }
                if (view.get(i1) instanceof AlphaAnimation)
                {
                    i1 = 1;
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
            } while (true);
        }
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void b(ad ad1)
    {
        a(ad1, n, 0, 0, false);
    }

    private static void b(View view, Animation animation)
    {
        while (view == null || animation == null || !a(view, animation)) 
        {
            return;
        }
        animation.setAnimationListener(new au(view, animation));
    }

    private void c(ad ad1)
    {
        if (ad1.T != null)
        {
            if (x == null)
            {
                x = new SparseArray();
            } else
            {
                x.clear();
            }
            ad1.T.saveHierarchyState(x);
            if (x.size() > 0)
            {
                ad1.o = x;
                x = null;
                return;
            }
        }
    }

    public static int d(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 4097: 
            return 8194;

        case 8194: 
            return 4097;

        case 4099: 
            return 4099;
        }
    }

    private void e(int i1)
    {
        a(i1, 0, 0, false);
    }

    private void u()
    {
        if (s)
        {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (u != null)
        {
            throw new IllegalStateException((new StringBuilder("Can not perform this action inside of ")).append(u).toString());
        } else
        {
            return;
        }
    }

    private void v()
    {
        if (m != null)
        {
            for (int i1 = 0; i1 < m.size(); i1++)
            {
                m.get(i1);
            }

        }
    }

    public int a(t t1)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (l != null && l.size() > 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (k == null)
        {
            k = new ArrayList();
        }
        i1 = k.size();
        if (a)
        {
            (new StringBuilder("Setting back stack index ")).append(i1).append(" to ").append(t1);
        }
        k.add(t1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        i1 = ((Integer)l.remove(l.size() - 1)).intValue();
        if (a)
        {
            (new StringBuilder("Adding back stack index ")).append(i1).append(" with ").append(t1);
        }
        k.set(i1, t1);
        this;
        JVM INSTR monitorexit ;
        return i1;
        t1;
        this;
        JVM INSTR monitorexit ;
        throw t1;
    }

    public ad a(int i1)
    {
        if (g == null) goto _L2; else goto _L1
_L1:
        int j1 = g.size() - 1;
_L11:
        if (j1 < 0) goto _L2; else goto _L3
_L3:
        ad ad1 = (ad)g.get(j1);
        if (ad1 == null || ad1.G != i1) goto _L5; else goto _L4
_L4:
        return ad1;
_L5:
        j1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        j1 = f.size() - 1;
_L9:
        if (j1 < 0) goto _L7; else goto _L6
_L6:
        ad ad2;
        ad2 = (ad)f.get(j1);
        if (ad2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ad1 = ad2;
        if (ad2.G == i1) goto _L4; else goto _L8
_L8:
        j1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public ad a(String s1)
    {
        if (g == null || s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = g.size() - 1;
_L11:
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        ad ad1 = (ad)g.get(i1);
        if (ad1 == null || !s1.equals(ad1.I)) goto _L5; else goto _L4
_L4:
        return ad1;
_L5:
        i1--;
        continue; /* Loop/switch isn't completed */
_L2:
        if (f == null || s1 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        i1 = f.size() - 1;
_L9:
        if (i1 < 0) goto _L7; else goto _L6
_L6:
        ad ad2;
        ad2 = (ad)f.get(i1);
        if (ad2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ad1 = ad2;
        if (s1.equals(ad2.I)) goto _L4; else goto _L8
_L8:
        i1--;
          goto _L9
_L7:
        return null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        if (!"fragment".equals(s1))
        {
            return null;
        }
        String s2 = attributeset.getAttributeValue(null, "class");
        s1 = context.obtainStyledAttributes(attributeset, av.a);
        if (s2 == null)
        {
            s2 = s1.getString(0);
        }
        int k1 = s1.getResourceId(1, -1);
        String s3 = s1.getString(2);
        s1.recycle();
        if (!ad.a(o.i(), s2))
        {
            return null;
        }
        int i1;
        if (view != null)
        {
            i1 = view.getId();
        } else
        {
            i1 = 0;
        }
        if (i1 == -1 && k1 == -1 && s3 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Must specify unique android:id, android:tag, or have a parent with an id for ").append(s2).toString());
        }
        if (k1 != -1)
        {
            s1 = a(k1);
        } else
        {
            s1 = null;
        }
        view = s1;
        if (s1 == null)
        {
            view = s1;
            if (s3 != null)
            {
                view = a(s3);
            }
        }
        s1 = view;
        if (view == null)
        {
            s1 = view;
            if (i1 != -1)
            {
                s1 = a(i1);
            }
        }
        if (a)
        {
            (new StringBuilder("onCreateView: id=0x")).append(Integer.toHexString(k1)).append(" fname=").append(s2).append(" existing=").append(s1);
        }
        if (s1 == null)
        {
            view = ad.instantiate(context, s2);
            view.y = true;
            int j1;
            if (k1 != 0)
            {
                j1 = k1;
            } else
            {
                j1 = i1;
            }
            view.G = j1;
            view.H = i1;
            view.I = s3;
            view.z = true;
            view.C = this;
            view.onInflate(o.i(), attributeset, ((ad) (view)).n);
            a(((ad) (view)), true);
        } else
        {
            if (((ad) (s1)).z)
            {
                throw new IllegalArgumentException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Duplicate id 0x").append(Integer.toHexString(k1)).append(", tag ").append(s3).append(", or parent id 0x").append(Integer.toHexString(i1)).append(" with another fragment for ").append(s2).toString());
            }
            s1.z = true;
            if (!((ad) (s1)).M)
            {
                s1.onInflate(o.i(), attributeset, ((ad) (s1)).n);
            }
            view = s1;
        }
        if (n <= 0 && ((ad) (view)).y)
        {
            a(((ad) (view)), 1, 0, 0, false);
        } else
        {
            b(view);
        }
        if (((ad) (view)).S == null)
        {
            throw new IllegalStateException((new StringBuilder("Fragment ")).append(s2).append(" did not create a view.").toString());
        }
        if (k1 != 0)
        {
            ((ad) (view)).S.setId(k1);
        }
        if (((ad) (view)).S.getTag() == null)
        {
            ((ad) (view)).S.setTag(s3);
        }
        return ((ad) (view)).S;
    }

    public bg a()
    {
        return new t(this);
    }

    void a(int i1, int j1, int k1, boolean flag)
    {
        if (o == null && i1 != 0)
        {
            throw new IllegalStateException("No host");
        }
        if (flag || n != i1)
        {
            n = i1;
            if (f != null)
            {
                int l1 = 0;
                boolean flag1 = false;
                for (; l1 < f.size(); l1++)
                {
                    ad ad1 = (ad)f.get(l1);
                    if (ad1 == null)
                    {
                        continue;
                    }
                    a(ad1, i1, j1, k1, false);
                    if (ad1.W != null)
                    {
                        flag1 |= ad1.W.a();
                    }
                }

                if (!flag1)
                {
                    f();
                }
                if (r && o != null && n == 5)
                {
                    o.d();
                    r = false;
                    return;
                }
            }
        }
    }

    public void a(ad ad1)
    {
label0:
        {
            if (ad1.U)
            {
                if (!e)
                {
                    break label0;
                }
                v = true;
            }
            return;
        }
        ad1.U = false;
        a(ad1, n, 0, 0, false);
    }

    public void a(ad ad1, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("remove: ")).append(ad1).append(" nesting=").append(ad1.B);
        }
        int k1;
        if (ad1.B > 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!ad1.K || k1 != 0)
        {
            if (g != null)
            {
                g.remove(ad1);
            }
            if (ad1.N && ad1.O)
            {
                r = true;
            }
            ad1.v = false;
            ad1.w = true;
            if (k1 != 0)
            {
                k1 = 0;
            } else
            {
                k1 = 1;
            }
            a(ad1, k1, i1, j1, false);
        }
    }

    void a(ad ad1, int i1, int j1, int k1, boolean flag)
    {
        int l1;
label0:
        {
            if (ad1.v)
            {
                l1 = i1;
                if (!ad1.K)
                {
                    break label0;
                }
            }
            l1 = i1;
            if (i1 > 1)
            {
                l1 = 1;
            }
        }
        int j2 = l1;
        if (ad1.w)
        {
            j2 = l1;
            if (l1 > ad1.k)
            {
                j2 = ad1.k;
            }
        }
        i1 = j2;
        if (ad1.U)
        {
            i1 = j2;
            if (ad1.k < 4)
            {
                i1 = j2;
                if (j2 > 3)
                {
                    i1 = 3;
                }
            }
        }
        if (ad1.k >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int k2;
        int l2;
        if (ad1.y && !ad1.z)
        {
            return;
        }
        if (ad1.l != null)
        {
            ad1.l = null;
            a(ad1, ad1.m, 0, 0, true);
        }
        i2 = i1;
        l2 = i1;
        k2 = i1;
        ad1.k;
        JVM INSTR tableswitch 0 4: default 184
    //                   0 194
    //                   1 567
    //                   2 1000
    //                   3 1000
    //                   4 1039;
           goto _L3 _L4 _L5 _L6 _L6 _L7
_L3:
        i2 = i1;
_L16:
        ad1.k = i2;
        return;
_L4:
        if (a)
        {
            (new StringBuilder("moveto CREATED: ")).append(ad1);
        }
        k2 = i1;
        if (ad1.n != null)
        {
            ad1.n.setClassLoader(o.i().getClassLoader());
            ad1.o = ad1.n.getSparseParcelableArray("android:view_state");
            ad1.s = a(ad1.n, "android:target_state");
            if (ad1.s != null)
            {
                ad1.u = ad1.n.getInt("android:target_req_state", 0);
            }
            ad1.V = ad1.n.getBoolean("android:user_visible_hint", true);
            k2 = i1;
            if (!ad1.V)
            {
                ad1.U = true;
                k2 = i1;
                if (i1 > 3)
                {
                    k2 = 3;
                }
            }
        }
        ad1.D = o;
        ad1.F = q;
        aq aq1;
        if (q != null)
        {
            aq1 = q.E;
        } else
        {
            aq1 = o.k();
        }
        ad1.C = aq1;
        ad1.P = false;
        ad1.onAttach(o.i());
        if (!ad1.P)
        {
            throw new du((new StringBuilder("Fragment ")).append(ad1).append(" did not call through to super.onAttach()").toString());
        }
        if (ad1.F == null)
        {
            o.a(ad1);
        }
        if (!ad1.M)
        {
            ad1.b(ad1.n);
        }
        ad1.M = false;
        i2 = k2;
        if (ad1.y)
        {
            ad1.S = ad1.a(ad1.getLayoutInflater(ad1.n), null, ad1.n);
            if (ad1.S != null)
            {
                ad1.T = ad1.S;
                Object obj1;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    kb.v(ad1.S);
                } else
                {
                    ad1.S = bx.a(ad1.S);
                }
                if (ad1.J)
                {
                    ad1.S.setVisibility(8);
                }
                ad1.onViewCreated(ad1.S, ad1.n);
                i2 = k2;
            } else
            {
                ad1.T = null;
                i2 = k2;
            }
        }
_L5:
        l2 = i2;
        if (i2 > 1)
        {
            if (a)
            {
                (new StringBuilder("moveto ACTIVITY_CREATED: ")).append(ad1);
            }
            if (!ad1.y)
            {
                Object obj;
                if (ad1.H != 0)
                {
                    obj1 = (ViewGroup)p.a(ad1.H);
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = obj1;
                        if (!ad1.A)
                        {
                            a(((RuntimeException) (new IllegalArgumentException((new StringBuilder("No view found for id 0x")).append(Integer.toHexString(ad1.H)).append(" (").append(ad1.getResources().getResourceName(ad1.H)).append(") for fragment ").append(ad1).toString()))));
                            obj = obj1;
                        }
                    }
                } else
                {
                    obj = null;
                }
                ad1.R = ((ViewGroup) (obj));
                ad1.S = ad1.a(ad1.getLayoutInflater(ad1.n), ((ViewGroup) (obj)), ad1.n);
                if (ad1.S != null)
                {
                    ad1.T = ad1.S;
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        kb.v(ad1.S);
                    } else
                    {
                        ad1.S = bx.a(ad1.S);
                    }
                    if (obj != null)
                    {
                        obj1 = a(ad1, j1, true, k1);
                        if (obj1 != null)
                        {
                            b(ad1.S, ((Animation) (obj1)));
                            ad1.S.startAnimation(((Animation) (obj1)));
                        }
                        ((ViewGroup) (obj)).addView(ad1.S);
                    }
                    if (ad1.J)
                    {
                        ad1.S.setVisibility(8);
                    }
                    ad1.onViewCreated(ad1.S, ad1.n);
                } else
                {
                    ad1.T = null;
                }
            }
            ad1.c(ad1.n);
            if (ad1.S != null)
            {
                obj = ad1.n;
                if (ad1.o != null)
                {
                    ad1.T.restoreHierarchyState(ad1.o);
                    ad1.o = null;
                }
                ad1.P = false;
                ad1.onViewStateRestored(((Bundle) (obj)));
                if (!ad1.P)
                {
                    throw new du((new StringBuilder("Fragment ")).append(ad1).append(" did not call through to super.onViewStateRestored()").toString());
                }
            }
            ad1.n = null;
            l2 = i2;
        }
_L6:
        k2 = l2;
        if (l2 > 3)
        {
            if (a)
            {
                (new StringBuilder("moveto STARTED: ")).append(ad1);
            }
            ad1.i();
            k2 = l2;
        }
_L7:
        i2 = k2;
        if (k2 > 4)
        {
            if (a)
            {
                (new StringBuilder("moveto RESUMED: ")).append(ad1);
            }
            ad1.x = true;
            ad1.j();
            ad1.n = null;
            ad1.o = null;
            i2 = k2;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        i2 = i1;
        if (ad1.k <= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        ad1.k;
        JVM INSTR tableswitch 1 5: default 1144
    //                   1 1150
    //                   2 1300
    //                   3 1270
    //                   4 1240
    //                   5 1205;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L9:
        i2 = i1;
        if (i1 > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (t && ad1.l != null)
        {
            obj = ad1.l;
            ad1.l = null;
            ((View) (obj)).clearAnimation();
        }
        if (ad1.l != null)
        {
            ad1.m = i1;
            i2 = 1;
            break; /* Loop/switch isn't completed */
        }
          goto _L14
_L13:
        if (i1 < 5)
        {
            if (a)
            {
                (new StringBuilder("movefrom RESUMED: ")).append(ad1);
            }
            ad1.l();
            ad1.x = false;
        }
_L12:
        if (i1 < 4)
        {
            if (a)
            {
                (new StringBuilder("movefrom STARTED: ")).append(ad1);
            }
            ad1.m();
        }
_L11:
        if (i1 < 3)
        {
            if (a)
            {
                (new StringBuilder("movefrom STOPPED: ")).append(ad1);
            }
            ad1.n();
        }
_L10:
        if (i1 < 2)
        {
            if (a)
            {
                (new StringBuilder("movefrom ACTIVITY_CREATED: ")).append(ad1);
            }
            if (ad1.S != null && o.b() && ad1.o == null)
            {
                c(ad1);
            }
            ad1.o();
            if (ad1.S != null && ad1.R != null)
            {
                if (n > 0 && !t)
                {
                    obj = a(ad1, j1, false, k1);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ad1.l = ad1.S;
                    ad1.m = i1;
                    ((Animation) (obj)).setAnimationListener(new at(this, ad1.S, ((Animation) (obj)), ad1));
                    ad1.S.startAnimation(((Animation) (obj)));
                }
                ad1.R.removeView(ad1.S);
            }
            ad1.R = null;
            ad1.S = null;
            ad1.T = null;
        }
        if (true) goto _L9; else goto _L14
_L14:
        if (a)
        {
            (new StringBuilder("movefrom CREATED: ")).append(ad1);
        }
        if (!ad1.M)
        {
            ad1.p();
        }
        ad1.P = false;
        ad1.onDetach();
        if (!ad1.P)
        {
            throw new du((new StringBuilder("Fragment ")).append(ad1).append(" did not call through to super.onDetach()").toString());
        }
        i2 = i1;
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!ad1.M)
        {
            i2 = i1;
            if (ad1.p >= 0)
            {
                if (a)
                {
                    (new StringBuilder("Freeing fragment index ")).append(ad1);
                }
                f.set(ad1.p, null);
                if (h == null)
                {
                    h = new ArrayList();
                }
                h.add(Integer.valueOf(ad1.p));
                o.b(ad1.q);
                ad1.g();
                i2 = i1;
            }
        } else
        {
            ad1.D = null;
            ad1.F = null;
            ad1.C = null;
            ad1.E = null;
            i2 = i1;
        }
        if (true) goto _L16; else goto _L15
_L15:
    }

    public void a(ad ad1, boolean flag)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        if (a)
        {
            (new StringBuilder("add: ")).append(ad1);
        }
        if (ad1.p < 0)
        {
            if (h == null || h.size() <= 0)
            {
                if (f == null)
                {
                    f = new ArrayList();
                }
                ad1.a(f.size(), q);
                f.add(ad1);
            } else
            {
                ad1.a(((Integer)h.remove(h.size() - 1)).intValue(), q);
                f.set(ad1.p, ad1);
            }
            if (a)
            {
                (new StringBuilder("Allocated fragment index ")).append(ad1);
            }
        }
        if (!ad1.K)
        {
            if (g.contains(ad1))
            {
                throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(ad1).toString());
            }
            g.add(ad1);
            ad1.v = true;
            ad1.w = false;
            if (ad1.N && ad1.O)
            {
                r = true;
            }
            if (flag)
            {
                b(ad1);
            }
        }
    }

    public void a(Configuration configuration)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                ad ad1 = (ad)g.get(i1);
                if (ad1 != null)
                {
                    ad1.a(configuration);
                }
            }

        }
    }

    void a(Parcelable parcelable, List list)
    {
        if (parcelable != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (((aw) (parcelable = (aw)parcelable)).a != null)
        {
            if (list != null)
            {
                for (int i1 = 0; i1 < list.size(); i1++)
                {
                    ad ad1 = (ad)list.get(i1);
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: re-attaching retained ")).append(ad1);
                    }
                    az az2 = ((aw) (parcelable)).a[ad1.p];
                    az2.k = ad1;
                    ad1.o = null;
                    ad1.B = 0;
                    ad1.z = false;
                    ad1.v = false;
                    ad1.s = null;
                    if (az2.j != null)
                    {
                        az2.j.setClassLoader(o.i().getClassLoader());
                        ad1.o = az2.j.getSparseParcelableArray("android:view_state");
                        ad1.n = az2.j;
                    }
                }

            }
            f = new ArrayList(((aw) (parcelable)).a.length);
            if (h != null)
            {
                h.clear();
            }
            int j1 = 0;
            while (j1 < ((aw) (parcelable)).a.length) 
            {
                az az1 = ((aw) (parcelable)).a[j1];
                if (az1 != null)
                {
                    ad ad3 = az1.a(o, q);
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: active #")).append(j1).append(": ").append(ad3);
                    }
                    f.add(ad3);
                    az1.k = null;
                } else
                {
                    f.add(null);
                    if (h == null)
                    {
                        h = new ArrayList();
                    }
                    if (!a);
                    h.add(Integer.valueOf(j1));
                }
                j1++;
            }
            if (list != null)
            {
                int k1 = 0;
                while (k1 < list.size()) 
                {
                    ad ad2 = (ad)list.get(k1);
                    if (ad2.t >= 0)
                    {
                        if (ad2.t < f.size())
                        {
                            ad2.s = (ad)f.get(ad2.t);
                        } else
                        {
                            (new StringBuilder("Re-attaching retained fragment ")).append(ad2).append(" target no longer exists: ").append(ad2.t);
                            ad2.s = null;
                        }
                    }
                    k1++;
                }
            }
            if (((aw) (parcelable)).b != null)
            {
                g = new ArrayList(((aw) (parcelable)).b.length);
                for (int l1 = 0; l1 < ((aw) (parcelable)).b.length; l1++)
                {
                    list = (ad)f.get(((aw) (parcelable)).b[l1]);
                    if (list == null)
                    {
                        a(((RuntimeException) (new IllegalStateException((new StringBuilder("No instantiated fragment for index #")).append(((aw) (parcelable)).b[l1]).toString()))));
                    }
                    list.v = true;
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: added #")).append(l1).append(": ").append(list);
                    }
                    if (g.contains(list))
                    {
                        throw new IllegalStateException("Already added!");
                    }
                    g.add(list);
                }

            } else
            {
                g = null;
            }
            if (((aw) (parcelable)).c != null)
            {
                i = new ArrayList(((aw) (parcelable)).c.length);
                int i2 = 0;
                while (i2 < ((aw) (parcelable)).c.length) 
                {
                    list = ((aw) (parcelable)).c[i2].a(this);
                    if (a)
                    {
                        (new StringBuilder("restoreAllState: back stack #")).append(i2).append(" (index ").append(((t) (list)).p).append("): ").append(list);
                        list.a("  ", new PrintWriter(new hc("FragmentManager")), false);
                    }
                    i.add(list);
                    if (((t) (list)).p >= 0)
                    {
                        a(((t) (list)).p, ((t) (list)));
                    }
                    i2++;
                }
            } else
            {
                i = null;
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(ao ao1, am am1, ad ad1)
    {
        if (o != null)
        {
            throw new IllegalStateException("Already attached");
        } else
        {
            o = ao1;
            p = am1;
            q = ad1;
            return;
        }
    }

    public void a(Runnable runnable, boolean flag)
    {
        if (!flag)
        {
            u();
        }
        this;
        JVM INSTR monitorenter ;
        if (t || o == null)
        {
            throw new IllegalStateException("Activity has been destroyed");
        }
        break MISSING_BLOCK_LABEL_40;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
        if (c == null)
        {
            c = new ArrayList();
        }
        c.add(runnable);
        if (c.size() == 1)
        {
            o.j().removeCallbacks(y);
            o.j().post(y);
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        boolean flag;
        flag = false;
        String s2 = (new StringBuilder()).append(s1).append("    ").toString();
        if (f != null)
        {
            int k2 = f.size();
            if (k2 > 0)
            {
                printwriter.print(s1);
                printwriter.print("Active Fragments in ");
                printwriter.print(Integer.toHexString(System.identityHashCode(this)));
                printwriter.println(":");
                for (int i1 = 0; i1 < k2; i1++)
                {
                    ad ad1 = (ad)f.get(i1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(i1);
                    printwriter.print(": ");
                    printwriter.println(ad1);
                    if (ad1 != null)
                    {
                        ad1.dump(s2, filedescriptor, printwriter, as1);
                    }
                }

            }
        }
        if (g != null)
        {
            int l2 = g.size();
            if (l2 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Added Fragments:");
                for (int j1 = 0; j1 < l2; j1++)
                {
                    filedescriptor = (ad)g.get(j1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (j != null)
        {
            int i3 = j.size();
            if (i3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Fragments Created Menus:");
                for (int k1 = 0; k1 < i3; k1++)
                {
                    filedescriptor = (ad)j.get(k1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                }

            }
        }
        if (i != null)
        {
            int j3 = i.size();
            if (j3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Back Stack:");
                for (int l1 = 0; l1 < j3; l1++)
                {
                    filedescriptor = (t)i.get(l1);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(l1);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor.toString());
                    filedescriptor.a(s2, printwriter);
                }

            }
        }
        this;
        JVM INSTR monitorenter ;
        if (k == null) goto _L2; else goto _L1
_L1:
        int k3 = k.size();
        if (k3 <= 0) goto _L2; else goto _L3
_L3:
        printwriter.print(s1);
        printwriter.println("Back Stack Indices:");
        int i2 = 0;
_L4:
        if (i2 >= k3)
        {
            break; /* Loop/switch isn't completed */
        }
        filedescriptor = (t)k.get(i2);
        printwriter.print(s1);
        printwriter.print("  #");
        printwriter.print(i2);
        printwriter.print(": ");
        printwriter.println(filedescriptor);
        i2++;
        if (true) goto _L4; else goto _L2
_L2:
        if (l != null && l.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("mAvailBackStackIndices: ");
            printwriter.println(Arrays.toString(l.toArray()));
        }
        this;
        JVM INSTR monitorexit ;
        if (c != null)
        {
            int l3 = c.size();
            if (l3 > 0)
            {
                printwriter.print(s1);
                printwriter.println("Pending Actions:");
                for (int j2 = ((flag) ? 1 : 0); j2 < l3; j2++)
                {
                    filedescriptor = (Runnable)c.get(j2);
                    printwriter.print(s1);
                    printwriter.print("  #");
                    printwriter.print(j2);
                    printwriter.print(": ");
                    printwriter.println(filedescriptor);
                }

            }
        }
        break MISSING_BLOCK_LABEL_700;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        printwriter.print(s1);
        printwriter.println("FragmentManager misc state:");
        printwriter.print(s1);
        printwriter.print("  mHost=");
        printwriter.println(o);
        printwriter.print(s1);
        printwriter.print("  mContainer=");
        printwriter.println(p);
        if (q != null)
        {
            printwriter.print(s1);
            printwriter.print("  mParent=");
            printwriter.println(q);
        }
        printwriter.print(s1);
        printwriter.print("  mCurState=");
        printwriter.print(n);
        printwriter.print(" mStateSaved=");
        printwriter.print(s);
        printwriter.print(" mDestroyed=");
        printwriter.println(t);
        if (r)
        {
            printwriter.print(s1);
            printwriter.print("  mNeedMenuInvalidate=");
            printwriter.println(r);
        }
        if (u != null)
        {
            printwriter.print(s1);
            printwriter.print("  mNoTransactionsBecause=");
            printwriter.println(u);
        }
        if (h != null && h.size() > 0)
        {
            printwriter.print(s1);
            printwriter.print("  mAvailIndices: ");
            printwriter.println(Arrays.toString(h.toArray()));
        }
        return;
    }

    boolean a(int i1, int j1)
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i1 >= 0 || (j1 & 1) != 0) goto _L4; else goto _L3
_L3:
        if ((i1 = i.size() - 1) < 0) goto _L1; else goto _L5
_L5:
        t t1 = (t)i.remove(i1);
        SparseArray sparsearray = new SparseArray();
        SparseArray sparsearray1 = new SparseArray();
        t1.a(sparsearray, sparsearray1);
        t1.a(true, null, sparsearray, sparsearray1);
_L8:
        v();
        return true;
_L4:
        int k1;
        int l1;
        k1 = -1;
        if (i1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = i.size() - 1;
        do
        {
            if (l1 < 0)
            {
                break;
            }
            t t2 = (t)i.get(l1);
            if (i1 >= 0 && i1 == t2.p)
            {
                break;
            }
            l1--;
        } while (true);
        if (l1 < 0) goto _L1; else goto _L6
_L6:
        k1 = l1;
        if ((j1 & 1) != 0)
        {
            j1 = l1 - 1;
            do
            {
                k1 = j1;
                if (j1 < 0)
                {
                    break;
                }
                t t3 = (t)i.get(j1);
                k1 = j1;
                if (i1 < 0)
                {
                    break;
                }
                k1 = j1;
                if (i1 != t3.p)
                {
                    break;
                }
                j1--;
            } while (true);
        }
        if (k1 == i.size() - 1) goto _L1; else goto _L7
_L7:
        ArrayList arraylist = new ArrayList();
        for (i1 = i.size() - 1; i1 > k1; i1--)
        {
            arraylist.add(i.remove(i1));
        }

        j1 = arraylist.size() - 1;
        SparseArray sparsearray2 = new SparseArray();
        SparseArray sparsearray3 = new SparseArray();
        for (i1 = 0; i1 <= j1; i1++)
        {
            ((t)arraylist.get(i1)).a(sparsearray2, sparsearray3);
        }

        x x1 = null;
        i1 = 0;
        while (i1 <= j1) 
        {
            if (a)
            {
                (new StringBuilder("Popping back stack state: ")).append(arraylist.get(i1));
            }
            t t4 = (t)arraylist.get(i1);
            boolean flag;
            if (i1 == j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            x1 = t4.a(flag, x1, sparsearray2, sparsearray3);
            i1++;
        }
          goto _L8
    }

    public boolean a(Menu menu)
    {
        boolean flag1;
        if (g != null)
        {
            int i1 = 0;
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (i1 >= g.size())
                {
                    break;
                }
                ad ad1 = (ad)g.get(i1);
                flag1 = flag;
                if (ad1 != null)
                {
                    flag1 = flag;
                    if (ad1.a(menu))
                    {
                        flag1 = true;
                    }
                }
                i1++;
                flag = flag1;
            } while (true);
        } else
        {
            flag1 = false;
        }
        return flag1;
    }

    public boolean a(Menu menu, MenuInflater menuinflater)
    {
        boolean flag = false;
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        boolean flag2;
        if (g != null)
        {
            int i1 = 0;
            boolean flag1 = false;
            do
            {
                arraylist1 = arraylist;
                flag2 = flag1;
                if (i1 >= g.size())
                {
                    break;
                }
                ad ad1 = (ad)g.get(i1);
                arraylist1 = arraylist;
                flag2 = flag1;
                if (ad1 != null)
                {
                    arraylist1 = arraylist;
                    flag2 = flag1;
                    if (ad1.a(menu, menuinflater))
                    {
                        flag2 = true;
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(ad1);
                    }
                }
                i1++;
                flag1 = flag2;
                arraylist = arraylist1;
            } while (true);
        } else
        {
            flag2 = false;
        }
        if (j != null)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < j.size(); j1++)
            {
                menu = (ad)j.get(j1);
                if (arraylist1 == null || !arraylist1.contains(menu))
                {
                    menu.onDestroyOptionsMenu();
                }
            }

        }
        j = arraylist1;
        return flag2;
    }

    public boolean a(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        ad ad1 = (ad)g.get(i1);
        if (ad1 == null || !ad1.a(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad id: ")).append(i1).toString());
        } else
        {
            a(new as(this, i1, 1), false);
            return;
        }
    }

    public void b(ad ad1, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("hide: ")).append(ad1);
        }
        if (!ad1.J)
        {
            ad1.J = true;
            if (ad1.S != null)
            {
                Animation animation = a(ad1, i1, false, j1);
                if (animation != null)
                {
                    b(ad1.S, animation);
                    ad1.S.startAnimation(animation);
                }
                ad1.S.setVisibility(8);
            }
            if (ad1.v && ad1.N && ad1.O)
            {
                r = true;
            }
            ad1.onHiddenChanged(true);
        }
    }

    public void b(Menu menu)
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                ad ad1 = (ad)g.get(i1);
                if (ad1 != null)
                {
                    ad1.b(menu);
                }
            }

        }
    }

    void b(t t1)
    {
        if (i == null)
        {
            i = new ArrayList();
        }
        i.add(t1);
        v();
    }

    public boolean b()
    {
        return g();
    }

    public boolean b(MenuItem menuitem)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (g == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= g.size()) goto _L2; else goto _L3
_L3:
        ad ad1 = (ad)g.get(i1);
        if (ad1 == null || !ad1.b(menuitem)) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(i1, null);
        if (l == null)
        {
            l = new ArrayList();
        }
        if (!a);
        l.add(Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c(ad ad1, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("show: ")).append(ad1);
        }
        if (ad1.J)
        {
            ad1.J = false;
            if (ad1.S != null)
            {
                Animation animation = a(ad1, i1, true, j1);
                if (animation != null)
                {
                    b(ad1.S, animation);
                    ad1.S.startAnimation(animation);
                }
                ad1.S.setVisibility(0);
            }
            if (ad1.v && ad1.N && ad1.O)
            {
                r = true;
            }
            ad1.onHiddenChanged(false);
        }
    }

    public boolean c()
    {
        u();
        b();
        return a(-1, 0);
    }

    public List d()
    {
        return f;
    }

    public void d(ad ad1, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("detach: ")).append(ad1);
        }
        if (!ad1.K)
        {
            ad1.K = true;
            if (ad1.v)
            {
                if (g != null)
                {
                    if (a)
                    {
                        (new StringBuilder("remove from detach: ")).append(ad1);
                    }
                    g.remove(ad1);
                }
                if (ad1.N && ad1.O)
                {
                    r = true;
                }
                ad1.v = false;
                a(ad1, 1, i1, j1, false);
            }
        }
    }

    public void e(ad ad1, int i1, int j1)
    {
        if (a)
        {
            (new StringBuilder("attach: ")).append(ad1);
        }
        if (ad1.K)
        {
            ad1.K = false;
            if (!ad1.v)
            {
                if (g == null)
                {
                    g = new ArrayList();
                }
                if (g.contains(ad1))
                {
                    throw new IllegalStateException((new StringBuilder("Fragment already added: ")).append(ad1).toString());
                }
                if (a)
                {
                    (new StringBuilder("add from attach: ")).append(ad1);
                }
                g.add(ad1);
                ad1.v = true;
                if (ad1.N && ad1.O)
                {
                    r = true;
                }
                a(ad1, n, i1, j1, false);
            }
        }
    }

    public boolean e()
    {
        return t;
    }

    void f()
    {
        if (f != null)
        {
            int i1 = 0;
            while (i1 < f.size()) 
            {
                ad ad1 = (ad)f.get(i1);
                if (ad1 != null)
                {
                    a(ad1);
                }
                i1++;
            }
        }
    }

    public boolean g()
    {
        if (e)
        {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != o.j().getLooper())
        {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean flag = false;
_L2:
        this;
        JVM INSTR monitorenter ;
        if (c != null && c.size() != 0)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        this;
        JVM INSTR monitorexit ;
        int k1;
        if (!v)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        int i1 = 0;
        int l1;
        for (k1 = 0; i1 < f.size(); k1 = l1)
        {
            ad ad1 = (ad)f.get(i1);
            l1 = k1;
            if (ad1 != null)
            {
                l1 = k1;
                if (ad1.W != null)
                {
                    l1 = k1 | ad1.W.a();
                }
            }
            i1++;
        }

        break; /* Loop/switch isn't completed */
        k1 = c.size();
        if (d == null || d.length < k1)
        {
            d = new Runnable[k1];
        }
        c.toArray(d);
        c.clear();
        o.j().removeCallbacks(y);
        this;
        JVM INSTR monitorexit ;
        e = true;
        for (int j1 = 0; j1 < k1; j1++)
        {
            d[j1].run();
            d[j1] = null;
        }

        break MISSING_BLOCK_LABEL_250;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        e = false;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        if (k1 == 0)
        {
            v = false;
            f();
        }
        return flag;
    }

    ArrayList h()
    {
        ArrayList arraylist1 = null;
        ArrayList arraylist = null;
        if (f != null)
        {
            int i1 = 0;
            do
            {
                arraylist1 = arraylist;
                if (i1 >= f.size())
                {
                    break;
                }
                ad ad1 = (ad)f.get(i1);
                ArrayList arraylist2 = arraylist;
                if (ad1 != null)
                {
                    arraylist2 = arraylist;
                    if (ad1.L)
                    {
                        arraylist1 = arraylist;
                        if (arraylist == null)
                        {
                            arraylist1 = new ArrayList();
                        }
                        arraylist1.add(ad1);
                        ad1.M = true;
                        int j1;
                        if (ad1.s != null)
                        {
                            j1 = ad1.s.p;
                        } else
                        {
                            j1 = -1;
                        }
                        ad1.t = j1;
                        arraylist2 = arraylist1;
                        if (a)
                        {
                            (new StringBuilder("retainNonConfig: keeping retained ")).append(ad1);
                            arraylist2 = arraylist1;
                        }
                    }
                }
                i1++;
                arraylist = arraylist2;
            } while (true);
        }
        return arraylist1;
    }

    Parcelable i()
    {
        y ay[] = null;
        g();
        if (b)
        {
            s = true;
        }
        if (f != null && f.size() > 0)
        {
            int k1 = f.size();
            az aaz[] = new az[k1];
            int j1 = 0;
            boolean flag = false;
            while (j1 < k1) 
            {
                ad ad1 = (ad)f.get(j1);
                if (ad1 == null)
                {
                    continue;
                }
                if (ad1.p < 0)
                {
                    a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(ad1).append(" has cleared index: ").append(ad1.p).toString()));
                }
                az az1 = new az(ad1);
                aaz[j1] = az1;
                if (ad1.k > 0 && az1.j == null)
                {
                    if (w == null)
                    {
                        w = new Bundle();
                    }
                    ad1.d(w);
                    Bundle bundle;
                    int ai[];
                    Object obj;
                    aw aw1;
                    int i1;
                    if (!w.isEmpty())
                    {
                        obj = w;
                        w = null;
                    } else
                    {
                        obj = null;
                    }
                    if (ad1.S != null)
                    {
                        c(ad1);
                    }
                    bundle = ((Bundle) (obj));
                    if (ad1.o != null)
                    {
                        bundle = ((Bundle) (obj));
                        if (obj == null)
                        {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", ad1.o);
                    }
                    obj = bundle;
                    if (!ad1.V)
                    {
                        obj = bundle;
                        if (bundle == null)
                        {
                            obj = new Bundle();
                        }
                        ((Bundle) (obj)).putBoolean("android:user_visible_hint", ad1.V);
                    }
                    az1.j = ((Bundle) (obj));
                    if (ad1.s != null)
                    {
                        if (ad1.s.p < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Failure saving state: ")).append(ad1).append(" has target not in fragment manager: ").append(ad1.s).toString()));
                        }
                        if (az1.j == null)
                        {
                            az1.j = new Bundle();
                        }
                        Bundle bundle1 = az1.j;
                        obj = ad1.s;
                        if (((ad) (obj)).p < 0)
                        {
                            a(new IllegalStateException((new StringBuilder("Fragment ")).append(obj).append(" is not currently in the FragmentManager").toString()));
                        }
                        bundle1.putInt("android:target_state", ((ad) (obj)).p);
                        if (ad1.u != 0)
                        {
                            az1.j.putInt("android:target_req_state", ad1.u);
                        }
                    }
                } else
                {
                    az1.j = ad1.n;
                }
                if (a)
                {
                    (new StringBuilder("Saved state of ")).append(ad1).append(": ").append(az1.j);
                }
                flag = true;
                j1++;
            }
            if (flag)
            {
label0:
                {
                    if (g != null)
                    {
                        j1 = g.size();
                        if (j1 > 0)
                        {
                            obj = new int[j1];
                            i1 = 0;
                            do
                            {
                                ai = ((int []) (obj));
                                if (i1 >= j1)
                                {
                                    break;
                                }
                                obj[i1] = ((ad)g.get(i1)).p;
                                if (obj[i1] < 0)
                                {
                                    a(new IllegalStateException((new StringBuilder("Failure saving state: active ")).append(g.get(i1)).append(" has cleared index: ").append(obj[i1]).toString()));
                                }
                                if (a)
                                {
                                    (new StringBuilder("saveAllState: adding fragment #")).append(i1).append(": ").append(g.get(i1));
                                }
                                i1++;
                            } while (true);
                            break label0;
                        }
                    }
                    ai = null;
                }
                obj = ay;
                if (i != null)
                {
                    j1 = i.size();
                    obj = ay;
                    if (j1 > 0)
                    {
                        ay = new y[j1];
                        i1 = 0;
                        do
                        {
                            obj = ay;
                            if (i1 >= j1)
                            {
                                break;
                            }
                            ay[i1] = new y((t)i.get(i1));
                            if (a)
                            {
                                (new StringBuilder("saveAllState: adding back stack #")).append(i1).append(": ").append(i.get(i1));
                            }
                            i1++;
                        } while (true);
                    }
                }
                aw1 = new aw();
                aw1.a = aaz;
                aw1.b = ai;
                aw1.c = ((y []) (obj));
                return aw1;
            }
        }
        return null;
    }

    public void j()
    {
        s = false;
        e(1);
    }

    public void k()
    {
        s = false;
        e(2);
    }

    public void l()
    {
        s = false;
        e(4);
    }

    public void m()
    {
        s = false;
        e(5);
    }

    public void n()
    {
        e(4);
    }

    public void noteStateNotSaved()
    {
        s = false;
    }

    public void o()
    {
        s = true;
        e(3);
    }

    public void p()
    {
        e(2);
    }

    public void q()
    {
        e(1);
    }

    public void r()
    {
        t = true;
        g();
        e(0);
        o = null;
        p = null;
        q = null;
    }

    public void s()
    {
        if (g != null)
        {
            for (int i1 = 0; i1 < g.size(); i1++)
            {
                ad ad1 = (ad)g.get(i1);
                if (ad1 != null)
                {
                    ad1.k();
                }
            }

        }
    }

    iv t()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("FragmentManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        if (q != null)
        {
            g.a(q, stringbuilder);
        } else
        {
            g.a(o, stringbuilder);
        }
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag = false;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        }
        b = flag;
    }
}
