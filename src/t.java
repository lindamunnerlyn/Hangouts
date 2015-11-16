// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public final class t extends bg
    implements Runnable
{

    static final boolean a;
    final aq b;
    w c;
    w d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    boolean m;
    String n;
    boolean o;
    int p;
    int q;
    CharSequence r;
    int s;
    CharSequence t;
    ArrayList u;
    ArrayList v;

    public t(aq aq1)
    {
        m = true;
        p = -1;
        b = aq1;
    }

    private int a(boolean flag)
    {
        if (o)
        {
            throw new IllegalStateException("commit already called");
        }
        if (aq.a)
        {
            (new StringBuilder("Commit: ")).append(this);
            a("  ", new PrintWriter(new hc("FragmentManager")));
        }
        o = true;
        if (l)
        {
            p = b.a(this);
        } else
        {
            p = -1;
        }
        b.a(this, flag);
        return p;
    }

    private static gz a(ArrayList arraylist, ArrayList arraylist1, gz gz1)
    {
        if (gz1.isEmpty())
        {
            return gz1;
        }
        gz gz2 = new gz();
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = (View)gz1.get(arraylist.get(i1));
            if (view != null)
            {
                gz2.put(arraylist1.get(i1), view);
            }
        }

        return gz2;
    }

    static gz a(t t1, x x1, boolean flag, ad ad1)
    {
        gz gz2 = new gz();
        View view = ad1.getView();
        gz gz1 = gz2;
        if (view != null)
        {
            gz1 = gz2;
            if (t1.u != null)
            {
                g.a(gz2, view);
                if (flag)
                {
                    gz1 = a(t1.u, t1.v, gz2);
                } else
                {
                    gz2.a(t1.v);
                    gz1 = gz2;
                }
            }
        }
        if (flag)
        {
            if (ad1.ai != null)
            {
                ad1 = ad1.ai;
            }
            t1.a(x1, gz1, true);
            return gz1;
        }
        if (ad1.ah != null)
        {
            t1 = ad1.ah;
        }
        b(x1, gz1, true);
        return gz1;
    }

    private gz a(x x1, ad ad1, boolean flag)
    {
        gz gz2 = new gz();
        gz gz1 = gz2;
        if (u != null)
        {
            g.a(gz2, ad1.getView());
            if (flag)
            {
                gz2.a(v);
                gz1 = gz2;
            } else
            {
                gz1 = a(u, v, gz2);
            }
        }
        if (flag)
        {
            if (ad1.ah != null)
            {
                ad1 = ad1.ah;
            }
            a(x1, gz1, false);
            return gz1;
        }
        if (ad1.ai != null)
        {
            ad1 = ad1.ai;
        }
        b(x1, gz1, false);
        return gz1;
    }

    private static Object a(Object obj, ad ad1, ArrayList arraylist, gz gz1, View view)
    {
label0:
        {
            Object obj1 = obj;
            if (obj != null)
            {
                ad1 = ad1.getView();
                obj1 = obj;
                if (obj != null)
                {
                    g.a(arraylist, ad1);
                    if (gz1 != null)
                    {
                        arraylist.removeAll(gz1.values());
                    }
                    if (!arraylist.isEmpty())
                    {
                        break label0;
                    }
                    obj1 = null;
                }
            }
            return obj1;
        }
        arraylist.add(view);
        g.b((Transition)obj, arraylist);
        return obj;
    }

    private x a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        x x1 = new x(this);
        x1.d = new View(b.o.i());
        int i1 = 0;
        boolean flag1 = false;
        int k1;
        boolean flag3;
        do
        {
            k1 = ((flag4) ? 1 : 0);
            flag3 = flag1;
            if (i1 >= sparsearray.size())
            {
                break;
            }
            if (a(sparsearray.keyAt(i1), x1, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
            i1++;
        } while (true);
        while (k1 < sparsearray1.size()) 
        {
            int j1 = sparsearray1.keyAt(k1);
            boolean flag2 = flag3;
            if (sparsearray.get(j1) == null)
            {
                flag2 = flag3;
                if (a(j1, x1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            k1++;
            flag3 = flag2;
        }
        sparsearray = x1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    private void a(int i1, ad ad1, String s1, int j1)
    {
        ad1.C = b;
        if (s1 != null)
        {
            if (ad1.I != null && !s1.equals(ad1.I))
            {
                throw new IllegalStateException((new StringBuilder("Can't change tag of fragment ")).append(ad1).append(": was ").append(ad1.I).append(" now ").append(s1).toString());
            }
            ad1.I = s1;
        }
        if (i1 != 0)
        {
            if (ad1.G != 0 && ad1.G != i1)
            {
                throw new IllegalStateException((new StringBuilder("Can't change container ID of fragment ")).append(ad1).append(": was ").append(ad1.G).append(" now ").append(i1).toString());
            }
            ad1.G = i1;
            ad1.H = i1;
        }
        s1 = new w();
        s1.c = j1;
        s1.d = ad1;
        a(((w) (s1)));
    }

    static void a(ad ad1, ad ad2, boolean flag, gz gz1)
    {
        if (flag)
        {
            ad1 = ad2.ah;
        } else
        {
            ad1 = ad1.ah;
        }
        if (ad1 != null)
        {
            new ArrayList(gz1.keySet());
            new ArrayList(gz1.values());
        }
    }

    private static void a(SparseArray sparsearray, ad ad1)
    {
        if (ad1 != null)
        {
            int i1 = ad1.H;
            if (i1 != 0 && !ad1.isHidden() && ad1.isAdded() && ad1.getView() != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, ad1);
            }
        }
    }

    private static void a(gz gz1, String s1, String s2)
    {
        if (s1 == null || s2 == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= gz1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.equals(gz1.c(i1))) goto _L4; else goto _L3
_L3:
        gz1.a(i1, s2);
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        gz1.put(s1, s2);
        return;
    }

    static void a(t t1, gz gz1, x x1)
    {
        if (t1.v != null && !gz1.isEmpty())
        {
            t1 = (View)gz1.get(t1.v.get(0));
            if (t1 != null)
            {
                x1.c.a = t1;
            }
        }
    }

    static void a(t t1, x x1, int i1, Object obj)
    {
        t1.a(x1, i1, obj);
    }

    private void a(x x1, int i1, Object obj)
    {
        if (b.g != null)
        {
            int j1 = 0;
            while (j1 < b.g.size()) 
            {
                ad ad1 = (ad)b.g.get(j1);
                if (ad1.S != null && ad1.R != null && ad1.H == i1)
                {
                    if (ad1.J)
                    {
                        if (!x1.b.contains(ad1.S))
                        {
                            g.a(obj, ad1.S, true);
                            x1.b.add(ad1.S);
                        }
                    } else
                    {
                        g.a(obj, ad1.S, false);
                        x1.b.remove(ad1.S);
                    }
                }
                j1++;
            }
        }
    }

    private void a(x x1, gz gz1, boolean flag)
    {
        int i1;
        int j1;
        if (v == null)
        {
            i1 = 0;
        } else
        {
            i1 = v.size();
        }
        j1 = 0;
        while (j1 < i1) 
        {
            String s1 = (String)u.get(j1);
            Object obj = (View)gz1.get((String)v.get(j1));
            if (obj != null)
            {
                obj = ((View) (obj)).getTransitionName();
                if (flag)
                {
                    a(x1.a, s1, ((String) (obj)));
                } else
                {
                    a(x1.a, ((String) (obj)), s1);
                }
            }
            j1++;
        }
    }

    private static void a(x x1, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null)
        {
            for (int i1 = 0; i1 < arraylist.size(); i1++)
            {
                String s1 = (String)arraylist.get(i1);
                String s2 = (String)arraylist1.get(i1);
                a(x1.a, s1, s2);
            }

        }
    }

    private boolean a(int i1, x x1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ViewGroup viewgroup;
        ArrayList arraylist;
        Object obj4;
        viewgroup = (ViewGroup)b.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        obj3 = (ad)sparsearray1.get(i1);
        obj4 = (ad)sparsearray.get(i1);
        if (obj3 == null)
        {
            obj = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((ad) (obj3)).getReenterTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((ad) (obj3)).getEnterTransition()));
            }
            obj = g.a(sparsearray);
        }
        if (obj3 == null || obj4 == null)
        {
            sparsearray = null;
        } else
        {
            if (flag)
            {
                sparsearray = ((SparseArray) (((ad) (obj4)).getSharedElementReturnTransition()));
            } else
            {
                sparsearray = ((SparseArray) (((ad) (obj3)).getSharedElementEnterTransition()));
            }
            if (sparsearray == null)
            {
                sparsearray = null;
            } else
            {
                sparsearray1 = (Transition)sparsearray;
                if (sparsearray1 == null)
                {
                    sparsearray = null;
                } else
                {
                    sparsearray = new TransitionSet();
                    sparsearray.addTransition(sparsearray1);
                }
            }
        }
        if (obj4 == null)
        {
            obj2 = null;
        } else
        {
            if (flag)
            {
                sparsearray1 = ((SparseArray) (((ad) (obj4)).getReturnTransition()));
            } else
            {
                sparsearray1 = ((SparseArray) (((ad) (obj4)).getExitTransition()));
            }
            obj2 = g.a(sparsearray1);
        }
        sparsearray1 = null;
        arraylist = new ArrayList();
        if (sparsearray == null) goto _L2; else goto _L1
_L1:
        obj1 = a(x1, ((ad) (obj4)), flag);
        if (!((gz) (obj1)).isEmpty()) goto _L4; else goto _L3
_L3:
        sparsearray1 = null;
        obj1 = null;
_L6:
        if (obj == null && obj1 == null && obj2 == null)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            sparsearray1 = ((ad) (obj4)).ah;
        } else
        {
            sparsearray1 = ((ad) (obj3)).ah;
        }
        if (sparsearray1 != null)
        {
            new ArrayList(((gz) (obj1)).keySet());
            new ArrayList(((gz) (obj1)).values());
        }
        viewgroup.getViewTreeObserver().addOnPreDrawListener(new u(this, viewgroup, sparsearray, arraylist, x1, flag, ((ad) (obj3)), ((ad) (obj4))));
        sparsearray1 = ((SparseArray) (obj1));
_L2:
        obj1 = sparsearray;
        if (true) goto _L6; else goto _L5
_L5:
        ArrayList arraylist1 = new ArrayList();
        Object obj5 = a(obj2, ((ad) (obj4)), arraylist1, ((gz) (sparsearray1)), x1.d);
        if (v != null && sparsearray1 != null)
        {
            sparsearray = (View)sparsearray1.get(v.get(0));
            if (sparsearray != null)
            {
                if (obj5 != null)
                {
                    g.a(obj5, sparsearray);
                }
                if (obj1 != null)
                {
                    g.a(obj1, sparsearray);
                }
            }
        }
        f f1 = new f(this, ((ad) (obj3)));
        obj4 = new ArrayList();
        gz gz1 = new gz();
        Transition transition;
        if (obj3 != null)
        {
            if (flag)
            {
                flag = ((ad) (obj3)).getAllowReturnTransitionOverlap();
            } else
            {
                flag = ((ad) (obj3)).getAllowEnterTransitionOverlap();
            }
        } else
        {
            flag = true;
        }
        obj2 = (Transition)obj;
        sparsearray = (Transition)obj5;
        transition = (Transition)obj1;
        if (obj2 == null || sparsearray == null)
        {
            flag = true;
        }
        if (flag)
        {
            obj3 = new TransitionSet();
            if (obj2 != null)
            {
                ((TransitionSet) (obj3)).addTransition(((Transition) (obj2)));
            }
            if (sparsearray != null)
            {
                ((TransitionSet) (obj3)).addTransition(sparsearray);
            }
            sparsearray = ((SparseArray) (obj3));
            if (transition != null)
            {
                ((TransitionSet) (obj3)).addTransition(transition);
                sparsearray = ((SparseArray) (obj3));
            }
        } else
        {
            if (sparsearray != null && obj2 != null)
            {
                sparsearray = (new TransitionSet()).addTransition(sparsearray).addTransition(((Transition) (obj2))).setOrdering(1);
            } else
            if (sparsearray == null)
            {
                sparsearray = ((SparseArray) (obj2));
                if (obj2 == null)
                {
                    sparsearray = null;
                }
            }
            if (transition != null)
            {
                obj2 = new TransitionSet();
                if (sparsearray != null)
                {
                    ((TransitionSet) (obj2)).addTransition(sparsearray);
                }
                ((TransitionSet) (obj2)).addTransition(transition);
                sparsearray = ((SparseArray) (obj2));
            }
        }
        if (sparsearray != null)
        {
            g.a(obj, obj1, viewgroup, f1, x1.d, x1.c, x1.a, ((ArrayList) (obj4)), sparsearray1, gz1, arraylist);
            viewgroup.getViewTreeObserver().addOnPreDrawListener(new v(this, viewgroup, x1, i1, sparsearray));
            g.a(sparsearray, x1.d, true);
            a(x1, i1, sparsearray);
            TransitionManager.beginDelayedTransition(viewgroup, (Transition)sparsearray);
            sparsearray1 = x1.d;
            x1 = x1.b;
            obj = (Transition)obj;
            obj2 = (Transition)obj5;
            obj1 = (Transition)obj1;
            obj3 = (Transition)sparsearray;
            if (obj3 != null)
            {
                viewgroup.getViewTreeObserver().addOnPreDrawListener(new bk(viewgroup, ((Transition) (obj)), ((ArrayList) (obj4)), ((Transition) (obj2)), arraylist1, ((Transition) (obj1)), arraylist, gz1, x1, ((Transition) (obj3)), sparsearray1));
            }
        }
        return sparsearray != null;
    }

    private static void b(SparseArray sparsearray, ad ad1)
    {
        if (ad1 != null)
        {
            int i1 = ad1.H;
            if (i1 != 0)
            {
                sparsearray.put(i1, ad1);
            }
        }
    }

    private void b(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        w w1 = c;
_L12:
        if (w1 == null) goto _L1; else goto _L3
_L3:
        w1.c;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 82
    //                   2 94
    //                   3 212
    //                   4 224
    //                   5 236
    //                   6 248
    //                   7 260;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_260;
_L13:
        w1 = w1.a;
          goto _L12
_L5:
        b(sparsearray1, w1.d);
          goto _L13
_L6:
        ad ad1 = w1.d;
        ad ad2;
        if (b.g != null)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    ad2 = ad1;
                    if (i1 >= b.g.size())
                    {
                        break label0;
                    }
                    ad ad3 = (ad)b.g.get(i1);
                    if (ad1 != null)
                    {
                        ad2 = ad1;
                        if (ad3.H != ad1.H)
                        {
                            break label1;
                        }
                    }
                    if (ad3 == ad1)
                    {
                        ad2 = null;
                    } else
                    {
                        a(sparsearray, ad3);
                        ad2 = ad1;
                    }
                }
                i1++;
                ad1 = ad2;
            } while (true);
        } else
        {
            ad2 = ad1;
        }
        b(sparsearray1, ad2);
          goto _L13
_L7:
        a(sparsearray, w1.d);
          goto _L13
_L8:
        a(sparsearray, w1.d);
          goto _L13
_L9:
        b(sparsearray1, w1.d);
          goto _L13
_L10:
        a(sparsearray, w1.d);
          goto _L13
        b(sparsearray1, w1.d);
          goto _L13
    }

    private static void b(x x1, gz gz1, boolean flag)
    {
        int j1 = gz1.size();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = (String)gz1.b(i1);
            String s2 = ((View)gz1.c(i1)).getTransitionName();
            if (flag)
            {
                a(x1.a, s1, s2);
            } else
            {
                a(x1.a, s2, s1);
            }
            i1++;
        }
    }

    public bg a()
    {
        j = 0;
        return this;
    }

    public bg a(int i1, int j1)
    {
        f = i1;
        g = j1;
        h = 0;
        i = 0;
        return this;
    }

    public bg a(int i1, ad ad1)
    {
        a(i1, ad1, ((String) (null)), 1);
        return this;
    }

    public bg a(int i1, ad ad1, String s1)
    {
        a(i1, ad1, s1, 1);
        return this;
    }

    public bg a(ad ad1)
    {
        w w1 = new w();
        w1.c = 3;
        w1.d = ad1;
        a(w1);
        return this;
    }

    public bg a(ad ad1, String s1)
    {
        a(0, ad1, s1, 1);
        return this;
    }

    public x a(boolean flag, x x1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        x x2;
        if (aq.a)
        {
            (new StringBuilder("popFromBackStack: ")).append(this);
            a("  ", new PrintWriter(new hc("FragmentManager")));
        }
        x2 = x1;
        if (!a) goto _L2; else goto _L1
_L1:
        if (x1 != null) goto _L4; else goto _L3
_L3:
        if (sparsearray.size() != 0) goto _L6; else goto _L5
_L5:
        x2 = x1;
        if (sparsearray1.size() == 0) goto _L2; else goto _L6
_L6:
        x2 = a(sparsearray, sparsearray1, true);
_L2:
        int i1;
        int j1;
        int k1;
        int l1;
        a(-1);
        if (x2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (x2 != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        x1 = d;
_L17:
        if (x1 == null) goto _L8; else goto _L7
_L7:
        if (x2 != null)
        {
            k1 = 0;
        } else
        {
            k1 = ((w) (x1)).g;
        }
        if (x2 != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((w) (x1)).h;
        }
        ((w) (x1)).c;
        JVM INSTR tableswitch 1 7: default 176
    //                   1 265
    //                   2 299
    //                   3 388
    //                   4 411
    //                   5 440
    //                   6 469
    //                   7 498;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L9:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(((w) (x1)).c).toString());
_L4:
        x2 = x1;
        if (!flag)
        {
            a(x1, v, u);
            x2 = x1;
        }
          goto _L2
_L10:
        sparsearray = ((w) (x1)).d;
        sparsearray.Q = l1;
        b.a(sparsearray, aq.d(j1), i1);
_L18:
        x1 = ((w) (x1)).b;
          goto _L17
_L11:
        sparsearray = ((w) (x1)).d;
        if (sparsearray != null)
        {
            sparsearray.Q = l1;
            b.a(sparsearray, aq.d(j1), i1);
        }
        if (((w) (x1)).i != null)
        {
            l1 = 0;
            while (l1 < ((w) (x1)).i.size()) 
            {
                sparsearray = (ad)((w) (x1)).i.get(l1);
                sparsearray.Q = k1;
                b.a(sparsearray, false);
                l1++;
            }
        }
          goto _L18
_L12:
        sparsearray = ((w) (x1)).d;
        sparsearray.Q = k1;
        b.a(sparsearray, false);
          goto _L18
_L13:
        sparsearray = ((w) (x1)).d;
        sparsearray.Q = k1;
        b.c(sparsearray, aq.d(j1), i1);
          goto _L18
_L14:
        sparsearray = ((w) (x1)).d;
        sparsearray.Q = l1;
        b.b(sparsearray, aq.d(j1), i1);
          goto _L18
_L15:
        sparsearray = ((w) (x1)).d;
        sparsearray.Q = k1;
        b.e(sparsearray, aq.d(j1), i1);
          goto _L18
_L16:
        sparsearray = ((w) (x1)).d;
        sparsearray.Q = k1;
        b.d(sparsearray, aq.d(j1), i1);
          goto _L18
_L8:
        if (flag)
        {
            b.a(b.n, aq.d(j1), i1, true);
            x2 = null;
        }
        if (p >= 0)
        {
            b.c(p);
            p = -1;
        }
        return x2;
    }

    void a(int i1)
    {
        if (l)
        {
            if (aq.a)
            {
                (new StringBuilder("Bump nesting in ")).append(this).append(" by ").append(i1);
            }
            w w1 = c;
            while (w1 != null) 
            {
                if (w1.d != null)
                {
                    ad ad1 = w1.d;
                    ad1.B = ad1.B + i1;
                    if (aq.a)
                    {
                        (new StringBuilder("Bump nesting of ")).append(w1.d).append(" to ").append(w1.d.B);
                    }
                }
                if (w1.i != null)
                {
                    for (int j1 = w1.i.size() - 1; j1 >= 0; j1--)
                    {
                        ad ad2 = (ad)w1.i.get(j1);
                        ad2.B = ad2.B + i1;
                        if (aq.a)
                        {
                            (new StringBuilder("Bump nesting of ")).append(ad2).append(" to ").append(ad2.B);
                        }
                    }

                }
                w1 = w1.a;
            }
        }
    }

    public void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (b.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        w w1 = c;
_L12:
        if (w1 == null) goto _L1; else goto _L3
_L3:
        w1.c;
        JVM INSTR tableswitch 1 7: default 68
    //                   1 76
    //                   2 87
    //                   3 146
    //                   4 157
    //                   5 168
    //                   6 179
    //                   7 190;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_190;
_L13:
        w1 = w1.a;
          goto _L12
_L5:
        a(sparsearray, w1.d);
          goto _L13
_L6:
        if (w1.i != null)
        {
            for (int i1 = w1.i.size() - 1; i1 >= 0; i1--)
            {
                b(sparsearray1, (ad)w1.i.get(i1));
            }

        }
        a(sparsearray, w1.d);
          goto _L13
_L7:
        b(sparsearray1, w1.d);
          goto _L13
_L8:
        b(sparsearray1, w1.d);
          goto _L13
_L9:
        a(sparsearray, w1.d);
          goto _L13
_L10:
        b(sparsearray1, w1.d);
          goto _L13
        a(sparsearray, w1.d);
          goto _L13
    }

    public void a(String s1, PrintWriter printwriter)
    {
        a(s1, printwriter, true);
    }

    public void a(String s1, PrintWriter printwriter, boolean flag)
    {
        w w1;
        String s3;
        int i1;
        if (flag)
        {
            printwriter.print(s1);
            printwriter.print("mName=");
            printwriter.print(n);
            printwriter.print(" mIndex=");
            printwriter.print(p);
            printwriter.print(" mCommitted=");
            printwriter.println(o);
            if (j != 0)
            {
                printwriter.print(s1);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(j));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(k));
            }
            if (f != 0 || g != 0)
            {
                printwriter.print(s1);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(f));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(g));
            }
            if (h != 0 || i != 0)
            {
                printwriter.print(s1);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(h));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(i));
            }
            if (q != 0 || r != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(q));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(r);
            }
            if (s != 0 || t != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(s));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(t);
            }
        }
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        w1 = c;
        i1 = 0;
_L13:
        if (w1 == null) goto _L2; else goto _L1
_L1:
        w1.c;
        JVM INSTR tableswitch 0 7: default 424
    //                   0 699
    //                   1 707
    //                   2 715
    //                   3 723
    //                   4 731
    //                   5 739
    //                   6 747
    //                   7 755;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_755;
_L3:
        String s2 = (new StringBuilder("cmd=")).append(w1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(i1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(w1.d);
        if (flag)
        {
            if (w1.e != 0 || w1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(w1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(w1.f));
            }
            if (w1.g != 0 || w1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(w1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(w1.h));
            }
        }
        if (w1.i != null && w1.i.size() > 0)
        {
            int j1 = 0;
            while (j1 < w1.i.size()) 
            {
                printwriter.print(s3);
                if (w1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (j1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s3);
                    printwriter.print("  #");
                    printwriter.print(j1);
                    printwriter.print(": ");
                }
                printwriter.println(w1.i.get(j1));
                j1++;
            }
        }
        break MISSING_BLOCK_LABEL_804;
_L4:
        s2 = "NULL";
          goto _L12
_L5:
        s2 = "ADD";
          goto _L12
_L6:
        s2 = "REPLACE";
          goto _L12
_L7:
        s2 = "REMOVE";
          goto _L12
_L8:
        s2 = "HIDE";
          goto _L12
_L9:
        s2 = "SHOW";
          goto _L12
_L10:
        s2 = "DETACH";
          goto _L12
        s2 = "ATTACH";
          goto _L12
        w1 = w1.a;
        i1++;
          goto _L13
_L2:
    }

    void a(w w1)
    {
        if (c == null)
        {
            d = w1;
            c = w1;
        } else
        {
            w1.b = d;
            d.a = w1;
            d = w1;
        }
        w1.e = f;
        w1.f = g;
        w1.g = h;
        w1.h = i;
        e = e + 1;
    }

    public int b()
    {
        return a(false);
    }

    public bg b(int i1, ad ad1)
    {
        return b(i1, ad1, ((String) (null)));
    }

    public bg b(int i1, ad ad1, String s1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, ad1, s1, 2);
            return this;
        }
    }

    public bg b(ad ad1)
    {
        w w1 = new w();
        w1.c = 4;
        w1.d = ad1;
        a(w1);
        return this;
    }

    public int c()
    {
        return a(true);
    }

    public bg c(ad ad1)
    {
        w w1 = new w();
        w1.c = 5;
        w1.d = ad1;
        a(w1);
        return this;
    }

    public bg d(ad ad1)
    {
        w w1 = new w();
        w1.c = 6;
        w1.d = ad1;
        a(w1);
        return this;
    }

    public bg e(ad ad1)
    {
        w w1 = new w();
        w1.c = 7;
        w1.d = ad1;
        a(w1);
        return this;
    }

    public void run()
    {
        if (aq.a)
        {
            (new StringBuilder("Run: ")).append(this);
        }
        if (l && p < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        ad ad1;
        Object obj;
        w w1;
        ad ad2;
        ad ad3;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (a)
        {
            SparseArray sparsearray = new SparseArray();
            obj = new SparseArray();
            b(sparsearray, ((SparseArray) (obj)));
            obj = a(sparsearray, ((SparseArray) (obj)), false);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            i1 = 0;
        } else
        {
            i1 = k;
        }
        if (obj != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        w1 = c;
        if (w1 == null)
        {
            break MISSING_BLOCK_LABEL_661;
        }
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = w1.e;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = w1.f;
        }
        w1.c;
        JVM INSTR tableswitch 1 7: default 172
    //                   1 236
    //                   2 264
    //                   3 531
    //                   4 557
    //                   5 583
    //                   6 609
    //                   7 635;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_635;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown cmd: ")).append(w1.c).toString());
_L2:
        ad1 = w1.d;
        ad1.Q = k1;
        b.a(ad1, false);
_L12:
        w1 = w1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_106;
_L9:
        ad1 = w1.d;
        j2 = ad1.H;
        if (b.g != null)
        {
            i2 = 0;
            do
            {
                ad2 = ad1;
                if (i2 >= b.g.size())
                {
                    break;
                }
                ad3 = (ad)b.g.get(i2);
                if (aq.a)
                {
                    (new StringBuilder("OP_REPLACE: adding=")).append(ad1).append(" old=").append(ad3);
                }
                ad2 = ad1;
                if (ad3.H == j2)
                {
                    if (ad3 == ad1)
                    {
                        w1.d = null;
                        ad2 = null;
                    } else
                    {
                        if (w1.i == null)
                        {
                            w1.i = new ArrayList();
                        }
                        w1.i.add(ad3);
                        ad3.Q = l1;
                        if (l)
                        {
                            ad3.B = ad3.B + 1;
                            if (aq.a)
                            {
                                (new StringBuilder("Bump nesting of ")).append(ad3).append(" to ").append(ad3.B);
                            }
                        }
                        b.a(ad3, j1, i1);
                        ad2 = ad1;
                    }
                }
                i2++;
                ad1 = ad2;
            } while (true);
        } else
        {
            ad2 = ad1;
        }
        if (ad2 != null)
        {
            ad2.Q = k1;
            b.a(ad2, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        ad1 = w1.d;
        ad1.Q = l1;
        b.a(ad1, j1, i1);
        continue; /* Loop/switch isn't completed */
_L5:
        ad1 = w1.d;
        ad1.Q = l1;
        b.b(ad1, j1, i1);
        continue; /* Loop/switch isn't completed */
_L6:
        ad1 = w1.d;
        ad1.Q = k1;
        b.c(ad1, j1, i1);
        continue; /* Loop/switch isn't completed */
_L7:
        ad1 = w1.d;
        ad1.Q = l1;
        b.d(ad1, j1, i1);
        continue; /* Loop/switch isn't completed */
        ad1 = w1.d;
        ad1.Q = k1;
        b.e(ad1, j1, i1);
        if (true) goto _L12; else goto _L11
_L11:
        b.a(b.n, j1, i1, true);
        if (l)
        {
            b.b(this);
        }
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (p >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(p);
        }
        if (n != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(n);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
