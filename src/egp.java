// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.views.ConversationNameView;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

public abstract class egp extends efx
    implements aqs
{

    private static boolean S;
    public static int f = 0;
    public static final String h;
    public static final String i;
    private static final boolean j = false;
    private static final int k;
    private static final int l;
    private static final int m;
    private static Boolean n = null;
    private String A;
    private String B;
    private String C;
    private int D;
    private String E;
    private String F;
    private long G;
    private String H;
    private int I;
    private String J;
    private String K;
    private String L;
    private int M;
    private boolean N;
    private String O;
    private boolean P;
    private int Q;
    private Object R;
    private final aqs T;
    private final StringBuilder U;
    private final StringBuilder V;
    private final SpannableStringBuilder W;
    public String a;
    public int b;
    public int c;
    public int d;
    public bjh e;
    public int g;
    private aqn o;
    private eef p;
    private aqn q;
    private eef r;
    private int s;
    private CharSequence t;
    private CharSequence u;
    private boolean v;
    private int w;
    private String x;
    private int y;
    private String z;

    public egp(Context context)
    {
        this(context, null);
    }

    public egp(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
        Q = 0;
        T = new egq(this);
        U = new StringBuilder();
        V = new StringBuilder();
        W = new SpannableStringBuilder();
        v = false;
        int i1 = f;
        f = i1 + 1;
        g = i1;
    }

    private void A()
    {
        CharSequence charsequence = c();
        if (charsequence != null && ((charsequence instanceof SpannableString) || (charsequence instanceof SpannedString)))
        {
            eha.a(getContext()).a((Spanned)charsequence);
        }
        a(((CharSequence) (null)));
    }

    static aqn a(egp egp1)
    {
        return egp1.q;
    }

    static eef a(egp egp1, eef eef1)
    {
        egp1.r = eef1;
        return eef1;
    }

    private void a(Cursor cursor)
    {
        int i1 = (int)ConversationListFragment.b(cursor);
        K = EsProvider.b(cursor.getString(21), i1);
        L = EsProvider.b(cursor.getString(7), i1);
        M = L.split(", ").length;
    }

    private void a(aoa aoa1)
    {
        if (j)
        {
            eev.b("ConversationListItem", "bindSnippet");
        }
        if (c == 1)
        {
            a(getResources().getString(l.he), ((CharSequence) (null)), ((CharSequence) (null)));
        } else
        if (c != 4)
        {
            switch (w)
            {
            case 6: // '\006'
            case 7: // '\007'
            default:
                return;

            case 1: // '\001'
                a(getResources().getString(l.fY), ((CharSequence) (null)), ((CharSequence) (null)));
                return;

            case 3: // '\003'
                b(A, aoa1);
                a(getResources().getString(l.ix), aoa1);
                return;

            case 13: // '\r'
                b(A, aoa1);
                a(getResources().getString(l.iy), aoa1);
                return;

            case 2: // '\002'
            case 9: // '\t'
                a(x, aoa1);
                return;

            case 4: // '\004'
                a(g.a(aoa1, C, B, F, false), ((CharSequence) (null)), ((CharSequence) (null)));
                return;

            case 5: // '\005'
                a(g.a(aoa1, dsu.values()[D], C, B, H), ((CharSequence) (null)), ((CharSequence) (null)));
                return;

            case 8: // '\b'
                a(getResources().getString(l.hG), ((CharSequence) (null)), ((CharSequence) (null)));
                return;

            case 10: // '\n'
                a(getResources().getString(l.fZ), ((CharSequence) (null)), ((CharSequence) (null)));
                return;

            case 11: // '\013'
                a(getResources().getString(l.hH), ((CharSequence) (null)), ((CharSequence) (null)));
                return;

            case 12: // '\f'
                a(getResources().getString(l.ie), ((CharSequence) (null)), ((CharSequence) (null)));
                m(0);
                d(J);
                return;
            }
        }
    }

    private void a(String s1, aoa aoa1)
    {
        Object obj1 = null;
        if (!P) goto _L2; else goto _L1
_L1:
        aoa1 = getResources().getString(l.iA, new Object[] {
            h
        });
_L4:
        String s2 = obj1;
        if (w == 9)
        {
            int i1 = eep.a(A, "://");
            s2 = obj1;
            if (i1 > 0)
            {
                s2 = getResources().getQuantityString(g.hL, i1, new Object[] {
                    Integer.valueOf(i1)
                });
            }
        }
        a(s1, ((CharSequence) (aoa1)), ((CharSequence) (s2)));
        return;
_L2:
label0:
        {
            Object obj;
label1:
            {
                if (b != 2)
                {
                    break label0;
                }
                String s3 = z;
                if (!TextUtils.isEmpty(s3))
                {
                    obj = s3;
                    if (!aoa1.D())
                    {
                        break label1;
                    }
                    obj = s3;
                    if (!aoa1.F())
                    {
                        break label1;
                    }
                }
                obj = E;
            }
            aoa1 = ((aoa) (obj));
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                aoa1 = L;
            }
            obj = aoa1;
            if (PhoneNumberUtils.isGlobalPhoneNumber(aoa1))
            {
                obj = eey.p(aoa1);
            }
            aoa1 = getResources().getString(l.iA, new Object[] {
                obj
            });
            continue; /* Loop/switch isn't completed */
        }
        aoa1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(String s1, CharSequence charsequence, CharSequence charsequence1)
    {
        a(0);
        x = s1;
        t = charsequence;
        u = charsequence1;
        A();
        if (TextUtils.isEmpty(x))
        {
            s1 = "";
        } else
        if (g.d(y) && I != 2)
        {
            s1 = x;
        } else
        {
            s1 = Html.fromHtml(x);
        }
        if (TextUtils.isEmpty(t))
        {
            s1 = s1.toString();
        } else
        {
            V.setLength(0);
            V.append(t);
            V.append(" ");
            V.append(s1);
            s1 = V;
        }
        charsequence = eha.a(getContext()).a(s1, d());
        W.clear();
        if (charsequence == null)
        {
            W.append(s1);
        } else
        {
            W.append(charsequence);
        }
        if (!TextUtils.isEmpty(u))
        {
            if (W.length() > 0)
            {
                W.append('\n');
            }
            s1 = String.valueOf(u);
            s1 = new SpannableString(Html.fromHtml((new StringBuilder(String.valueOf(s1).length() + 7)).append("<i>").append(s1).append("</i>").toString()));
            s1.setSpan(new ForegroundColorSpan(0xffbfbfbf), 0, s1.length(), 33);
            W.append(s1);
        }
        a(((CharSequence) (W)));
    }

    static aqn b(egp egp1)
    {
        egp1.q = null;
        return null;
    }

    private void b(String s1, aoa aoa1)
    {
        d(0);
        s1 = eep.a(s1);
        if (!TextUtils.equals(O, s1) || q == null && r == null)
        {
            u();
            O = s1;
            q = new aqn((new edq(s1, aoa1.a())).a(m).d(true), T, true, null);
            boolean flag = ((dpn)hlp.a(getContext(), dpn)).a(q);
            if (j)
            {
                eev.b("ConversationListItem", (new StringBuilder(40)).append("setImageSnippet - image was cached:").append(flag).toString());
            }
        }
    }

    static eef c(egp egp1)
    {
        return egp1.r;
    }

    private void u()
    {
        if (q != null)
        {
            q.b();
            q = null;
        }
        a(((Bitmap) (null)));
        if (r != null)
        {
            r.b();
            r = null;
        }
        d(8);
    }

    private void v()
    {
        a(8);
        A();
        x = null;
        t = null;
        u = null;
        a(8);
        u();
        m(8);
        d(((CharSequence) (null)));
    }

    private void w()
    {
        boolean flag2 = true;
        int i1;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        byte byte0;
        byte byte1;
        boolean flag3;
        if (e != null && e.a(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = isSelected();
        if (flag)
        {
            i1 = com.google.android.apps.hangouts.R.drawable.b;
        } else
        {
            i1 = com.google.android.apps.hangouts.R.drawable.a;
        }
        setBackgroundResource(i1);
        if (flag)
        {
            i1 = -1;
            j1 = -1;
            k1 = 0;
        } else
        if (v)
        {
            j1 = getResources().getColor(g.dx);
            i1 = getResources().getColor(g.dw);
            k1 = 1;
        } else
        {
            j1 = getResources().getColor(g.dx);
            i1 = getResources().getColor(g.dv);
            k1 = 0;
        }
        if (d == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        byte1 = i1;
        byte0 = j1;
        if (c == 1)
        {
            byte1 = i1;
            byte0 = j1;
            if (!flag1)
            {
                setBackgroundColor(getResources().getColor(g.dv));
                byte1 = -1;
                byte0 = -1;
            }
        }
        a(byte0, byte1, k1);
        if (v)
        {
            i1 = l;
        } else
        {
            i1 = k;
        }
        e(i1);
        if (v)
        {
            i1 = 255;
        } else
        {
            i1 = 127;
        }
        f(i1);
        if (c == 2 || c == 5)
        {
            if (flag3)
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aG;
            } else
            if (v)
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aE;
            } else
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aF;
            }
        } else
        if (c == 1 && flag1 || c == 6)
        {
            if (flag || flag3)
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aN;
            } else
            if (v)
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aH;
            } else
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aI;
            }
        } else
        {
            i1 = 0;
        }
        b(i1);
        if (c == 3)
        {
            Drawable drawable = getResources().getDrawable(com.google.android.apps.hangouts.R.drawable.bZ);
            if (flag || flag3 || v)
            {
                i1 = getResources().getColor(g.dx);
            } else
            {
                i1 = getResources().getColor(g.dv);
            }
            drawable.setColorFilter(i1, android.graphics.PorterDuff.Mode.SRC_IN);
            a(drawable);
        }
        if (flag || flag3)
        {
            h(-1);
            if (o())
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aO;
            } else
            {
                i1 = com.google.android.apps.hangouts.R.drawable.bo;
            }
            n(i1);
        } else
        {
            h(0x26000000);
            if (o())
            {
                i1 = com.google.android.apps.hangouts.R.drawable.aJ;
            } else
            {
                i1 = com.google.android.apps.hangouts.R.drawable.bn;
            }
            n(i1);
        }
        if (v)
        {
            i1 = 6;
        } else
        {
            i1 = 1;
        }
        j1 = i1;
        if (!TextUtils.isEmpty(u))
        {
            j1 = i1 + 1;
        }
        if (j1 != 1)
        {
            flag2 = false;
        }
        a(flag2);
        c(j1);
    }

    private ann x()
    {
        if (!((dup)hlp.a(getContext(), dup)).c())
        {
            if (g.g(Q))
            {
                return ann.c;
            }
            if (g.d(Q))
            {
                return ann.b;
            }
        }
        return ann.a;
    }

    private void y()
    {
        if (o != null)
        {
            o.b();
            o = null;
        }
        if (p != null)
        {
            p.b();
            p = null;
        }
    }

    private void z()
    {
        U.setLength(0);
        Object obj = getResources();
        if (isActivated())
        {
            eep.a(U, ((Resources) (obj)).getString(l.ib));
        }
        CharSequence charsequence = b();
        if (!TextUtils.isEmpty(charsequence))
        {
            eep.a(U, charsequence.toString());
        }
        if (g.e(Q))
        {
            eep.a(U, ((Resources) (obj)).getString(l.iI));
        }
        if (h() == 0)
        {
            eep.a(U, ((Resources) (obj)).getString(l.ia));
        }
        if (i() == 0)
        {
            eep.a(U, ((Resources) (obj)).getString(l.hY));
        }
        if (j() == 0)
        {
            eep.a(U, ((Resources) (obj)).getString(l.ic));
        }
        if (v)
        {
            eep.a(U, ((Resources) (obj)).getString(l.hZ));
        }
        if (e() == 0)
        {
            CharSequence charsequence1 = g();
            obj = charsequence1;
            if (TextUtils.isEmpty(charsequence1))
            {
                obj = f();
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                eep.a(U, ((CharSequence) (obj)).toString());
            }
        }
        obj = c();
        if (obj != null && ((CharSequence) (obj)).length() > 0)
        {
            eep.a(U, ((CharSequence) (obj)));
        }
        setContentDescription(U);
    }

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1);

    public void a(int i1, Cursor cursor)
    {
        if (c != i1)
        {
            c = i1;
            k();
            if (p())
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            g(i1);
        }
    }

    public void a(Cursor cursor, aoa aoa1, boolean flag, Object obj)
    {
        boolean flag3 = true;
        boolean flag2 = true;
        v();
        R = obj;
        Object obj1 = (TextView)findViewById(h.aG);
        long l2 = ConversationListFragment.a(cursor);
        int i1 = (int)l2;
        s = (int)(l2 >> 32);
        a = EsProvider.b(cursor.getString(1), i1);
        w = EsProvider.a(cursor.getString(8), i1);
        if (w == 3 && !l())
        {
            w = 9;
        }
        D = EsProvider.a(cursor.getString(30), i1);
        x = EsProvider.b(cursor.getString(9), i1);
        y = EsProvider.a(cursor.getString(36), i1);
        B = EsProvider.b(cursor.getString(11), i1);
        C = EsProvider.b(cursor.getString(10), i1);
        A = EsProvider.b(cursor.getString(12), i1);
        E = EsProvider.b(cursor.getString(37), i1);
        z = EsProvider.b(cursor.getString(13), i1);
        int j1;
        int l1;
        boolean flag1;
        if (EsProvider.a(cursor.getString(26), i1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        N = flag1;
        F = EsProvider.b(cursor.getString(41), i1);
        H = EsProvider.b(cursor.getString(40), i1);
        I = EsProvider.a(cursor.getString(43), i1);
        j1 = EsProvider.a(cursor.getString(46), i1);
        obj = new StringBuilder();
        l1 = j1 / 1000;
        j1 = l1 / 60;
        l1 %= 60;
        ((StringBuilder) (obj)).append(j1);
        ((StringBuilder) (obj)).append(":");
        if (l1 < 10)
        {
            ((StringBuilder) (obj)).append("0");
        }
        ((StringBuilder) (obj)).append(l1);
        J = ((StringBuilder) (obj)).toString();
        Q = EsProvider.a(cursor.getString(36), i1);
        a(cursor);
        b = cursor.getInt(3);
        if (B == null || TextUtils.equals(B, aoa1.b().b))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        P = flag1;
        d = cursor.getInt(23);
        if (flag)
        {
            i1 = 4;
        } else
        if (cursor.getInt(23) != 0)
        {
            i1 = 1;
        } else
        if (w == 1)
        {
            i1 = 2;
        } else
        if (w == 8)
        {
            i1 = 3;
        } else
        if (w == 10)
        {
            i1 = 5;
        } else
        if (w == 11)
        {
            i1 = 6;
        } else
        {
            i1 = 0;
        }
        a(i1, cursor);
        if (j)
        {
            obj = String.valueOf(a);
            long l3;
            long l4;
            if (((String) (obj)).length() != 0)
            {
                obj = "bindConversationItem ".concat(((String) (obj)));
            } else
            {
                obj = new String("bindConversationItem ");
            }
            eev.b("ConversationListItem", ((String) (obj)));
        }
        if (S && obj1 != null)
        {
            if (s > 1)
            {
                obj = String.format("(%d)", new Object[] {
                    Integer.valueOf(s)
                });
            } else
            {
                obj = "";
            }
            ((TextView) (obj1)).setText(((CharSequence) (obj)));
        }
        obj = cursor.getString(6);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            b(ConversationNameView.b(((String) (obj))));
        } else
        {
            String s1 = L;
            if (s1 != null)
            {
                obj = String.valueOf("L");
                s1 = String.valueOf(s1);
                if (s1.length() != 0)
                {
                    obj = ((String) (obj)).concat(s1);
                } else
                {
                    obj = new String(((String) (obj)));
                }
                b(((String) (obj)));
            } else
            {
                b(ConversationNameView.b(""));
            }
        }
        l3 = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        l4 = cursor.getLong(5);
        if (l4 > 0L && l4 < l3)
        {
            RealTimeChatService.a(aoa1, a);
        }
        G = cursor.getLong(4) / 1000L;
        if (p())
        {
            l3 = System.currentTimeMillis();
            b(g.a(G, l3, false));
            c(g.a(G, l3, true));
            int k1;
            if (cursor.getInt(38) == 1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                k1 = 0;
            } else
            {
                k1 = 8;
            }
            j(k1);
            if (cursor.getInt(2) == 10 && i1 == 0)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            i(i1);
            if (cursor.getLong(28) > 0L)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            k(i1);
            if (w == 12)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            l(i1);
        }
        if (w == 8 || w == 11)
        {
            obj = null;
            if (!cursor.isNull(39))
            {
                obj = Long.valueOf(cursor.getLong(39));
            }
            l3 = cursor.getLong(29);
            if (g.a(((Long) (obj)), 0L) > l3)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            v = flag;
        } else
        {
            if (!P && N)
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
            v = flag;
        }
        a(cursor);
        obj1 = K;
        if (m())
        {
            aoa1.v();
            cursor = new LinkedList();
            if (M > 0)
            {
                obj = new LinkedList();
                if (obj1 != null)
                {
                    obj1 = new StringTokenizer(((String) (obj1)), "|");
                    do
                    {
                        if (!((StringTokenizer) (obj1)).hasMoreElements())
                        {
                            break;
                        }
                        String s2 = ((StringTokenizer) (obj1)).nextToken();
                        if (s2 != null)
                        {
                            if (s2.startsWith("defaultavatar://"))
                            {
                                cursor.add(s2.substring(16));
                            } else
                            {
                                ((List) (obj)).add(s2);
                            }
                        }
                    } while (true);
                }
                a(((List) (obj)), M - ((List) (obj)).size(), aoa1, ((List) (cursor)));
            } else
            {
                eev.f("Babel", "No participants found for conversation.");
                a(((List) (null)), 0, aoa1, ((List) (cursor)));
            }
        }
        a(aoa1);
        w();
        z();
    }

    public abstract void a(Bitmap bitmap);

    public void a(Drawable drawable)
    {
    }

    public void a(bjh bjh1)
    {
        e = bjh1;
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (j)
        {
            int i1 = g;
            String s1;
            if (eef1 == null)
            {
                s1 = null;
            } else
            {
                s1 = eef1.toString();
            }
            if (edf == null)
            {
                edf = null;
            } else
            {
                edf = edf.toString();
            }
            edf = String.valueOf(edf);
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s1).length() + 79 + String.valueOf(edf).length())).append("CLIV(").append(i1).append(") setImageBitmap ").append(s1).append(" gifImage=").append(edf).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (o != aqn1)
        {
            if (eef1 != null)
            {
                eef1.b();
            }
            if (j)
            {
                eef1 = String.valueOf(R);
                eev.b("ConversationListItem", (new StringBuilder(String.valueOf(eef1).length() + 44)).append("setImage leaving early: mAvatarLoadedToken: ").append(eef1).toString());
            }
        } else
        {
            o = null;
            if (flag)
            {
                gdv.a("Expected null", p);
                p = eef1;
                if (!flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag, eef1.e(), false, aqn1.m());
                return;
            }
        }
    }

    public abstract void a(CharSequence charsequence);

    protected void a(List list, int i1, aoa aoa1, List list1)
    {
        String s1;
        ann ann1;
        Object obj;
        Object obj1;
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (o != null)
        {
            s1 = o.c();
        } else
        if (p == null)
        {
            s1 = null;
        } else
        {
            s1 = p.h();
        }
        ann1 = x();
        aoa1 = aoa1.a();
        j1 = aon.b();
        obj = a;
        obj1 = R;
        if (ann1 != ann.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = anl.a(list, i1, list1, aoa1, j1, ((String) (obj)), this, obj1, s1, flag, ann1, true);
        if ((list == null || list.size() == 0) && i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj != null || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (obj != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (j)
        {
            i1 = g;
            String s3 = a;
            String s2;
            if (obj == null)
            {
                aoa1 = "null";
            } else
            {
                aoa1 = ((aqn) (obj)).toString();
            }
            if (p == null)
            {
                list1 = "null";
            } else
            {
                list1 = p.h();
            }
            if (list == null)
            {
                s2 = " null";
            } else
            {
                s2 = Integer.toString(list.size());
            }
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s3).length() + 119 + String.valueOf(aoa1).length() + String.valueOf(list1).length() + String.valueOf(s2).length())).append("CLIV(").append(i1).append(") setAvatarUrls convId=").append(s3).append(" newRequest=").append(aoa1).append(" oldBitmap=").append(list1).append(" clearPrev=").append(flag1).append(" fetch=").append(flag2).append(" setDefault=").append(flag).append(" avatarUrls=").append(s2).toString());
        }
        if (flag1)
        {
            y();
        }
        if (flag2)
        {
            ((aqn) (obj)).b(false);
            o = ((aqn) (obj));
            if (((dpn)hlp.a(getContext(), dpn)).a(o))
            {
                if (j)
                {
                    i1 = g;
                    eev.b("Babel_medialoader", (new StringBuilder(54)).append("CLIV(").append(i1).append(") loaded setAvatarUrl came from cache.").toString());
                }
                o = null;
                flag = false;
            } else
            {
                flag = true;
            }
        }
        if (flag)
        {
            a(false, aon.a(x()), true, R);
            if (j)
            {
                i1 = g;
                if (s1 == null)
                {
                    aoa1 = "true";
                } else
                {
                    aoa1 = "false";
                }
                if (list == null)
                {
                    list = "null";
                } else
                {
                    list = Integer.toString(list.size());
                }
                eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(aoa1).length() + 79 + String.valueOf(list).length())).append("CLIV(").append(i1).append(") setAvatarUrls setting default avatar: oldkeynull=").append(aoa1).append(" avatarUrls=").append(list).toString());
            }
        }
    }

    public abstract void a(boolean flag);

    public abstract void a(boolean flag, Bitmap bitmap, boolean flag1, Object obj);

    public abstract CharSequence b();

    public abstract void b(int i1);

    public abstract void b(Drawable drawable);

    public abstract void b(CharSequence charsequence);

    public abstract void b(String s1);

    public abstract CharSequence c();

    public abstract void c(int i1);

    public abstract void c(CharSequence charsequence);

    public abstract TextView d();

    public abstract void d(int i1);

    public abstract void d(CharSequence charsequence);

    public abstract int e();

    public abstract void e(int i1);

    public abstract CharSequence f();

    public abstract void f(int i1);

    public abstract CharSequence g();

    public abstract void g(int i1);

    public abstract int h();

    public abstract void h(int i1);

    public abstract int i();

    public abstract void i(int i1);

    public abstract int j();

    public abstract void j(int i1);

    public abstract void k();

    public abstract void k(int i1);

    public abstract void l(int i1);

    public abstract boolean l();

    public abstract void m(int i1);

    public boolean m()
    {
        return true;
    }

    public abstract void n(int i1);

    public boolean n()
    {
        aoa aoa1;
        boolean flag;
        if (c == 1 && d != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aoa1 = dcn.e(((gqu)hlp.a(getContext(), gqu)).a());
        return flag && g.a(n, false) && aoa1.aa();
    }

    public boolean o()
    {
        aoa aoa1;
        boolean flag;
        if (c == 1 && d == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aoa1 = dcn.e(((gqu)hlp.a(getContext(), gqu)).a());
        return (flag || c == 5) && g.a(n, false) && aoa1.aa();
    }

    protected void onDetachedFromWindow()
    {
        v();
        y();
        super.onDetachedFromWindow();
    }

    public void onFinishInflate()
    {
        bnk.a();
        n = Boolean.valueOf(bnk.c());
    }

    public boolean p()
    {
        return c == 0 || c == 3 || c == 6;
    }

    public boolean q()
    {
        return v;
    }

    public int r()
    {
        return b;
    }

    public int s()
    {
        return Q;
    }

    public void setActivated(boolean flag)
    {
        Object obj = getResources();
        boolean flag1;
        if (flag)
        {
            obj = ((Resources) (obj)).getString(l.hT);
        } else
        {
            obj = ((Resources) (obj)).getString(l.hU);
        }
        eep.a(this, null, ((CharSequence) (obj)));
        flag1 = super.isActivated();
        super.setActivated(flag);
        if (flag != flag1)
        {
            w();
            z();
        }
    }

    public void setSelected(boolean flag)
    {
        boolean flag1 = super.isSelected();
        super.setSelected(flag);
        if (flag != flag1)
        {
            w();
            z();
        }
    }

    public long t()
    {
        return G;
    }

    static 
    {
        hnc hnc = eev.w;
        if (g.nV)
        {
            k = 0;
            l = 0;
            m = 0;
            h = "";
            i = "";
            S = false;
        } else
        {
            Resources resources = g.nU.getResources();
            k = resources.getDimensionPixelSize(g.eC);
            l = resources.getDimensionPixelSize(g.eP);
            m = resources.getDimensionPixelSize(g.dX);
            h = resources.getString(l.gt);
            i = resources.getString(l.iJ);
            S = false;
        }
    }
}
