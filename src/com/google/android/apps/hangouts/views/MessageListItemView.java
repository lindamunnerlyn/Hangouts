// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ai;
import aia;
import aib;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ani;
import bhp;
import bq;
import bxo;
import byc;
import byf;
import can;
import cao;
import ceu;
import cey;
import com.google.android.apps.hangouts.content.EsProvider;
import dqb;
import dqc;
import drk;
import drl;
import ebr;
import ebw;
import ebz;
import edy;
import eeg;
import eew;
import efa;
import efe;
import eff;
import efg;
import efh;
import efi;
import efj;
import efk;
import efm;
import efn;
import efo;
import eft;
import egm;
import egn;
import egp;
import egs;
import em;
import g;
import gbh;
import h;
import hgx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jgu;
import l;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            MessageBubbleView, MessageStatusView, AudioAttachmentView, ScalingTextView, 
//            AvatarView

public class MessageListItemView extends ViewGroup
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, cao
{

    private static boolean a;
    private static final Animation am;
    private static final Animation an;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private boolean A;
    private boolean B;
    private final MessageBubbleView C;
    private final FrameLayout D;
    private AccessibilityManager E;
    private SpannableString F;
    private final Runnable G;
    private final Runnable H;
    private int I;
    private boolean J;
    private dqb K;
    private String L;
    private Spanned M;
    private CharSequence N;
    private String O;
    private String P;
    private String Q;
    private int R;
    private String S;
    private boolean T;
    private float U;
    private int V;
    private int W;
    private int aa;
    private long ab;
    private long ac;
    private String ad;
    private String ae;
    private String af;
    private int ag;
    private String ah;
    private String ai;
    private String aj;
    private ani ak;
    private Handler al;
    private ArrayList ao;
    private boolean ap;
    private TextView g;
    private MessageStatusView h;
    private AvatarView i;
    private cey j;
    private int k;
    private String l;
    private long m;
    private efa n;
    private bhp o;
    private String p;
    private CharSequence q;
    private String r;
    private ViewGroup s;
    private LinearLayout t;
    private List u;
    private List v;
    private boolean w;
    private Set x;
    private long y;
    private boolean z;

    public MessageListItemView(Context context)
    {
        this(context, null);
    }

    public MessageListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        x = new HashSet();
        A = false;
        B = true;
        G = new efe(this);
        H = new eff(this);
        I = 0;
        J = false;
        T = false;
        U = 1.0F;
        ap = false;
        attributeset = LayoutInflater.from(context);
        C = (MessageBubbleView)attributeset.inflate(g.gJ, null, false);
        D = (FrameLayout)attributeset.inflate(g.gI, null, false);
        h = (MessageStatusView)attributeset.inflate(g.gM, null, false);
        t = new LinearLayout(context);
        attributeset = new android.view.ViewGroup.LayoutParams(-2, -2);
        t.setLayoutParams(attributeset);
        t.setOrientation(1);
        t.setVisibility(8);
        attributeset = getResources().getDisplayMetrics();
        int i1 = (int)TypedValue.applyDimension(1, 12F, attributeset);
        int j1 = (int)TypedValue.applyDimension(1, 8F, attributeset);
        t.setPadding(i1, 0, i1, j1);
        addView(D);
        addView(C);
        addView(h);
        addView(t);
        E = (AccessibilityManager)context.getSystemService("accessibility");
        if (!a)
        {
            context = getContext().getApplicationContext().getResources();
            b = context.getString(l.tn);
            c = context.getString(l.tq);
            d = context.getString(l.tp);
            e = context.getString(l.to);
            f = context.getString(l.ta);
            a = true;
        }
    }

    private int[] A()
    {
        android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        if (z)
        {
            return (new int[] {
                (int)TypedValue.applyDimension(1, 12F, displaymetrics), (int)TypedValue.applyDimension(1, 76F, displaymetrics)
            });
        } else
        {
            return (new int[] {
                (int)TypedValue.applyDimension(1, 4F, displaymetrics), (int)TypedValue.applyDimension(1, 48F, displaymetrics)
            });
        }
    }

    private boolean B()
    {
        return ebr.d() && android.os.Build.VERSION.SDK_INT >= 19;
    }

    private boolean C()
    {
        return E != null && E.isEnabled() && E.isTouchExplorationEnabled();
    }

    private void D()
    {
        if (!g.a(g.nS, "babel_force_gb_copy_paste_textview", true))
        {
            g.setTextIsSelectable(true);
            C.setClickable(false);
            C.setLongClickable(false);
            return;
        } else
        {
            g.setLongClickable(true);
            C.setClickable(false);
            C.setLongClickable(true);
            return;
        }
    }

    private void E()
    {
        if (!TextUtils.isEmpty(e()))
        {
            C.setVisibility(0);
        }
        Object obj = e();
        SpannableString spannablestring = edy.a(getContext()).a(((CharSequence) (obj)), g);
        if (spannablestring != null)
        {
            obj = spannablestring;
        }
        g.setText(((CharSequence) (obj)));
        g.setTextColor(F());
        for (obj = hgx.c(getContext(), eft).iterator(); ((Iterator) (obj)).hasNext(); o.O())
        {
            ((Iterator) (obj)).next();
        }

        if (!g())
        {
            Linkify.addLinks(g, 15);
        }
    }

    private int F()
    {
        if (A)
        {
            if (z)
            {
                return getResources().getColor(g.dJ);
            } else
            {
                return getResources().getColor(g.dH);
            }
        }
        if (z)
        {
            return getResources().getColor(g.dI);
        } else
        {
            return getResources().getColor(g.dG);
        }
    }

    private boolean G()
    {
        return z || R == 1;
    }

    private void H()
    {
        c(getResources().getString(l.bY));
    }

    private void I()
    {
        c(getResources().getString(l.bX));
    }

    private void J()
    {
        w = false;
        a(u, s);
        a(v, t);
        if (u != null && u.isEmpty())
        {
            u = null;
        }
        if (v != null && v.isEmpty())
        {
            v = null;
        }
    }

    private void K()
    {
        Resources resources = getResources();
        if (A)
        {
            TextView textview = g;
            int i1;
            if (z)
            {
                i1 = resources.getColor(g.dF);
            } else
            {
                i1 = resources.getColor(g.dD);
            }
            textview.setLinkTextColor(i1);
        } else
        {
            TextView textview1 = g;
            int j1;
            if (z)
            {
                j1 = resources.getColor(g.dE);
            } else
            {
                j1 = resources.getColor(g.dC);
            }
            textview1.setLinkTextColor(j1);
        }
        requestLayout();
        a(z, A, B);
    }

    private drl L()
    {
        drl drl1 = new drl();
        drl1.a = p;
        drl1.b = ai;
        return drl1;
    }

    public static String a(MessageListItemView messagelistitemview, String s1)
    {
        messagelistitemview.af = s1;
        return s1;
    }

    private String a(String s1, String s2)
    {
        boolean flag = TextUtils.isEmpty(s1);
        boolean flag1 = TextUtils.isEmpty(s2);
        if (flag && flag1)
        {
            return "";
        }
        if (flag)
        {
            return getResources().getString(l.Q, new Object[] {
                s2
            });
        }
        if (flag1)
        {
            return getResources().getString(l.O, new Object[] {
                s1
            });
        } else
        {
            return getResources().getString(l.P, new Object[] {
                s1, s2
            });
        }
    }

    private void a(int i1, String s1, String s2, String s3, long l1, boolean flag)
    {
        if (g.b(s1) || g.d(s1) || g.c(s1) || "hangouts/gv_voicemail".equals(s1))
        {
            if (flag)
            {
                s1 = (can)u.get(i1);
            } else
            {
                s1 = (can)v.get(i1);
            }
            s1.a(s2);
            if (s1 instanceof efo)
            {
                ((efo)s1).a(s3, l1);
            }
        }
    }

    private void a(int i1, boolean flag)
    {
        Spanned spanned = M;
        URLSpan aurlspan[] = (URLSpan[])spanned.getSpans(0, spanned.length(), android/text/style/URLSpan);
        int k1 = aurlspan.length;
label0:
        for (int j1 = 0; j1 < k1; j1++)
        {
            String s1 = aurlspan[j1].getURL();
            Object obj = hgx.c(getContext(), bxo).iterator();
            bxo bxo1;
            can can1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue label0;
                }
                bxo1 = (bxo)((Iterator) (obj)).next();
                can1 = bxo1.a(getContext(), i1, flag, s1);
            } while (can1 == null);
            x.add(can1);
            a(can1, false);
            obj = String.valueOf(bxo1.getClass().getName());
            ebw.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 22 + String.valueOf(s1).length())).append("LinkHandler ").append(((String) (obj))).append(" handled: ").append(s1).toString());
        }

    }

    private static void a(TextView textview)
    {
        if (textview != null)
        {
            textview.setText(null);
        }
    }

    private void a(can can1, boolean flag)
    {
        if (flag)
        {
            C.setVisibility(0);
            if (u == null)
            {
                u = new ArrayList();
                s.setVisibility(0);
            }
            s.addView((View)can1);
            u.add(can1);
        } else
        {
            if (v == null)
            {
                v = new ArrayList();
                t.setVisibility(0);
            }
            t.addView((View)can1);
            v.add(can1);
        }
        q = ((View)can1).getContentDescription();
    }

    public static void a(MessageListItemView messagelistitemview)
    {
        messagelistitemview.I();
    }

    private void a(CharSequence charsequence, String s1, CharSequence charsequence1)
    {
        String s2;
        s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            can can1;
            if (q == null)
            {
                s1 = "";
            } else
            {
                s1 = q.toString();
            }
            s2 = s1;
        }
        N = charsequence;
        O = s2;
        s1 = M;
        if (!"hangouts/gv_voicemail".equals(ai)) goto _L2; else goto _L1
_L1:
        charsequence = u.iterator();
_L6:
        if (!charsequence.hasNext()) goto _L4; else goto _L3
_L3:
        can1 = (can)charsequence.next();
        if (!(can1 instanceof AudioAttachmentView)) goto _L6; else goto _L5
_L5:
        charsequence = ((AudioAttachmentView)can1).f();
_L8:
        setContentDescription(getContext().getString(l.tT, new Object[] {
            s2, charsequence1, charsequence, s1
        }));
        F = null;
        return;
_L2:
        if (K == dqb.d)
        {
            charsequence = getContext().getString(l.ce, new Object[] {
                s2, s1, charsequence, charsequence1
            });
        } else
        {
            charsequence = getContext().getString(l.ga, new Object[] {
                s2, s1, charsequence, charsequence1
            });
        }
        F = new SpannableString(charsequence);
        Linkify.addLinks(F, 15);
        setContentDescription(F);
        return;
_L4:
        charsequence = "";
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(String s1, String s2, int i1, int j1, int k1, boolean flag, ani ani1, 
            bhp bhp1, boolean flag1, String s3, String s4, String s5, long l1, 
            String s6, double d1, double d2, String s7, String s8, 
            String s9, int i2, String s10)
    {
        Context context;
label0:
        {
label1:
            {
                context = getContext();
                if (!g.b(s2))
                {
                    break label0;
                }
                s4 = null;
                bhp1 = s4;
                if (s3 == null)
                {
                    break label1;
                }
                bhp1 = s4;
                if (s10 == null)
                {
                    break label1;
                }
                if (!s10.startsWith("sticker://"))
                {
                    bhp1 = s4;
                    if (!s10.startsWith(EsProvider.c(getContext())))
                    {
                        break label1;
                    }
                }
                bhp1 = (egm)hgx.b(getContext(), egm);
            }
            if (bhp1 != null)
            {
                s1 = bhp1.a(context, ani1, flag, s10, s1, i1, j1, s9, s3, this, n);
                w = true;
            } else
            {
                bhp1 = new eew(context);
                bhp1.a(ani1, flag, s1, i1, j1, k1, n, this, s2, s9);
                s1 = bhp1;
            }
            a(((can) (s1)), false);
            return;
        }
        if ("hangouts/location".equals(s2))
        {
            s1 = bhp1.getActivity();
            try
            {
                s2 = s1.getPackageManager().getActivityInfo(s1.getComponentName(), 128);
                i1 = ((ActivityInfo) (s2)).flags;
                ebw.c("Babel", (new StringBuilder(48)).append("Manifest activity information flags: ").append(i1).toString());
                i1 = ((ActivityInfo) (s2)).flags;
                ebw.c("Babel", (new StringBuilder(43)).append("Manifest hardware acceleration: ").append(i1 & 0x200).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s2)
            {
                ebw.b("Babel", "NameNotFoundException getting package info", s2);
            }
            i1 = s1.getWindow().getAttributes().flags;
            ebw.c("Babel", (new StringBuilder(32)).append("Window layout flags: ").append(i1).toString());
            ebw.c("Babel", (new StringBuilder(48)).append("Window layout hardware acceleration: ").append(i1 & 0x1000000).toString());
            s1 = ((byf)hgx.a(context, byf)).c(context);
            s1.a(bhp1, s6, s7, d1, d2);
            a(((can) (s1)), false);
            return;
        }
        if (g.d(s2))
        {
            if (flag1)
            {
                s3 = new egs(context);
                s3.a(ani1, flag, s1, s2, bhp1, i1, j1, k1);
                a(((can) (s3)), false);
                return;
            } else
            {
                s2 = new egp(context);
                s2.a(ani1, flag, s1, bhp1, s3, s4, s5, i1, j1, k1);
                a(((can) (s2)), false);
                return;
            }
        }
        if (g.c(s2))
        {
            bhp1 = (AudioAttachmentView)LayoutInflater.from(context).inflate(g.ff, s, false);
            if (!TextUtils.isEmpty(s3))
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                s5 = s1;
            }
            if (i1 == 0)
            {
                l1 = 0L;
            }
            i1 = F();
            bhp1.a(ani1, s5, l1, s3, l, s2, getContext().getResources().getString(l.z), 0L, i1);
            a(((can) (bhp1)), true);
            return;
        }
        if ("hangouts/gv_voicemail".equals(s2))
        {
            s1 = (AudioAttachmentView)LayoutInflater.from(context).inflate(g.ff, s, false);
            i1 = F();
            s1.a(ani1, s5, l1, s3, l, s2, getContext().getResources().getString(l.tU), i2, i1);
            a(((can) (s1)), true);
            return;
        }
        if ("hangouts/*".equals(s2))
        {
            s2 = new eeg(context);
            s2.a(ani1, flag, s1, i1, j1, k1, s8, bhp1, s6);
            a(((can) (s2)), true);
            return;
        }
        if (g.e(s2))
        {
            s2 = new egn(context);
            s2.a(ani1, s1, bhp1);
            a(((can) (s2)), false);
            return;
        } else
        {
            ebw.f("Babel", (new StringBuilder(String.valueOf(s2).length() + 87 + String.valueOf(s1).length())).append("We do not recognize the contentType ").append(s2).append(" for image url ").append(s1).append(" and are not handling the attachment").toString());
            return;
        }
    }

    private void a(String s1, String s2, String s3, String s4)
    {
        boolean flag = true;
        boolean flag1 = false;
        int i1;
        if (TextUtils.isEmpty(s1))
        {
            h.b.setVisibility(8);
        } else
        {
            h.b.setText(ebr.d(s1));
            h.b.setVisibility(0);
        }
        s2 = a(s2, s4);
        if (!TextUtils.isEmpty(s1))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (TextUtils.isEmpty(s2))
        {
            flag = false;
        }
        s1 = h.c;
        if (flag && i1 != 0)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        s1.setVisibility(i1);
        h.d.setText(s2);
        s1 = a(s3, s4);
        h.d.setContentDescription(s1);
    }

    private void a(List list, ViewGroup viewgroup)
    {
        if (list != null)
        {
            for (int i1 = 0; i1 < list.size();)
            {
                can can1 = (can)list.get(i1);
                if (x.contains(can1))
                {
                    i1++;
                } else
                {
                    list.remove(i1);
                    can1.b();
                    viewgroup.removeView((View)can1);
                }
            }

            if (list.isEmpty())
            {
                viewgroup.setVisibility(8);
            }
        }
    }

    private void a(boolean flag, boolean flag1, boolean flag2)
    {
        int i1;
        if (flag1 && flag)
        {
            i1 = g.dr;
        } else
        if (flag1 && !flag)
        {
            i1 = g.dp;
        } else
        if (!flag1 && flag)
        {
            i1 = g.dq;
        } else
        {
            i1 = g._flddo;
        }
        i1 = getResources().getColor(i1);
        if (flag)
        {
            if (flag2)
            {
                C.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.bO);
            } else
            {
                C.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.bP);
            }
        } else
        if (flag2)
        {
            C.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.bM);
        } else
        {
            C.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.bN);
        }
        C.getBackground().setColorFilter(i1, android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public static void b(MessageListItemView messagelistitemview)
    {
        messagelistitemview.H();
    }

    private void b(String s1)
    {
        String s2;
        boolean flag;
label0:
        {
            boolean flag1 = false;
            L = s1;
            if (TextUtils.isEmpty(s1))
            {
                M = new SpannedString("");
                return;
            }
            s2 = s1;
            if (s1.charAt(s1.length() - 1) == '\240')
            {
                int i1;
                for (i1 = s1.length() - 2; i1 >= 0 && s1.charAt(i1) == '\240'; i1--) { }
                s2 = s1.substring(0, i1 + 1);
            }
            if (W != 0)
            {
                flag = flag1;
                if (W != 1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            if (!TextUtils.isEmpty(ad))
            {
                M = new SpannedString(drk.a(ad, s2));
                return;
            } else
            {
                M = new SpannedString(s2);
                return;
            }
        } else
        {
            M = Html.fromHtml(s2);
            return;
        }
    }

    public static bhp c(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.o;
    }

    private void c(String s1)
    {
        h.g.setText(s1);
        if (!J)
        {
            J = true;
            h.a.setVisibility(8);
            h.h.setVisibility(8);
            h.f.setVisibility(0);
            h.g.a(1.0F);
            h.g.setAlpha(1.0F);
        }
        a(N, O, s1);
    }

    public static String d(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.P;
    }

    public static AvatarView e(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.i;
    }

    public static ani f(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.ak;
    }

    public static boolean g(MessageListItemView messagelistitemview)
    {
        messagelistitemview.ap = true;
        return true;
    }

    public static MessageStatusView h(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.h;
    }

    public static boolean i(MessageListItemView messagelistitemview)
    {
        messagelistitemview.T = false;
        return false;
    }

    public static String j(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.aj;
    }

    public static long k(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.y;
    }

    public static String l(MessageListItemView messagelistitemview)
    {
        return messagelistitemview.af;
    }

    public long a()
    {
        return y;
    }

    public void a(ai ai1)
    {
        W;
        JVM INSTR tableswitch -1 1: default 32
    //                   -1 734
    //                   0 33
    //                   1 306;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        ai1 = getContext();
        Resources resources = getContext().getResources();
        StringBuilder stringbuilder1 = new StringBuilder();
        stringbuilder1.append(resources.getString(l.gl, new Object[] {
            resources.getString(l.ss)
        }));
        String s1;
        if (z)
        {
            if (af != null)
            {
                stringbuilder1.append('\n');
                stringbuilder1.append(resources.getString(l.su, new Object[] {
                    af
                }));
            }
        } else
        if (!TextUtils.isEmpty(ae))
        {
            stringbuilder1.append('\n');
            stringbuilder1.append(resources.getString(l.ch, new Object[] {
                ebz.p(ae)
            }));
        }
        if (!z && ac != 0L)
        {
            stringbuilder1.append('\n');
            stringbuilder1.append(resources.getString(l.jX, new Object[] {
                g.a(ac).toString()
            }));
        }
        stringbuilder1.append('\n');
        s1 = g.a(y).toString();
        if (z)
        {
            stringbuilder1.append(resources.getString(l.jX, new Object[] {
                s1
            }));
        } else
        {
            stringbuilder1.append(resources.getString(l.jC, new Object[] {
                s1
            }));
        }
        g.c(ai1, stringbuilder1.toString());
        return;
_L4:
        Resources resources2;
        Context context = getContext();
        resources2 = getContext().getResources();
        StringBuilder stringbuilder2 = new StringBuilder();
        stringbuilder2.append(resources2.getString(l.gl, new Object[] {
            resources2.getString(l.gM)
        }));
        if (!TextUtils.isEmpty(ae))
        {
            stringbuilder2.append('\n');
            int i1;
            if (TextUtils.isEmpty(ae))
            {
                ai1 = resources2.getString(l.eY);
            } else
            {
                ai1 = ebz.p(ae);
            }
            stringbuilder2.append(resources2.getString(l.ch, new Object[] {
                ai1
            }));
        }
        if (af != null)
        {
            stringbuilder2.append('\n');
            stringbuilder2.append(resources2.getString(l.su, new Object[] {
                af
            }));
        }
        stringbuilder2.append('\n');
        ai1 = g.a(y).toString();
        if (!z)
        {
            stringbuilder2.append(resources2.getString(l.jC, new Object[] {
                ai1
            }));
        } else
        {
            stringbuilder2.append(resources2.getString(l.jX, new Object[] {
                ai1
            }));
        }
        if (!TextUtils.isEmpty(drk.b(getContext(), ad)))
        {
            stringbuilder2.append('\n');
            stringbuilder2.append(resources2.getString(l.rf, new Object[] {
                ad
            }));
        }
        stringbuilder2.append('\n');
        i1 = l.ip;
        aa;
        JVM INSTR tableswitch 128 130: default 592
    //                   128 723
    //                   129 592
    //                   130 712;
           goto _L5 _L6 _L5 _L7
_L5:
        ai1 = resources2.getString(l.ir);
_L8:
        stringbuilder2.append(resources2.getString(i1, new Object[] {
            ai1
        }));
        if (ab > 0L)
        {
            stringbuilder2.append('\n');
            stringbuilder2.append(resources2.getString(l.gj, new Object[] {
                Long.valueOf(drk.b(ab))
            }));
        }
        g.c(context, stringbuilder2.toString());
        return;
_L7:
        ai1 = resources2.getString(l.io);
          goto _L8
_L6:
        ai1 = resources2.getString(l.iq);
          goto _L8
_L2:
        if (V == 2)
        {
            if (z)
            {
                StringBuilder stringbuilder = new StringBuilder();
                Resources resources3 = getContext().getResources();
                int l1 = l.gl;
                Resources resources6 = getContext().getResources();
                int j1;
                if (ak.ab())
                {
                    j1 = l.sH;
                } else
                {
                    j1 = l.cw;
                }
                stringbuilder.append(resources3.getString(l1, new Object[] {
                    resources6.getString(j1)
                }));
                if (af != null)
                {
                    g.a(getContext(), stringbuilder, y, null, af);
                    return;
                }
                boolean flag1;
                if (!TextUtils.isEmpty(aj))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                gbh.a("Outbound GV SMS messages must have a Conversation ID", flag1);
                ai1.f().b(1, null, new efn(this, getContext(), stringbuilder)).u();
                return;
            }
            ai1 = new StringBuilder();
            Resources resources1 = getContext().getResources();
            int i2 = l.gl;
            Resources resources4 = getContext().getResources();
            int k1;
            if (ak.ab())
            {
                k1 = l.sH;
            } else
            {
                k1 = l.cw;
            }
            ai1.append(resources1.getString(i2, new Object[] {
                resources4.getString(k1)
            }));
            ae = o.a(j).f();
            g.a(getContext(), ai1, y, ae, null);
            return;
        }
        Context context1 = getContext();
        Resources resources5 = getContext().getResources();
        StringBuilder stringbuilder3 = new StringBuilder();
        stringbuilder3.append(resources5.getString(l.gl, new Object[] {
            resources5.getString(l.eU)
        }));
        boolean flag;
        if (o.R() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (z && flag)
        {
            ai1 = o.M();
        } else
        {
            ai1 = o.a(j);
        }
        if (ai1 != null && !TextUtils.isEmpty(((ceu) (ai1)).e))
        {
            stringbuilder3.append('\n');
            if (z && flag)
            {
                stringbuilder3.append(resources5.getString(l.su, new Object[] {
                    ((ceu) (ai1)).e
                }));
            } else
            {
                stringbuilder3.append(resources5.getString(l.ch, new Object[] {
                    ((ceu) (ai1)).e
                }));
            }
        }
        stringbuilder3.append('\n');
        stringbuilder3.append(resources5.getString(l.jX, new Object[] {
            g.a(y).toString()
        }));
        g.c(context1, stringbuilder3.toString());
        return;
    }

    public void a(Cursor cursor, int i1, ani ani1, bhp bhp1, boolean flag)
    {
        ak = ani1;
        k = cursor.getPosition();
        ao = null;
        String s1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (cursor.getLong(19) != 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (cursor.getInt(8) == dqc.b.ordinal())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s1 = cursor.getString(1);
        if (!TextUtils.equals(s1, l))
        {
            j();
            l = s1;
        }
        al = bhp1.T();
        m = cursor.getLong(0);
        j = new cey(cursor.getString(4), cursor.getString(3));
        ag = -1;
        ah = cursor.getString(24);
        W = cursor.getInt(33);
        if (W == 0 || W == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (flag4)
        {
            aa = cursor.getInt(22);
            ab = cursor.getLong(21);
            ac = cursor.getLong(23) / 1000L;
            ae = cursor.getString(26);
            Object obj = cursor.getString(27);
            Object obj1;
            Object obj2;
            Object obj3;
            int j1;
            int k1;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = null;
            } else
            {
                obj = ((String) (obj)).split(",");
                if (obj.length == 0)
                {
                    obj = null;
                } else
                {
                    obj1 = new ArrayList(obj.length);
                    k1 = obj.length;
                    for (j1 = 0; j1 < k1; j1++)
                    {
                        ((List) (obj1)).add(ebz.p(obj[j1]));
                    }

                    obj = jgu.a(", ").a(((Iterable) (obj1)));
                }
            }
            af = ((String) (obj));
            if (W == 0 && z)
            {
                ag = cursor.getInt(29);
            }
            obj1 = drk.b(getContext(), cursor.getString(25));
            if (!TextUtils.equals(((CharSequence) (obj1)), ad))
            {
                ad = ((String) (obj1));
            }
            double d1;
            double d2;
            String s3;
            String s4;
            String s5;
            int l1;
            boolean flag1;
            int i2;
            long l2;
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = String.valueOf(getContext().getApplicationContext().getResources().getString(l.rf));
                obj1 = String.valueOf(obj1);
                String s2;
                if (((String) (obj1)).length() != 0)
                {
                    obj = ((String) (obj)).concat(((String) (obj1)));
                } else
                {
                    obj = new String(((String) (obj)));
                }
            } else
            {
                obj = null;
            }
        } else
        {
            if (W == 2)
            {
                ac = cursor.getLong(23) / 1000L;
            }
            obj = null;
        }
        if (V == 2 && z)
        {
            aj = cursor.getString(2);
        }
        j1 = cursor.getInt(36);
        if (A != flag2 || z != flag3 || V != j1)
        {
            A = flag2;
            z = flag3;
            V = j1;
            K();
        }
        obj1 = cursor.getString(5);
        K = dqb.values()[cursor.getInt(7)];
        if (!TextUtils.equals(((CharSequence) (obj1)), f()))
        {
            b(((String) (obj1)));
            if (TextUtils.isEmpty(f()) && TextUtils.isEmpty(ad))
            {
                g.setVisibility(8);
            } else
            {
                E();
                a(ani1.h(), flag);
            }
        }
        obj1 = cursor.getString(9);
        obj2 = cursor.getString(10);
        if (obj1 != null && ((String) (obj1)).contains(drk.a))
        {
            ao = drk.b(((String) (obj1)));
        }
        if (obj2 != null && ((String) (obj2)).contains(drk.a))
        {
            ao = drk.b(((String) (obj2)));
        }
        obj3 = p;
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            p = ((String) (obj2));
        } else
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            p = ((String) (obj1));
        } else
        {
            p = "";
        }
        s2 = r;
        r = cursor.getString(30);
        if (!TextUtils.isEmpty(((CharSequence) (obj3))) && (((String) (obj3)).equals(obj2) || ((String) (obj3)).equals(obj1)) || !TextUtils.isEmpty(r) && TextUtils.equals(r, s2))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0)
        {
            J();
        }
        obj2 = cursor.getString(20);
        if (obj2 == null)
        {
            obj1 = "";
        } else
        {
            obj1 = obj2;
        }
        ai = ((String) (obj1));
        obj3 = bhp1.M();
        if (!TextUtils.isEmpty(p) || !TextUtils.isEmpty(r))
        {
            if (j1 != 0 && v == null && u == null)
            {
                obj1 = String.valueOf(r);
                if (((String) (obj1)).length() != 0)
                {
                    obj1 = "Image added with no previous attachment view:".concat(((String) (obj1)));
                } else
                {
                    obj1 = new String("Image added with no previous attachment view:");
                }
                ebw.a("Babel", ((String) (obj1)));
                j1 = 0;
            }
            if (ai.equals("multipart/mixed"))
            {
                k1 = 0;
                for (obj1 = ao.iterator(); ((Iterator) (obj1)).hasNext();)
                {
                    obj2 = (drl)((Iterator) (obj1)).next();
                    if (j1 != 0)
                    {
                        a(k1, ((drl) (obj2)).b, ((drl) (obj2)).a, null, 0L, false);
                    } else
                    {
                        a(((drl) (obj2)).a, ((drl) (obj2)).b, ((drl) (obj2)).c, ((drl) (obj2)).d, 0, flag, ani1, bhp1, flag4, null, null, null, 0L, null, 0.0D, 0.0D, null, null, cursor.getString(2), 0, null);
                        k1++;
                    }
                }

            } else
            {
                obj1 = cursor.getString(31);
                l2 = cursor.getLong(32);
                if (j1 != 0)
                {
                    if (g.c(((String) (obj2))) || "hangouts/gv_voicemail".equals(obj2))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a(0, ai, p, ((String) (obj1)), l2, flag);
                } else
                {
                    j1 = cursor.getInt(11);
                    k1 = cursor.getInt(12);
                    l1 = cursor.getInt(40);
                    obj2 = cursor.getString(13);
                    d1 = cursor.getDouble(14);
                    d2 = cursor.getDouble(15);
                    s3 = cursor.getString(16);
                    s4 = cursor.getString(17);
                    s5 = cursor.getString(9);
                    a(p, ai, j1, k1, l1, flag, ani1, bhp1, flag4, r, cursor.getString(4), ((String) (obj1)), l2, ((String) (obj2)), d1, d2, s3, s4, cursor.getString(2), cursor.getInt(39), s5);
                }
            }
        } else
        {
            J();
        }
        R = i1;
        P = bhp1.f(j);
        Q = bhp1.g(j);
        if (bhp1.R() == 1 && !z)
        {
            if (obj3 != null)
            {
                a(bhp1.d(((ceu) (obj3)).b), ((ceu) (obj3)).e, ani1);
            } else
            {
                a(((String) (null)), ((String) (null)), ani1);
            }
        } else
        if (z)
        {
            a(S, ak.c(), ani1);
        } else
        {
            a(bhp1.d(j), bhp1.f(j), ani1);
        }
        k();
        y = cursor.getLong(6) / 1000L;
        l2 = System.currentTimeMillis();
        obj2 = g.b(y, l2, false).toString();
        obj1 = g.b(y, l2, true).toString();
        if (cursor.getInt(28) == 0 && cursor.getInt(8) == dqc.b.ordinal())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        i2 = cursor.getInt(37);
        if (h.b == null || h.d == null) goto _L2; else goto _L1
_L1:
        i1 = 0;
        flag1 = false;
        l1 = 0;
        if (W == 2)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        efm.a[K.ordinal()];
        JVM INSTR tableswitch 1 4: default 1488
    //                   1 1910
    //                   2 1910
    //                   3 1912
    //                   4 2118;
           goto _L3 _L4 _L4 _L5 _L6
_L3:
        j1 = l1;
        i1 = ((flag1) ? 1 : 0);
_L9:
        if (i1 != 0)
        {
            if (System.currentTimeMillis() - y < 0L)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                c("");
                y();
                if (k1 != 0)
                {
                    al.postDelayed(G, 0L);
                } else
                {
                    al.postDelayed(H, 0L);
                }
            } else
            if (k1 != 0)
            {
                I();
            } else
            {
                H();
            }
        } else
        if (j1 != 0)
        {
            h.a.setVisibility(8);
            h.f.setVisibility(8);
            h.h.setVisibility(0);
        } else
        if (J)
        {
            J = false;
            h.h.setVisibility(8);
            h.a.setVisibility(0);
            h.a.startAnimation(an);
            I = 1;
        } else
        {
            h.h.setVisibility(8);
            h.a.setVisibility(0);
        }
_L2:
        if (h.f.getVisibility() == 0 && !TextUtils.isEmpty(h.g.getText()))
        {
            cursor = h.g.getText();
        } else
        if (!TextUtils.isEmpty(h.d.getContentDescription()))
        {
            cursor = h.d.getContentDescription();
        } else
        if ("hangouts/gv_voicemail".equals(ai))
        {
            cursor = ((Cursor) (obj1));
        } else
        {
            cursor = h.d.getText();
        }
        if (h.b.getVisibility() == 0)
        {
            ani1 = h.b.getText();
        } else
        {
            ani1 = bhp1.f(j);
        }
        a(((CharSequence) (ani1)), ((String) (obj)), ((CharSequence) (cursor)));
        if (g())
        {
            if (C())
            {
                setOnClickListener(this);
            } else
            {
                C.setOnClickListener(this);
            }
            C.setLongClickable(false);
            g.setLongClickable(false);
            g.setClickable(false);
            return;
        } else
        {
            D();
            return;
        }
_L4:
        i1 = 1;
_L5:
        if (K == dqb.e)
        {
            y();
        }
        if (k1 == 0) goto _L8; else goto _L7
_L7:
        j1 = l.gI;
_L11:
        cursor = this;
        cursor.a(((MessageListItemView) (cursor)).h.b.getContext().getString(j1), null, null, null);
        j1 = l1;
          goto _L9
_L8:
        if (G())
        {
            ani1 = null;
        } else
        {
            ani1 = Q;
        }
        if (V == 2)
        {
            if (ak != null && ak.ab())
            {
                cursor = c;
            } else
            {
                cursor = b;
            }
        } else
        if (W == 0)
        {
            cursor = d;
        } else
        if (W == 1)
        {
            cursor = e;
        } else
        if (j1 != 0)
        {
            cursor = f;
        } else
        {
            cursor = "";
        }
        a(((String) (ani1)), ((String) (obj2)), ((String) (obj1)), ((String) (cursor)));
        if (ag == 0)
        {
            h.e.setVisibility(0);
            j1 = l1;
        } else
        if (ag == 64)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
          goto _L9
_L6:
        y();
        switch (i2)
        {
        default:
            if (k1 != 0)
            {
                j1 = l.hY;
                i1 = 0;
            } else
            {
                j1 = l.hZ;
                i1 = 0;
            }
            break;

        case 123: // '{'
            j1 = l.gC;
            i1 = 0;
            break;

        case 124: // '|'
            j1 = l.gG;
            i1 = 0;
            break;

        case 125: // '}'
            j1 = l.gw;
            i1 = 0;
            break;

        case 126: // '~'
            j1 = l.gD;
            i1 = 0;
            break;

        case 127: // '\177'
            j1 = l.gA;
            i1 = 0;
            break;

        case 132: 
            j1 = l.gt;
            i1 = 0;
            break;

        case 134: 
            j1 = l.gu;
            i1 = 0;
            break;

        case 129: 
            j1 = l.gv;
            i1 = 0;
            break;

        case 133: 
            j1 = l.gy;
            i1 = 0;
            break;

        case 128: 
            j1 = l.gz;
            i1 = 0;
            break;

        case 130: 
            j1 = l.gB;
            i1 = 0;
            break;

        case 135: 
            j1 = l.gE;
            i1 = 0;
            break;

        case 131: 
            j1 = l.gF;
            i1 = 0;
            break;

        case 136: 
            j1 = l.gx;
            i1 = 0;
            break;
        }
        if (true) goto _L11; else goto _L10
_L10:
          goto _L9
    }

    public void a(bhp bhp1)
    {
        o = bhp1;
    }

    public void a(efa efa1)
    {
        n = efa1;
    }

    public void a(String s1)
    {
        S = s1;
    }

    public void a(String s1, String s2, ani ani1)
    {
        if (i != null)
        {
            i.a(s1, s2, ani1);
        }
    }

    public void a(boolean flag)
    {
        if (I == 0) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            I = 2;
        }
        I;
        JVM INSTR tableswitch 1 2: default 44
    //                   1 50
    //                   2 147;
           goto _L3 _L4 _L5
_L3:
        I = 0;
_L2:
        return;
_L4:
        h.f.setVisibility(4);
        h.f.startAnimation(am);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "sendingStatusDelayedShrinkPercentage", new float[] {
            1.0F, 0.0F
        });
        objectanimator.setDuration(getResources().getInteger(g.eZ));
        objectanimator.setStartDelay(350L);
        objectanimator.setInterpolator(new aia((byte)0));
        objectanimator.addListener(new efi(this));
        objectanimator.start();
        continue; /* Loop/switch isn't completed */
_L5:
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(this, "sendingStatusShrinkPercentage", new float[] {
            1.0F, 0.0F
        });
        objectanimator1.setDuration(getResources().getInteger(g.eZ));
        objectanimator1.setInterpolator(new aia((byte)0));
        objectanimator1.addListener(new efj(this));
        objectanimator1.start();
        if (true) goto _L3; else goto _L6
_L6:
    }

    public View b()
    {
        return this;
    }

    public void b(boolean flag)
    {
        if (T)
        {
            return;
        }
        float f1;
        MessageStatusView messagestatusview;
        byte byte0;
        if (ag == 0)
        {
            flag = false;
        } else
        if (J)
        {
            flag = false;
        }
        messagestatusview = h;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 1.0F;
        }
        messagestatusview.a(f1);
        messagestatusview = h;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        messagestatusview.setVisibility(byte0);
        if (!flag && ag == 0)
        {
            h.e.setVisibility(0);
            return;
        } else
        {
            h.e.setVisibility(8);
            return;
        }
    }

    public void c(boolean flag)
    {
        boolean flag2 = true;
        FrameLayout framelayout;
        boolean flag1;
        int i1;
        if (t.getChildCount() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        framelayout = D;
        if ((flag || flag1) && !z)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        framelayout.setVisibility(i1);
        if (flag && !flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        B = flag;
        a(z, A, B);
    }

    public boolean c()
    {
        return K == dqb.c;
    }

    public void d()
    {
        String s2 = null;
        String s1;
        String s3;
        if (j == null)
        {
            s1 = null;
        } else
        {
            s1 = j.a;
        }
        s3 = ae;
        if (V == 2 && o.M() != null)
        {
            s3 = o.M().f();
            s1 = s2;
            s2 = s3;
        } else
        {
            s2 = s3;
        }
        (new efg(this, s1, s2)).a(new Void[0]);
    }

    public CharSequence e()
    {
        return M;
    }

    public String f()
    {
        return L;
    }

    public boolean g()
    {
        return z && bhp.a(K) || W == 2;
    }

    public void h()
    {
        if (u != null)
        {
            for (Iterator iterator = u.iterator(); iterator.hasNext(); ((can)iterator.next()).f_()) { }
        }
        if (v != null)
        {
            for (Iterator iterator1 = v.iterator(); iterator1.hasNext(); ((can)iterator1.next()).f_()) { }
        }
    }

    public void i()
    {
        if (u != null)
        {
            for (Iterator iterator = u.iterator(); iterator.hasNext(); ((can)iterator.next()).c()) { }
        }
        if (v != null)
        {
            for (Iterator iterator1 = v.iterator(); iterator1.hasNext(); ((can)iterator1.next()).c()) { }
        }
    }

    public void j()
    {
        if (g != null)
        {
            CharSequence charsequence = g.getText();
            if (charsequence != null && ((charsequence instanceof SpannableString) || (charsequence instanceof SpannedString)))
            {
                edy.a(getContext()).a((Spanned)charsequence);
            }
            g.setText(null);
            g.setMovementMethod(null);
            b(((String) (null)));
            g.setVisibility(0);
        }
        C.setVisibility(8);
        a(h.b);
        a(h.d);
        h.f.clearAnimation();
        I = 0;
        ad = null;
        ab = 0L;
        aa = 0;
        j = null;
        P = null;
        Q = null;
        R = 0;
        B = true;
        T = false;
        b(false);
        x.clear();
        ae = null;
        ac = 0L;
        af = null;
        ag = -1;
        j = null;
        p = null;
        q = null;
        J();
        z();
    }

    public void k()
    {
        U = 1.0F;
    }

    public drl l()
    {
        while (ao != null || !g.b(ai) && !g.d(ai)) 
        {
            return null;
        }
        return L();
    }

    public List m()
    {
        if (ao != null)
        {
            return ao;
        } else
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(L());
            return arraylist;
        }
    }

    public boolean n()
    {
        return !w && !TextUtils.isEmpty(ai) && g.f(ai);
    }

    public int o()
    {
        if (ao != null)
        {
            return ao.size();
        }
        return TextUtils.isEmpty(p) ? 0 : 1;
    }

    public void onClick(View view)
    {
        if (n != null)
        {
            if (g())
            {
                n.b(k);
                return;
            }
            if (view == i && !z)
            {
                d();
                return;
            }
        }
    }

    public void onFinishInflate()
    {
        i = (AvatarView)D.findViewById(h.H);
        if (i != null)
        {
            i.setClickable(true);
            i.setOnClickListener(this);
            i.setLongClickable(true);
            i.setOnLongClickListener(this);
        }
        g = (TextView)C.findViewById(h.dM);
        efh efh1 = new efh(this);
        if (C())
        {
            setOnLongClickListener(efh1);
        } else
        {
            g.setOnLongClickListener(efh1);
        }
        K();
        D();
        s = (ViewGroup)C.findViewById(h.w);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (F != null)
        {
            accessibilitynodeinfo.setText(F);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (ap)
        {
            ap = false;
            flag = true;
        }
        return flag;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int j2;
        int k2;
        int i3;
        int ai1[] = A();
        j2 = C.getMeasuredWidth();
        int i2 = C.getMeasuredHeight();
        int l2 = t.getMeasuredWidth();
        k2 = t.getMeasuredHeight();
        if (!z)
        {
            l1 = D.getMeasuredWidth();
            j1 = D.getMeasuredHeight();
            int j3;
            if (B())
            {
                i1 = k1 - i1 - getPaddingRight() - (int)((float)l1 * U);
            } else
            {
                i1 = getPaddingLeft();
            }
            k1 = getPaddingTop();
            D.layout(i1, k1, i1 + l1, j1 + k1);
            if (B())
            {
                j1 = i1 - j2;
            } else
            {
                j1 = ai1[0] + (i1 + l1);
            }
            if (B())
            {
                i1 -= l2;
            } else
            {
                i1 += l1;
            }
        } else
        {
            D.setVisibility(8);
            if (B())
            {
                j1 = ai1[0] + i1;
            } else
            {
                j1 = k1 - j2 - ai1[0];
            }
            if (!B())
            {
                i1 = k1 - l2;
            }
        }
        l1 = getPaddingTop();
        j3 = getPaddingTop();
        k1 = l1;
        if (t.getVisibility() == 0)
        {
            t.layout(i1, j3, i1 + l2, j3 + k2);
            k1 = l1 + k2;
        }
        l1 = h.getMeasuredHeight();
        i3 = h.getMeasuredWidth();
        if (z ^ B())
        {
            i1 = (i1 + l2) - i3 - t.getPaddingLeft();
        } else
        {
            i1 += t.getPaddingLeft();
        }
        k2 = j3 + k2;
        if (C.getVisibility() != 0)
        {
            break MISSING_BLOCK_LABEL_476;
        }
        C.layout(j1, k1, j1 + j2, k1 + i2);
        if (!z) goto _L2; else goto _L1
_L1:
        if (B()) goto _L4; else goto _L3
_L3:
        i1 = (j1 + j2) - C.getPaddingRight() - i3;
_L6:
        j1 = k2 + i2;
_L7:
        if (h.getVisibility() == 0)
        {
            h.layout(i1, j1, i1 + i3, j1 + l1);
        }
        return;
_L2:
        if (!B()) goto _L4; else goto _L5
_L5:
        i1 = (j1 + j2) - C.getPaddingRight() - i3;
          goto _L6
_L4:
        i1 = C.getPaddingLeft() + j1;
          goto _L6
        j1 = t.getPaddingBottom();
        j1 = k2 - j1;
          goto _L7
    }

    public boolean onLongClick(View view)
    {
        if (view == i && !G() && !TextUtils.isEmpty(Q))
        {
            n.c(Q.replaceAll("\\s+", "_"));
            return true;
        } else
        {
            return false;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1 = 0;
        int ai1[] = A();
        int l1 = android.view.View.MeasureSpec.getSize(i1);
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        j1 = l1 - ai1[0] - ai1[1];
        i1 = j1;
        if (!z)
        {
            D.measure(i2, i2);
            i1 = j1 - D.getMeasuredWidth();
        }
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
        if (t.getVisibility() == 0)
        {
            t.measure(j2, i2);
            i1 = t.getMeasuredHeight();
        } else
        {
            i1 = 0;
        }
        if (C.getVisibility() == 0)
        {
            C.measure(j2, i2);
            j1 = C.getMeasuredHeight();
        } else
        {
            j1 = 0;
        }
        if (h.getVisibility() == 0)
        {
            h.measure(j2, i2);
            k1 = h.getMeasuredHeight();
        }
        setMeasuredDimension(l1, Math.max(D.getMeasuredHeight(), i1 + j1 + k1) + getPaddingBottom() + getPaddingTop());
    }

    public int p()
    {
        return W;
    }

    public int q()
    {
        return V;
    }

    public String r()
    {
        return ah;
    }

    public int s()
    {
        return k;
    }

    public void setSelected(boolean flag)
    {
        C.setSelected(flag);
    }

    public void t()
    {
        if (u != null)
        {
            for (Iterator iterator = u.iterator(); iterator.hasNext(); ((can)iterator.next()).d()) { }
        }
        if (v != null)
        {
            for (Iterator iterator1 = v.iterator(); iterator1.hasNext(); ((can)iterator1.next()).d()) { }
        }
    }

    public void u()
    {
        while (h.getVisibility() == 8 || T || ag == 0) 
        {
            return;
        }
        T = true;
        post(new efk(this));
    }

    public boolean v()
    {
        return z;
    }

    public String w()
    {
        return ad;
    }

    public long x()
    {
        return m;
    }

    public void y()
    {
        if (al != null)
        {
            al.removeCallbacks(G);
            al.removeCallbacks(H);
        }
    }

    public void z()
    {
        y();
        al = null;
    }

    static 
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        am = translateanimation;
        translateanimation.setDuration(200L);
        am.setInterpolator(new aib());
        translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        an = translateanimation;
        translateanimation.setDuration(350L);
        an.setInterpolator(new aib());
    }
}
