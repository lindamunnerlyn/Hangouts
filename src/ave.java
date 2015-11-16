// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.LayoutTransition;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.rastermill.FrameSequenceDrawable;
import android.text.ClipboardManager;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.hangouts.content.DraftService;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.conversation.v2.FloatingButtonWithCounter;
import com.google.android.apps.hangouts.hangout.ProximityCoverView;
import com.google.android.apps.hangouts.phone.ConversationParticipantsActivity;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.service.NetworkStateReceiver;
import com.google.android.apps.hangouts.views.EasterEggView;
import com.google.android.apps.hangouts.views.FixedParticipantsView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;
import com.google.android.apps.hangouts.views.MessageListItemView;
import com.google.android.apps.hangouts.views.MessageListItemWrapperView;
import com.google.android.apps.hangouts.views.ParticipantsGalleryView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class ave extends bhp
    implements android.support.rastermill.FrameSequenceDrawable.OnFinishedListener, aqj, ato, aus, aye, ayg, azz, bfg, bfi, bfs, bkf, blb, bld, blg, br, efa, gqq
{

    private static final int aJ[];
    private static final boolean aj = false;
    private static long al;
    private static String cG = "(select merge_key from merge_keys where merge_keys.conversation_id=conversations.conversation_id)  IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)";
    private static final boolean i = false;
    bkl a;
    private int aA;
    private aip aB;
    private ArrayList aC;
    private int aD;
    private arx aE;
    private int aF;
    private final ary aG = new awo(this);
    private boolean aH;
    private boolean aI;
    private ani aK;
    private bxi aL;
    private bwf aM;
    private int aN;
    private int aO;
    private final dgp aP = new ayb(this);
    private azq aQ;
    private azu aR;
    private ayw aS;
    private avd aT;
    private bdj aU;
    private dmt aV;
    private Uri aW;
    private String aX;
    private String aY;
    private String aZ;
    private Runnable ak;
    private int am;
    private ard an;
    private dsm ao;
    private final ayv ap;
    private final ayf aq;
    private final aza ar;
    private gow as;
    private gqr at;
    private final gov au = new avf(this);
    private final gov av = new avq(this);
    private final gov aw = new awc(this);
    private long ax;
    private boolean ay;
    private atd az;
    atq b;
    private long bA;
    private long bB;
    private int bC;
    private String bD;
    private long bE;
    private int bF;
    private ceu bG;
    private long bH;
    private long bI;
    private Cursor bJ;
    private apw bK;
    private String bL;
    private boolean bM;
    private int bN;
    private boolean bO;
    private boolean bP;
    private ceu bQ;
    private eey bR;
    private final avc bS = new avc();
    private ayh bT;
    private boolean bU;
    private int bV;
    private int bW;
    private Boolean bX;
    private Integer bY;
    private int bZ;
    private String ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private boolean be;
    private final gz bf = new gz();
    private boolean bg;
    private boolean bh;
    private ViewGroup bi;
    private android.view.View.OnLayoutChangeListener bj;
    private FloatingButtonWithCounter bk;
    private List bl;
    private int bm;
    private aut bn;
    private ata bo;
    private View bp;
    private View bq;
    private View br;
    private EditText bs;
    private ImageView bt;
    private View bu;
    private ParticipantsGalleryView bv;
    private final eay bw = new eay();
    private final Handler bx = new Handler();
    private EasterEggView by;
    private ProximityCoverView bz;
    bky c;
    private asd cA;
    private final ase cB = new avj(this);
    private final Runnable cC = new awb(this);
    private final Map cD = new gz();
    private arm cE;
    private final TextWatcher cF = new axf(this);
    private final Runnable ca = new axl(this);
    private final boolean cb[] = new boolean[4];
    private Runnable cc;
    private final efc cd = new axn(this);
    private final List ce = new ArrayList();
    private aym cf;
    private ebx cg;
    private boolean ch;
    private boolean ci;
    private bhr cj;
    private MessageListAnimationManager ck;
    private final Runnable cl = new avg(this);
    private boolean cm;
    private ang cn;
    private boolean co;
    private boolean cp;
    private Chronometer cq;
    private FixedParticipantsView cr;
    private aug cs[];
    private auh ct;
    private axv cu;
    private int cv;
    private cnh cw;
    private bhd cx;
    private daw cy;
    private final azr cz;
    axy d;
    final List e = new ArrayList();

    public ave()
    {
        am = -1;
        ao = new dsm();
        ap = (new ayv()).a(binder);
        aq = (new ayi(context, this, lifecycle)).a(binder);
        ar = (new aza(this, lifecycle)).a(binder);
        bl = new ArrayList();
        bm = -1;
        bU = false;
        bV = 1;
        bW = 2;
        bX = null;
        bY = null;
        bZ = 1;
        a = new axi(this);
        b = new axj(this);
        c = new axk(this);
        ci = false;
        cu = new axv(this);
        cz = new azr(context, new avh(this));
        (new axm(this)).a(binder);
        bS.a(binder);
        aq.a(new amz(new avi(this)));
        if (aj || g.a(g.nS, "babel_cve_logging", false))
        {
            cg = new ebx("cfi");
            cg.a("created");
        }
        cE = new awy(this);
    }

    static int A(ave ave1)
    {
        return ave1.am;
    }

    static gz B(ave ave1)
    {
        return ave1.bf;
    }

    static bhr C(ave ave1)
    {
        return ave1.cj;
    }

    static List D(ave ave1)
    {
        return ave1.ce;
    }

    static ParticipantsGalleryView E(ave ave1)
    {
        return ave1.bv;
    }

    static eay F(ave ave1)
    {
        return ave1.bw;
    }

    static Runnable G(ave ave1)
    {
        return ave1.cl;
    }

    static Handler H(ave ave1)
    {
        return ave1.bx;
    }

    static Uri I(ave ave1)
    {
        return ave1.an();
    }

    static void J(ave ave1)
    {
        ave1.au();
    }

    static cng K(ave ave1)
    {
        return ave1.g;
    }

    static FixedParticipantsView L(ave ave1)
    {
        return ave1.cr;
    }

    static EasterEggView M(ave ave1)
    {
        return ave1.by;
    }

    static String N(ave ave1)
    {
        return ave1.aX;
    }

    static void O(ave ave1)
    {
        ave1.ad();
    }

    static hhb P(ave ave1)
    {
        return ave1.context;
    }

    static hhb Q(ave ave1)
    {
        return ave1.context;
    }

    static void R(ave ave1)
    {
        ave1.ai();
    }

    static hgx S(ave ave1)
    {
        return ave1.binder;
    }

    static gow T(ave ave1)
    {
        return ave1.as;
    }

    static dmt U(ave ave1)
    {
        return ave1.aV;
    }

    static boolean U()
    {
        return ao();
    }

    static azu V(ave ave1)
    {
        return ave1.aR;
    }

    static void V()
    {
        aq();
    }

    static Runnable W(ave ave1)
    {
        return ave1.cc;
    }

    static boolean W()
    {
        return i;
    }

    static long X()
    {
        return al;
    }

    static Runnable X(ave ave1)
    {
        ave1.cc = null;
        return null;
    }

    static ProximityCoverView Y(ave ave1)
    {
        return ave1.bz;
    }

    static void Z(ave ave1)
    {
        ave1.ap();
    }

    static int a(ave ave1, int i1)
    {
        ave1.bm = i1;
        return i1;
    }

    static Uri a(ave ave1, Uri uri)
    {
        ave1.aW = uri;
        return uri;
    }

    static daw a(ave ave1, daw daw1)
    {
        ave1.cy = daw1;
        return daw1;
    }

    static hhb a(ave ave1)
    {
        return ave1.context;
    }

    static Runnable a(ave ave1, Runnable runnable)
    {
        ave1.ak = runnable;
        return runnable;
    }

    private void a(Cursor cursor, ani ani1)
    {
        int i1;
        if (i)
        {
            String s1 = aq.e();
            Object obj1 = aq.a();
            Object obj2 = String.valueOf("onConversationParticipantsLoaderFinished() mConversationId=");
            Object obj3 = O();
            String s2 = String.valueOf(this);
            if (s1 != null)
            {
                s1 = String.valueOf(s1);
                boolean flag;
                if (s1.length() != 0)
                {
                    s1 = ", convName=".concat(s1);
                } else
                {
                    s1 = new String(", convName=");
                }
            } else
            {
                s1 = "";
            }
            if (obj1 != null)
            {
                obj1 = Integer.valueOf(((ark) (obj1)).b);
            } else
            {
                obj1 = "not set";
            }
            obj1 = String.valueOf(obj1);
            ebw.b("Conv", (new StringBuilder(String.valueOf(obj2).length() + 17 + String.valueOf(obj3).length() + String.valueOf(s2).length() + String.valueOf(s1).length() + String.valueOf(obj1).length())).append(((String) (obj2))).append(((String) (obj3))).append(": this=").append(s2).append(s1).append(" variant: ").append(((String) (obj1))).toString());
        }
        ap.f();
        obj1 = null;
        s1 = null;
        obj2 = new ArrayList();
        boolean flag1;
        if (cursor.moveToFirst())
        {
            flag = false;
            do
            {
                obj1 = s1;
                i1 = ((flag) ? 1 : 0);
                if (cursor.getInt(13) != 0)
                {
                    obj3 = amz.a(ani1, cursor);
                    obj1 = cursor.getString(12);
                    a(((ceu) (obj3)), ((String) (obj1)));
                    if (((ceu) (obj3)).h() && !TextUtils.isEmpty(((ceu) (obj3)).f()))
                    {
                        ((List) (obj2)).add(((ceu) (obj3)).f());
                    }
                    if (i)
                    {
                        s2 = String.valueOf(obj3);
                        ebw.b("Conv", (new StringBuilder(String.valueOf(s2).length() + 31 + String.valueOf(obj1).length())).append("Participant: ").append(s2).append(" Conversation Id: ").append(((String) (obj1))).toString());
                    }
                    ap.a(((String) (obj1))).add(obj3);
                    if (ebz.j(((ceu) (obj3)).c))
                    {
                        s1 = ((ceu) (obj3)).c;
                    }
                    obj1 = s1;
                    i1 = ((flag) ? 1 : 0);
                    if (((ceu) (obj3)).i())
                    {
                        i1 = 1;
                        obj1 = s1;
                    }
                }
                s1 = ((String) (obj1));
                flag = i1;
            } while (cursor.moveToNext());
        } else
        {
            i1 = 0;
        }
        cz.a(((List) (obj2)));
        if (bn != null && obj1 == null)
        {
            bn.a();
        }
        if (obj1 != null && !daw.a(context, ani1.h()))
        {
            cursor = getLoaderManager();
            cursor.a(0);
            cursor.a(1);
            cursor.a(2);
            cursor.a(3);
            daw.a(getContext(), ((String) (obj1)), new awl(this));
            return;
        }
        if (i1 != 0 && (!ani1.t() || !ebz.c()))
        {
            Object obj = (new android.app.AlertDialog.Builder(getActivity())).setTitle(l.ge);
            if (ani1.ab())
            {
                i1 = l.gk;
            } else
            {
                i1 = l.gd;
            }
            ((android.app.AlertDialog.Builder) (obj)).setMessage(i1).setCancelable(false).setPositiveButton(0x104000a, new awm(this)).show();
        }
        ani1 = aq.f();
        ani1.a(cursor);
        as();
        ac();
        bn.a();
        cursor = ce.iterator();
        do
        {
            if (!cursor.hasNext())
            {
                break;
            }
            obj = (aya)cursor.next();
            if (ani1.a(((aya) (obj)).b))
            {
                aP.a(((aya) (obj)).a, ((aya) (obj)).b, ((aya) (obj)).c);
            }
        } while (true);
        ce.clear();
        if (!P())
        {
            au();
        }
        cursor = ao;
        if (aq.d() != 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        cursor.a(flag1);
        ci = false;
        cursor = ani1.b().iterator();
        do
        {
            if (!cursor.hasNext())
            {
                break;
            }
            ani1 = (ceu)cursor.next();
            if (ani1.equals(drk.h()))
            {
                ci = true;
                ak();
                continue;
            }
            if (ani1.h() && TextUtils.isEmpty(ani1.f()))
            {
                ci = true;
                ak();
                continue;
            }
            ani1 = ani1.f();
            if (ani1 == null || !bhj.a(ani1))
            {
                continue;
            }
            ao.c();
            break;
        } while (true);
        ar();
        if (ci)
        {
            bn.h();
            bp.setVisibility(8);
            bk.setVisibility(8);
        }
        bn.a();
        ((ListView)h).invalidateViews();
    }

    private void a(ang ang1)
    {
        ang1.a = aq.a().a;
        Iterator iterator = ap.e().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ark ark1 = (ark)iterator.next();
            if (ark1.a != null)
            {
                DraftService.a(getActivity(), aK, ark1.a, ang1);
            }
        } while (true);
    }

    private void a(ark ark1, String s1)
    {
        bb = true;
        axv.a(cu);
        at();
        ani ani1 = aK;
        if (g.f(d()) && by != null)
        {
            String s2 = EasterEggView.a(s1);
            if (s2 != null)
            {
                if (EasterEggView.b(s2))
                {
                    RealTimeChatService.b(aK.h(), ark1.a, s2);
                }
                ark1 = by;
                s1 = aK;
                aK.b();
                ark1.a(s1, s2);
                return;
            }
        }
        int i1 = ((ListView)h).getAdapter().getCount();
        int k1 = i1 - 20;
        if (((ListView)h).getLastVisiblePosition() < k1)
        {
            ((ListView)h).setSelection(k1);
        }
        if ("hangouts/location".equals(aU.f()))
        {
            gbh.b(aU.j());
            if (g.e(d()))
            {
                long l2 = Math.abs(f.nextLong());
                Object obj = EsProvider.a(aK.h(), l2);
                Object obj1 = (byf)binder.a(byf);
                String s5 = ebr.a(((byf) (obj1)).a(aU.j()));
                k1 = ((byf) (obj1)).a();
                obj1 = new apw((new eam(s5, null)).a(k1), aS, true, obj);
                aV.a(((dlt) (obj1)));
                obj = ((Uri) (obj)).toString();
                aU.c(((String) (obj)));
                if (obj == null)
                {
                    aU.a(null);
                }
            }
        }
        View view = ((ListView)h).getChildAt(i1 - 1 - ((ListView)h).getFirstVisiblePosition());
        k1 = ((ListView)h).getHeight();
        boolean flag;
        if (i1 > 0 && (view == null || view.getBottom() > k1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g.a(context, "babel_extra_log_scrolling", false))
        {
            ebw.e("Babel_Scroll", (new StringBuilder(29)).append("sendMessage needsScroll:").append(flag).toString());
        }
        if (flag)
        {
            String s3 = aU.g();
            int j1 = aU.h();
            String s4 = aU.i();
            int l1 = aU.d();
            int i2 = aU.e();
            String s6 = ao.b();
            flag = ao.d();
            String s7 = aU.f();
            ffo ffo = aU.j();
            ((ListView)h).smoothScrollToPosition(((ListView)h).getAdapter().getCount() - 1);
            if (g.a(context, "babel_extra_log_scrolling", false))
            {
                int j2 = ((ListView)h).getAdapter().getCount();
                ebw.e("Babel_Scroll", (new StringBuilder(46)).append("sendMessage smoothScrollToPosition:").append(j2 - 1).toString());
            }
            bd = true;
            bx.postDelayed(new awu(this, ani1, ark1, s1, s3, j1, s4, l1, i2, s7, s6, flag, ffo), 500L);
        } else
        {
            ((dkt)binder.a(dkt)).a(ani1, ark1.a, s1, aU.g(), aU.h(), aU.i(), aU.d(), aU.e(), aU.f(), ao.b(), ao.d(), aU.j(), 0);
        }
        ark1 = d;
        if (ark1 != null && ((axy) (ark1)).a > 0L && ((axy) (ark1)).b != null && (!((axy) (ark1)).e || ((axy) (ark1)).c != null))
        {
            (new axg(this)).execute(new axy[] {
                ark1
            });
        }
        ao.a();
        b(false);
        if (bn != null)
        {
            bn.b(0);
        }
        aU.a();
        a(new ang());
        getActivity().getIntent().removeExtra("share_intent");
        bc = false;
        ac();
    }

    private void a(atd atd1)
    {
        a(atd1, 63, false);
    }

    private void a(atd atd1, int i1, boolean flag)
    {
        boolean flag1;
        if (az == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag1, "Cannot start a call while one is in progress");
        if (aA == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag1, "Cannot start a call while one is in progress");
        if (aB == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag1, "Cannot start a call while one is in progress");
        if (aC == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag1, "Cannot start a call while one is in progress");
        if (aD == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag1, "Cannot start a call while one is in progress");
        if (aE == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag1, "Cannot start a call while one is in progress");
        aB = new aip();
        aC = new ArrayList();
        aD = 0;
        az = atd1;
        aA = i1;
        af();
        atd1 = aq.a();
        if (flag)
        {
            aE.a(((ark) (atd1)).a, 2724);
            return;
        }
        List list = ap.e();
        int j1;
        if (list != null && list.size() > 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        j1 = aq.d();
        if (i1 != 0 && j1 == 1)
        {
            aC.add(amh.a(((ark) (atd1)).h, null, false));
        } else
        {
            atd1 = aq.f().c().iterator();
            while (atd1.hasNext()) 
            {
                ceu ceu1 = (ceu)atd1.next();
                aC.add(amh.a(ceu1, null, false));
            }
        }
        ag();
    }

    static void a(ave ave1, long l1)
    {
        ave1.c(l1);
    }

    static void a(ave ave1, aih aih1)
    {
        aih1.k = ave1.aq.b().k;
        RealTimeChatService.b(ave1.aP);
        ave1.cj.a(aih1);
        ave1.cj = null;
    }

    static void a(ave ave1, Cursor cursor, ani ani1)
    {
        ave1.b(cursor, ani1);
    }

    static void a(ave ave1, View view)
    {
        ave1.showEmptyViewProgress(view);
    }

    static void a(ave ave1, ang ang1)
    {
        if (ang1 != null && !ang1.a())
        {
            String s1 = ang1.b;
            boolean flag;
            if (!ave1.aH)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ave1.bn.a(s1, flag);
            ave1.bn.a();
            ave1.aU.a(ang1);
            return;
        } else
        {
            ave1.aU.b();
            return;
        }
    }

    static void a(ave ave1, ark ark1)
    {
        gbh.a(ark1.a);
        ark1 = ave1.aq.a();
        Object obj = daf.a(ark1.e);
        ((daf) (obj)).a(dac.b(ark1.e));
        obj = ais.newBuilder().a(((daf) (obj)));
        obj = aik.newBuilder().a(((ait) (obj)).a()).a();
        dhi dhi1 = dhi.b();
        ave1.am = dhi1.a();
        RealTimeChatService.a(dhi1, (new dce(ave1.context)).a(ave1.aK.h()).a(((aik) (obj))).a(aob.c).b(ark1.b).a());
    }

    static void a(ave ave1, axu axu1)
    {
        ave1.a(axu1);
    }

    static void a(ave ave1, String s1)
    {
        ave1.e(s1);
    }

    static void a(ave ave1, boolean flag)
    {
        ave1.a(flag);
    }

    private void a(axu axu1)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = bf.entrySet().iterator(); iterator.hasNext(); axu1.a((String)entry.getKey(), (axo)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_68;
        Exception exception;
        exception;
        axu1.a();
        throw exception;
        axu1.a();
        return;
    }

    private void a(ceu ceu1, String s1)
    {
        if (aq.d() == 1 && ceu1 != null && ceu1.b.a != null && !ceu1.b.a(aK.b()) && ceu1.a == cfa.b)
        {
            Iterator iterator = bf.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (!TextUtils.isEmpty(ceu1.c))
                {
                    String s3 = aX;
                    String s4 = String.valueOf(ebw.b(ceu1.toString()));
                    ebw.g("Conv", (new StringBuilder(String.valueOf(s1).length() + 119 + String.valueOf(s3).length() + String.valueOf(s4).length())).append("ParticipantType PERSON with phone found in conversation conversationId=").append(s1).append(" mergeKey=").append(s3).append(" ParticipantEntity phone number like: ").append(s4).toString());
                }
                if (TextUtils.equals(s1, (String)entry.getKey()))
                {
                    String s2 = aqc.b.c(aX);
                    if (s2 != null && !s2.equals(ceu1.b.a))
                    {
                        ebw.g("Babel", String.format(Locale.US, "in conversation %s gaia mismatch %s vs %s", new Object[] {
                            s1, aX, ceu1.b.a
                        }));
                        throw new IllegalStateException("Gaia mismatch");
                    }
                }
            }
        }
    }

    private void a(em em1, Cursor cursor)
    {
        if (g.a(context, "babel_extra_log_scrolling", false))
        {
            String s1 = String.valueOf(em1);
            int i1 = ((aqd)g).getCount();
            String s3 = String.valueOf(Integer.valueOf(cursor.getCount()));
            ebw.e("Babel_Scroll", (new StringBuilder(String.valueOf(s1).length() + 98 + String.valueOf(s3).length())).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(s1).append(" mAdapter.getCount(): ").append(i1).append(" new cursor data count: ").append(s3).toString());
        }
        if (i)
        {
            em1 = String.valueOf(em1);
            int j1 = ((aqd)g).getCount();
            String s2 = String.valueOf(Integer.valueOf(cursor.getCount()));
            ebw.b("Conv", (new StringBuilder(String.valueOf(em1).length() + 98 + String.valueOf(s2).length())).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(em1).append(" mAdapter.getCount(): ").append(j1).append(" new cursor data count: ").append(s2).toString());
        }
        if (ck.a().c())
        {
            if (i)
            {
                ebw.b("Conv", "  ignore onMessagesLoaderFinished() MESSAGES_LOADER, UI updateblocking is on.");
            }
            return;
        }
        int i2 = ((aqd)g).getCount();
        int j2 = ((ListView)h).getFirstVisiblePosition();
        int k2 = cursor.getCount();
        em1 = ((ListView)h).getChildAt(0);
        int k1;
        if (em1 != null)
        {
            k1 = em1.getTop();
        } else
        {
            k1 = 0;
        }
        ((aqd)g).b(cursor);
        if (bK != null && bL != null)
        {
            cursor.moveToLast();
            if (cursor.getString(1).equals(bL))
            {
                aQ.a(bK);
                aV.a(bK);
            }
        }
        bK = null;
        bL = null;
        if (i2 > 0 && k2 > i2 + 1)
        {
            int l1;
            long l2;
            if (aw())
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            l1 = Math.max(l1, Math.min((k2 - i2) + ((j2 + l1) - 1), k2 - 1));
            ((ListView)h).setSelectionFromTop(l1, k1);
        }
        if (aq.a() == null)
        {
            showEmptyView(getView());
        } else
        {
            showContent(getView());
        }
        if (cursor.getCount() > 0 && cursor.moveToFirst())
        {
            bA = cursor.getLong(6);
        } else
        {
            bA = System.currentTimeMillis() * 1000L;
        }
        if (cursor.getCount() > 0 && cursor.moveToLast())
        {
            l2 = bB;
            bB = cursor.getLong(6);
            if (I() && bB > l2 && isVisible())
            {
                e(cursor.getString(2));
            }
            if (!P())
            {
                au();
            }
        }
        if (!bg)
        {
            l2 = SystemClock.elapsedRealtime();
            if (aL != null)
            {
                aL.a(aK.h(), "hangout_launch_remote_notification", l2, 1002);
                aL.a(aK.h(), "click_contact_list", l2, 1004);
                aL.a(aK.h(), "click_conversation_list", l2, 1005);
            }
        }
        bg = true;
        ax();
        if (cursor.moveToLast())
        {
            if (g.a(context, "babel_extra_log_scrolling", false))
            {
                ebw.e("Babel_Scroll", "onMessagesLoaderFinished moveToLast");
            }
            k1 = cD.size();
label0:
            do
            {
                do
                {
                    long l3 = cursor.getLong(0);
                    l1 = k1;
                    if (cD.containsKey(Long.valueOf(l3)))
                    {
                        em1 = dqb.values()[cursor.getInt(7)];
                        if (em1 == dqb.e)
                        {
                            cD.remove(Long.valueOf(l3));
                        } else
                        {
                            cD.put(Long.valueOf(l3), Integer.valueOf(em1.ordinal()));
                        }
                        l1 = k1 - 1;
                    }
                    em1 = cursor.getString(4);
                    if (!bb && em1 != null && em1.equalsIgnoreCase(aK.b().a))
                    {
                        bb = true;
                    }
                    if (!cursor.moveToPrevious())
                    {
                        break label0;
                    }
                    k1 = l1;
                } while (!bb);
                k1 = l1;
            } while (l1 > 0);
        }
        ac();
        bn.a();
    }

    private void a(Map map, long l1, String s1)
    {
        Object obj = new ArrayList();
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (g.a((Integer)entry.getValue(), 0) == dqb.d.ordinal())
            {
                ((ArrayList) (obj)).add(entry.getKey());
            }
        } while (true);
        map = new Long[((ArrayList) (obj)).size()];
        ((ArrayList) (obj)).toArray(map);
        Arrays.sort(map);
        obj = getActivity();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (obj)));
        builder.setTitle(l.jH).setItems(g.cU, new aww(this, l1, map, s1, ((android.app.Activity) (obj))));
        builder.create().show();
    }

    private void a(boolean flag)
    {
        boolean flag2 = true;
        boolean flag1 = flag;
        if (g != null)
        {
            flag1 = flag;
            if (((aqd)g).getCount() == 0)
            {
                flag1 = true;
            }
        }
        if (dzk.c(context))
        {
            flag1 = true;
        }
        if (!dzk.d(context))
        {
            flag = flag2;
        } else
        {
            flag = flag1;
        }
        cj.b_(flag);
    }

    private static boolean a(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        context = context.getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    static boolean a(ave ave1, List list, ark ark1)
    {
        return ave1.a(list, ark1);
    }

    private static boolean a(dqc dqc1, dqb dqb1, boolean flag)
    {
        boolean flag1;
        if (dqc1 == dqc.c || dqc1 == dqc.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1 && a(dqb1);
    }

    private boolean a(List list, ark ark1)
    {
        boolean flag;
        boolean flag2;
        bb = true;
        axv.a(cu);
        at();
        list = list.iterator();
        flag2 = false;
        flag = true;
_L9:
        Object obj;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (asy)list.next();
        asz asz1 = ((asy) (obj)).c;
        boolean flag1;
        if (g.f(aq.a().b) && asz1 != asz.b && asz1 != asz.d && asz1 != asz.e)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        axh.b[((asy) (obj)).c.ordinal()];
        JVM INSTR tableswitch 1 4: default 144
    //                   1 161
    //                   2 161
    //                   3 262
    //                   4 352;
           goto _L3 _L4 _L4 _L5 _L6
_L3:
        throw new UnsupportedOperationException("Cannot send unsupported attachment type.");
_L4:
        if (((asy) (obj)).c == asz.b || ((asy) (obj)).c == asz.c)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g.a(flag2);
        obj = (atg)obj;
        ((dkt)binder.a(dkt)).a(aK, ark1.a, "", ((atg) (obj)).a, ((atg) (obj)).g, null, ((atg) (obj)).f, ((atg) (obj)).e, ((atg) (obj)).d, "", true, null, 0);
_L7:
        flag2 = true;
        continue; /* Loop/switch isn't completed */
_L5:
        if (((asy) (obj)).c == asz.d)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g.a(flag2);
        obj = (atj)obj;
        ebw.a("Conv", "sendStickerAttachment");
        aU.b(((atj) (obj)).e);
        aU.c(((atj) (obj)).a);
        aU.a(((atj) (obj)).d);
        bn.b(1);
        a(ark1, "");
        continue; /* Loop/switch isn't completed */
_L6:
        if (((asy) (obj)).c == asz.e)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g.a(flag2);
        obj = (ate)obj;
        aU.a(((ate) (obj)).e);
        bn.b(4);
        a(ark1, "");
        if (true) goto _L7; else goto _L2
_L2:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        if (!flag)
        {
            Toast.makeText(context, l.gb, 1).show();
        } else
        if (h != null)
        {
            int i1 = ((ListView)h).getAdapter().getCount();
            int j1 = i1 - 20;
            if (((ListView)h).getLastVisiblePosition() < j1)
            {
                ((ListView)h).setSelection(j1);
            }
            list = ((ListView)h).getChildAt(i1 - 1 - ((ListView)h).getFirstVisiblePosition());
            j1 = ((ListView)h).getHeight();
            if (i1 > 0 && (list == null || list.getBottom() > j1))
            {
                ((ListView)h).smoothScrollToPosition(((ListView)h).getAdapter().getCount() - 1);
                return flag2;
            }
        }
        return flag2;
    }

    private void aA()
    {
        String s1;
        for (s1 = aq.e(); s1 == null || cj == null;)
        {
            return;
        }

        cj.a(s1);
    }

    static boolean aA(ave ave1)
    {
        ave1.bd = false;
        return false;
    }

    private atd aB()
    {
        if (g.e(d()))
        {
            return atd.b;
        } else
        {
            return atd.a;
        }
    }

    static hhb aB(ave ave1)
    {
        return ave1.context;
    }

    static hhb aC(ave ave1)
    {
        return ave1.context;
    }

    static hhb aD(ave ave1)
    {
        return ave1.context;
    }

    static cng aE(ave ave1)
    {
        return ave1.g;
    }

    static cng aF(ave ave1)
    {
        return ave1.g;
    }

    static void aG(ave ave1)
    {
        ave1.ao.a(null);
        ave1.b(false);
        ave1.bn.a();
    }

    static void aH(ave ave1)
    {
        if (ave1.bZ != ave1.bV)
        {
            boolean flag;
            if (ave1.bV == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            azk.a(flag, ave1.context, ave1.getChildFragmentManager());
            return;
        } else
        {
            ave1.ai();
            return;
        }
    }

    static bdj aI(ave ave1)
    {
        return ave1.aU;
    }

    static boolean aJ(ave ave1)
    {
        return ave1.bO;
    }

    static ang aK(ave ave1)
    {
        return ave1.cn;
    }

    static void aL(ave ave1)
    {
        Intent intent;
        if (i)
        {
            String s1 = String.valueOf(ave1.bn);
            ebw.b("Conv", (new StringBuilder(String.valueOf(s1).length() + 47)).append("handleOptionalShareIntent mComposeMessageView: ").append(s1).toString());
        }
        intent = ave1.F();
        dzj.a("handleOptionalShareIntent", intent);
        if (intent == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Uri uri;
        Bundle bundle;
        ave1.bO = true;
        bundle = intent.getExtras();
        if (bundle.containsKey("android.intent.extra.TEXT"))
        {
            ebw.a("Conv", "handleOptionalShareIntent attaching TEXT");
            ave1.bn.a(bundle.getString("android.intent.extra.TEXT"), false);
        }
        obj = intent.getType();
        uri = null;
        if (!g.e(((String) (obj)))) goto _L4; else goto _L3
_L3:
        uri = (Uri)bundle.getParcelable("android.intent.extra.STREAM");
        if (uri != null)
        {
            ave1.bn.b(6);
            ave1.aU.a(ave1.aK, ((String) (obj)), uri);
            ave1.a(ave1.aq.a(), "");
        }
_L2:
        return;
_L4:
        if (!bundle.containsKey("requires_mms")) goto _L6; else goto _L5
_L5:
        obj = bundle.getString("draft_attachment_url");
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L8; else goto _L7
_L7:
        ebw.a("Conv", "handleOptionalShareIntent possibly attaching PHOTO");
        if (!g.a(dbf.e(((gmo)ave1.binder.a(gmo)).a()), apk.f))
        {
            Toast.makeText(ave1.context, g.kM, 1).show();
            return;
        }
        break; /* Loop/switch isn't completed */
_L8:
        obj = uri;
        if (bundle.getInt("draft_attachment_count") == 0)
        {
            ave1.aU.c();
            obj = uri;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = g.a(intent);
        if (true) goto _L7; else goto _L9
_L9:
        if (obj == null) goto _L2; else goto _L10
_L10:
        obj = azg.a(ave1.context, ((String) (obj)));
        ave1.as.a(g.ks, ((Intent) (obj)));
        return;
    }

    static long aM(ave ave1)
    {
        return ave1.bB;
    }

    static hhb aN(ave ave1)
    {
        return ave1.context;
    }

    static boolean aO(ave ave1)
    {
        return ave1.al();
    }

    static List aP(ave ave1)
    {
        return ave1.bl;
    }

    static hhb aQ(ave ave1)
    {
        return ave1.context;
    }

    static void aR(ave ave1)
    {
        ave1.am();
    }

    static boolean aS(ave ave1)
    {
        return ave1.aj();
    }

    static boolean aT(ave ave1)
    {
        return ave1.ci;
    }

    static hhb aU(ave ave1)
    {
        return ave1.context;
    }

    static daw aV(ave ave1)
    {
        return ave1.cy;
    }

    static hhb aW(ave ave1)
    {
        return ave1.context;
    }

    static hhb aX(ave ave1)
    {
        return ave1.context;
    }

    static boolean aY(ave ave1)
    {
        return g.d(ave1.d());
    }

    static void aZ(ave ave1)
    {
        ave1.b(true);
    }

    static String aa(ave ave1)
    {
        return ave1.ba;
    }

    static hhb ab(ave ave1)
    {
        return ave1.context;
    }

    static gqr ac(ave ave1)
    {
        return ave1.at;
    }

    private void ac()
    {
        axv.a(cu);
    }

    static hhb ad(ave ave1)
    {
        return ave1.context;
    }

    private void ad()
    {
        View view = getView();
        g.d(view);
        g.a(new aui(view));
    }

    static hhb ae(ave ave1)
    {
        return ave1.context;
    }

    private Boolean ae()
    {
        Boolean boolean1 = Boolean.FALSE;
        if (v()) goto _L2; else goto _L1
_L1:
        Object obj = Boolean.FALSE;
_L8:
        return ((Boolean) (obj));
_L2:
        Object obj1;
        obj1 = ap.e();
        obj = aq.a();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj1 = ((Collection) (obj1)).iterator();
_L6:
        if (((Iterator) (obj1)).hasNext())
        {
            ark ark1 = (ark)((Iterator) (obj1)).next();
            if (ark1.h == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (ark1.h.b() != null)
            {
                boolean1 = Boolean.TRUE;
            } else
            {
                if (obj == null || !TextUtils.equals(ark1.a, ((ark) (obj)).a) || ark1.h.b() == null)
                {
                    continue; /* Loop/switch isn't completed */
                }
                boolean1 = Boolean.TRUE;
            }
        }
_L4:
        if (g.e(d()))
        {
            return Boolean.FALSE;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
        if (g.f(d()))
        {
            bnd.a();
            if (bnd.c() && obj != null)
            {
                return Boolean.TRUE;
            } else
            {
                return Boolean.FALSE;
            }
        }
        obj = boolean1;
        if (boolean1 == Boolean.TRUE)
        {
            return null;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static hhb af(ave ave1)
    {
        return ave1.context;
    }

    private void af()
    {
        aE = ((asa)binder.a(asa)).a(context, lifecycle, aF, this, aB, az);
        aF = aF + 1;
    }

    static hhb ag(ave ave1)
    {
        return ave1.context;
    }

    private void ag()
    {
        if (aD == aC.size())
        {
            boolean flag;
            if (aD > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a("No contacts added", flag);
            if (aB() == atd.a)
            {
                aE.a(aq.a().a, 2622);
                return;
            } else
            {
                aE.a(aob.c, 2622);
                return;
            }
        } else
        {
            amf amf1 = (amf)aC.get(aD);
            aD = aD + 1;
            aE.a(amf1);
            return;
        }
    }

    static int ah(ave ave1)
    {
        return ave1.bN;
    }

    private String ah()
    {
        ark ark1 = aq.a();
        if (ark1.j == null && ark1.e != null)
        {
            return ark1.e;
        } else
        {
            return null;
        }
    }

    static hhb ai(ave ave1)
    {
        return ave1.context;
    }

    private void ai()
    {
        boolean flag1 = true;
        if (bn.i() && aq.g().size() > 0)
        {
            g.a(aK, 2324);
        }
        bn.j();
        jlk jlk1 = aq.g();
        jqy jqy;
        boolean flag;
        if (aq.a() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jqy = jlk1.a();
        do
        {
            if (!jqy.hasNext())
            {
                break;
            }
            asy asy1 = (asy)jqy.next();
            if (!flag && !l.b(asy1.a))
            {
                continue;
            }
            (new azv(context, jlk1, this)).execute(new Void[0]);
            flag = flag1;
            break;
        } while (true);
        if (flag || b(jlk1))
        {
            av();
        }
        aq.h();
    }

    static void aj(ave ave1)
    {
        if (ave1.I())
        {
            ave1.a(new avz(ave1));
            ave1.bx.removeCallbacks(ave1.cC);
            ave1.bx.postDelayed(ave1.cC, g.a(ave1.context, "babel_focusrenewperiodmillis", 0x41eb0));
        }
    }

    private boolean aj()
    {
        if (aq.a() == null && ((drw)binder.a(drw)).b())
        {
            return false;
        }
        if (cy != null && !cy.a)
        {
            return false;
        }
        return !ci;
    }

    static int ak(ave ave1)
    {
        return ave1.bm;
    }

    private void ak()
    {
        boolean flag = aj();
        bn.a(flag);
        am();
    }

    private boolean al()
    {
        return aq.a() != null && cy != null;
    }

    static boolean al(ave ave1)
    {
        return ave1.getResources().getDimensionPixelSize(g.jY) == 0;
    }

    static ata am(ave ave1)
    {
        return ave1.bo;
    }

    private void am()
    {
        if (aj())
        {
            int i1 = aq.g().size();
            boolean flag;
            if (bn != null && bn.i())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (bU && (bX == null || g.a(bX, false) != flag || bY == null || g.a(bY, 0) != i1))
            {
                bZ = bV;
                bX = Boolean.valueOf(flag);
                bY = Integer.valueOf(i1);
            }
            if (bk != null)
            {
                bk.a(flag, i1);
                return;
            }
        }
    }

    private Uri an()
    {
        return EsProvider.b(aK, O()).buildUpon().appendQueryParameter("limit", String.valueOf(cv)).build();
    }

    static hhb an(ave ave1)
    {
        return ave1.context;
    }

    static hhb ao(ave ave1)
    {
        return ave1.context;
    }

    private static boolean ao()
    {
        ecz ecz1 = ecz.a;
        return ecz1 != null && ecz1.e();
    }

    static cng ap(ave ave1)
    {
        return ave1.g;
    }

    private void ap()
    {
        ecz ecz1 = ecz.a;
        if (ecz1 != null && ecz1.g())
        {
            getActivity().setVolumeControlStream(0);
            return;
        } else
        {
            getActivity().setVolumeControlStream(0x80000000);
            return;
        }
    }

    static AbsListView aq(ave ave1)
    {
        return ave1.h;
    }

    private static void aq()
    {
        al = g.a(g.nS, "babel_poll_conversation_data_frequency_ms", 60000L);
    }

    private void ar()
    {
        if (aI)
        {
            return;
        }
        aI = true;
        if (aq.d() == 2)
        {
            Object obj = aq.f().c();
            int k1 = ((Collection) (obj)).size();
            obj = ((Collection) (obj)).iterator();
            int j1 = 0;
            while (((Iterator) (obj)).hasNext()) 
            {
                int i1;
                if (!TextUtils.isEmpty(((ceu)((Iterator) (obj)).next()).h))
                {
                    i1 = j1 + 1;
                } else
                {
                    i1 = j1;
                }
                j1 = i1;
            }
            aM.a(aK.h(), 2721).a(Integer.valueOf(k1)).d();
            if ((double)j1 <= (double)k1 * 0.25D)
            {
                i1 = 2717;
            } else
            if ((double)j1 <= (double)k1 * 0.5D)
            {
                i1 = 2718;
            } else
            if ((double)j1 <= (double)k1 * 0.75D)
            {
                i1 = 2719;
            } else
            {
                i1 = 2720;
            }
            aM.a(aK.h(), i1).a(Integer.valueOf(j1)).d();
            return;
        } else
        {
            aM.a(aK.h(), 2722).d();
            return;
        }
    }

    static boolean ar(ave ave1)
    {
        return ave1.bg;
    }

    static int as(ave ave1)
    {
        return ave1.cv;
    }

    private void as()
    {
        bF = 0;
        bG = null;
        Iterator iterator = aq.f().b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ceu ceu1 = (ceu)iterator.next();
            if (Boolean.TRUE.equals(ceu1.i))
            {
                bF = bF + 1;
                bG = ceu1;
            }
        } while (true);
    }

    static long at(ave ave1)
    {
        return ave1.bA;
    }

    private void at()
    {
        Iterator iterator = bf.values().iterator();
        int i1 = 0;
        do
        {
            if (iterator.hasNext())
            {
                switch (((axo)iterator.next()).b)
                {
                case 1: // '\001'
                    i1++;
                    break;
                }
                continue;
            }
            if (i1 > 1)
            {
                (new awn(this)).a(new Void[0]);
            }
            break;
        } while (true);
    }

    static hhb au(ave ave1)
    {
        return ave1.context;
    }

    private void au()
    {
        Object obj;
        obj = aq.a();
        break MISSING_BLOCK_LABEL_10;
        if (obj != null && ((ark) (obj)).a != null && bB > 0L)
        {
            Object obj1 = an.a(((ark) (obj)).a);
            obj = new ArrayList();
            ArrayList arraylist = new ArrayList();
            obj1 = ((are) (obj1)).a(0L, 0x7fffffffffffffffL).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                czn czn1 = (czn)((Iterator) (obj1)).next();
                cey cey1 = czn1.d;
                amz amz1 = aq.f();
                ceu ceu1 = amz1.b(cey1);
                if (ceu1 != null && !amz1.c(cey1))
                {
                    if (czn1.e >= bB)
                    {
                        arraylist.add(ceu1);
                    } else
                    {
                        ((List) (obj)).add(ceu1);
                    }
                }
            } while (true);
            if (!((List) (obj)).isEmpty())
            {
                bv.a(((List) (obj)), false);
            }
            if (!arraylist.isEmpty())
            {
                bv.b(arraylist, true);
                return;
            }
        }
        return;
    }

    static cng av(ave ave1)
    {
        return ave1.g;
    }

    private void av()
    {
        bo.a();
        if (bT != null)
        {
            ayh ayh = bT;
            bT = null;
            gbk.a(new aws(this, ayh));
        }
    }

    static hhb aw(ave ave1)
    {
        return ave1.context;
    }

    private boolean aw()
    {
        for (Iterator iterator = bf.values().iterator(); iterator.hasNext();)
        {
            if (!((axo)iterator.next()).d)
            {
                return true;
            }
        }

        return false;
    }

    static AbsListView ax(ave ave1)
    {
        return ave1.h;
    }

    private void ax()
    {
        if (bg && aw())
        {
            bq.setVisibility(0);
            return;
        } else
        {
            bq.setVisibility(8);
            return;
        }
    }

    static AbsListView ay(ave ave1)
    {
        return ave1.h;
    }

    private void ay()
    {
        ark ark1 = aq.a();
        RealTimeChatService.h(aK, ark1.a);
        if (cj != null)
        {
            cj.a();
        }
    }

    private ark az()
    {
label0:
        {
            Object obj = ap.e();
            if (obj == null)
            {
                break label0;
            }
            obj = ((Collection) (obj)).iterator();
            ark ark1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                ark1 = (ark)((Iterator) (obj)).next();
            } while (!g.f(ark1.b));
            return ark1;
        }
        return null;
    }

    static boolean az(ave ave1)
    {
        return ave1.bd;
    }

    static View b(ave ave1, View view)
    {
        ave1.bu = view;
        return view;
    }

    static ayv b(ave ave1)
    {
        return ave1.ap;
    }

    static String b(ave ave1, String s1)
    {
        ave1.ba = s1;
        return s1;
    }

    private void b(Cursor cursor, ani ani1)
    {
        if (bH <= 0L)
        {
            bJ = cursor;
            return;
        }
        cursor.moveToLast();
        if (cursor.isAfterLast()) goto _L2; else goto _L1
_L1:
        long l1 = cursor.getLong(2);
        if (l1 <= bH || l1 <= bI) goto _L4; else goto _L3
_L3:
        cursor.getInt(3);
        JVM INSTR tableswitch 17 17: default 84
    //                   17 163;
           goto _L4 _L5
_L4:
        long l2 = bI;
        ebw.c("Babel", (new StringBuilder(99)).append("Setting last processed event suggestion timestamp from ").append(l2).append(" to ").append(l1).toString());
        bI = l1;
_L2:
        bJ = null;
        RealTimeChatService.d(ani1, aq.a().a, bI);
        return;
_L5:
        Object obj = new eam(cursor.getString(4), null);
        aQ.a();
        bK = null;
        bL = null;
        int i1 = cursor.getInt(5);
        obj = new apw(((eam) (obj)), aQ, true, Integer.valueOf(i1));
        Cursor cursor1 = ((aqd)g).a();
        if (cursor1 != null && cursor1.moveToLast() && cursor1.getString(1).equals(cursor.getString(1)))
        {
            aQ.a(((apw) (obj)));
            aV.a(((dlt) (obj)));
        } else
        {
            bK = ((apw) (obj));
            bL = cursor.getString(1);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static void b(ave ave1, int i1)
    {
label0:
        {
            if (ave1.bg)
            {
                Cursor cursor = ((aqd)ave1.g).a();
                long l1;
                if (i1 > 0 && cursor != null && !cursor.isClosed() && cursor.moveToPosition(i1 - 1))
                {
                    l1 = cursor.getLong(6);
                } else
                {
                    l1 = 0L;
                }
                ave1.a(new axe(ave1, l1));
                if (i1 == 0 && ave1.cv == ((aqd)ave1.g).a().getCount())
                {
                    if (ave1.cw == null)
                    {
                        break label0;
                    }
                    ave1.cv = ave1.cv + g.a(ave1.context, "babel_conversation_messages_limit", 500);
                    ave1.aW = ave1.an();
                    ave1.cw.a(ave1.aW);
                    ave1.cw.u();
                }
            }
            return;
        }
        ebw.f("Conv", "MessagesLoader is null. Error 22253232");
    }

    static void b(ave ave1, ang ang1)
    {
        ave1.a(ang1);
    }

    static void b(ave ave1, boolean flag)
    {
        ave1.bM = flag;
    }

    private void b(boolean flag)
    {
        if (br == null)
        {
            return;
        }
        View view;
        int i1;
        if (flag)
        {
            bs.setText(ao.b());
            bs.addTextChangedListener(cF);
            bs.requestFocus();
        } else
        {
            bs.removeTextChangedListener(cF);
            bn.b();
        }
        view = br;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    private boolean b(List list)
    {
        ark ark1 = aq.a();
        if (ark1 == null)
        {
            ap.a(new awt(this, list));
            return true;
        } else
        {
            return a(list, ark1);
        }
    }

    static void bA(ave ave1)
    {
        if (ave1.I())
        {
            RealTimeChatService.a(ave1.aK, ave1.bf.keySet());
        }
    }

    static void bB(ave ave1)
    {
        boolean flag = true;
        ave1.a(new avy(ave1));
        if (ave1.ao != null)
        {
            dsm dsm1 = ave1.ao;
            if (ave1.aq.d() == 1)
            {
                flag = false;
            }
            dsm1.a(flag);
            ave1.bn.a();
        }
    }

    static Cursor bC(ave ave1)
    {
        return ave1.bJ;
    }

    static void bD(ave ave1)
    {
        ave1.ab();
    }

    static Collection bE(ave ave1)
    {
        ArrayList arraylist = new ArrayList();
        ceu ceu1;
        for (ave1 = ave1.aq.f().c().iterator(); ave1.hasNext(); arraylist.add(ais.a(daf.a(ceu1.b, ceu1.c, ceu1.g), ceu1.e, ceu1.h)))
        {
            ceu1 = (ceu)ave1.next();
        }

        return arraylist;
    }

    static asd bF(ave ave1)
    {
        return ave1.cA;
    }

    static bxi bG(ave ave1)
    {
        return ave1.aL;
    }

    static hhb bH(ave ave1)
    {
        return ave1.context;
    }

    static hjg bI(ave ave1)
    {
        return ave1.lifecycle;
    }

    static hhb bJ(ave ave1)
    {
        return ave1.context;
    }

    static hhb bK(ave ave1)
    {
        return ave1.context;
    }

    static dsm ba(ave ave1)
    {
        return ave1.ao;
    }

    static hhb bb(ave ave1)
    {
        return ave1.context;
    }

    static hhb bc(ave ave1)
    {
        return ave1.context;
    }

    static hhb bd(ave ave1)
    {
        return ave1.context;
    }

    static AbsListView be(ave ave1)
    {
        return ave1.h;
    }

    static AbsListView bf(ave ave1)
    {
        return ave1.h;
    }

    static hgx bg(ave ave1)
    {
        return ave1.binder;
    }

    static ebx bh(ave ave1)
    {
        return ave1.cg;
    }

    static ebx bi(ave ave1)
    {
        ave1.cg = null;
        return null;
    }

    static void bj(ave ave1)
    {
        ave1.aA();
    }

    static cng bk(ave ave1)
    {
        return ave1.g;
    }

    static View bl(ave ave1)
    {
        return ave1.bu;
    }

    static azr bm(ave ave1)
    {
        return ave1.cz;
    }

    static boolean bn(ave ave1)
    {
        return ave1.be;
    }

    static boolean bo(ave ave1)
    {
        ave1.be = true;
        return true;
    }

    static hjg bp(ave ave1)
    {
        return ave1.lifecycle;
    }

    static hjg bq(ave ave1)
    {
        return ave1.lifecycle;
    }

    static axv br(ave ave1)
    {
        return ave1.cu;
    }

    static hjg bs(ave ave1)
    {
        return ave1.lifecycle;
    }

    static hgx bt(ave ave1)
    {
        return ave1.binder;
    }

    static hjg bu(ave ave1)
    {
        return ave1.lifecycle;
    }

    static Runnable bv(ave ave1)
    {
        return ave1.ak;
    }

    static Runnable bw(ave ave1)
    {
        return ave1.cC;
    }

    static void bx(ave ave1)
    {
        ceu ceu1;
        for (Iterator iterator = ave1.aq.f().b().iterator(); iterator.hasNext(); ave1.bv.a(ceu1))
        {
            ceu1 = (ceu)iterator.next();
        }

    }

    static void by(ave ave1)
    {
        ave1.a(new awa(ave1));
    }

    static aut bz(ave ave1)
    {
        return ave1.bn;
    }

    static int c(ave ave1, int i1)
    {
        ave1.bN = i1;
        return i1;
    }

    static hhb c(ave ave1)
    {
        return ave1.context;
    }

    private void c(long l1)
    {
        RealTimeChatService.a(aK, new long[] {
            l1
        });
    }

    private void c(Cursor cursor, ani ani1)
    {
        String s7;
        gz gz1;
        int j1;
        int k1;
        j1 = 0;
        k1 = bC;
        s7 = bD;
        bD = null;
        gz1 = new gz();
        if (cg != null)
        {
            cg.a("processConvLoaded");
        }
        if (cursor == null || !cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        String s1;
        String s2;
        int i1;
        i1 = 0;
        s1 = null;
        s2 = null;
_L7:
        boolean flag;
        if (cg != null)
        {
            cg.a("processConvLoaded:loopStart");
        }
        Object obj;
        axo axo1;
        String s8;
        int l1;
        int i2;
        long l2;
        boolean flag1;
        if (cursor.getPosition() == 0)
        {
            s1 = cursor.getString(3);
            s2 = cursor.getString(4);
        } else
        {
            String s3 = s2;
            s2 = s1;
            s1 = s3;
        }
        s8 = cursor.getString(0);
        l1 = cursor.getInt(17);
        flag = j1;
        if (j1 == 0)
        {
            flag = j1;
            if (l1 == 1)
            {
                aq.a(cursor.getString(3), cursor.getString(4));
                flag = true;
            }
        }
        l2 = g.a(Long.valueOf(cursor.getLong(18)), 0L);
        if (l2 > bH)
        {
            bH = l2;
        }
        axo1 = (axo)bf.get(s8);
        obj = axo1;
        if (axo1 == null)
        {
            obj = new axo();
        }
        gz1.put(s8, obj);
        obj.a = s8;
        obj.c = cursor.getLong(19);
        if (cursor.getInt(6) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj.d = flag1;
        obj.f = cursor.getString(22);
        aX = ((axo) (obj)).f;
        obj.b = l1;
        obj.g = cursor.getLong(20);
        obj.h = cursor.getLong(23);
        j1 = cursor.getInt(2);
        i2 = aq.d();
        if (j1 != 0 && j1 != i2)
        {
            String s5 = O();
            ebw.f("Babel", (new StringBuilder(String.valueOf(s5).length() + 100)).append("loaded client conversation type ").append(j1).append(" overriding ").append(i2).append(" for conversation ").append(s5).append(" (this is weird)").toString());
        }
        if (l1 == 1)
        {
            ark ark1;
            String s9;
            String s10;
            if (ani1.n())
            {
                bC = 0;
            } else
            {
                bC = cursor.getInt(9);
            }
            bD = s8;
            bE = cursor.getLong(10);
        }
        if (TextUtils.equals(O(), ((axo) (obj)).a))
        {
            aq.a(j1);
            aY = cursor.getString(24);
            aZ = cursor.getString(25);
            aN = cursor.getInt(1);
            aO = cursor.getInt(21);
            bh = true;
            if (i)
            {
                obj = aq.e();
                ark1 = aq.a();
                s8 = String.valueOf("onConversationsLoaderFinished(CONVERSATION_LOADER) mConversationId=");
                s9 = O();
                s10 = String.valueOf(this);
                Object obj1;
                if (obj != null)
                {
                    obj = String.valueOf(obj);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = ", convName=".concat(((String) (obj)));
                    } else
                    {
                        obj = new String(", convName=");
                    }
                } else
                {
                    obj = "";
                }
                if (ark1 != null)
                {
                    obj1 = Integer.valueOf(ark1.b);
                } else
                {
                    obj1 = "not set";
                }
                obj1 = String.valueOf(obj1);
                ebw.b("Conv", (new StringBuilder(String.valueOf(s8).length() + 17 + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(obj).length() + String.valueOf(obj1).length())).append(s8).append(s9).append(": this=").append(s10).append(((String) (obj))).append(" variant: ").append(((String) (obj1))).toString());
            }
            getActivity().p_();
            if (!bU)
            {
                bZ = bV;
            }
            bU = true;
            bV = cursor.getInt(7);
            bW = cursor.getInt(8);
            bn.a(bV);
            bv.b(bV);
            bv.c(i2);
            if (cursor.getInt(11) == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            cp = flag1;
            if (!co)
            {
                co = true;
                if (F() == null && cursor.moveToFirst())
                {
                    obj = new ang(cursor);
                    obj1 = DraftService.a(O(), aK);
                    if (obj1 != null && !((ang) (obj1)).a())
                    {
                        obj = obj1;
                        if (i)
                        {
                            obj = String.valueOf(obj1);
                            ebw.b("Conv", (new StringBuilder(String.valueOf(obj).length() + 36)).append("DraftService.getDraft pendingDraft: ").append(((String) (obj))).toString());
                            obj = obj1;
                        }
                    } else
                    if (i)
                    {
                        String s6 = String.valueOf(obj);
                        ebw.b("Conv", (new StringBuilder(String.valueOf(s6).length() + 48)).append("DraftService.getDraft returning original draft: ").append(s6).toString());
                    }
                    cn = ((ang) (obj));
                }
            }
        }
        i1++;
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        if (cg != null)
        {
            cg.a("processConvLoaded:loopDone");
        }
        if (!flag)
        {
            aq.a(s1, s2);
        }
        aA();
        if (bf.isEmpty())
        {
            cursor = gz1.values().iterator();
            for (l2 = 0L; cursor.hasNext(); l2 = Math.max(l2, ((axo)cursor.next()).h)) { }
            ((aqd)g).a(l2);
        }
        bf.clear();
        bf.a(gz1);
        at();
_L5:
        if (k1 == 0 && bC != 0)
        {
            RealTimeChatService.o(ani1, bD);
        }
        ax();
        RealTimeChatService.d(ani1, O(), bI);
        ani1 = O();
        cursor = ani1;
        if (ani1 == null)
        {
            cursor = "(NULL)";
        }
        ani1 = String.valueOf(Integer.toString(i1));
        ebw.e("Conv", (new StringBuilder(String.valueOf(cursor).length() + 42 + String.valueOf(ani1).length())).append("Conversation loader finished for ").append(cursor).append(", count# ").append(ani1).toString());
        if (s7 != null && bD == null)
        {
            cursor = String.valueOf(s7);
            if (cursor.length() != 0)
            {
                cursor = "Error: CallMediaTypeConvId is now missing! ".concat(cursor);
            } else
            {
                cursor = new String("Error: CallMediaTypeConvId is now missing! ");
            }
            ebw.g("Conv", cursor);
        }
        ac();
        return;
_L2:
        if (RealTimeChatService.a(O()) == null)
        {
            cursor = cj;
            O();
            cursor.a();
        }
        i1 = 0;
          goto _L5
_L4:
        String s4 = s1;
        s1 = s2;
        s2 = s4;
        j1 = ((flag) ? 1 : 0);
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void c(ave ave1, String s1)
    {
        ark ark1 = ave1.aq.a();
        boolean flag2 = ave1.al();
        boolean flag;
        boolean flag1;
        if (ark1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ave1.cy == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag2)
        {
            throw new IllegalStateException(g.b("variant null: %s. reachability null: %s.", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1)
            }));
        }
        if (!ave1.cy.a)
        {
            ave1.cy.a(ave1.context, false);
        } else
        if (!ave1.aj())
        {
            if (ave1.getActivity() != null)
            {
                Toast.makeText(ave1.context, l.jU, 1).show();
                return;
            }
        } else
        {
            ave1.a(ark1, s1);
            return;
        }
    }

    private void d(int i1)
    {
        if (bW == 2)
        {
            ebw.a("Conv", "toggleHistoryNotAllowed");
            ai ai1 = getActivity();
            if (aK.o())
            {
                i1 = l.jp;
            } else
            {
                i1 = l.jo;
            }
            Toast.makeText(ai1, i1, 1).show();
            return;
        } else
        {
            RealTimeChatService.b(aK, aq.a().a, i1);
            return;
        }
    }

    static void d(ave ave1)
    {
        ave1.ag();
    }

    static void d(ave ave1, int i1)
    {
        Object obj1 = null;
        Cursor cursor = ((aqd)ave1.g).a();
        cursor.moveToPosition(i1);
        Object obj = g.g(cursor.getString(24));
        if (obj != null)
        {
            obj1 = ((Iterable) (obj)).iterator();
            long l1;
            if (((Iterator) (obj1)).hasNext())
            {
                obj = (String)((Iterator) (obj1)).next();
            } else
            {
                obj = null;
            }
            if (((Iterator) (obj1)).hasNext())
            {
                String s1 = (String)((Iterator) (obj1)).next();
                obj1 = obj;
                obj = s1;
            } else
            {
                Object obj2 = null;
                obj1 = obj;
                obj = obj2;
            }
        } else
        {
            obj = null;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))) && (((String) (obj1)).startsWith("http://") || ((String) (obj1)).startsWith("https://")))
        {
            l1 = cursor.getLong(0);
            RealTimeChatService.a(ave1.aK.h(), ((String) (obj1)), drk.a(((String) (obj)), "UTF-8"), l1, false);
        }
    }

    static void e(ave ave1)
    {
        ave1.az = null;
        ave1.aA = 0;
        ave1.aB = null;
        ave1.aC = null;
        ave1.aD = 0;
        ave1.aE = null;
    }

    static void e(ave ave1, int i1)
    {
        Cursor cursor = ((aqd)ave1.g).a();
        cursor.moveToPosition(i1);
        RealTimeChatService.a(ave1.aK, new long[] {
            cursor.getLong(0)
        });
    }

    private void e(String s1)
    {
        if (bh || bH > 0L)
        {
            at.b(bai.a(s1));
            at.a(new bai(context, aK, s1));
            int i1 = aK.h();
            if (dbq.r(i1))
            {
                at.a(new azi(context, s1, i1));
            }
        }
    }

    static atd f(ave ave1)
    {
        return ave1.az;
    }

    static auh g(ave ave1)
    {
        return ave1.ct;
    }

    static ani h(ave ave1)
    {
        return ave1.aK;
    }

    static boolean i(ave ave1)
    {
        return g.e(ave1.d());
    }

    static MessageListAnimationManager j(ave ave1)
    {
        return ave1.ck;
    }

    static AbsListView k(ave ave1)
    {
        return ave1.h;
    }

    static AbsListView l(ave ave1)
    {
        return ave1.h;
    }

    static int m(ave ave1)
    {
        return ave1.bV;
    }

    static boolean n(ave ave1)
    {
        return g.f(ave1.d());
    }

    static ayf o(ave ave1)
    {
        return ave1.aq;
    }

    static boolean p(ave ave1)
    {
        return ave1.bb;
    }

    static boolean q(ave ave1)
    {
        return ave1.bP;
    }

    static boolean r(ave ave1)
    {
        return ave1.isPaused();
    }

    static void s(ave ave1)
    {
        long l1 = System.currentTimeMillis();
        ArrayList arraylist = new ArrayList();
        Iterator iterator1 = ave1.bw.entrySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if (l1 - ((ayd)entry.getValue()).b > 30000L)
            {
                if (ebw.a("Conv", 3))
                {
                    String s1 = String.valueOf(((ayd)entry.getValue()).a);
                    if (s1.length() != 0)
                    {
                        s1 = "Typing status expired for ".concat(s1);
                    } else
                    {
                        s1 = new String("Typing status expired for ");
                    }
                    ebw.d("Conv", s1);
                }
                arraylist.add(entry.getKey());
            }
        } while (true);
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (cey)iterator.next();
            ave1.bw.remove(obj);
            obj = ave1.a(((cey) (obj)));
            if (obj != null)
            {
                ave1.bv.a(((ceu) (obj)), 4, true);
            }
        } while (true);
    }

    static void t(ave ave1)
    {
        ave1.ak();
    }

    static void u(ave ave1)
    {
        if (ave1.al())
        {
            for (Iterator iterator = ave1.bl.iterator(); iterator.hasNext(); g.a((Runnable)iterator.next())) { }
            ave1.bl.clear();
        }
    }

    static void v(ave ave1)
    {
        String s1 = null;
        if (!ave1.P() && ave1.aq.a() != null && g.f(ave1.d())) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        if (ave1.bQ == obj || ave1.bQ != null && ave1.bQ.equals(obj))
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        ceu ceu1 = ave1.M();
        if (ceu1 != null)
        {
            obj = ceu1;
            if (ceu1.a())
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        ave1.bQ = ((ceu) (obj));
        if (ave1.bQ != null)
        {
            s1 = ((ceu) (obj)).b();
            obj = ((ceu) (obj)).e;
        } else
        {
            obj = null;
        }
        if (ave1.bR != null)
        {
            ave1.bR.a(s1);
        }
        ave1.bS.a(((String) (obj)), s1);
        return;
    }

    static int w(ave ave1)
    {
        return ave1.aO;
    }

    static aug[] x(ave ave1)
    {
        return ave1.cs;
    }

    static aym y(ave ave1)
    {
        return ave1.cf;
    }

    static void z(ave ave1)
    {
        axv.a(ave1.cu);
    }

    public boolean A()
    {
        return aN == 10;
    }

    public boolean B()
    {
        return bC != 0 && a(context);
    }

    public void C()
    {
        bn.f();
    }

    public void D()
    {
        bn.g();
    }

    public void E()
    {
        bn.b();
    }

    Intent F()
    {
        return (Intent)getActivity().getIntent().getParcelableExtra("share_intent");
    }

    public void G()
    {
        if (bn != null)
        {
            bn.setVisibility(8);
            bp.setVisibility(8);
            bk.setVisibility(8);
        }
        cm = true;
    }

    public boolean H()
    {
        gbh.b(cm);
        bo.b();
        if (dzk.d(context))
        {
            boolean flag = bn.c();
            a(false);
            return flag;
        } else
        {
            return false;
        }
    }

    public boolean I()
    {
        return bM;
    }

    public void J()
    {
        bn.a("", false);
        aU.c(null);
        aU.b(null);
        aq.h();
        if (ao != null)
        {
            ao.a();
        }
        a(new ang());
    }

    public void K()
    {
        int i1;
        if (((ListView)h).getFirstVisiblePosition() <= 0)
        {
            ebw.e("Babel_Scroll", "Message load failed. scroll to hide spinner.");
            ((ListView)h).smoothScrollToPositionFromTop(1, 0);
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ebw.g("Babel", "Message load failed");
        if (g.a(context, "babel_enable_message_load_failed_toast", true))
        {
            long l1 = SystemClock.elapsedRealtime();
            if (l1 - ax > TimeUnit.MINUTES.toMillis(1L))
            {
                ax = l1;
                Toast.makeText(getActivity(), l.iP, i1).show();
            }
        }
    }

    public void L()
    {
        if (bn != null)
        {
            bn.b(0);
        }
        aU.a();
    }

    public ceu M()
    {
        ceu ceu2;
label0:
        {
            ceu2 = null;
            if (aq.d() != 1)
            {
                break label0;
            }
            amz amz1 = aq.f();
            Iterator iterator = amz1.b().iterator();
            ceu ceu1 = null;
            while (iterator.hasNext()) 
            {
                ceu ceu3 = (ceu)iterator.next();
                if (!amz1.c(ceu3.b))
                {
                    ceu2 = ceu3;
                    if (ceu3.b.a != null)
                    {
                        break label0;
                    }
                    if (ceu1 == null)
                    {
                        ceu1 = ceu3;
                    }
                }
            }
            ceu2 = ceu1;
        }
        return ceu2;
    }

    public void N()
    {
        atd atd1;
        if (bC == 1)
        {
            atd1 = atd.c;
        } else
        {
            atd1 = atd.d;
        }
        a(atd1, 60, true);
    }

    public String O()
    {
        return aq.c();
    }

    public boolean P()
    {
        return getId() == h.cX;
    }

    public void Q()
    {
        if (bu != null)
        {
            g.b(coy.a);
            ((ViewGroup)bu.getParent()).removeView(bu);
            bu = null;
        }
    }

    public int R()
    {
        return aq.d();
    }

    public ang S()
    {
        return aU.a(bn.e(), ao.b());
    }

    public Handler T()
    {
        return bx;
    }

    public ani a()
    {
        return aK;
    }

    public ceu a(cey cey1)
    {
        return aq.f().b(cey1);
    }

    public void a(int i1)
    {
        bF = i1;
        axv.a(cu);
    }

    public void a(Bundle bundle, String s1)
    {
        if (!s1.equals("conversation_error")) goto _L2; else goto _L1
_L1:
        ay();
_L4:
        return;
_L2:
        if (!s1.equals("delete_conversation"))
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = getAccountForConversationDeletion(bundle);
        if (bundle != null)
        {
            RealTimeChatService.b(aP);
            a(((axu) (new awv(this, bundle))));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s1.equals("leave_conversation"))
        {
            ay();
            return;
        }
        if (s1.equals("delete_message"))
        {
            c(bundle.getLong("row_id"));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void a(ayh ayh)
    {
        bT = ayh;
        am();
    }

    public void a(bhr bhr1)
    {
        cj = bhr1;
    }

    public void a(eew eew, String s1, String s2)
    {
        cj.a(eew, s1, s2);
    }

    public void a(CharSequence charsequence)
    {
        bn.a(charsequence);
    }

    public void a(String s1)
    {
    }

    public void a(String s1, grk grk1, grh grh1)
    {
        grh1.a(false);
        if (s1 != null && grk1 != null)
        {
            if ((s1 = (cxp)grk1.d().getSerializable("response_header")) != null)
            {
                cvn.a(aK, s1);
                return;
            }
        }
    }

    public void a(List list)
    {
        if (b(list))
        {
            av();
        }
        am();
    }

    public void a(jlk jlk1)
    {
        b(jlk1);
    }

    public boolean a(long l1)
    {
        return cD.containsKey(Long.valueOf(l1));
    }

    public void b(int i1)
    {
        Cursor cursor;
        String s1;
        boolean flag;
        long l2;
        long l5;
        if (getActivity() == null)
        {
            return;
        }
        cursor = ((aqd)g).a();
        cursor.moveToPosition(i1);
        if (2 == cursor.getInt(33))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = cursor.getString(2);
        l5 = cursor.getLong(0);
        l2 = cursor.getLong(0);
        if (!cD.containsKey(Long.valueOf(l2))) goto _L2; else goto _L1
_L1:
        cD.remove(Long.valueOf(l2));
_L4:
        Object obj;
        dqb dqb1;
        int j1;
        int k1;
        int l1;
        long l3;
        long l4;
        long l6;
        if (flag)
        {
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(l.jG).setItems(g.cT, new axd(this, i1)).create().show();
        } else
        {
            a(cD, l5, s1);
        }
        ((aqd)g).notifyDataSetChanged();
        return;
_L2:
        obj = cD;
        if (flag)
        {
            j1 = dqb.d.ordinal();
        } else
        {
            j1 = cursor.getInt(7);
        }
        ((Map) (obj)).put(Long.valueOf(l2), Integer.valueOf(j1));
        if (!flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0) goto _L4; else goto _L3
_L3:
        l6 = g.a(context, "babel_select_adjacent_maximum_timedelta", 60) * 0xf4240;
        k1 = g.a(context, "babel_select_adjacent_maximum_count", 10);
        cursor.moveToPosition(i1);
        l2 = cursor.getLong(6);
        j1 = 0;
        l3 = l2;
        do
        {
            if (!cursor.moveToNext())
            {
                break;
            }
            obj = dqc.values()[cursor.getInt(8)];
            dqb1 = dqb.values()[cursor.getInt(7)];
            l4 = cursor.getLong(6);
            l1 = cursor.getInt(33);
            if (!a(((dqc) (obj)), dqb1, true) || l4 > l3 + l6)
            {
                break;
            }
            j1++;
            if (j1 > k1 || l1 == 2)
            {
                break;
            }
            cD.put(Long.valueOf(cursor.getLong(0)), Integer.valueOf(dqb1.ordinal()));
            l3 = l4;
        } while (true);
        cursor.moveToPosition(i1);
        j1 = 0;
_L8:
        if (!cursor.moveToPrevious()) goto _L4; else goto _L5
_L5:
        obj = dqc.values()[cursor.getInt(8)];
        dqb1 = dqb.values()[cursor.getInt(7)];
        l3 = cursor.getLong(6);
        l1 = cursor.getInt(33);
        if (!a(((dqc) (obj)), dqb1, true) || l3 < l2 - l6) goto _L4; else goto _L6
_L6:
        j1++;
        if (j1 > k1 || l1 == 2) goto _L4; else goto _L7
_L7:
        cD.put(Long.valueOf(cursor.getLong(0)), Integer.valueOf(dqb1.ordinal()));
        l2 = l3;
          goto _L8
    }

    public void b(long l1)
    {
        l1 /= 1000L;
        l1 = System.currentTimeMillis() - l1;
        if (l1 < 0L)
        {
            cq.setVisibility(8);
            return;
        } else
        {
            cq.setVisibility(0);
            long l2 = SystemClock.elapsedRealtime();
            cq.setBase(l2 - l1);
            cq.start();
            return;
        }
    }

    public void b(String s1)
    {
        if (s1.equals("conversation_error"))
        {
            ay();
        }
    }

    public boolean b()
    {
        return bg;
    }

    public boolean b(cey cey1)
    {
        return aK.b().a(cey1);
    }

    public void c(int i1)
    {
        ((byf)binder.a(byf)).a(context, g.kl, i1);
    }

    public void c(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            bn.a((new StringBuilder(String.valueOf(s1).length() + 2)).append("@").append(s1).append(" ").toString());
        }
    }

    public boolean c()
    {
        return bb;
    }

    public boolean c(cey cey1)
    {
        return bv.a(cey1);
    }

    public int d()
    {
        return aq.a().b;
    }

    public String d(cey cey1)
    {
        return aq.f().d(cey1);
    }

    public void d(String s1)
    {
        RealTimeChatService.c(aK, aq.a().a, s1);
    }

    public String e(cey cey1)
    {
        cey1 = aq.f().b(cey1);
        if (cey1 != null)
        {
            boolean flag;
            if (aq.d() != 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return g.a(cey1, flag);
        } else
        {
            return null;
        }
    }

    public boolean e()
    {
        ark ark1 = aq.a();
        return ark1 != null && !g.e(ark1.b);
    }

    public int f()
    {
        return bF;
    }

    public String f(cey cey1)
    {
        return aq.f().e(cey1);
    }

    public String g(cey cey1)
    {
        cey1 = aq.f().b(cey1);
        if (cey1 != null)
        {
            return g.a(cey1, true);
        } else
        {
            return null;
        }
    }

    protected boolean isEmpty()
    {
        return false;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = (egv)binder.b(egv);
        if (bundle != null)
        {
            bR = bundle.a(context, aK.h(), cj, getResources());
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(ary, aG);
        binder.a(ase, cB);
        cA = ((asa)binder.a(asa)).a(context, lifecycle, getFragmentManager());
        bundle = (bxj)binder.b(bxj);
        if (bundle != null)
        {
            aL = bundle.a(17);
        }
        aV = (dmt)binder.a(dmt);
        aM = (bwf)binder.a(bwf);
        bundle = new avl(this);
        binder.a(atb, bundle);
        binder.a(aus, this);
        binder.a(aye, this);
        int i1 = ((gmo)binder.a(gmo)).a();
        binder.a(bdp, new bdp(((gap)binder.a(gap)).a(i1)));
        an = (ard)binder.a(ard);
        as = ((gow)binder.a(gow)).a(g.kr, au).a(g.ks, av).a(g.kt, aw);
        at = (gqr)binder.a(gqr);
        at.a(this);
        binder.a(azl, new avm(this));
        ((byf)binder.a(byf)).a(context, g.kl, new avn(this));
        ((cia)binder.a(cia)).a(g.kn, new avo(this));
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        String s2;
        boolean flag;
        int i1;
        boolean flag2;
        s2 = null;
        flag = false;
        flag2 = false;
        i1 = menuitem.getItemId();
        if (i1 == h.aE || i1 == h.aR || i1 == h.bJ || i1 == h.aO || i1 == h.fC) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (i1 != 1000) goto _L3; else goto _L2
_L2:
        menuitem = menuitem.getMenuInfo();
        flag1 = flag2;
        if (!(menuitem instanceof android.widget.AdapterView.AdapterContextMenuInfo)) goto _L3; else goto _L4
_L4:
        menuitem = (MessageListItemWrapperView)((android.widget.AdapterView.AdapterContextMenuInfo)menuitem).targetView;
        flag1 = flag2;
        if (menuitem == null) goto _L3; else goto _L5
_L5:
        flag1 = flag2;
        if (!(menuitem.c() instanceof MessageListItemView)) goto _L3; else goto _L6
_L6:
        Object obj = (MessageListItemView)menuitem.c();
        if (i1 != h.aE) goto _L8; else goto _L7
_L7:
        ((ClipboardManager)getActivity().getSystemService("clipboard")).setText(((MessageListItemView) (obj)).e());
_L10:
        flag1 = true;
_L3:
        return flag1;
_L8:
        if (i1 == h.aR)
        {
            ((MessageListItemView) (obj)).a(getActivity());
        } else
        if (i1 == h.bJ)
        {
            drl drl1 = ((MessageListItemView) (obj)).l();
            String s1 = drk.b(context, ((MessageListItemView) (obj)).w());
            i1 = l.cf;
            menuitem = s1;
            if (s1 == null)
            {
                menuitem = "";
            }
            String s3 = getString(i1, new Object[] {
                menuitem
            });
            String s4;
            if (((MessageListItemView) (obj)).e() == null)
            {
                s1 = "";
            } else
            {
                s1 = ((MessageListItemView) (obj)).e().toString();
            }
            if (((MessageListItemView) (obj)).p() == 1)
            {
                flag = true;
            }
            s4 = ((MessageListItemView) (obj)).r();
            if (drl1 != null)
            {
                menuitem = drl1.a;
            } else
            {
                menuitem = null;
            }
            if (drl1 != null)
            {
                s2 = drl1.b;
            }
            i1 = ((MessageListItemView) (obj)).o();
            obj = new Intent("android.intent.action.SEND");
            ((Intent) (obj)).setClass(g.nS, com/google/android/apps/hangouts/phone/ShareIntentActivity);
            ((Intent) (obj)).putExtra("android.intent.extra.TEXT", s1);
            ((Intent) (obj)).putExtra("sms_convs_only", true);
            if (flag)
            {
                ((Intent) (obj)).putExtra("requires_mms", true);
                ((Intent) (obj)).putExtra("uri", s4);
                if (menuitem != null && menuitem.startsWith("//"))
                {
                    s1 = String.valueOf(menuitem);
                    if (s1.length() != 0)
                    {
                        s1 = "Forwarding MMS has attachment URL without valid scheme.".concat(s1);
                    } else
                    {
                        s1 = new String("Forwarding MMS has attachment URL without valid scheme.");
                    }
                    ebw.g("Babel", s1);
                }
                ((Intent) (obj)).putExtra("draft_attachment_url", menuitem);
                ((Intent) (obj)).putExtra("draft_content_type", s2);
                ((Intent) (obj)).putExtra("draft_attachment_count", i1);
                ((Intent) (obj)).putExtra("draft_subject", s3);
            }
            startActivity(((Intent) (obj)));
        } else
        if (i1 == h.aO)
        {
            long l1 = ((MessageListItemView) (obj)).x();
            menuitem = bff.a(null, getString(l.je), getString(l.iB), getString(l.T));
            Bundle bundle = menuitem.getArguments();
            bundle.putLong("row_id", l1);
            menuitem.setArguments(bundle);
            menuitem.setTargetFragment(this, 0);
            menuitem.a(getFragmentManager(), "delete_message");
        } else
        if (i1 == h.fC)
        {
            menuitem = (cia)binder.a(cia);
            Bundle bundle1 = new Bundle();
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(((MessageListItemView) (obj)).m());
            bundle1.putParcelableArrayList("save_media_attachments", arraylist);
            menuitem.a(g.kn, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), 2666, bundle1);
        } else
        if (i1 == 1000)
        {
            ((MessageListItemView) (obj)).d();
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (cg != null)
        {
            cg.a("onCreate");
        }
        cx = new bhd(getActivity());
        cx.a(new avk(this));
        MessageListItemWrapperView.c(false);
        setHasOptionsMenu(true);
        if (bundle != null)
        {
            Object obj = (aih)bundle.getParcelable("conversation_params");
            az = (atd)bundle.getSerializable("call_conversation_type");
            aA = bundle.getInt("call_start_action");
            aB = (aip)bundle.getSerializable("call_participants");
            aC = (ArrayList)bundle.getSerializable("call_contacts");
            aD = bundle.getInt("next_call_contact");
            Object obj1;
            ayv ayv1;
            ani ani1;
            if (az != null)
            {
                af();
                bundle = ((Bundle) (obj));
            } else
            {
                bundle = ((Bundle) (obj));
            }
        } else
        {
            bundle = (aih)getArguments().getParcelable("conversation_parameters");
        }
        aq.a(bundle);
        aH = ((aih) (bundle)).n;
        aI = ((aih) (bundle)).o;
        aK = dbf.e(((gmo)binder.a(gmo)).a());
        ap.a(aK.b());
        aq.f().d(aK, ((aih) (bundle)).a);
        cv = g.a(context, "babel_conversation_messages_limit", 500);
        aW = an();
        aY = ((aih) (bundle)).i;
        aZ = ((aih) (bundle)).j;
        obj1 = context;
        ayv1 = ap;
        ani1 = aK;
        if (((aih) (bundle)).d)
        {
            obj = ((aih) (bundle)).a;
        } else
        {
            obj = null;
        }
        cf = new aym(((Context) (obj1)), ayv1, ani1, ((String) (obj)), ((aih) (bundle)).e);
        if (((aih) (bundle)).h > -1L)
        {
            bH = ((aih) (bundle)).h;
        }
        if (bundle.a() == 1)
        {
            getActivity().getWindow().setSoftInputMode(20);
        }
        obj = String.valueOf(this);
        bundle = String.valueOf(((aih) (bundle)).a);
        obj1 = String.valueOf(getLoaderManager());
        ebw.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 29 + String.valueOf(bundle).length() + String.valueOf(obj1).length())).append("Start loaders for ").append(((String) (obj))).append("(").append(bundle).append(") loader: ").append(((String) (obj1))).toString());
        bundle = getLoaderManager();
        bundle.a(2, null, this);
        bundle.a(0, null, this);
        bundle.a(3, null, this);
    }

    public Animation onCreateAnimation(int i1, boolean flag, int j1)
    {
        if (j1 != 0)
        {
            Animation animation = AnimationUtils.loadAnimation(getActivity(), j1);
            if (animation != null)
            {
                animation.setAnimationListener(new avp(this, flag));
            }
            return animation;
        } else
        {
            return null;
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        aT.a(contextmenu, view, contextmenuinfo, getActivity().getMenuInflater(), (dqd)hgx.b(getContext(), dqd));
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        if (i)
        {
            bundle = O();
            ebw.b("Conv", (new StringBuilder(String.valueOf(bundle).length() + 42)).append("onCreateLoader ").append(i1).append(" conversationId ").append(bundle).toString());
        }
        if (cg != null)
        {
            cg.a((new StringBuilder(24)).append("createLoader:").append(i1).toString());
        }
        if (i1 == 2)
        {
            bundle = new cnh(getActivity(), aK, aW, aql.a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL)", aql.a(), "timestamp desc");
            cw = bundle;
        } else
        if (i1 == 0)
        {
            bundle = new cnh(getActivity(), aK, EsProvider.a(EsProvider.g, aK.h()), and.a, cG, new String[] {
                O()
            }, null);
        } else
        if (i1 == 1)
        {
            bundle = g.a((String[])bf.keySet().toArray(new String[bf.size()]));
            amz amz1 = aq.f();
            amz1.d(aK, bundle);
            ap.f();
            bundle = amz1.a(anb.b);
        } else
        if (i1 == 3)
        {
            bundle = EsProvider.b(aK.h(), O());
            bundle = new cnh(getActivity(), aK, bundle, axq.a, "timestamp>? AND type=?", new String[] {
                Long.toString(bH), Integer.toString(17)
            }, null);
        } else
        {
            bundle = null;
        }
        if (i)
        {
            String s1 = String.valueOf(bundle);
            ebw.b("Conv", (new StringBuilder(String.valueOf(s1).length() + 39)).append("onCreateLoader: id=").append(i1).append(", loader=").append(s1).toString());
        }
        return bundle;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        int i1 = 0;
        super.onCreateOptionsMenu(menu, menuinflater);
        if (!P())
        {
            menuinflater.inflate(g.hr, menu);
            if (!ay)
            {
                ay = true;
                for (; i1 < 2; i1++)
                {
                    menu = (new Class[] {
                        atm, atl
                    })[i1];
                    binder.b(menu);
                }

            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(g.fp, viewgroup, false);
        if (((aro)binder.a(aro)).a(aK.h(), O()))
        {
            cm = true;
        }
        bi = (ViewGroup)view.findViewById(h.fs);
        bj = new awd(this);
        Object obj = getChildFragmentManager().a(ata.getName());
        viewgroup = ((ViewGroup) (obj));
        if (obj == null)
        {
            viewgroup = auk.c();
            getChildFragmentManager().a().a(h.z, viewgroup, ata.getName()).b();
        }
        bo = (ata)viewgroup;
        bp = view.findViewById(h.z);
        bk = (FloatingButtonWithCounter)view.findViewById(h.bC);
        bk.bringToFront();
        bk.a(new awk(this));
        new axt(this, ((ViewGroup)getActivity().findViewById(0x1020002)).getChildAt(0));
        viewgroup = (ViewGroup)view.findViewById(h.ag);
        bn = new aut(getContext(), layoutinflater);
        viewgroup.addView(bn, new android.view.ViewGroup.LayoutParams(-1, -2));
        bn.a(ao);
        bn.a(aK);
        h = (ListView)view.findViewById(0x102000a);
        aT = new avd(getContext(), (ListView)h);
        obj = new awp(this);
        bn.a(((ava) (obj)));
        aU = new bdj(view, context);
        if (bundle != null)
        {
            aU.b(bundle);
            bO = bundle.getBoolean("share_intent_processed");
        }
        if (cm)
        {
            viewgroup.setVisibility(8);
            bk.setVisibility(8);
            if (bp != null)
            {
                bp.setVisibility(8);
            }
        }
        bv = (ParticipantsGalleryView)view.findViewById(h.et);
        bv.e();
        bv.a(aq.d(), aK);
        bv.a(new axz(this));
        aA();
        viewgroup = new bhc(view, ar);
        bundle = new blc(view, this, ar);
        obj = new bke(view, this, ar);
        bkz bkz1 = new bkz(view, this, ar);
        bfq bfq1 = new bfq(view, this, ar);
        bfh bfh1 = new bfh(view, this, ar);
        atn atn1 = new atn(view, this, ar);
        bkk bkk1 = new bkk(view, a, ar);
        cs = (new aug[] {
            viewgroup, bundle, obj, bfh1, new atp(view, b, ar, aK.h()), atn1, bkk1, bfq1, bkz1, new bkx(view, c, ar)
        });
        ct = new ble(view, this);
        viewgroup = aq.b();
        if (viewgroup != null && ((aih) (viewgroup)).l.size() > 0)
        {
            gbh.a("The saved snackbar shown size should equal the current list of snackbar.", Integer.valueOf(cs.length), Integer.valueOf(((aih) (viewgroup)).l.size()));
            viewgroup = ((aih) (viewgroup)).l.iterator();
            for (int i1 = 0; viewgroup.hasNext(); i1++)
            {
                bundle = (Boolean)viewgroup.next();
                cs[i1].a = g.a(bundle, false);
            }

        }
        bt = (ImageView)view.findViewById(h.gi);
        aQ = new azq(this, aK, bt);
        aR = new azu(context);
        aS = new ayw(context);
        view.findViewById(h.Y).setOnClickListener(new awe(this));
        cq = (Chronometer)view.findViewById(h.ac);
        cr = (FixedParticipantsView)view.findViewById(h.cs);
        ((ViewGroup)view.findViewById(h.em)).setLayoutTransition(new LayoutTransition());
        bi.setLayoutTransition(new LayoutTransition());
        viewgroup = layoutinflater.inflate(g.gD, null);
        ((ListView)h).addHeaderView(viewgroup);
        layoutinflater = layoutinflater.inflate(g.gF, h, false);
        ((ListView)h).addHeaderView(layoutinflater);
        bq = viewgroup.findViewById(h.dt);
        ax();
        ck = new MessageListAnimationManager(h, cd, bx);
        g = new aqd(this, h, ck, aq.d(), P());
        ((aqd)g).a(new awf(this));
        ((ListView)h).setAdapter(g);
        if (!g.a(context, "babel_force_gb_copy_paste_textview", true))
        {
            ((ListView)h).setChoiceMode(0);
        } else
        {
            registerForContextMenu(h);
        }
        ((ListView)h).setOnScrollListener(new awg(this));
        ((ListView)h).setRecyclerListener(new awi(this));
        br = view.findViewById(h.gk);
        bs = (EditText)view.findViewById(h.gj);
        bs.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(dqv.a().t())
        });
        view.findViewById(h.aP).setOnClickListener(new awj(this));
        by = (EasterEggView)view.findViewById(h.bd);
        if (!fwz.a(getActivity().getContentResolver(), "babel_easter_eggs", true))
        {
            by.setVisibility(8);
            by = null;
        }
        bz = (ProximityCoverView)view.findViewById(h.D);
        showContent(view);
        getActivity().p_();
        ap.a(cE);
        return view;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((MessageListItemView)iterator.next()).j()) { }
        bn.d();
        ap.b(cE);
        cx.b();
        bv.a(null);
    }

    public void onFinished(FrameSequenceDrawable framesequencedrawable)
    {
        bt.setVisibility(8);
        framesequencedrawable = (FrameSequenceDrawable)bt.getDrawable();
        framesequencedrawable.stop();
        framesequencedrawable.destroy();
        bt.setImageDrawable(null);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        ani ani1;
        obj = (Cursor)obj;
        ani1 = ((cnh)em1).C();
        if (TextUtils.equals(ani1.a(), aK.a())) goto _L2; else goto _L1
_L1:
        ebw.f("Conv", "onLoadFinished called for non-fragment account");
_L9:
        return;
_L2:
        int j1;
        if (cg != null)
        {
            ebx ebx1 = cg;
            String s2 = String.valueOf(em1);
            ebx1.a((new StringBuilder(String.valueOf(s2).length() + 15)).append("onLoadFinished:").append(s2).toString());
        }
        j1 = em1.o();
        j1;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 493
    //                   1 523
    //                   2 477
    //                   3 532;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        int i1;
        if (cg != null)
        {
            cg.a("onLoadFinished2");
        }
        gbh.b(aK);
        if (P())
        {
            if (i)
            {
                ebw.b("Babel", "tryRunConversationVariantsEngine -- INVITE");
            }
            i1 = 0;
        } else
        if (aq.d() == 1 && M() == null)
        {
            if (i)
            {
                ebw.b("Babel", "tryRunConversationVariantsEngine -- NO ROOT");
            }
            if (cg != null)
            {
                cg.a("notReady:noRoot");
            }
            i1 = 0;
        } else
        if (bf.isEmpty())
        {
            if (i)
            {
                ebw.b("Babel", "tryRunConversationVariantsEngine -- NO MERGED IDS");
            }
            if (cg != null)
            {
                cg.a("notReady:noMerged");
            }
            i1 = 0;
        } else
        if (aX == null)
        {
            if (i)
            {
                ebw.b("Babel", "tryRunConversationVariantsEngine -- NO MERGE KEY");
            }
            if (cg != null)
            {
                cg.a("notReady:noKey");
            }
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (i1 != 0)
        {
            if (i)
            {
                ebw.b("Babel", "Running conversation variant engine");
            }
            if (cg != null)
            {
                cg.a("runCve");
            }
            int l1;
            if (ch)
            {
                ebw.e("Babel", "Skipping variant computation; already ran");
            } else
            {
                ch = true;
                em1 = new axa(this);
                obj = String.valueOf(this);
                String s1 = String.valueOf(getLoaderManager());
                ebw.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 37 + String.valueOf(s1).length())).append("Starting variant engine for ").append(((String) (obj))).append(" loader: ").append(s1).toString());
                if (aL != null)
                {
                    aL.a("conversation_variant_engine_computation");
                    ap.a(new axc(this));
                }
                cf.a(aq.d(), aX, bf.values(), em1);
            }
        }
        em1 = getActivity();
        if (em1 != null)
        {
            em1.p_();
        }
        cb[j1] = true;
        if (!bP) goto _L9; else goto _L8
_L8:
        em1 = cb;
        j1 = em1.length;
        i1 = 0;
_L19:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_910;
        }
        if (em1[i1] != 0) goto _L11; else goto _L10
_L10:
        i1 = 0;
_L23:
        if (i1 == 0) goto _L9; else goto _L12
_L12:
        bx.removeCallbacks(ca);
        showContent(getView());
        if (aq.d() != 1 || g.a(coy.b)) goto _L14; else goto _L13
_L13:
        i1 = g.a(context, "babel_max_outgoing_message_search_rows", 50);
        if (i1 <= 0) goto _L14; else goto _L15
_L15:
        em1 = ((aqd)g).a();
        if (em1 == null || !em1.moveToLast()) goto _L14; else goto _L16
_L16:
        l1 = em1.getInt(36);
_L21:
        if (dqc.values()[em1.getInt(8)] != dqc.b) goto _L18; else goto _L17
_L17:
        i1 = em1.getInt(36);
_L22:
        int k1;
        if (l1 == 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0)
        {
            if (i1 == 0)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (k1 == 0 && g.e(l1) != g.e(i1))
            {
                bc = true;
                ac();
            }
        }
_L14:
        bP = false;
        return;
_L6:
        a(em1, new azt(((Cursor) (obj))));
          goto _L3
_L4:
        c(((Cursor) (obj)), ani1);
        if (!bf.isEmpty())
        {
            getLoaderManager().b(1, null, this);
        }
          goto _L3
_L5:
        a(((Cursor) (obj)), ani1);
          goto _L3
_L7:
        if (I())
        {
            b(((Cursor) (obj)), ani1);
        } else
        {
            bJ = ((Cursor) (obj));
        }
          goto _L3
_L11:
        i1++;
          goto _L19
_L18:
        k1 = i1 - 1;
        if (!em1.moveToPrevious())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = k1;
        if (k1 > 0) goto _L21; else goto _L20
_L20:
        i1 = 0;
          goto _L22
        i1 = 1;
          goto _L23
    }

    public void onLoaderReset(em em1)
    {
        ((aqd)g).a(null);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        if (P())
        {
            return false;
        }
        if (menuitem.getItemId() == 0x102002c)
        {
            bu.a(getActivity());
            return true;
        }
        Object obj1 = aq.a();
        if (obj1 == null)
        {
            return false;
        }
        if (menuitem.getItemId() == h.fJ)
        {
            bwr bwr1 = bwr.a;
            menuitem = az();
            if (menuitem != null)
            {
                ap.a(menuitem);
                return true;
            }
            obj1 = aq.a();
            menuitem = ((ark) (obj1)).e;
            if (((ark) (obj1)).h != null)
            {
                menuitem = g.a(((ark) (obj1)).h, true);
            }
            (new bwn(aK, menuitem, ((ark) (obj1)).e, ((ark) (obj1)).a, bwr1, context)).a(getFragmentManager());
            return true;
        }
        if (menuitem.getItemId() == h.fT)
        {
            if (((ark) (obj1)).a != null)
            {
                String as1[] = (String[])bf.keySet().toArray(new String[bf.size()]);
                int i1 = aq.d();
                String s1;
                Intent intent;
                ani ani2;
                String s2;
                String s3;
                String s4;
                String s5;
                int k1;
                int l1;
                long l2;
                boolean flag1;
                if (i1 == 2)
                {
                    s1 = null;
                    menuitem = null;
                } else
                {
                    s1 = ((ark) (obj1)).h.c();
                    menuitem = ((ark) (obj1)).h.b();
                }
                ani2 = aK;
                s2 = ((ark) (obj1)).a;
                s3 = aq.e();
                k1 = d();
                l1 = aN;
                l2 = bB;
                flag1 = ci;
                s4 = aY;
                s5 = aZ;
                intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/ConversationParticipantsActivity);
                intent.putExtra("account_id", ani2.h());
                intent.putExtra("conversation_id", s2);
                intent.putExtra("conversation_name", s3);
                intent.putExtra("client_conversation_type", i1);
                intent.putExtra("transport_type", k1);
                intent.putExtra("notification_level", l1);
                intent.putExtra("latest_timestamp", l2);
                intent.putExtra("has_unknown_sender", flag1);
                intent.putExtra("chat_ringtone_uri", s4);
                intent.putExtra("hangout_ringtone_uri", s5);
                intent.putExtra("merged_conversation_ids", as1);
                intent.putExtra("preferred_chat_id", s1);
                intent.putExtra("preferred_gaia_id", menuitem);
                menuitem = (Intent)getActivity().getIntent().getParcelableExtra("share_intent");
                if (menuitem != null)
                {
                    menuitem.putExtra("conversation_id", ((ark) (obj1)).a);
                    intent.putExtra("share_intent", menuitem);
                }
                as.a(g.kr, intent);
                return true;
            } else
            {
                return true;
            }
        }
        if (menuitem.getItemId() == h.t)
        {
            menuitem = ah();
            gbh.b(menuitem);
            menuitem = g.r(menuitem);
            getActivity().startActivityForResult(menuitem, 102);
            return true;
        }
        if (menuitem.getItemId() == h.fb)
        {
            ani ani1;
            Collection collection;
            boolean flag;
            if (aq.d() == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ani1 = aK;
            obj1 = aq.a().a;
            collection = ap.g();
            if (flag)
            {
                menuitem = cnd.d;
            } else
            {
                menuitem = cnd.c;
            }
            startActivity(g.a(ani1, ((String) (obj1)), collection, menuitem, aB()));
            return true;
        }
        if (menuitem.getItemId() == h.fi)
        {
            d(1);
            return true;
        }
        if (menuitem.getItemId() == h.fj)
        {
            d(2);
            return true;
        }
        if (menuitem.getItemId() == h.gc)
        {
            g.a(aK, 1535);
            a(atd.d);
            return true;
        }
        if (menuitem.getItemId() == h.eX)
        {
            g.a(aK, 1534);
            a(atd.c);
            return true;
        }
        if (menuitem.getItemId() == h.fg || menuitem.getItemId() == h.eW)
        {
            ArrayList arraylist = new ArrayList();
            Object obj = new ArrayList();
            a(new avs(this, arraylist, ((ArrayList) (obj))));
            String as2[] = (String[])arraylist.toArray(new String[arraylist.size()]);
            long al1[] = new long[((ArrayList) (obj)).size()];
            for (int j1 = 0; j1 < ((ArrayList) (obj)).size(); j1++)
            {
                al1[j1] = g.a((Long)((ArrayList) (obj)).get(j1), 0L);
            }

            obj = aK;
            boolean flag2;
            if (menuitem.getItemId() == h.eW)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            RealTimeChatService.a(((ani) (obj)), as2, al1, flag2, false);
            bx.postDelayed(new avt(this, ((ark) (obj1))), 250L);
            return true;
        }
        if (menuitem.getItemId() == h.eY)
        {
            if (aK != null)
            {
                displayDeleteConversationDialog(aK.h());
                return true;
            } else
            {
                ebw.f("Conv", "ConversationFragment delete failed because of null account.");
                return true;
            }
        }
        if (menuitem.getItemId() == h.fc)
        {
            if (aK != null)
            {
                menuitem = bff.a(getString(l.iY), getString(l.iX), getString(l.iW), getString(l.jv));
                menuitem.setTargetFragment(this, 0);
                menuitem.a(getFragmentManager(), "leave_conversation");
                return true;
            } else
            {
                ebw.f("Conv", "ConversationFragment leave failed because of null account.");
                return true;
            }
        }
        if (menuitem.getItemId() == h.fm)
        {
            RealTimeChatService.b(aK, (String[])bf.keySet().toArray(new String[bf.size()]));
            return true;
        }
        if (menuitem.getItemId() == h.aK)
        {
            (new atr(getActivity())).a(aK).a(aX).a(M()).a(((ark) (obj1))).a().show();
            return true;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        bx.removeCallbacks(cl);
        bx.removeCallbacks(ca);
        Iterator iterator = bw.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            iterator.remove();
            obj = a((cey)((java.util.Map.Entry) (obj)).getKey());
            if (obj != null)
            {
                bv.a(((ceu) (obj)), 4, true);
            }
        } while (true);
        ((aqd)g).c();
        ax();
        for (Iterator iterator1 = e.iterator(); iterator1.hasNext(); ((MessageListItemView)iterator1.next()).i()) { }
        if (by != null)
        {
            by.a();
        }
        ecz.b = null;
        bz.d();
        bz.e();
        bz.b();
        for (Iterator iterator2 = e.iterator(); iterator2.hasNext(); ((MessageListItemView)iterator2.next()).z()) { }
        ad();
        bi.removeOnLayoutChangeListener(bj);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        if (getActivity() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        MenuItem menuitem = menu.findItem(h.eW);
        MenuItem menuitem1 = menu.findItem(h.fg);
        boolean flag1;
        if (menuitem != null)
        {
            int ai1[];
            int i1;
            int k1;
            if (!cp && !cm)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            menuitem.setVisible(flag1);
        }
        if (menuitem1 != null)
        {
            if (cp && !cm)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            menuitem1.setVisible(flag1);
        }
        if (!ci)
        {
            break; /* Loop/switch isn't completed */
        }
        ai1 = aJ;
        k1 = ai1.length;
        i1 = 0;
        while (i1 < k1) 
        {
            menuitem1 = menu.findItem(ai1[i1]);
            if (menuitem1 != null)
            {
                menuitem1.setVisible(false);
            }
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj = aq.a();
        if (obj == null)
        {
            menu = String.valueOf(this);
            obj = String.valueOf(getLoaderManager());
            ebw.f("Babel", (new StringBuilder(String.valueOf(menu).length() + 52 + String.valueOf(obj).length())).append("variant not set when preparing options for ").append(menu).append(" loader: ").append(((String) (obj))).toString());
            return;
        }
        if (P())
        {
            super.onPrepareOptionsMenu(menu);
            return;
        }
        Object obj1 = menu.findItem(h.t);
        Object obj2;
        MenuItem menuitem2;
        MenuItem menuitem3;
        int j1;
        boolean flag;
        int l1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (ah() != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj1)).setVisible(flag2);
        obj1 = menu.findItem(h.fd);
        if (obj1 != null)
        {
            ((MenuItem) (obj1)).setVisible(false);
        }
        obj1 = menu.findItem(h.fh);
        if (obj1 != null)
        {
            ((MenuItem) (obj1)).setVisible(false);
        }
        obj1 = menu.findItem(h.fi);
        obj2 = menu.findItem(h.fj);
        menuitem2 = menu.findItem(h.fb);
        menuitem3 = menu.findItem(h.fJ);
        flag3 = g.e(d());
        l1 = aq.d();
        if (menuitem2 != null)
        {
            boolean flag6;
            if (aK != null && aK.n())
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (bh && j1 == 0 && (!flag3 || l1 != 2 && drk.a(aK.h(), d())) && !ci)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0 && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            menuitem2.setEnabled(flag2);
            if (j1 != 0 && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            menuitem2.setVisible(flag2);
            if (l1 == 2)
            {
                j1 = l.iJ;
            } else
            if (flag3)
            {
                j1 = l.gS;
            } else
            {
                j1 = l.iL;
            }
            menuitem2.setTitle(j1);
        }
        if (g.a(context, "babel_enable_viral_flow_v1", true) && dbf.c().length > 0 && l1 != 2 && az() == null)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0 && flag3)
        {
            if (!cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            menuitem3.setVisible(flag2);
        } else
        {
            menuitem3.setVisible(false);
        }
        if (g.b(aK))
        {
            if (bV == 2 && !flag3)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (bV == 1 && !flag3)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag2 && !cm)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            ((MenuItem) (obj1)).setVisible(flag4).setEnabled(flag2);
            if (flag3 && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj2)).setVisible(flag2).setEnabled(flag3);
        } else
        {
            ((MenuItem) (obj1)).setVisible(false);
            ((MenuItem) (obj2)).setVisible(false);
        }
        obj2 = menu.findItem(h.eY);
        menuitem2 = menu.findItem(h.fc);
        obj1 = menu.findItem(h.fm);
        if (l1 == 2 && !g.e(d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj2 != null)
        {
            if (!flag && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj2)).setVisible(flag2);
        }
        if (menuitem2 != null)
        {
            if (flag && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            menuitem2.setVisible(flag2);
        }
        obj2 = ap.e();
        if (obj2 != null && ((Collection) (obj2)).size() > 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (obj1 != null)
        {
            ((MenuItem) (obj1)).setVisible(flag2);
        }
        obj2 = menu.findItem(h.gc);
        obj1 = ae();
        if ((obj1 == Boolean.TRUE || j1 != 0) && !cm)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj2)).setEnabled(flag2);
        if ((obj1 != Boolean.FALSE || j1 != 0) && !cm)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj2)).setVisible(flag2);
        obj2 = menu.findItem(h.eX);
        if (obj2 != null)
        {
            boolean flag5;
            if (obj1 == Boolean.TRUE)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (v() && ((dan)binder.a(dan)).a(getActivity(), aK))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (v() && ebz.e())
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            flag6 = cx.a();
            if (flag4 || flag5 && flag6)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (aq.d() != 1)
            {
                ebw.c("Conv", "hasParticipantPhoneNumber: Not 1:1 client conversation type");
                flag2 = false;
            } else
            if (!g.f(d()) && !g.e(d()))
            {
                ebw.c("Conv", "hasParticipantPhoneNumber: Not Babel or SMS transport");
                flag2 = false;
            } else
            {
                flag2 = ap.h();
            }
            if (flag2 && j1 != 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            ebw.c("Conv", (new StringBuilder(155)).append("hasHangoutsCallOption: ").append(flag3).append(" supportsPhoneCallsOverVoip: ").append(flag4).append(" supportsPhoneCallsOverPstn: ").append(flag5).append(" hasCellularService: ").append(flag6).append(" hasParticipantPhoneNumber: ").append(flag2).toString());
            if ((flag3 || j1 != 0) && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj2)).setVisible(flag2);
        }
        obj1 = menu.findItem(h.fT);
        if (obj1 != null)
        {
            if (obj != null || l1 == 2)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0 && !cm)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj1)).setVisible(flag2);
        }
        obj = menu.findItem(h.aK);
        if (obj != null)
        {
            flag2 = ebr.a();
            ((MenuItem) (obj)).setVisible(flag2).setEnabled(flag2);
        }
        super.onPrepareOptionsMenu(menu);
        return;
    }

    public void onResume()
    {
        super.onResume();
        aA();
        bx.post(cl);
        bx.postDelayed(cl, 31000L);
        if (((aqd)g).a() == null)
        {
            showEmptyViewProgress(getView());
        }
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((MessageListItemView)iterator.next()).h()) { }
        bz.a(new avu(this));
        bz.a(new avv(this));
        if (ao())
        {
            bz.a();
        }
        ap();
        ecz.b = new avw(this);
        bi.addOnLayoutChangeListener(bj);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        boolean flag = true;
        super.onSaveInstanceState(bundle);
        Object obj = aq.a();
        int i1 = aq.d();
        aug aaug[];
        int j1;
        if (obj != null && ((ark) (obj)).a != null)
        {
            obj = new aih(((ark) (obj)).a, i1, ((ark) (obj)).b);
            obj.d = true;
            obj.e = true;
        } else
        {
            aih aih1 = aq.b();
            obj = new aih(aih1.a, i1, aih1.c);
            obj.d = aih1.d;
            obj.e = aih1.e;
        }
        aaug = cs;
        j1 = aaug.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            aug aug1 = aaug[i1];
            ((aih) (obj)).l.add(Boolean.valueOf(aug1.a));
        }

        obj.g = aq.e();
        obj.h = bH;
        obj.i = aY;
        obj.j = aZ;
        if (getActivity() == null || !getActivity().isChangingConfigurations())
        {
            flag = false;
        }
        obj.n = flag;
        obj.o = aI;
        bundle.putParcelable("conversation_params", ((android.os.Parcelable) (obj)));
        bundle.putSerializable("call_conversation_type", az);
        bundle.putInt("call_start_action", aA);
        bundle.putSerializable("call_participants", aB);
        bundle.putSerializable("call_contacts", aC);
        bundle.putInt("next_call_contact", aD);
    }

    public void onStart()
    {
        super.onStart();
        RealTimeChatService.a(aP);
        ((aqd)g).d_();
    }

    public void onStop()
    {
        super.onStop();
        RealTimeChatService.b(aP);
    }

    public ceu q()
    {
        return bG;
    }

    public void r()
    {
        bG = null;
    }

    public long s()
    {
        return bE;
    }

    public boolean t()
    {
        return bc;
    }

    public boolean u()
    {
        return isResumed();
    }

    public boolean v()
    {
        return aK.ad();
    }

    public boolean w()
    {
        return !NetworkStateReceiver.a();
    }

    public boolean x()
    {
        return !a(context);
    }

    public boolean y()
    {
        return g.d(d());
    }

    public void z()
    {
        aN = 30;
        String s1;
        for (Iterator iterator = bf.keySet().iterator(); iterator.hasNext(); RealTimeChatService.a(aK, s1, aN))
        {
            s1 = (String)iterator.next();
        }

        axv.a(cu);
    }

    static 
    {
        hik hik = ebw.e;
        hik = ebw.v;
        aJ = (new int[] {
            h.t, h.fb, h.fm, h.fc
        });
        aq();
        g.a(g.nS).a(new avx());
    }
}
