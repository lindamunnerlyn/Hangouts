// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class vk
{

    public static final boolean a;
    private static final android.graphics.PorterDuff.Mode b;
    private static final WeakHashMap c = new WeakHashMap();
    private static final vl d = new vl();
    private static final int e[];
    private static final int f[];
    private static final int g[];
    private static final int h[];
    private static final int i[];
    private static final int j[];
    private final WeakReference k;
    private SparseArray l;
    private ColorStateList m;

    private vk(Context context)
    {
        k = new WeakReference(context);
    }

    private static PorterDuffColorFilter a(int i1, android.graphics.PorterDuff.Mode mode)
    {
        PorterDuffColorFilter porterduffcolorfilter1 = d.a(i1, mode);
        PorterDuffColorFilter porterduffcolorfilter = porterduffcolorfilter1;
        if (porterduffcolorfilter1 == null)
        {
            porterduffcolorfilter = new PorterDuffColorFilter(i1, mode);
            d.a(i1, mode, porterduffcolorfilter);
        }
        return porterduffcolorfilter;
    }

    public static Drawable a(Context context, int i1)
    {
        boolean flag;
        if (a(f, i1) || a(e, i1) || a(g, i1) || a(i, i1) || a(h, i1) || a(j, i1) || i1 == g.ah)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return a(context).a(i1);
        } else
        {
            return ef.a(context, i1);
        }
    }

    public static vk a(Context context)
    {
        vk vk2 = (vk)c.get(context);
        vk vk1 = vk2;
        if (vk2 == null)
        {
            vk1 = new vk(context);
            c.put(context, vk1);
        }
        return vk1;
    }

    public static void a(View view, vj vj1)
    {
        Object obj1 = null;
        Drawable drawable = view.getBackground();
        if (vj1.d || vj1.c)
        {
            ColorStateList colorstatelist;
            Object obj;
            int ai[];
            if (vj1.d)
            {
                colorstatelist = vj1.a;
            } else
            {
                colorstatelist = null;
            }
            if (vj1.c)
            {
                vj1 = vj1.b;
            } else
            {
                vj1 = b;
            }
            ai = view.getDrawableState();
            obj = obj1;
            if (colorstatelist != null)
            {
                if (vj1 == null)
                {
                    obj = obj1;
                } else
                {
                    obj = a(colorstatelist.getColorForState(ai, 0), ((android.graphics.PorterDuff.Mode) (vj1)));
                }
            }
            drawable.setColorFilter(((android.graphics.ColorFilter) (obj)));
        } else
        {
            drawable.clearColorFilter();
        }
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            view.invalidate();
        }
    }

    private static boolean a(int ai[], int i1)
    {
        boolean flag1 = false;
        int k1 = ai.length;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (ai[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    private static ColorStateList b(Context context, int i1)
    {
        i1 = vg.a(context, i1);
        int l1 = vg.a(context, g.A);
        int ai[] = vg.a;
        int j1 = vg.c(context, g.y);
        context = vg.d;
        int k1 = g.a(l1, i1);
        int ai1[] = vg.b;
        l1 = g.a(l1, i1);
        return new ColorStateList(new int[][] {
            ai, context, ai1, vg.h
        }, new int[] {
            j1, k1, l1, i1
        });
    }

    public Drawable a(int i1)
    {
        return a(i1, false);
    }

    public Drawable a(int i1, boolean flag)
    {
        Object obj;
        Drawable drawable;
        Object obj2;
        obj2 = null;
        obj = (Context)k.get();
        if (obj == null)
        {
            return null;
        }
        drawable = ef.a(((Context) (obj)), i1);
        obj = drawable;
        if (drawable == null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1 = drawable;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj1 = drawable.mutate();
        }
        obj = b(i1);
        if (obj == null) goto _L4; else goto _L3
_L3:
        Drawable drawable1 = fe.c(((Drawable) (obj1)));
        fe.a(drawable1, ((ColorStateList) (obj)));
        obj1 = obj2;
        if (i1 == g.aC)
        {
            obj1 = android.graphics.PorterDuff.Mode.MULTIPLY;
        }
        obj = drawable1;
        if (obj1 != null)
        {
            fe.a(drawable1, ((android.graphics.PorterDuff.Mode) (obj1)));
            obj = drawable1;
        }
_L2:
        return ((Drawable) (obj));
_L4:
        if (i1 == g.ah)
        {
            return new LayerDrawable(new Drawable[] {
                a(g.ag), a(g.ai)
            });
        }
        obj = obj1;
        if (!a(i1, ((Drawable) (obj1))))
        {
            obj = obj1;
            if (flag)
            {
                obj = null;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean a(int i1, Drawable drawable)
    {
        Context context = (Context)k.get();
        if (context == null)
        {
            return false;
        }
        android.graphics.PorterDuff.Mode mode = b;
        int j1;
        boolean flag;
        if (a(e, i1))
        {
            j1 = g.B;
            flag = true;
            i1 = -1;
        } else
        if (a(g, i1))
        {
            j1 = g.z;
            flag = true;
            i1 = -1;
        } else
        if (a(h, i1))
        {
            mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            flag = true;
            j1 = 0x1010031;
            i1 = -1;
        } else
        if (i1 == g.aw)
        {
            j1 = 0x1010030;
            i1 = Math.round(40.8F);
            flag = true;
        } else
        {
            i1 = -1;
            j1 = 0;
            flag = false;
        }
        if (flag)
        {
            drawable.setColorFilter(a(vg.a(context, j1), mode));
            if (i1 != -1)
            {
                drawable.setAlpha(i1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final ColorStateList b(int i1)
    {
        Object obj1 = (Context)k.get();
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            Object obj;
            if (l != null)
            {
                obj = (ColorStateList)l.get(i1);
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                if (i1 == g.aj)
                {
                    obj = vg.a;
                    int j1 = vg.c(((Context) (obj1)), g.B);
                    int ai[] = vg.g;
                    int k2 = vg.a(((Context) (obj1)), g.B);
                    int ai5[] = vg.h;
                    int l3 = vg.a(((Context) (obj1)), g.z);
                    obj = new ColorStateList(new int[][] {
                        obj, ai, ai5
                    }, new int[] {
                        j1, k2, l3
                    });
                } else
                if (i1 == g.aD)
                {
                    obj = vg.a;
                    int k1 = vg.a(((Context) (obj1)), 0x1010030, 0.1F);
                    int ai1[] = vg.e;
                    int l2 = vg.a(((Context) (obj1)), g.z, 0.3F);
                    int ai6[] = vg.h;
                    int i4 = vg.a(((Context) (obj1)), 0x1010030, 0.3F);
                    obj = new ColorStateList(new int[][] {
                        obj, ai1, ai6
                    }, new int[] {
                        k1, l2, i4
                    });
                } else
                if (i1 == g.aC)
                {
                    obj = new int[3][];
                    int ai2[] = new int[3];
                    ColorStateList colorstatelist = vg.b(((Context) (obj1)), g.C);
                    if (colorstatelist != null && colorstatelist.isStateful())
                    {
                        obj[0] = vg.a;
                        ai2[0] = colorstatelist.getColorForState(obj[0], 0);
                        obj[1] = vg.e;
                        ai2[1] = vg.a(((Context) (obj1)), g.z);
                        obj[2] = vg.h;
                        ai2[2] = colorstatelist.getDefaultColor();
                    } else
                    {
                        obj[0] = vg.a;
                        ai2[0] = vg.c(((Context) (obj1)), g.C);
                        obj[1] = vg.e;
                        ai2[1] = vg.a(((Context) (obj1)), g.z);
                        obj[2] = vg.h;
                        ai2[2] = vg.a(((Context) (obj1)), g.C);
                    }
                    obj = new ColorStateList(((int [][]) (obj)), ai2);
                } else
                if (i1 == g.ae || i1 == g.ab)
                {
                    obj = b(((Context) (obj1)), g.y);
                } else
                if (i1 == g.ad)
                {
                    obj = b(((Context) (obj1)), g.x);
                } else
                if (i1 == g.aA || i1 == g.aB)
                {
                    obj = vg.a;
                    int l1 = vg.c(((Context) (obj1)), g.B);
                    int ai3[] = vg.g;
                    int i3 = vg.a(((Context) (obj1)), g.B);
                    int ai7[] = vg.h;
                    int j4 = vg.a(((Context) (obj1)), g.z);
                    obj = new ColorStateList(new int[][] {
                        obj, ai3, ai7
                    }, new int[] {
                        l1, i3, j4
                    });
                } else
                if (a(f, i1))
                {
                    obj = vg.b(((Context) (obj1)), g.B);
                } else
                if (a(i, i1))
                {
                    if (m == null)
                    {
                        int i2 = vg.a(((Context) (obj1)), g.B);
                        int j3 = vg.a(((Context) (obj1)), g.z);
                        obj = vg.a;
                        int k4 = vg.c(((Context) (obj1)), g.B);
                        m = new ColorStateList(new int[][] {
                            obj, vg.b, vg.c, vg.d, vg.e, vg.f, vg.h
                        }, new int[] {
                            k4, j3, j3, j3, j3, j3, i2
                        });
                    }
                    obj = m;
                } else
                if (a(j, i1))
                {
                    obj = vg.a;
                    int j2 = vg.c(((Context) (obj1)), g.B);
                    int ai4[] = vg.e;
                    int k3 = vg.a(((Context) (obj1)), g.z);
                    int ai8[] = vg.h;
                    int l4 = vg.a(((Context) (obj1)), g.B);
                    obj = new ColorStateList(new int[][] {
                        obj, ai4, ai8
                    }, new int[] {
                        j2, k3, l4
                    });
                }
                obj1 = obj;
                if (obj != null)
                {
                    if (l == null)
                    {
                        l = new SparseArray();
                    }
                    l.append(i1, obj);
                    return ((ColorStateList) (obj));
                }
            } else
            {
                return ((ColorStateList) (obj));
            }
        }
        return ((ColorStateList) (obj1));
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        b = android.graphics.PorterDuff.Mode.SRC_IN;
        e = (new int[] {
            g.aJ, g.aH, g.aa
        });
        f = (new int[] {
            g.ak, g.an, g.au, g.am, g.al, g.at, g.ao, g.ap, g.as, g.ar, 
            g.aq, g.av
        });
        g = (new int[] {
            g.aG, g.aI, g.ai, g.aF
        });
        h = (new int[] {
            g.ay, g.ag, g.ax
        });
        i = (new int[] {
            g.aj, g.aE, g.aK, g.aA, g.aB, g.az, g.aD, g.aC, g.ae, g.ab
        });
        j = (new int[] {
            g.ac, g.af
        });
    }
}
