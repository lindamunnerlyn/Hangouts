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
import android.widget.FrameLayout;
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
import com.google.android.apps.hangouts.service.GcmStateReceiver;
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

public final class avv extends bib
    implements android.support.rastermill.FrameSequenceDrawable.OnFinishedListener, ara, auf, avj, ays, ayu, azz, bao, bfs, bfu, bge, bkr, blk, blm, blp, br, eic, gvb
{

    private static final int aJ[];
    private static long ak;
    private static String cA = "(select merge_key from merge_keys where merge_keys.conversation_id=conversations.conversation_id)  IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)";
    private static final boolean h = false;
    private static final efh i = efh.a("ConvFrag");
    auh a;
    private int aA;
    private aii aB;
    private ArrayList aC;
    private int aD;
    private asm aE;
    private int aF;
    private final asn aG = new axh(this);
    private boolean aH;
    private boolean aI;
    private aoa aK;
    private bye aL;
    private gdd aM;
    private int aN;
    private int aO;
    private final dhy aP = new ayp(this);
    private baf aQ;
    private baj aR;
    private azk aS;
    private avu aT;
    private dpn aU;
    private Uri aV;
    private String aW;
    private String aX;
    private String aY;
    private String aZ;
    private Runnable aj;
    private int al;
    private aru am;
    private dvf an;
    private bax ao;
    private final azj ap;
    private final ayt aq;
    private final azo ar;
    private gte as;
    private gvc at;
    private final gtd au = new avw(this);
    private final gtd av = new awh(this);
    private final gtd aw = new awt(this);
    private long ax;
    private boolean ay;
    private atu az;
    blh b;
    private ProximityCoverView bA;
    private long bB;
    private long bC;
    private int bD;
    private String bE;
    private long bF;
    private int bG;
    private cfz bH;
    private long bI;
    private long bJ;
    private Cursor bK;
    private aqn bL;
    private String bM;
    private boolean bN;
    private int bO;
    private boolean bP;
    private cfz bQ;
    private eia bR;
    private final avt bS = new avt();
    private ayv bT;
    private azy bU;
    private final Runnable bV = new axy(this);
    private final boolean bW[] = new boolean[4];
    private Runnable bX;
    private final eie bY = new ayb(this);
    private final List bZ = new ArrayList();
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private boolean bd;
    private atn be;
    private ad bf;
    private final gz bg = new gz();
    private boolean bh;
    private boolean bi;
    private ViewGroup bj;
    private android.view.View.OnLayoutChangeListener bk;
    private FloatingButtonWithCounter bl;
    private List bm;
    private int bn;
    private avk bo;
    private atq bp;
    private View bq;
    private View br;
    private View bs;
    private EditText bt;
    private ImageView bu;
    private View bv;
    private ParticipantsGalleryView bw;
    private final eec bx = new eec();
    private final Handler by = new Handler();
    private EasterEggView bz;
    aym c;
    private aza ca;
    private boolean cb;
    private boolean cc;
    private bid cd;
    private MessageListAnimationManager ce;
    private final Runnable cf = new axz(this);
    private boolean cg;
    private any ch;
    private boolean ci;
    private boolean cj;
    private Chronometer ck;
    private FixedParticipantsView cl;
    private aux cm[];
    private auy cn;
    private ayj co;
    private int cp;
    private coz cq;
    private bhp cr;
    private dcc cs;
    private final bag ct;
    private ass cu;
    private final ast cv = new avz(this);
    private final Runnable cw = new awr(this);
    private final Map cx = new gz();
    private asc cy;
    private final TextWatcher cz = new axs(this);
    final List d = new ArrayList();

    public avv()
    {
        new eet(getClass().getSimpleName(), getLifecycle());
        al = -1;
        an = new dvf();
        ap = (new azj()).a(binder);
        aq = (new ayw(context, this, lifecycle)).a(binder);
        ar = (new azo(this, lifecycle)).a(binder);
        bm = new ArrayList();
        bn = -1;
        a = new axw(this);
        b = new axx(this);
        cc = false;
        co = new ayj(this);
        ct = new bag(context, new avx(this));
        (new aya(this)).a(binder);
        bS.a(binder);
        aq.a(new anr(new avy(this)));
        cy = new axm(this);
    }

    static gz A(avv avv1)
    {
        return avv1.bg;
    }

    static bid B(avv avv1)
    {
        return avv1.cd;
    }

    static List C(avv avv1)
    {
        return avv1.bZ;
    }

    static ParticipantsGalleryView D(avv avv1)
    {
        return avv1.bw;
    }

    static eec E(avv avv1)
    {
        return avv1.bx;
    }

    static Runnable F(avv avv1)
    {
        return avv1.cf;
    }

    static Handler G(avv avv1)
    {
        return avv1.by;
    }

    static Uri H(avv avv1)
    {
        return avv1.am();
    }

    static atn I(avv avv1)
    {
        return avv1.be;
    }

    static void J(avv avv1)
    {
        avv1.at();
    }

    static coy K(avv avv1)
    {
        return avv1.f;
    }

    static FixedParticipantsView L(avv avv1)
    {
        return avv1.cl;
    }

    static EasterEggView M(avv avv1)
    {
        return avv1.bz;
    }

    static String N(avv avv1)
    {
        return avv1.aW;
    }

    static void O(avv avv1)
    {
        avv1.ad();
    }

    static hlt P(avv avv1)
    {
        return avv1.context;
    }

    static hlp Q(avv avv1)
    {
        return avv1.binder;
    }

    static hlt R(avv avv1)
    {
        return avv1.context;
    }

    static void S(avv avv1)
    {
        boolean flag1 = true;
        if (avv1.bU.a(avv1.getChildFragmentManager()))
        {
            i.b("sendMessageUiLatency");
            if (avv1.bo.i() && avv1.aq.g().size() > 0)
            {
                g.a(avv1.aK, 2324);
            }
            avv1.bo.j();
            jsh jsh1 = avv1.aq.g();
            jyh jyh;
            boolean flag;
            if (avv1.aq.a() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jyh = jsh1.a();
            do
            {
                if (!jyh.hasNext())
                {
                    break;
                }
                ato ato1 = (ato)jyh.next();
                if (!flag && !l.b(ato1.a))
                {
                    continue;
                }
                (new bak(avv1.context, jsh1, avv1)).execute(new Void[0]);
                flag = flag1;
                break;
            } while (true);
            if (flag || avv1.b(jsh1))
            {
                avv1.au();
            }
            avv1.aq.h();
        }
    }

    static hlp T(avv avv1)
    {
        return avv1.binder;
    }

    static gte U(avv avv1)
    {
        return avv1.as;
    }

    static boolean U()
    {
        return an();
    }

    static dpn V(avv avv1)
    {
        return avv1.aU;
    }

    static void V()
    {
        ap();
    }

    static baj W(avv avv1)
    {
        return avv1.aR;
    }

    static boolean W()
    {
        return h;
    }

    static long X()
    {
        return ak;
    }

    static Runnable X(avv avv1)
    {
        return avv1.bX;
    }

    static Runnable Y(avv avv1)
    {
        avv1.bX = null;
        return null;
    }

    static ProximityCoverView Z(avv avv1)
    {
        return avv1.bA;
    }

    static int a(avv avv1, int i1)
    {
        avv1.bn = i1;
        return i1;
    }

    static Uri a(avv avv1, Uri uri)
    {
        avv1.aV = uri;
        return uri;
    }

    static dcc a(avv avv1, dcc dcc1)
    {
        avv1.cs = dcc1;
        return dcc1;
    }

    static hlt a(avv avv1)
    {
        return avv1.context;
    }

    static Runnable a(avv avv1, Runnable runnable)
    {
        avv1.aj = runnable;
        return runnable;
    }

    private String a(aoa aoa1, String s1, String s2, String s3, boolean flag, ato ato1)
    {
        String s4 = aow.g();
        at.a(new bef(context, aoa1, s1, s2, ato1, 0, s3, flag, s4, SystemClock.elapsedRealtime()));
        return s4;
    }

    private void a(Cursor cursor, aoa aoa1)
    {
        int i1;
        if (h)
        {
            String s1 = aq.e();
            Object obj1 = aq.a();
            Object obj2 = String.valueOf("onConversationParticipantsLoaderFinished() mConversationId=");
            Object obj3 = String.valueOf(O());
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
                obj1 = Integer.valueOf(((asa) (obj1)).b);
            } else
            {
                obj1 = "not set";
            }
            obj1 = String.valueOf(obj1);
            eev.b("Conv", (new StringBuilder(String.valueOf(obj2).length() + 17 + String.valueOf(obj3).length() + String.valueOf(s2).length() + String.valueOf(s1).length() + String.valueOf(obj1).length())).append(((String) (obj2))).append(((String) (obj3))).append(": this=").append(s2).append(s1).append(" variant: ").append(((String) (obj1))).toString());
        }
        ap.e();
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
                    obj3 = anr.a(aoa1, cursor);
                    obj1 = cursor.getString(12);
                    a(((cfz) (obj3)), ((String) (obj1)));
                    if (((cfz) (obj3)).h() && !TextUtils.isEmpty(((cfz) (obj3)).f()))
                    {
                        ((List) (obj2)).add(((cfz) (obj3)).f());
                    }
                    if (h)
                    {
                        s2 = String.valueOf(obj3);
                        eev.b("Conv", (new StringBuilder(String.valueOf(s2).length() + 31 + String.valueOf(obj1).length())).append("Participant: ").append(s2).append(" Conversation Id: ").append(((String) (obj1))).toString());
                    }
                    ap.a(((String) (obj1))).add(obj3);
                    if (eey.j(((cfz) (obj3)).c))
                    {
                        s1 = ((cfz) (obj3)).c;
                    }
                    obj1 = s1;
                    i1 = ((flag) ? 1 : 0);
                    if (((cfz) (obj3)).i())
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
        ct.a(((List) (obj2)));
        if (bo != null && obj1 == null)
        {
            bo.a();
        }
        if (obj1 != null && !dcc.a(context, aoa1.h()))
        {
            cursor = getLoaderManager();
            cursor.a(0);
            cursor.a(1);
            cursor.a(2);
            cursor.a(3);
            dcc.a(getContext(), ((String) (obj1)), new awz(this));
            return;
        }
        if (i1 != 0 && (!aoa1.r() || !eey.c()))
        {
            Object obj = (new android.app.AlertDialog.Builder(getActivity())).setTitle(l.fN);
            if (aoa1.Y())
            {
                i1 = l.fT;
            } else
            {
                i1 = l.fM;
            }
            ((android.app.AlertDialog.Builder) (obj)).setMessage(i1).setCancelable(false).setPositiveButton(0x104000a, new axa(this)).show();
        }
        aoa1 = aq.f();
        aoa1.a(cursor);
        ar();
        ac();
        bo.a();
        cursor = bZ.iterator();
        do
        {
            if (!cursor.hasNext())
            {
                break;
            }
            obj = (ayo)cursor.next();
            if (aoa1.a(((ayo) (obj)).b))
            {
                aP.a(((ayo) (obj)).a, ((ayo) (obj)).b, ((ayo) (obj)).c);
            }
        } while (true);
        bZ.clear();
        if (!P())
        {
            at();
        }
        cursor = an;
        if (aq.d() != 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        cursor.a(flag1);
        cc = false;
        cursor = aoa1.b().iterator();
        do
        {
            if (!cursor.hasNext())
            {
                break;
            }
            aoa1 = (cfz)cursor.next();
            if (aoa1.equals(due.h()))
            {
                cc = true;
                aj();
                continue;
            }
            if (aoa1.h() && TextUtils.isEmpty(aoa1.f()))
            {
                cc = true;
                aj();
                continue;
            }
            aoa1 = aoa1.f();
            if (aoa1 == null || !bhv.a(aoa1))
            {
                continue;
            }
            an.c();
            break;
        } while (true);
        aq();
        if (cc)
        {
            bo.h();
            bq.setVisibility(8);
            bl.setVisibility(8);
        }
        bo.a();
        ((ListView)g).invalidateViews();
    }

    private void a(any any1)
    {
        any1.a = aq.a().a;
        Iterator iterator = ap.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            asa asa1 = (asa)iterator.next();
            if (asa1.a != null)
            {
                DraftService.a(getActivity(), aK, asa1.a, any1);
            }
        } while (true);
    }

    private void a(asa asa1, String s1, ato ato1)
    {
        Object obj;
        Object obj1;
        fik fik;
        aoa aoa1;
        String s3;
        boolean flag1;
        if (dcz.a(context, aK.h()))
        {
            s1 = a(aK, asa1.a, s1, an.b(), an.d(), ato1);
            ao.a(asa1.a, s1);
            return;
        }
        ba = true;
        ac();
        as();
        aoa1 = aK;
        if (g.f(d()) && bz != null)
        {
            String s2 = EasterEggView.a(s1);
            if (s2 != null)
            {
                if (EasterEggView.b(s2))
                {
                    RealTimeChatService.b(aK.h(), asa1.a, s2);
                }
                asa1 = bz;
                s1 = aK;
                aK.b();
                asa1.a(s1, s2);
                return;
            }
        }
        int i1 = ((ListView)g).getAdapter().getCount();
        int k1 = i1 - 20;
        if (((ListView)g).getLastVisiblePosition() < k1)
        {
            ((ListView)g).setSelection(k1);
        }
        obj = ((ListView)g).getChildAt(i1 - 1 - ((ListView)g).getFirstVisiblePosition());
        k1 = ((ListView)g).getHeight();
        boolean flag;
        if (i1 > 0 && (obj == null || ((View) (obj)).getBottom() > k1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g.a(context, "babel_extra_log_scrolling", false))
        {
            eev.e("Babel_Scroll", (new StringBuilder(29)).append("sendMessage needsScroll:").append(flag).toString());
        }
        s3 = an.b();
        flag1 = an.d();
        if (ato1 == null)
        {
            break MISSING_BLOCK_LABEL_798;
        }
        axu.b[ato1.c.ordinal()];
        JVM INSTR tableswitch 3 4: default 368
    //                   3 369
    //                   4 631;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        obj1 = (aua)ato1;
        obj = ((aua) (obj1)).e;
        ato1 = ((aua) (obj1)).a;
        obj1 = ((aua) (obj1)).d;
        fik = null;
_L4:
        Object obj2;
        int j1;
        long l1;
        if (flag)
        {
            ((ListView)g).smoothScrollToPosition(((ListView)g).getAdapter().getCount() - 1);
            if (g.a(context, "babel_extra_log_scrolling", false))
            {
                i1 = ((ListView)g).getAdapter().getCount();
                eev.e("Babel_Scroll", (new StringBuilder(46)).append("sendMessage smoothScrollToPosition:").append(i1 - 1).toString());
            }
            bc = true;
            by.postDelayed(new axi(this, aoa1, asa1, s1, ato1, ((String) (obj)), ((String) (obj1)), s3, flag1, fik), 500L);
        } else
        {
            s1 = ((dml)binder.a(dml)).a(aoa1, asa1.a, s1, ato1, 0, ((String) (obj)), 0, 0, ((String) (obj1)), s3, flag1, fik, 0);
            ao.a(asa1.a, s1);
        }
        asa1 = c;
        if (asa1 != null && ((aym) (asa1)).a > 0L && ((aym) (asa1)).b != null && (!((aym) (asa1)).e || ((aym) (asa1)).c != null))
        {
            (new axt(this)).execute(new aym[] {
                asa1
            });
        }
        an.a();
        b(false);
        a(new any());
        getActivity().getIntent().removeExtra("share_intent");
        bb = false;
        ac();
        i.c("sendMessageUiLatency");
        return;
_L3:
        fik = ((atv)ato1).e;
        if (g.e(d()))
        {
            l1 = Math.abs(e.nextLong());
            ato1 = EsProvider.a(aK.h(), l1);
            obj = (bzi)binder.a(bzi);
            obj1 = eep.a(((bzi) (obj)).a(fik));
            j1 = ((bzi) (obj)).a();
            obj = new aqn((new edq(((String) (obj1)), null)).a(j1), aS, true, ato1);
            aU.a(((dor) (obj)));
            obj = ato1.toString();
            if (obj == null)
            {
                ato1 = null;
            } else
            {
                ato1 = "hangouts/location";
            }
        } else
        {
            obj = null;
            ato1 = "hangouts/location";
        }
        obj2 = null;
        obj1 = ato1;
        ato1 = ((ato) (obj));
        obj = obj2;
          goto _L4
        obj = null;
        ato1 = null;
        obj1 = null;
        fik = null;
          goto _L4
    }

    private void a(atu atu1)
    {
        a(atu1, 63, false);
    }

    private void a(atu atu1, int i1, boolean flag)
    {
        boolean flag1;
        if (az == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.d(flag1, "Cannot start a call while one is in progress");
        if (aA == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.d(flag1, "Cannot start a call while one is in progress");
        if (aB == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.d(flag1, "Cannot start a call while one is in progress");
        if (aC == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.d(flag1, "Cannot start a call while one is in progress");
        if (aD == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.d(flag1, "Cannot start a call while one is in progress");
        if (aE == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.d(flag1, "Cannot start a call while one is in progress");
        aB = new aii();
        aC = new ArrayList();
        aD = 0;
        az = atu1;
        aA = i1;
        af();
        atu1 = aq.a();
        if (flag)
        {
            aE.a(((asa) (atu1)).a, 2724);
            return;
        }
        List list = ap.d();
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
            aC.add(amz.a(((asa) (atu1)).h, null, false));
        } else
        {
            atu1 = aq.f().c().iterator();
            while (atu1.hasNext()) 
            {
                cfz cfz1 = (cfz)atu1.next();
                aC.add(amz.a(cfz1, null, false));
            }
        }
        ag();
    }

    static void a(avv avv1, int i1, int j1)
    {
label0:
        {
            if (avv1.bh)
            {
                Cursor cursor = ((aqu)avv1.f).a();
                long l1;
                if (i1 > 0 && cursor != null && !cursor.isClosed() && cursor.moveToPosition(i1 - j1))
                {
                    l1 = cursor.getLong(6);
                } else
                {
                    l1 = 0L;
                }
                avv1.a(((ayi) (new axv(avv1, l1))));
                if (i1 == 0 && avv1.cp == ((aqu)avv1.f).a().getCount())
                {
                    if (avv1.cq == null)
                    {
                        break label0;
                    }
                    avv1.cp = avv1.cp + g.a(avv1.context, "babel_conversation_messages_limit", 500);
                    avv1.aV = avv1.am();
                    avv1.cq.a(avv1.aV);
                    avv1.cq.u();
                }
            }
            return;
        }
        eev.f("Conv", "MessagesLoader is null. Error 22253232");
    }

    static void a(avv avv1, long l1)
    {
        avv1.d(l1);
    }

    static void a(avv avv1, aia aia1)
    {
        aia1.k = avv1.aq.b().k;
        RealTimeChatService.b(avv1.aP);
        avv1.cd.a(aia1);
        avv1.cd = null;
    }

    static void a(avv avv1, Cursor cursor, aoa aoa1)
    {
        avv1.b(cursor, aoa1);
    }

    static void a(avv avv1, View view)
    {
        avv1.showEmptyViewProgress(view);
    }

    static void a(avv avv1, any any1)
    {
        if (any1 != null && !any1.a())
        {
            any1 = any1.b;
            boolean flag;
            if (!avv1.aH)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            avv1.bo.a(any1, flag);
            avv1.bo.a();
        }
    }

    static void a(avv avv1, asa asa1)
    {
        gdv.a("Expected null", asa1.a);
        asa1 = avv1.aq.a();
        Object obj = dbl.a(asa1.e);
        ((dbl) (obj)).a(dbi.b(asa1.e));
        obj = ail.newBuilder().a(((dbl) (obj)));
        obj = aid.newBuilder().a(((aim) (obj)).a()).a();
        dir dir1 = dir.b();
        avv1.al = dir1.a();
        RealTimeChatService.a(dir1, (new ddm(avv1.context)).a(avv1.aK.h()).a(((aid) (obj))).a(aot.c).b(asa1.b).a());
    }

    static void a(avv avv1, ayi ayi1)
    {
        avv1.a(ayi1);
    }

    static void a(avv avv1, String s1)
    {
        avv1.e(s1);
    }

    static void a(avv avv1, String s1, long l1)
    {
        Object obj = null;
        s1 = g.g(s1);
        if (s1 != null)
        {
            obj = s1.iterator();
            if (((Iterator) (obj)).hasNext())
            {
                s1 = (String)((Iterator) (obj)).next();
            } else
            {
                s1 = null;
            }
            if (((Iterator) (obj)).hasNext())
            {
                String s2 = (String)((Iterator) (obj)).next();
                obj = s1;
                s1 = s2;
            } else
            {
                Object obj1 = null;
                obj = s1;
                s1 = obj1;
            }
        } else
        {
            s1 = null;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && (((String) (obj)).startsWith("http://") || ((String) (obj)).startsWith("https://")))
        {
            RealTimeChatService.a(avv1.aK.h(), ((String) (obj)), due.a(s1, "UTF-8"), l1, false);
        }
    }

    static void a(avv avv1, boolean flag)
    {
        avv1.a(flag);
    }

    private void a(ayi ayi1)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = bg.entrySet().iterator(); iterator.hasNext(); ayi1.a((String)entry.getKey(), (ayc)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_68;
        Exception exception;
        exception;
        ayi1.a();
        throw exception;
        ayi1.a();
        return;
    }

    private void a(cfz cfz1, String s1)
    {
        if (aq.d() == 1 && cfz1 != null && cfz1.b.a != null && !cfz1.b.a(aK.b()) && cfz1.a == cgf.b)
        {
            Iterator iterator = bg.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (!TextUtils.isEmpty(cfz1.c))
                {
                    String s3 = aW;
                    String s4 = String.valueOf(eev.b(cfz1.toString()));
                    eev.g("Conv", (new StringBuilder(String.valueOf(s1).length() + 119 + String.valueOf(s3).length() + String.valueOf(s4).length())).append("ParticipantType PERSON with phone found in conversation conversationId=").append(s1).append(" mergeKey=").append(s3).append(" ParticipantEntity phone number like: ").append(s4).toString());
                }
                if (TextUtils.equals(s1, (String)entry.getKey()))
                {
                    String s2 = aqt.b.c(aW);
                    if (s2 != null && !s2.equals(cfz1.b.a))
                    {
                        eev.g("Babel", String.format(Locale.US, "in conversation %s gaia mismatch %s vs %s", new Object[] {
                            s1, aW, cfz1.b.a
                        }));
                        throw new IllegalStateException("Gaia mismatch");
                    }
                }
            }
        }
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
            if (g.a((Integer)entry.getValue(), 0) == dsu.d.ordinal())
            {
                ((ArrayList) (obj)).add(entry.getKey());
            }
        } while (true);
        map = new Long[((ArrayList) (obj)).size()];
        ((ArrayList) (obj)).toArray(map);
        Arrays.sort(map);
        obj = getActivity();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (obj)));
        builder.setTitle(l.ja).setItems(g.cT, new axk(this, l1, map, s1, ((android.app.Activity) (obj))));
        builder.create().show();
    }

    private void a(boolean flag)
    {
        boolean flag2 = true;
        boolean flag1 = flag;
        if (f != null)
        {
            flag1 = flag;
            if (((aqu)f).getCount() == 0)
            {
                flag1 = true;
            }
        }
        if (eco.c(context))
        {
            flag1 = true;
        }
        if (!eco.d(context))
        {
            flag = flag2;
        } else
        {
            flag = flag1;
        }
        cd.b_(flag);
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

    static boolean a(avv avv1, List list, asa asa1)
    {
        return avv1.a(list, asa1);
    }

    private static boolean a(dsv dsv1, dsu dsu1, boolean flag)
    {
        boolean flag1;
        if (dsv1 == dsv.c || dsv1 == dsv.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return flag1 && a(dsu1);
    }

    private boolean a(List list, asa asa1)
    {
        Iterator iterator;
        boolean flag;
        boolean flag2;
        ba = true;
        ac();
        as();
        iterator = list.iterator();
        flag2 = false;
        flag = true;
_L9:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        list = (ato)iterator.next();
        atp atp1 = ((ato) (list)).c;
        boolean flag1;
        if (g.f(aq.a().b) && atp1 != atp.b && atp1 != atp.d && atp1 != atp.e)
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        axu.b[((ato) (list)).c.ordinal()];
        JVM INSTR tableswitch 1 4: default 144
    //                   1 161
    //                   2 161
    //                   3 322
    //                   4 367;
           goto _L3 _L4 _L4 _L5 _L6
_L3:
        throw new UnsupportedOperationException("Cannot send unsupported attachment type.");
_L4:
        atx atx1;
        if (((ato) (list)).c == atp.b || ((ato) (list)).c == atp.c)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g.c(flag2);
        atx1 = (atx)list;
        if (dcz.a(context, aK.h()))
        {
            list = a(aK, asa1.a, "", "", true, ((ato) (list)));
        } else
        {
            list = ((dml)binder.a(dml)).a(aK, asa1.a, "", atx1.a, atx1.g, null, atx1.f, atx1.e, atx1.d, "", true, null, 0);
        }
        ao.a(asa1.a, list);
_L7:
        flag2 = true;
        continue; /* Loop/switch isn't completed */
_L5:
        if (((ato) (list)).c == atp.d)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g.c(flag2);
        eev.a("Conv", "sendStickerAttachment");
        a(asa1, "", ((ato) (list)));
        continue; /* Loop/switch isn't completed */
_L6:
        if (((ato) (list)).c == atp.e)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g.c(flag2);
        a(asa1, "", ((ato) (list)));
        if (true) goto _L7; else goto _L2
_L2:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        if (flag) goto _L11; else goto _L10
_L10:
        Toast.makeText(context, l.fK, 0).show();
_L13:
        i.c("sendMessageUiLatency");
        return flag2;
_L11:
        if (g != null)
        {
            int i1 = ((ListView)g).getAdapter().getCount();
            int j1 = i1 - 20;
            if (((ListView)g).getLastVisiblePosition() < j1)
            {
                ((ListView)g).setSelection(j1);
            }
            list = ((ListView)g).getChildAt(i1 - 1 - ((ListView)g).getFirstVisiblePosition());
            j1 = ((ListView)g).getHeight();
            if (i1 > 0 && (list == null || list.getBottom() > j1))
            {
                ((ListView)g).smoothScrollToPosition(((ListView)g).getAdapter().getCount() - 1);
            }
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    private atu aA()
    {
        if (g.e(d()))
        {
            return atu.b;
        } else
        {
            return atu.a;
        }
    }

    static boolean aA(avv avv1)
    {
        return avv1.bc;
    }

    static boolean aB(avv avv1)
    {
        avv1.bc = false;
        return false;
    }

    static hlt aC(avv avv1)
    {
        return avv1.context;
    }

    static hlt aD(avv avv1)
    {
        return avv1.context;
    }

    static hlt aE(avv avv1)
    {
        return avv1.context;
    }

    static coy aF(avv avv1)
    {
        return avv1.f;
    }

    static coy aG(avv avv1)
    {
        return avv1.f;
    }

    static void aH(avv avv1)
    {
        avv1.an.a(null);
        avv1.b(false);
        avv1.bo.a();
    }

    static any aI(avv avv1)
    {
        return avv1.ch;
    }

    static void aJ(avv avv1)
    {
        if (h)
        {
            String s1 = String.valueOf(avv1.bo);
            eev.b("Conv", (new StringBuilder(String.valueOf(s1).length() + 47)).append("handleOptionalShareIntent mComposeMessageView: ").append(s1).toString());
        }
        Object obj = avv1.G();
        ecn.a("handleOptionalShareIntent", ((Intent) (obj)));
        if (obj != null)
        {
            Bundle bundle = ((Intent) (obj)).getExtras();
            if (bundle.containsKey("android.intent.extra.TEXT"))
            {
                eev.a("Conv", "handleOptionalShareIntent attaching TEXT");
                avv1.bo.a(bundle.getString("android.intent.extra.TEXT"), false);
            }
            if (!g.e(((Intent) (obj)).getType()))
            {
                if (bundle.containsKey("requires_mms"))
                {
                    obj = bundle.getString("draft_attachment_url");
                    if (TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        obj = null;
                    }
                } else
                {
                    obj = g.a(((Intent) (obj)));
                }
                eev.a("Conv", "handleOptionalShareIntent possibly attaching PHOTO");
                if (!g.a(dcn.e(((gqu)avv1.binder.a(gqu)).a()), aqc.f))
                {
                    Toast.makeText(avv1.context, g.kD, 0).show();
                } else
                if (obj != null)
                {
                    obj = azt.a(avv1.context, ((String) (obj)));
                    avv1.as.a(g.kl, ((Intent) (obj)));
                    return;
                }
            }
        }
    }

    static long aK(avv avv1)
    {
        return avv1.bC;
    }

    static hlt aL(avv avv1)
    {
        return avv1.context;
    }

    static boolean aM(avv avv1)
    {
        return avv1.ak();
    }

    static List aN(avv avv1)
    {
        return avv1.bm;
    }

    static hlt aO(avv avv1)
    {
        return avv1.context;
    }

    static void aP(avv avv1)
    {
        avv1.al();
    }

    static boolean aQ(avv avv1)
    {
        return avv1.ai();
    }

    static boolean aR(avv avv1)
    {
        return avv1.cc;
    }

    static hlt aS(avv avv1)
    {
        return avv1.context;
    }

    static dcc aT(avv avv1)
    {
        return avv1.cs;
    }

    static hlt aU(avv avv1)
    {
        return avv1.context;
    }

    static hlt aV(avv avv1)
    {
        return avv1.context;
    }

    static boolean aW(avv avv1)
    {
        return g.d(avv1.d());
    }

    static void aX(avv avv1)
    {
        avv1.b(true);
    }

    static hlt aY(avv avv1)
    {
        return avv1.context;
    }

    static hlt aZ(avv avv1)
    {
        return avv1.context;
    }

    static void aa(avv avv1)
    {
        avv1.ao();
    }

    static String ab(avv avv1)
    {
        return avv1.aZ;
    }

    static hlt ac(avv avv1)
    {
        return avv1.context;
    }

    private void ac()
    {
        ayj ayj1 = co;
        if (ayj1.a != ayl.b || ayj1.c.P() || ayj1.c.aO == 1)
        {
            return;
        }
        aux aaux[] = ayj1.c.cm;
        int j1 = aaux.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            aux aux1 = aaux[i1];
            boolean flag = aux1.a();
            aux1.a(flag);
            if (aux1 instanceof bll)
            {
                if (flag && !ayj1.b)
                {
                    g.a(ayj1.c.aK, 2100);
                    ayj1.b = true;
                } else
                if (ayj1.b && !flag)
                {
                    g.a(ayj1.c.aK, 2101);
                    ayj1.b = false;
                }
            }
            i1++;
        }
        ayj1.c.cn.a(ayj1.c.cn.a());
    }

    static gvc ad(avv avv1)
    {
        return avv1.at;
    }

    private void ad()
    {
        View view = getView();
        g.d(view);
        g.a(new auz(view));
    }

    static hlt ae(avv avv1)
    {
        return avv1.context;
    }

    private Boolean ae()
    {
        Boolean boolean1 = Boolean.FALSE;
        if (w()) goto _L2; else goto _L1
_L1:
        Object obj = Boolean.FALSE;
_L8:
        return ((Boolean) (obj));
_L2:
        Object obj1;
        obj1 = ap.d();
        obj = aq.a();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj1 = ((Collection) (obj1)).iterator();
_L6:
        if (((Iterator) (obj1)).hasNext())
        {
            asa asa1 = (asa)((Iterator) (obj1)).next();
            if (asa1.h == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (asa1.h.b() != null)
            {
                boolean1 = Boolean.TRUE;
            } else
            {
                if (obj == null || !TextUtils.equals(asa1.a, ((asa) (obj)).a) || asa1.h.b() == null)
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
            bnk.a();
            if (bnk.c() && obj != null)
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

    static hlt af(avv avv1)
    {
        return avv1.context;
    }

    private void af()
    {
        aE = ((asp)binder.a(asp)).a(context, lifecycle, aF, this, aB, az);
        aF = aF + 1;
    }

    static hlt ag(avv avv1)
    {
        return avv1.context;
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
            gdv.a("No contacts added", flag);
            if (aA() == atu.a)
            {
                aE.a(aq.a().a, 2622);
                return;
            } else
            {
                aE.a(aot.c, 2622);
                return;
            }
        } else
        {
            amx amx1 = (amx)aC.get(aD);
            aD = aD + 1;
            aE.a(amx1);
            return;
        }
    }

    static hlt ah(avv avv1)
    {
        return avv1.context;
    }

    private String ah()
    {
        asa asa1 = aq.a();
        if (asa1.j == null && asa1.e != null)
        {
            return asa1.e;
        } else
        {
            return null;
        }
    }

    static int ai(avv avv1)
    {
        return avv1.bO;
    }

    private boolean ai()
    {
        if (aq.a() == null && ((dup)binder.a(dup)).c())
        {
            return false;
        }
        if (cs != null && !cs.a)
        {
            return false;
        }
        return !cc;
    }

    static hlt aj(avv avv1)
    {
        return avv1.context;
    }

    private void aj()
    {
        boolean flag = ai();
        bo.a(flag);
        al();
    }

    static void ak(avv avv1)
    {
        if (avv1.J())
        {
            avv1.a(new awp(avv1));
            avv1.by.removeCallbacks(avv1.cw);
            avv1.by.postDelayed(avv1.cw, g.a(avv1.context, "babel_focusrenewperiodmillis", 0x41eb0));
        }
    }

    private boolean ak()
    {
        return aq.a() != null && cs != null;
    }

    static int al(avv avv1)
    {
        return avv1.bn;
    }

    private void al()
    {
        if (ai())
        {
            int i1 = aq.g().size();
            boolean flag;
            if (bo != null && bo.i())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (bU != null && flag)
            {
                bU.a(System.currentTimeMillis());
            }
            if (bl != null)
            {
                bl.a(flag, i1);
                return;
            }
        }
    }

    private Uri am()
    {
        return EsProvider.a(aK, O()).buildUpon().appendQueryParameter("limit", String.valueOf(cp)).build();
    }

    static boolean am(avv avv1)
    {
        return avv1.getResources().getDimensionPixelSize(g.jR) == 0;
    }

    static atq an(avv avv1)
    {
        return avv1.bp;
    }

    private static boolean an()
    {
        egb egb1 = egb.a;
        return egb1 != null && egb1.e();
    }

    static hlt ao(avv avv1)
    {
        return avv1.context;
    }

    private void ao()
    {
        egb egb1 = egb.a;
        if (egb1 != null && egb1.g())
        {
            getActivity().setVolumeControlStream(0);
            return;
        } else
        {
            getActivity().setVolumeControlStream(0x80000000);
            return;
        }
    }

    static hlt ap(avv avv1)
    {
        return avv1.context;
    }

    private static void ap()
    {
        ak = g.a(g.nU, "babel_poll_conversation_data_frequency_ms", 60000L);
    }

    static coy aq(avv avv1)
    {
        return avv1.f;
    }

    private void aq()
    {
        if (aI)
        {
            return;
        }
        aI = true;
        if (aq.d() != 2) goto _L2; else goto _L1
_L1:
        Object obj = aq.f().c();
        int k1 = ((Collection) (obj)).size();
        obj = ((Collection) (obj)).iterator();
        int j1 = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            int i1;
            if (!TextUtils.isEmpty(((cfz)((Iterator) (obj)).next()).h))
            {
                i1 = j1 + 1;
            } else
            {
                i1 = j1;
            }
            j1 = i1;
        }
        aM.a(aK.h()).a(2721).a(Integer.valueOf(k1)).d();
        if (k1 == 0) goto _L4; else goto _L3
_L3:
        if ((double)j1 > (double)k1 * 0.25D) goto _L6; else goto _L5
_L5:
        i1 = 2717;
_L7:
        aM.a(aK.h()).a(i1).a(Integer.valueOf(j1)).d();
        return;
_L6:
        if ((double)j1 <= (double)k1 * 0.5D)
        {
            i1 = 2718;
            continue; /* Loop/switch isn't completed */
        }
        if ((double)j1 <= (double)k1 * 0.75D)
        {
            i1 = 2719;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        i1 = 2720;
        if (true) goto _L7; else goto _L2
_L2:
        aM.a(aK.h()).a(2722).d();
        return;
    }

    static AbsListView ar(avv avv1)
    {
        return avv1.g;
    }

    private void ar()
    {
        bG = 0;
        bH = null;
        Iterator iterator = aq.f().b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cfz cfz1 = (cfz)iterator.next();
            if (Boolean.TRUE.equals(cfz1.i))
            {
                bG = bG + 1;
                bH = cfz1;
            }
        } while (true);
    }

    private void as()
    {
        Iterator iterator = bg.values().iterator();
        int i1 = 0;
        do
        {
            if (iterator.hasNext())
            {
                switch (((ayc)iterator.next()).b)
                {
                case 1: // '\001'
                    i1++;
                    break;
                }
                continue;
            }
            if (i1 > 1)
            {
                (new axb(this)).a(new Void[0]);
            }
            break;
        } while (true);
    }

    static boolean as(avv avv1)
    {
        return avv1.bh;
    }

    static int at(avv avv1)
    {
        return avv1.cp;
    }

    private void at()
    {
        Object obj;
        obj = aq.a();
        break MISSING_BLOCK_LABEL_10;
        if (obj != null && ((asa) (obj)).a != null && bC > 0L)
        {
            Object obj1 = am.a(((asa) (obj)).a);
            obj = new ArrayList();
            ArrayList arraylist = new ArrayList();
            obj1 = ((arv) (obj1)).a(0L, 0x7fffffffffffffffL).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                dnt dnt1 = (dnt)((Iterator) (obj1)).next();
                cgd cgd1 = dnt1.d;
                anr anr1 = aq.f();
                cfz cfz1 = anr1.b(cgd1);
                if (cfz1 != null && !anr1.c(cgd1))
                {
                    if (dnt1.e >= bC)
                    {
                        arraylist.add(cfz1);
                    } else
                    {
                        ((List) (obj)).add(cfz1);
                    }
                }
            } while (true);
            if (!((List) (obj)).isEmpty())
            {
                bw.a(((List) (obj)), false);
            }
            if (!arraylist.isEmpty())
            {
                bw.b(arraylist, true);
                return;
            }
        }
        return;
    }

    static long au(avv avv1)
    {
        return avv1.bB;
    }

    private void au()
    {
        bp.a();
        if (bT != null)
        {
            ayv ayv = bT;
            bT = null;
            gdy.a(new axf(this, ayv));
        }
    }

    static hlt av(avv avv1)
    {
        return avv1.context;
    }

    private boolean av()
    {
        for (Iterator iterator = bg.values().iterator(); iterator.hasNext();)
        {
            if (!((ayc)iterator.next()).d)
            {
                return true;
            }
        }

        return false;
    }

    static coy aw(avv avv1)
    {
        return avv1.f;
    }

    private void aw()
    {
        if (bh && av())
        {
            br.setVisibility(0);
            return;
        } else
        {
            br.setVisibility(8);
            return;
        }
    }

    static hlt ax(avv avv1)
    {
        return avv1.context;
    }

    private void ax()
    {
        asa asa1 = aq.a();
        RealTimeChatService.h(aK, asa1.a);
        if (cd != null)
        {
            cd.a();
        }
    }

    static AbsListView ay(avv avv1)
    {
        return avv1.g;
    }

    private asa ay()
    {
label0:
        {
            Object obj = ap.d();
            if (obj == null)
            {
                break label0;
            }
            obj = ((Collection) (obj)).iterator();
            asa asa1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                asa1 = (asa)((Iterator) (obj)).next();
            } while (!g.f(asa1.b));
            return asa1;
        }
        return null;
    }

    static AbsListView az(avv avv1)
    {
        return avv1.g;
    }

    private void az()
    {
        String s1;
        for (s1 = aq.e(); s1 == null || cd == null;)
        {
            return;
        }

        cd.a(s1);
    }

    static int b(avv avv1, int i1)
    {
        avv1.bO = i1;
        return i1;
    }

    static View b(avv avv1, View view)
    {
        avv1.bv = view;
        return view;
    }

    static azj b(avv avv1)
    {
        return avv1.ap;
    }

    static String b(avv avv1, String s1)
    {
        avv1.aZ = s1;
        return s1;
    }

    private void b(Cursor cursor, aoa aoa1)
    {
        if (bI <= 0L)
        {
            bK = cursor;
            return;
        }
        cursor.moveToLast();
        if (cursor.isAfterLast()) goto _L2; else goto _L1
_L1:
        long l1 = cursor.getLong(2);
        if (l1 <= bI || l1 <= bJ) goto _L4; else goto _L3
_L3:
        cursor.getInt(3);
        JVM INSTR tableswitch 17 17: default 84
    //                   17 163;
           goto _L4 _L5
_L4:
        long l2 = bJ;
        eev.c("Babel", (new StringBuilder(99)).append("Setting last processed event suggestion timestamp from ").append(l2).append(" to ").append(l1).toString());
        bJ = l1;
_L2:
        bK = null;
        RealTimeChatService.d(aoa1, aq.a().a, bJ);
        return;
_L5:
        Object obj = new edq(cursor.getString(4), null);
        aQ.a();
        bL = null;
        bM = null;
        int i1 = cursor.getInt(5);
        obj = new aqn(((edq) (obj)), aQ, true, Integer.valueOf(i1));
        Cursor cursor1 = ((aqu)f).a();
        if (cursor1 != null && cursor1.moveToLast() && cursor1.getString(1).equals(cursor.getString(1)))
        {
            aQ.a(((aqn) (obj)));
            aU.a(((dor) (obj)));
        } else
        {
            bL = ((aqn) (obj));
            bM = cursor.getString(1);
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static void b(avv avv1, long l1)
    {
        RealTimeChatService.a(avv1.aK, new long[] {
            l1
        });
    }

    static void b(avv avv1, any any1)
    {
        avv1.a(any1);
    }

    static void b(avv avv1, boolean flag)
    {
        avv1.bN = flag;
    }

    private void b(boolean flag)
    {
        if (bs == null)
        {
            return;
        }
        View view;
        int i1;
        if (flag)
        {
            bt.setText(an.b());
            bt.addTextChangedListener(cz);
            bt.requestFocus();
        } else
        {
            bt.removeTextChangedListener(cz);
            bo.b();
        }
        view = bs;
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
        asa asa1 = aq.a();
        if (asa1 == null)
        {
            ap.a(new axg(this, list));
            return true;
        } else
        {
            return a(list, asa1);
        }
    }

    static Collection bA(avv avv1)
    {
        ArrayList arraylist = new ArrayList();
        cfz cfz1;
        for (avv1 = avv1.aq.f().c().iterator(); avv1.hasNext(); arraylist.add(ail.a(dbl.a(cfz1.b, cfz1.c, cfz1.g), cfz1.e, cfz1.h)))
        {
            cfz1 = (cfz)avv1.next();
        }

        return arraylist;
    }

    static ass bB(avv avv1)
    {
        return avv1.cu;
    }

    static bye bC(avv avv1)
    {
        return avv1.aL;
    }

    static dvf bD(avv avv1)
    {
        return avv1.an;
    }

    static hlt bE(avv avv1)
    {
        return avv1.context;
    }

    static hny bF(avv avv1)
    {
        return avv1.lifecycle;
    }

    static hlt bG(avv avv1)
    {
        return avv1.context;
    }

    static hlt bH(avv avv1)
    {
        return avv1.context;
    }

    static hlt ba(avv avv1)
    {
        return avv1.context;
    }

    static AbsListView bb(avv avv1)
    {
        return avv1.g;
    }

    static AbsListView bc(avv avv1)
    {
        return avv1.g;
    }

    static hlp bd(avv avv1)
    {
        return avv1.binder;
    }

    static bax be(avv avv1)
    {
        return avv1.ao;
    }

    static void bf(avv avv1)
    {
        avv1.az();
    }

    static coy bg(avv avv1)
    {
        return avv1.f;
    }

    static View bh(avv avv1)
    {
        return avv1.bv;
    }

    static bag bi(avv avv1)
    {
        return avv1.ct;
    }

    static boolean bj(avv avv1)
    {
        return avv1.bd;
    }

    static boolean bk(avv avv1)
    {
        avv1.bd = true;
        return true;
    }

    static hny bl(avv avv1)
    {
        return avv1.lifecycle;
    }

    static hny bm(avv avv1)
    {
        return avv1.lifecycle;
    }

    static ayj bn(avv avv1)
    {
        return avv1.co;
    }

    static hny bo(avv avv1)
    {
        return avv1.lifecycle;
    }

    static hlp bp(avv avv1)
    {
        return avv1.binder;
    }

    static hny bq(avv avv1)
    {
        return avv1.lifecycle;
    }

    static Runnable br(avv avv1)
    {
        return avv1.aj;
    }

    static Runnable bs(avv avv1)
    {
        return avv1.cw;
    }

    static void bt(avv avv1)
    {
        cfz cfz1;
        for (Iterator iterator = avv1.aq.f().b().iterator(); iterator.hasNext(); avv1.bw.a(cfz1))
        {
            cfz1 = (cfz)iterator.next();
        }

    }

    static void bu(avv avv1)
    {
        avv1.a(new awq(avv1));
    }

    static avk bv(avv avv1)
    {
        return avv1.bo;
    }

    static void bw(avv avv1)
    {
        if (avv1.J())
        {
            RealTimeChatService.a(avv1.aK, avv1.bg.keySet());
        }
    }

    static void bx(avv avv1)
    {
        boolean flag = true;
        avv1.a(new awo(avv1));
        if (avv1.an != null)
        {
            dvf dvf1 = avv1.an;
            if (avv1.aq.d() == 1)
            {
                flag = false;
            }
            dvf1.a(flag);
            avv1.bo.a();
        }
    }

    static Cursor by(avv avv1)
    {
        return avv1.bK;
    }

    static void bz(avv avv1)
    {
        avv1.ab();
    }

    static hlt c(avv avv1)
    {
        return avv1.context;
    }

    private void c(Cursor cursor, aoa aoa1)
    {
        String s7;
        gz gz1;
        int j1;
        int k1;
        j1 = 0;
        k1 = bD;
        s7 = bE;
        bE = null;
        gz1 = new gz();
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
        Object obj;
        ayc ayc1;
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
        if (l2 > bI)
        {
            bI = l2;
        }
        ayc1 = (ayc)bg.get(s8);
        obj = ayc1;
        if (ayc1 == null)
        {
            obj = new ayc();
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
        aW = ((ayc) (obj)).f;
        obj.b = l1;
        obj.g = cursor.getLong(20);
        obj.h = cursor.getLong(23);
        j1 = cursor.getInt(2);
        i2 = aq.d();
        if (j1 != 0 && j1 != i2)
        {
            String s5 = String.valueOf(O());
            eev.f("Babel", (new StringBuilder(String.valueOf(s5).length() + 100)).append("loaded client conversation type ").append(j1).append(" overriding ").append(i2).append(" for conversation ").append(s5).append(" (this is weird)").toString());
        }
        if (l1 == 1)
        {
            asa asa1;
            String s9;
            String s10;
            if (aoa1.l())
            {
                bD = 0;
            } else
            {
                bD = cursor.getInt(9);
            }
            bE = s8;
            bF = cursor.getLong(10);
        }
        if (TextUtils.equals(O(), ((ayc) (obj)).a))
        {
            aq.a(j1);
            aX = cursor.getString(24);
            aY = cursor.getString(25);
            aN = cursor.getInt(1);
            aO = cursor.getInt(21);
            bi = true;
            if (h)
            {
                obj = aq.e();
                asa1 = aq.a();
                s8 = String.valueOf("onConversationsLoaderFinished(CONVERSATION_LOADER) mConversationId=");
                s9 = String.valueOf(O());
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
                if (asa1 != null)
                {
                    obj1 = Integer.valueOf(asa1.b);
                } else
                {
                    obj1 = "not set";
                }
                obj1 = String.valueOf(obj1);
                eev.b("Conv", (new StringBuilder(String.valueOf(s8).length() + 17 + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(obj).length() + String.valueOf(obj1).length())).append(s8).append(s9).append(": this=").append(s10).append(((String) (obj))).append(" variant: ").append(((String) (obj1))).toString());
            }
            getActivity().q_();
            bU.a(cursor);
            bw.b(bU.d());
            bw.c(i2);
            if (cursor.getInt(11) == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            cj = flag1;
            if (!ci)
            {
                ci = true;
                if (G() == null && cursor.moveToFirst())
                {
                    obj = new any(cursor);
                    obj1 = DraftService.a(O(), aK);
                    if (obj1 != null && !((any) (obj1)).a())
                    {
                        obj = obj1;
                        if (h)
                        {
                            obj = String.valueOf(obj1);
                            eev.b("Conv", (new StringBuilder(String.valueOf(obj).length() + 36)).append("DraftService.getDraft pendingDraft: ").append(((String) (obj))).toString());
                            obj = obj1;
                        }
                    } else
                    if (h)
                    {
                        String s6 = String.valueOf(obj);
                        eev.b("Conv", (new StringBuilder(String.valueOf(s6).length() + 48)).append("DraftService.getDraft returning original draft: ").append(s6).toString());
                    }
                    ch = ((any) (obj));
                }
            }
        }
        i1++;
        if (cursor.moveToNext()) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            aq.a(s1, s2);
        }
        az();
        if (bg.isEmpty())
        {
            cursor = gz1.values().iterator();
            for (l2 = 0L; cursor.hasNext(); l2 = Math.max(l2, ((ayc)cursor.next()).h)) { }
            ((aqu)f).a(l2);
        }
        bg.clear();
        bg.a(gz1);
        as();
_L5:
        if (k1 == 0 && bD != 0)
        {
            RealTimeChatService.o(aoa1, bE);
        }
        aw();
        RealTimeChatService.d(aoa1, O(), bJ);
        aoa1 = O();
        cursor = aoa1;
        if (aoa1 == null)
        {
            cursor = "(NULL)";
        }
        aoa1 = String.valueOf(Integer.toString(i1));
        eev.e("Conv", (new StringBuilder(String.valueOf(cursor).length() + 42 + String.valueOf(aoa1).length())).append("Conversation loader finished for ").append(cursor).append(", count# ").append(aoa1).toString());
        if (s7 != null && bE == null)
        {
            cursor = String.valueOf(s7);
            if (cursor.length() != 0)
            {
                cursor = "Error: CallMediaTypeConvId is now missing! ".concat(cursor);
            } else
            {
                cursor = new String("Error: CallMediaTypeConvId is now missing! ");
            }
            eev.g("Conv", cursor);
        }
        ac();
        return;
_L2:
        if (RealTimeChatService.a(O()) == null)
        {
            cursor = cd;
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

    static void c(avv avv1, String s1)
    {
        asa asa1 = avv1.aq.a();
        boolean flag2 = avv1.ak();
        boolean flag;
        boolean flag1;
        if (asa1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (avv1.cs == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g.b(flag2, "variant null: %s. reachability null: %s.", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        if (!avv1.cs.a)
        {
            avv1.cs.a(avv1.context, false);
        } else
        if (!avv1.ai())
        {
            if (avv1.getActivity() != null)
            {
                Toast.makeText(avv1.context, l.jn, 0).show();
                return;
            }
        } else
        {
            avv1.a(asa1, s1, ((ato) (null)));
            return;
        }
    }

    private void d(long l1)
    {
        RealTimeChatService.a(aK, new long[] {
            l1
        });
    }

    static void d(avv avv1)
    {
        avv1.ag();
    }

    static void e(avv avv1)
    {
        avv1.az = null;
        avv1.aA = 0;
        avv1.aB = null;
        avv1.aC = null;
        avv1.aD = 0;
        avv1.aE = null;
    }

    private void e(String s1)
    {
        if (bi || bI > 0L)
        {
            at.b(bay.a(s1));
            at.a(new bay(context, aK, s1));
            int i1 = aK.h();
            if (dcz.t(i1))
            {
                at.a(new azv(context, s1, i1));
            }
        }
    }

    static atu f(avv avv1)
    {
        return avv1.az;
    }

    static auy g(avv avv1)
    {
        return avv1.cn;
    }

    static aoa h(avv avv1)
    {
        return avv1.aK;
    }

    static boolean i(avv avv1)
    {
        return g.e(avv1.d());
    }

    static MessageListAnimationManager j(avv avv1)
    {
        return avv1.ce;
    }

    static AbsListView k(avv avv1)
    {
        return avv1.g;
    }

    static AbsListView l(avv avv1)
    {
        return avv1.g;
    }

    static ayt m(avv avv1)
    {
        return avv1.aq;
    }

    static boolean n(avv avv1)
    {
        return avv1.ba;
    }

    static boolean o(avv avv1)
    {
        return g.f(avv1.d());
    }

    static boolean p(avv avv1)
    {
        return avv1.bP;
    }

    static boolean q(avv avv1)
    {
        return avv1.isPaused();
    }

    static void r(avv avv1)
    {
        long l1 = System.currentTimeMillis();
        ArrayList arraylist = new ArrayList();
        Iterator iterator1 = avv1.bx.entrySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if (l1 - ((ayr)entry.getValue()).b > 30000L)
            {
                if (eev.a("Conv", 3))
                {
                    String s1 = String.valueOf(((ayr)entry.getValue()).a);
                    if (s1.length() != 0)
                    {
                        s1 = "Typing status expired for ".concat(s1);
                    } else
                    {
                        s1 = new String("Typing status expired for ");
                    }
                    eev.d("Conv", s1);
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
            Object obj = (cgd)iterator.next();
            avv1.bx.remove(obj);
            obj = avv1.a(((cgd) (obj)));
            if (obj != null)
            {
                avv1.bw.a(((cfz) (obj)), 4, true);
            }
        } while (true);
    }

    static void s(avv avv1)
    {
        avv1.aj();
    }

    static void t(avv avv1)
    {
        if (avv1.ak())
        {
            for (Iterator iterator = avv1.bm.iterator(); iterator.hasNext(); g.a((Runnable)iterator.next())) { }
            avv1.bm.clear();
        }
    }

    static void u(avv avv1)
    {
        String s1 = null;
        if (!avv1.P() && avv1.aq.a() != null && g.f(avv1.d())) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        if (avv1.bQ == obj || avv1.bQ != null && avv1.bQ.equals(obj))
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        cfz cfz1 = avv1.M();
        if (cfz1 != null)
        {
            obj = cfz1;
            if (cfz1.a())
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        avv1.bQ = ((cfz) (obj));
        if (avv1.bQ != null)
        {
            s1 = ((cfz) (obj)).b();
            obj = ((cfz) (obj)).e;
        } else
        {
            obj = null;
        }
        if (avv1.bR != null)
        {
            avv1.bR.a(s1);
        }
        avv1.bS.a(((String) (obj)), s1);
        return;
    }

    static int v(avv avv1)
    {
        return avv1.aO;
    }

    static aux[] w(avv avv1)
    {
        return avv1.cm;
    }

    static aza x(avv avv1)
    {
        return avv1.ca;
    }

    static void y(avv avv1)
    {
        avv1.ac();
    }

    static int z(avv avv1)
    {
        return avv1.al;
    }

    public void A()
    {
        aN = 30;
        String s1;
        for (Iterator iterator = bg.keySet().iterator(); iterator.hasNext(); RealTimeChatService.a(aK, s1, aN))
        {
            s1 = (String)iterator.next();
        }

        ac();
    }

    public boolean B()
    {
        return aN == 10;
    }

    public boolean C()
    {
        return bD != 0 && a(context);
    }

    public void D()
    {
        bo.f();
    }

    public void E()
    {
        bo.g();
    }

    public void F()
    {
        bo.b();
    }

    Intent G()
    {
        return (Intent)getActivity().getIntent().getParcelableExtra("share_intent");
    }

    public void H()
    {
        if (bo != null)
        {
            bo.setVisibility(8);
            bq.setVisibility(8);
            bl.setVisibility(8);
        }
        cg = true;
    }

    public boolean I()
    {
        gdv.b("Expected condition to be false", cg);
        bp.b();
        if (eco.d(context))
        {
            boolean flag = bo.c();
            a(false);
            return flag;
        } else
        {
            return false;
        }
    }

    public boolean J()
    {
        return bN;
    }

    public void K()
    {
        bo.a("", false);
        aq.h();
        if (an != null)
        {
            an.a();
        }
        a(new any());
    }

    public void L()
    {
        if (((ListView)g).getFirstVisiblePosition() <= 0)
        {
            eev.e("Babel_Scroll", "Message load failed. scroll to hide spinner.");
            ((ListView)g).smoothScrollToPositionFromTop(1, 0);
        }
        eev.g("Babel", "Message load failed");
        if (g.a(context, "babel_enable_message_load_failed_toast", true))
        {
            long l1 = SystemClock.elapsedRealtime();
            if (l1 - ax > TimeUnit.MINUTES.toMillis(1L))
            {
                ax = l1;
                Toast.makeText(getActivity(), l.ij, 0).show();
            }
        }
    }

    public cfz M()
    {
        cfz cfz2;
label0:
        {
            cfz2 = null;
            if (aq.d() != 1)
            {
                break label0;
            }
            anr anr1 = aq.f();
            Iterator iterator = anr1.b().iterator();
            cfz cfz1 = null;
            while (iterator.hasNext()) 
            {
                cfz cfz3 = (cfz)iterator.next();
                if (!anr1.c(cfz3.b))
                {
                    cfz2 = cfz3;
                    if (cfz3.b.a != null)
                    {
                        break label0;
                    }
                    if (cfz1 == null)
                    {
                        cfz1 = cfz3;
                    }
                }
            }
            cfz2 = cfz1;
        }
        return cfz2;
    }

    public void N()
    {
        atu atu1;
        if (bD == 1)
        {
            atu1 = atu.c;
        } else
        {
            atu1 = atu.d;
        }
        a(atu1, 60, true);
    }

    public String O()
    {
        return aq.c();
    }

    public boolean P()
    {
        return getId() == h.cM;
    }

    public void Q()
    {
        if (bv != null)
        {
            g.b(cqo.a);
            ((ViewGroup)bv.getParent()).removeView(bv);
            bv = null;
        }
    }

    public int R()
    {
        return aq.d();
    }

    public any S()
    {
        return new any(bo.e(), an.b(), null, 0, null, null);
    }

    public Handler T()
    {
        return by;
    }

    public aoa a()
    {
        return aK;
    }

    public cfz a(cgd cgd1)
    {
        return aq.f().b(cgd1);
    }

    public void a(int i1)
    {
        bG = i1;
        ayj ayj1 = co;
        if (ayj1.a != ayl.b || ayj1.c.P() || ayj1.c.aO == 1)
        {
            return;
        }
        aux aaux[] = ayj1.c.cm;
        int j1 = aaux.length;
        i1 = 0;
        while (i1 < j1) 
        {
            aux aux1 = aaux[i1];
            boolean flag = aux1.a();
            aux1.a(flag);
            if (aux1 instanceof bll)
            {
                if (flag && !ayj1.b)
                {
                    g.a(ayj1.c.aK, 2100);
                    ayj1.b = true;
                } else
                if (ayj1.b && !flag)
                {
                    g.a(ayj1.c.aK, 2101);
                    ayj1.b = false;
                }
            }
            i1++;
        }
        ayj1.c.cn.a(ayj1.c.cn.a());
    }

    public void a(Bundle bundle, String s1)
    {
        if (!s1.equals("conversation_error")) goto _L2; else goto _L1
_L1:
        ax();
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
            a(((ayi) (new axj(this, bundle))));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s1.equals("leave_conversation"))
        {
            ax();
            return;
        }
        if (s1.equals("delete_message"))
        {
            d(bundle.getLong("row_id"));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void a(ayv ayv)
    {
        bT = ayv;
        al();
    }

    public void a(bid bid1)
    {
        cd = bid1;
    }

    public void a(ehy ehy, String s1, String s2)
    {
        cd.a(ehy, s1, s2);
    }

    public void a(CharSequence charsequence)
    {
        bo.a(charsequence);
    }

    public void a(String s1)
    {
    }

    public void a(String s1, gvv gvv1, gvs gvs1)
    {
        gvs1.a(false);
        if (s1 != null && gvv1 != null)
        {
            if ((s1 = (czt)gvv1.d().getSerializable("response_header")) != null)
            {
                cxr.a(aK, s1);
                return;
            }
        }
    }

    public void a(List list)
    {
        if (b(list))
        {
            au();
        }
        al();
    }

    public void a(jsh jsh1)
    {
        b(jsh1);
    }

    public boolean a(long l1)
    {
        return cx.containsKey(Long.valueOf(l1));
    }

    public void b(int i1)
    {
        if (getActivity() == null)
        {
            return;
        }
        Object obj = ((aqu)f).a();
        ((Cursor) (obj)).moveToPosition(i1);
        String s1;
        boolean flag;
        long l2;
        long l7;
        if (2 == ((Cursor) (obj)).getInt(33))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = ((Cursor) (obj)).getString(2);
        l7 = ((Cursor) (obj)).getLong(0);
        l2 = ((Cursor) (obj)).getLong(0);
        if (!cx.containsKey(Long.valueOf(l2)))
        {
            Map map = cx;
            int j1;
            if (flag)
            {
                j1 = dsu.d.ordinal();
            } else
            {
                j1 = ((Cursor) (obj)).getInt(7);
            }
            map.put(Long.valueOf(l2), Integer.valueOf(j1));
            if (!flag)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0)
            {
                long l8 = g.a(context, "babel_select_adjacent_maximum_timedelta", 60) * 0xf4240;
                int l1 = g.a(context, "babel_select_adjacent_maximum_count", 10);
                ((Cursor) (obj)).moveToPosition(i1);
                long l3 = ((Cursor) (obj)).getLong(6);
                j1 = 0;
                long l4 = l3;
                do
                {
                    if (!((Cursor) (obj)).moveToNext())
                    {
                        break;
                    }
                    dsv dsv1 = dsv.values()[((Cursor) (obj)).getInt(8)];
                    dsu dsu1 = dsu.values()[((Cursor) (obj)).getInt(7)];
                    long l6 = ((Cursor) (obj)).getLong(6);
                    int i2 = ((Cursor) (obj)).getInt(33);
                    if (!a(dsv1, dsu1, true) || l6 > l4 + l8)
                    {
                        break;
                    }
                    j1++;
                    if (j1 > l1 || i2 == 2)
                    {
                        break;
                    }
                    cx.put(Long.valueOf(((Cursor) (obj)).getLong(0)), Integer.valueOf(dsu1.ordinal()));
                    l4 = l6;
                } while (true);
                ((Cursor) (obj)).moveToPosition(i1);
                i1 = 0;
                do
                {
                    if (!((Cursor) (obj)).moveToPrevious())
                    {
                        break;
                    }
                    dsv dsv2 = dsv.values()[((Cursor) (obj)).getInt(8)];
                    dsu dsu2 = dsu.values()[((Cursor) (obj)).getInt(7)];
                    long l5 = ((Cursor) (obj)).getLong(6);
                    int k1 = ((Cursor) (obj)).getInt(33);
                    if (!a(dsv2, dsu2, true) || l5 < l3 - l8)
                    {
                        break;
                    }
                    i1++;
                    if (i1 > l1 || k1 == 2)
                    {
                        break;
                    }
                    cx.put(Long.valueOf(((Cursor) (obj)).getLong(0)), Integer.valueOf(dsu2.ordinal()));
                    l3 = l5;
                } while (true);
            }
        }
        if (flag)
        {
            obj = ((Cursor) (obj)).getString(24);
            (new android.app.AlertDialog.Builder(getActivity())).setTitle(l.iZ).setItems(g.cS, new axr(this, ((String) (obj)), l7)).create().show();
        } else
        {
            a(cx, l7, s1);
        }
        ((aqu)f).notifyDataSetChanged();
    }

    public void b(long l1)
    {
        l1 /= 1000L;
        l1 = System.currentTimeMillis() - l1;
        if (l1 < 0L)
        {
            ck.setVisibility(8);
            return;
        } else
        {
            ck.setVisibility(0);
            long l2 = SystemClock.elapsedRealtime();
            ck.setBase(l2 - l1);
            ck.start();
            return;
        }
    }

    public void b(String s1)
    {
        if (s1.equals("conversation_error"))
        {
            ax();
        }
    }

    public boolean b()
    {
        return bh;
    }

    public boolean b(cgd cgd1)
    {
        return aK.b().a(cgd1);
    }

    public void c(int i1)
    {
        ((bzi)binder.a(bzi)).a(context, g.ke, i1);
    }

    public void c(long l1)
    {
        bU.b(l1);
    }

    public void c(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            bo.a((new StringBuilder(String.valueOf(s1).length() + 2)).append("@").append(s1).append(" ").toString());
        }
    }

    public boolean c()
    {
        return ba;
    }

    public boolean c(cgd cgd1)
    {
        return bw.a(cgd1);
    }

    public int d()
    {
        return aq.a().b;
    }

    public String d(cgd cgd1)
    {
        return aq.f().d(cgd1);
    }

    public void d(String s1)
    {
        RealTimeChatService.a(aK, aq.a().a, s1);
    }

    public String e(cgd cgd1)
    {
        cgd1 = aq.f().b(cgd1);
        if (cgd1 != null)
        {
            boolean flag;
            if (aq.d() != 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return g.a(cgd1, flag);
        } else
        {
            return null;
        }
    }

    public boolean e()
    {
        asa asa1 = aq.a();
        return asa1 != null && !g.e(asa1.b);
    }

    public int f()
    {
        return bG;
    }

    public String f(cgd cgd1)
    {
        return aq.f().e(cgd1);
    }

    public String g(cgd cgd1)
    {
        cgd1 = aq.f().b(cgd1);
        if (cgd1 != null)
        {
            return g.a(cgd1, true);
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
        bundle = (ejx)binder.b(ejx);
        if (bundle != null)
        {
            bR = bundle.a(context, aK.h(), cd, getResources());
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        binder.a(asn, aG);
        binder.a(ast, cv);
        cu = ((asp)binder.a(asp)).a(context, lifecycle, getFragmentManager());
        aL = ((byf)binder.a(byf)).a(17);
        aU = (dpn)binder.a(dpn);
        aM = (gdd)binder.a(gdd);
        bundle = new awb(this);
        binder.a(atr, bundle);
        binder.a(avj, this);
        binder.a(ays, this);
        int i1 = ((gqu)binder.a(gqu)).a();
        binder.a(beb, new beb(((gdd)binder.a(gdd)).a(i1)));
        am = (aru)binder.a(aru);
        as = ((gte)binder.a(gte)).a(g.kk, au).a(g.kl, av).a(g.km, aw);
        at = (gvc)binder.a(gvc);
        at.a(this);
        binder.a(baa, new awc(this));
        ((bzi)binder.a(bzi)).a(context, g.ke, new awd(this));
        ((cjg)binder.a(cjg)).a(g.kg, new awe(this));
        binder.a(azz, this);
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
        if (i1 == h.az || i1 == h.aL || i1 == h.bD || i1 == h.aI || i1 == h.fk) goto _L2; else goto _L1
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
        if (i1 != h.az) goto _L8; else goto _L7
_L7:
        ((ClipboardManager)getActivity().getSystemService("clipboard")).setText(((MessageListItemView) (obj)).e());
_L10:
        flag1 = true;
_L3:
        return flag1;
_L8:
        if (i1 == h.aL)
        {
            ((MessageListItemView) (obj)).a(getActivity());
        } else
        if (i1 == h.bD)
        {
            duf duf1 = ((MessageListItemView) (obj)).l();
            String s1 = due.b(context, ((MessageListItemView) (obj)).w());
            i1 = l.bZ;
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
            if (duf1 != null)
            {
                menuitem = duf1.a;
            } else
            {
                menuitem = null;
            }
            if (duf1 != null)
            {
                s2 = duf1.b;
            }
            i1 = ((MessageListItemView) (obj)).o();
            obj = new Intent("android.intent.action.SEND");
            ((Intent) (obj)).setClass(g.nU, com/google/android/apps/hangouts/phone/ShareIntentActivity);
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
                    eev.g("Babel", s1);
                }
                ((Intent) (obj)).putExtra("draft_attachment_url", menuitem);
                ((Intent) (obj)).putExtra("draft_content_type", s2);
                ((Intent) (obj)).putExtra("draft_attachment_count", i1);
                ((Intent) (obj)).putExtra("draft_subject", s3);
            }
            startActivity(((Intent) (obj)));
        } else
        if (i1 == h.aI)
        {
            long l1 = ((MessageListItemView) (obj)).x();
            menuitem = bfr.a(null, getString(l.iw), getString(l.hV), getString(l.Q));
            Bundle bundle = menuitem.getArguments();
            bundle.putLong("row_id", l1);
            menuitem.setArguments(bundle);
            menuitem.setTargetFragment(this, 0);
            menuitem.a(getFragmentManager(), "delete_message");
        } else
        if (i1 == h.fk)
        {
            menuitem = (cjg)binder.a(cjg);
            Bundle bundle1 = new Bundle();
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(((MessageListItemView) (obj)).m());
            bundle1.putParcelableArrayList("save_media_attachments", arraylist);
            menuitem.a(g.kg, Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"), 2666, bundle1);
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
        String s1 = i.b("onCreate");
        super.onCreate(bundle);
        int i1 = ((gqu)binder.a(gqu)).a();
        aK = dcn.e(i1);
        ao = new bax(i1);
        ao.a(bundle);
        cr = new bhp(getActivity());
        cr.a(new awa(this));
        MessageListItemWrapperView.c(false);
        setHasOptionsMenu(true);
        if (bundle != null)
        {
            Object obj = (aia)bundle.getParcelable("conversation_params");
            az = (atu)bundle.getSerializable("call_conversation_type");
            aA = bundle.getInt("call_start_action");
            aB = (aii)bundle.getSerializable("call_participants");
            aC = (ArrayList)bundle.getSerializable("call_contacts");
            aD = bundle.getInt("next_call_contact");
            Object obj1;
            azj azj1;
            aoa aoa1;
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
            bundle = (aia)getArguments().getParcelable("conversation_parameters");
        }
        aq.a(bundle);
        aH = ((aia) (bundle)).n;
        aI = ((aia) (bundle)).o;
        ap.a(aK.b());
        aq.f().d(aK, ((aia) (bundle)).a);
        cp = g.a(context, "babel_conversation_messages_limit", 500);
        aV = am();
        aX = ((aia) (bundle)).i;
        aY = ((aia) (bundle)).j;
        obj1 = context;
        azj1 = ap;
        aoa1 = aK;
        if (((aia) (bundle)).d)
        {
            obj = ((aia) (bundle)).a;
        } else
        {
            obj = null;
        }
        ca = new aza(((Context) (obj1)), azj1, aoa1, ((String) (obj)), ((aia) (bundle)).e);
        if (((aia) (bundle)).h > -1L)
        {
            bI = ((aia) (bundle)).h;
        }
        if (bundle.a() == 1 || !eco.d(context))
        {
            getActivity().getWindow().setSoftInputMode(20);
        }
        be = (atn)binder.b(atn);
        obj = String.valueOf(this);
        bundle = String.valueOf(((aia) (bundle)).a);
        obj1 = String.valueOf(getLoaderManager());
        eev.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 29 + String.valueOf(bundle).length() + String.valueOf(obj1).length())).append("Start loaders for ").append(((String) (obj))).append("(").append(bundle).append(") loader: ").append(((String) (obj1))).toString());
        bundle = getLoaderManager();
        i.b("MESSAGES_LOADER");
        if (be == null)
        {
            bundle.a(2, null, this);
        }
        i.b("CONVERSATION_LOADER");
        bundle.a(0, null, this);
        i.b("EVENT_SUGGESTIONS_LOADER");
        bundle.a(3, null, this);
        i.c(s1);
    }

    public Animation onCreateAnimation(int i1, boolean flag, int j1)
    {
        if (j1 != 0)
        {
            Animation animation = AnimationUtils.loadAnimation(getActivity(), j1);
            if (animation != null)
            {
                animation.setAnimationListener(new awf(this, flag));
            }
            return animation;
        } else
        {
            return null;
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        aT.a(contextmenu, view, contextmenuinfo, getActivity().getMenuInflater(), (dsx)hlp.b(getContext(), dsx));
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public em onCreateLoader(int i1, Bundle bundle)
    {
        if (h)
        {
            bundle = String.valueOf(O());
            eev.b("Conv", (new StringBuilder(String.valueOf(bundle).length() + 42)).append("onCreateLoader ").append(i1).append(" conversationId ").append(bundle).toString());
        }
        if (i1 == 2)
        {
            bundle = new coz(getActivity(), aK, aV, arc.a, "type!=? AND (expiration_timestamp>? OR expiration_timestamp IS NULL)", arc.a(), "timestamp desc");
            cq = bundle;
            i.c("MESSAGES_LOADER");
        } else
        if (i1 == 0)
        {
            bundle = new coz(getActivity(), aK, EsProvider.a(EsProvider.g, aK.h()), anv.a, cA, new String[] {
                O()
            }, null);
            i.c("CONVERSATION_LOADER");
        } else
        if (i1 == 1)
        {
            bundle = g.a((String[])bg.keySet().toArray(new String[bg.size()]));
            anr anr1 = aq.f();
            anr1.d(aK, bundle);
            ap.e();
            bundle = anr1.a(ant.b);
        } else
        if (i1 == 3)
        {
            bundle = EsProvider.a(aK.h(), O());
            bundle = new coz(getActivity(), aK, bundle, aye.a, "timestamp>? AND type=?", new String[] {
                Long.toString(bI), Integer.toString(17)
            }, null);
            i.c("EVENT_SUGGESTIONS_LOADER");
        } else
        {
            bundle = null;
        }
        if (h)
        {
            String s1 = String.valueOf(bundle);
            eev.b("Conv", (new StringBuilder(String.valueOf(s1).length() + 39)).append("onCreateLoader: id=").append(i1).append(", loader=").append(s1).toString());
        }
        return bundle;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        int i1 = 0;
        super.onCreateOptionsMenu(menu, menuinflater);
        if (!P())
        {
            menuinflater.inflate(g.hj, menu);
            if (!ay)
            {
                ay = true;
                for (; i1 < 2; i1++)
                {
                    menu = (new Class[] {
                        aud, auc
                    })[i1];
                    binder.b(menu);
                }

            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(g.fn, viewgroup, false);
        g = (ListView)view.findViewById(0x102000a);
        if (be != null)
        {
            viewgroup = (FrameLayout)view.findViewById(h.dD);
            ((ListView)g).setVisibility(8);
            viewgroup.setVisibility(0);
            viewgroup = getFragmentManager();
            bf = viewgroup.a(h.dD);
            if (bf == null)
            {
                bf = be.a();
                viewgroup.a().a(h.dD, bf, "messageListFragment").b();
            }
        }
        if (((ase)binder.a(ase)).a(aK.h(), O()))
        {
            cg = true;
        }
        bj = (ViewGroup)view.findViewById(h.fa);
        bk = new aws(this);
        bundle = getChildFragmentManager().a(atq.getName());
        viewgroup = bundle;
        if (bundle == null)
        {
            viewgroup = new avb();
            getChildFragmentManager().a().a(h.y, viewgroup, atq.getName()).b();
        }
        bp = (atq)viewgroup;
        bq = view.findViewById(h.y);
        bl = (FloatingButtonWithCounter)view.findViewById(h.bw);
        bl.bringToFront();
        new ayh(this, ((ViewGroup)getActivity().findViewById(0x1020002)).getChildAt(0));
        viewgroup = (ViewGroup)view.findViewById(h.ae);
        bo = new avk(getContext(), layoutinflater, an);
        viewgroup.addView(bo, new android.view.ViewGroup.LayoutParams(-1, -2));
        aT = new avu(getContext(), (ListView)g);
        bundle = new axc(this);
        bo.a(bundle);
        if (cg)
        {
            viewgroup.setVisibility(8);
            bl.setVisibility(8);
            if (bq != null)
            {
                bq.setVisibility(8);
            }
        }
        bw = (ParticipantsGalleryView)view.findViewById(h.ec);
        bw.e();
        bw.a(aq.d(), aK);
        bw.a(new ayn(this));
        az();
        viewgroup = new bho(view, ar);
        bundle = new bll(view, this, ar);
        bkq bkq1 = new bkq(view, this, ar);
        bli bli1 = new bli(view, this, ar);
        bgc bgc1 = new bgc(view, this, ar);
        bft bft1 = new bft(view, this, ar);
        aue aue1 = new aue(view, this, ar);
        bU = new azy(context, aK, lifecycle);
        bkw bkw1 = new bkw(view, bU, ar);
        cm = (new aux[] {
            viewgroup, bundle, bkq1, bft1, new aug(view, a, ar, aK.h()), aue1, bkw1, bgc1, bli1, new blg(view, b, ar)
        });
        cn = new bln(view, this);
        viewgroup = aq.b();
        if (viewgroup != null && ((aia) (viewgroup)).l.size() > 0)
        {
            gdv.a("The saved snackbar shown size should equal the current list of snackbar.", Integer.valueOf(cm.length), Integer.valueOf(((aia) (viewgroup)).l.size()));
            viewgroup = ((aia) (viewgroup)).l.iterator();
            for (int i1 = 0; viewgroup.hasNext(); i1++)
            {
                bundle = (Boolean)viewgroup.next();
                cm[i1].a = g.a(bundle, false);
            }

        }
        bu = (ImageView)view.findViewById(h.fQ);
        aQ = new baf(this, aK, bu);
        aR = new baj(context);
        aS = new azk(context);
        ck = (Chronometer)view.findViewById(h.ab);
        cl = (FixedParticipantsView)view.findViewById(h.ci);
        ((ViewGroup)view.findViewById(h.dU)).setLayoutTransition(new LayoutTransition());
        bj.setLayoutTransition(new LayoutTransition());
        viewgroup = layoutinflater.inflate(g.gy, null);
        ((ListView)g).addHeaderView(viewgroup);
        layoutinflater = layoutinflater.inflate(g.gA, g, false);
        ((ListView)g).addHeaderView(layoutinflater);
        br = viewgroup.findViewById(h.dh);
        aw();
        ce = new MessageListAnimationManager(g, bY, by);
        f = new aqu(this, g, ce, aq.d(), P());
        ((aqu)f).a(new awu(this));
        ((ListView)g).setAdapter(f);
        if (!g.a(context, "babel_force_gb_copy_paste_textview", true))
        {
            ((ListView)g).setChoiceMode(0);
        } else
        {
            registerForContextMenu(g);
            avu.a(context);
        }
        ((ListView)g).setOnScrollListener(new awv(this));
        ((ListView)g).setRecyclerListener(new awx(this));
        bs = view.findViewById(h.fS);
        bt = (EditText)view.findViewById(h.fR);
        bt.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(dtp.a().t())
        });
        view.findViewById(h.aJ).setOnClickListener(new awy(this));
        bz = (EasterEggView)view.findViewById(h.aX);
        if (!fzd.a(getActivity().getContentResolver(), "babel_easter_eggs", true))
        {
            bz.setVisibility(8);
            bz = null;
        }
        bA = (ProximityCoverView)view.findViewById(h.C);
        showContent(view);
        getActivity().q_();
        ap.a(cy);
        return view;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ao.a();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((MessageListItemView)iterator.next()).j()) { }
        bo.d();
        ap.b(cy);
        cr.b();
        bw.a(null);
    }

    public void onFinished(FrameSequenceDrawable framesequencedrawable)
    {
        bu.setVisibility(8);
        framesequencedrawable = (FrameSequenceDrawable)bu.getDrawable();
        framesequencedrawable.stop();
        framesequencedrawable.destroy();
        bu.setImageDrawable(null);
    }

    public void onLoadFinished(em em1, Object obj)
    {
        Object obj1;
        obj = (Cursor)obj;
        obj1 = ((coz)em1).C();
        if (TextUtils.equals(((aoa) (obj1)).a(), aK.a())) goto _L2; else goto _L1
_L1:
        eev.f("Conv", "onLoadFinished called for non-fragment account");
_L9:
        return;
_L2:
        int k1 = em1.o();
        k1;
        JVM INSTR tableswitch 0 3: default 80
    //                   0 1347
    //                   1 1377
    //                   2 397
    //                   3 1386;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        int i1;
        gdv.b("Expected non-null", aK);
        if (P())
        {
            if (h)
            {
                eev.b("Babel", "tryRunConversationVariantsEngine -- INVITE");
            }
            i1 = 0;
        } else
        if (aq.d() == 1 && M() == null)
        {
            if (h)
            {
                eev.b("Babel", "tryRunConversationVariantsEngine -- NO ROOT");
            }
            i1 = 0;
        } else
        if (bg.isEmpty())
        {
            if (h)
            {
                eev.b("Babel", "tryRunConversationVariantsEngine -- NO MERGED IDS");
            }
            i1 = 0;
        } else
        if (aW == null)
        {
            if (h)
            {
                eev.b("Babel", "tryRunConversationVariantsEngine -- NO MERGE KEY");
            }
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (i1 != 0)
        {
            if (h)
            {
                eev.b("Babel", "Running conversation variant engine");
            }
            String s2;
            boolean flag;
            int l1;
            int i2;
            int j2;
            long l2;
            if (cb)
            {
                eev.e("Babel", "Skipping variant computation; already ran");
            } else
            {
                cb = true;
                em1 = new axo(this);
                obj = String.valueOf(this);
                String s1 = String.valueOf(getLoaderManager());
                eev.e("Babel", (new StringBuilder(String.valueOf(obj).length() + 37 + String.valueOf(s1).length())).append("Starting variant engine for ").append(((String) (obj))).append(" loader: ").append(s1).toString());
                aL.a("conversation_variant_engine_computation");
                ap.a(new axq(this));
                ca.a(aq.d(), aW, bg.values(), em1);
            }
        }
        em1 = getActivity();
        if (em1 != null)
        {
            em1.q_();
        }
        bW[k1] = true;
        if (!bP) goto _L9; else goto _L8
_L8:
        k1 = 1;
        em1 = bW;
        l1 = em1.length;
        i1 = 0;
_L19:
        flag = k1;
        if (i1 >= l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (em1[i1] != 0) goto _L11; else goto _L10
_L10:
        flag = false;
        if (!flag) goto _L9; else goto _L12
_L12:
        by.removeCallbacks(bV);
        showContent(getView());
        if (aq.d() != 1 || g.a(cqo.b)) goto _L14; else goto _L13
_L13:
        i1 = g.a(context, "babel_max_outgoing_message_search_rows", 50);
        if (i1 <= 0) goto _L14; else goto _L15
_L15:
        em1 = ((aqu)f).a();
        if (em1 == null || !em1.moveToLast()) goto _L14; else goto _L16
_L16:
        k1 = em1.getInt(36);
_L21:
        if (dsv.values()[em1.getInt(8)] != dsv.b) goto _L18; else goto _L17
_L17:
        i1 = em1.getInt(36);
_L22:
        int j1;
        if (k1 == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0)
        {
            if (i1 == 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 == 0 && g.e(k1) != g.e(i1))
            {
                bb = true;
                ac();
            }
        }
_L14:
        bP = false;
        return;
_L6:
        obj = new bai(((Cursor) (obj)));
        ao.a(((Cursor) (obj)));
        if (g.a(context, "babel_extra_log_scrolling", false))
        {
            obj1 = String.valueOf(em1);
            i1 = ((aqu)f).getCount();
            s2 = String.valueOf(Integer.valueOf(((Cursor) (obj)).getCount()));
            eev.e("Babel_Scroll", (new StringBuilder(String.valueOf(obj1).length() + 98 + String.valueOf(s2).length())).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(((String) (obj1))).append(" mAdapter.getCount(): ").append(i1).append(" new cursor data count: ").append(s2).toString());
        }
        if (h)
        {
            em1 = String.valueOf(em1);
            i1 = ((aqu)f).getCount();
            obj1 = String.valueOf(Integer.valueOf(((Cursor) (obj)).getCount()));
            eev.b("Conv", (new StringBuilder(String.valueOf(em1).length() + 98 + String.valueOf(obj1).length())).append("onMessagesLoaderFinished MESSAGES_LOADER ").append(em1).append(" mAdapter.getCount(): ").append(i1).append(" new cursor data count: ").append(((String) (obj1))).toString());
        }
        if (ce.a().c())
        {
            if (h)
            {
                eev.b("Conv", "  ignore onMessagesLoaderFinished() MESSAGES_LOADER, UI updateblocking is on.");
            }
        } else
        {
            l1 = ((aqu)f).getCount();
            i2 = ((ListView)g).getFirstVisiblePosition();
            j2 = ((Cursor) (obj)).getCount();
            em1 = ((ListView)g).getChildAt(0);
            if (em1 != null)
            {
                i1 = em1.getTop();
            } else
            {
                i1 = 0;
            }
            ((aqu)f).b(((Cursor) (obj)));
            if (bL != null && bM != null)
            {
                ((Cursor) (obj)).moveToLast();
                if (((Cursor) (obj)).getString(1).equals(bM))
                {
                    aQ.a(bL);
                    aU.a(bL);
                }
            }
            bL = null;
            bM = null;
            if (l1 > 0 && j2 > l1 + 1)
            {
                if (av())
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                j1 = Math.max(j1, Math.min((j2 - l1) + ((i2 + j1) - 1), j2 - 1));
                ((ListView)g).setSelectionFromTop(j1, i1);
            }
            if (aq.a() == null)
            {
                showEmptyView(getView());
            } else
            {
                showContent(getView());
            }
            if (((Cursor) (obj)).getCount() > 0 && ((Cursor) (obj)).moveToFirst())
            {
                bB = ((Cursor) (obj)).getLong(6);
            } else
            {
                bB = System.currentTimeMillis() * 1000L;
            }
            if (((Cursor) (obj)).getCount() > 0 && ((Cursor) (obj)).moveToLast())
            {
                l2 = bC;
                bC = ((Cursor) (obj)).getLong(6);
                if (J() && bC > l2 && isVisible())
                {
                    e(((Cursor) (obj)).getString(2));
                }
                if (!P())
                {
                    at();
                }
            }
            if (!bh)
            {
                l2 = SystemClock.elapsedRealtime();
                aL.a(aK.h(), "hangout_launch_remote_notification", l2, 1002);
                aL.a(aK.h(), "click_contact_list", l2, 1004);
                aL.a(aK.h(), "click_conversation_list", l2, 1005);
            }
            bh = true;
            aw();
            if (((Cursor) (obj)).moveToLast())
            {
                if (g.a(context, "babel_extra_log_scrolling", false))
                {
                    eev.e("Babel_Scroll", "onMessagesLoaderFinished moveToLast");
                }
                i1 = cx.size();
label0:
                do
                {
                    do
                    {
                        l2 = ((Cursor) (obj)).getLong(0);
                        j1 = i1;
                        if (cx.containsKey(Long.valueOf(l2)))
                        {
                            em1 = dsu.values()[((Cursor) (obj)).getInt(7)];
                            if (em1 == dsu.e)
                            {
                                cx.remove(Long.valueOf(l2));
                            } else
                            {
                                cx.put(Long.valueOf(l2), Integer.valueOf(em1.ordinal()));
                            }
                            j1 = i1 - 1;
                        }
                        em1 = ((Cursor) (obj)).getString(4);
                        if (!ba && em1 != null && em1.equalsIgnoreCase(aK.b().a))
                        {
                            ba = true;
                        }
                        if (!((Cursor) (obj)).moveToPrevious())
                        {
                            break label0;
                        }
                        i1 = j1;
                    } while (!ba);
                    i1 = j1;
                } while (j1 > 0);
            }
            ac();
            bo.a();
        }
          goto _L3
_L4:
        c(((Cursor) (obj)), ((aoa) (obj1)));
        if (!bg.isEmpty())
        {
            getLoaderManager().b(1, null, this);
        }
          goto _L3
_L5:
        a(((Cursor) (obj)), ((aoa) (obj1)));
          goto _L3
_L7:
        if (J())
        {
            b(((Cursor) (obj)), ((aoa) (obj1)));
        } else
        {
            bK = ((Cursor) (obj));
        }
          goto _L3
_L11:
        i1++;
          goto _L19
_L18:
        j1 = i1 - 1;
        if (!em1.moveToPrevious())
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (j1 > 0) goto _L21; else goto _L20
_L20:
        i1 = 0;
          goto _L22
    }

    public void onLoaderReset(em em1)
    {
        ((aqu)f).a(null);
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
        boolean flag3 = bU.a(getActivity(), menuitem, aq.a().a);
        if (flag3)
        {
            return true;
        }
        if (menuitem.getItemId() == h.fr)
        {
            bxi bxi1 = bxi.a;
            menuitem = ay();
            if (menuitem != null)
            {
                ap.a(menuitem);
                return flag3;
            }
            obj1 = aq.a();
            menuitem = ((asa) (obj1)).e;
            if (((asa) (obj1)).h != null)
            {
                menuitem = g.a(((asa) (obj1)).h, true);
            }
            ((bxg)binder.a(bxg)).a(context, getFragmentManager(), menuitem, ((asa) (obj1)).e, ((asa) (obj1)).a, bxi1);
            return flag3;
        }
        if (menuitem.getItemId() == h.fB)
        {
            if (((asa) (obj1)).a != null)
            {
                String as1[] = (String[])bg.keySet().toArray(new String[bg.size()]);
                int i1 = aq.d();
                String s1;
                Intent intent;
                aoa aoa2;
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
                    s1 = ((asa) (obj1)).h.c();
                    menuitem = ((asa) (obj1)).h.b();
                }
                aoa2 = aK;
                s2 = ((asa) (obj1)).a;
                s3 = aq.e();
                k1 = d();
                l1 = aN;
                l2 = bC;
                flag1 = cc;
                s4 = aX;
                s5 = aY;
                intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/ConversationParticipantsActivity);
                intent.putExtra("account_id", aoa2.h());
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
                    menuitem.putExtra("conversation_id", ((asa) (obj1)).a);
                    intent.putExtra("share_intent", menuitem);
                }
                as.a(g.kk, intent);
                return flag3;
            } else
            {
                return flag3;
            }
        }
        if (menuitem.getItemId() == h.t)
        {
            menuitem = ah();
            gdv.b("Expected non-null", menuitem);
            menuitem = g.r(menuitem);
            getActivity().startActivityForResult(menuitem, 102);
            return flag3;
        }
        if (menuitem.getItemId() == h.eJ)
        {
            aoa aoa1;
            Collection collection;
            boolean flag;
            if (aq.d() == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aoa1 = aK;
            obj1 = aq.a().a;
            collection = ap.f();
            if (flag)
            {
                menuitem = cov.d;
            } else
            {
                menuitem = cov.c;
            }
            startActivity(g.a(aoa1, ((String) (obj1)), collection, menuitem, aA()));
            return flag3;
        }
        if (menuitem.getItemId() == h.fK)
        {
            g.a(aK, 1535);
            a(atu.d);
            return flag3;
        }
        if (menuitem.getItemId() == h.eF)
        {
            g.a(aK, 1534);
            a(atu.c);
            return flag3;
        }
        if (menuitem.getItemId() == h.eO || menuitem.getItemId() == h.eE)
        {
            ArrayList arraylist = new ArrayList();
            Object obj = new ArrayList();
            a(new awg(this, arraylist, ((ArrayList) (obj))));
            String as2[] = (String[])arraylist.toArray(new String[arraylist.size()]);
            long al1[] = new long[((ArrayList) (obj)).size()];
            for (int j1 = 0; j1 < ((ArrayList) (obj)).size(); j1++)
            {
                al1[j1] = g.a((Long)((ArrayList) (obj)).get(j1), 0L);
            }

            obj = aK;
            boolean flag2;
            if (menuitem.getItemId() == h.eE)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            RealTimeChatService.a(((aoa) (obj)), as2, al1, flag2, false);
            by.postDelayed(new awj(this, ((asa) (obj1))), 250L);
            return flag3;
        }
        if (menuitem.getItemId() == h.eG)
        {
            if (aK != null)
            {
                displayDeleteConversationDialog(aK.h());
                return flag3;
            } else
            {
                eev.f("Conv", "ConversationFragment delete failed because of null account.");
                return flag3;
            }
        }
        if (menuitem.getItemId() == h.eK)
        {
            if (aK != null)
            {
                menuitem = bfr.a(getString(l.iq), getString(l.ip), getString(l.io), getString(l.iN));
                menuitem.setTargetFragment(this, 0);
                menuitem.a(getFragmentManager(), "leave_conversation");
                return flag3;
            } else
            {
                eev.f("Conv", "ConversationFragment leave failed because of null account.");
                return flag3;
            }
        }
        if (menuitem.getItemId() == h.eU)
        {
            RealTimeChatService.b(aK, (String[])bg.keySet().toArray(new String[bg.size()]));
            return flag3;
        }
        if (menuitem.getItemId() == h.aF)
        {
            (new aui(getActivity())).a(aK).a(aW).a(M()).a(((asa) (obj1))).a().show();
            return flag3;
        } else
        {
            return false;
        }
    }

    public void onPause()
    {
        super.onPause();
        by.removeCallbacks(cf);
        by.removeCallbacks(bV);
        Iterator iterator = bx.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            iterator.remove();
            obj = a((cgd)((java.util.Map.Entry) (obj)).getKey());
            if (obj != null)
            {
                bw.a(((cfz) (obj)), 4, true);
            }
        } while (true);
        ((aqu)f).c();
        aw();
        for (Iterator iterator1 = d.iterator(); iterator1.hasNext(); ((MessageListItemView)iterator1.next()).i()) { }
        if (bz != null)
        {
            bz.a();
        }
        egb.b = null;
        bA.d();
        bA.e();
        bA.b();
        for (Iterator iterator2 = d.iterator(); iterator2.hasNext(); ((MessageListItemView)iterator2.next()).z()) { }
        ad();
        bj.removeOnLayoutChangeListener(bk);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        if (getActivity() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        MenuItem menuitem = menu.findItem(h.eE);
        MenuItem menuitem1 = menu.findItem(h.eO);
        boolean flag1;
        if (menuitem != null)
        {
            int ai1[];
            int i1;
            int k1;
            if (!cj && !cg)
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
            if (cj && !cg)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            menuitem1.setVisible(flag1);
        }
        if (!cc)
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
            eev.f("Babel", (new StringBuilder(String.valueOf(menu).length() + 52 + String.valueOf(obj).length())).append("variant not set when preparing options for ").append(menu).append(" loader: ").append(((String) (obj))).toString());
            return;
        }
        if (P())
        {
            super.onPrepareOptionsMenu(menu);
            return;
        }
        Object obj1 = menu.findItem(h.t);
        Object obj2;
        int j1;
        boolean flag;
        int l1;
        boolean flag2;
        boolean flag3;
        if (ah() != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj1)).setVisible(flag2);
        obj1 = menu.findItem(h.eL);
        if (obj1 != null)
        {
            ((MenuItem) (obj1)).setVisible(false);
        }
        obj1 = menu.findItem(h.eP);
        if (obj1 != null)
        {
            ((MenuItem) (obj1)).setVisible(false);
        }
        obj1 = menu.findItem(h.eJ);
        obj2 = menu.findItem(h.fr);
        flag3 = g.e(d());
        l1 = aq.d();
        if (obj1 != null)
        {
            MenuItem menuitem2;
            boolean flag6;
            if (aK != null && aK.l())
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (bi && j1 == 0 && (!flag3 || l1 != 2 && due.a(aK.h(), d())) && !cc)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0 && !cg)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj1)).setEnabled(flag2);
            if (j1 != 0 && !cg)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj1)).setVisible(flag2);
            if (l1 == 2)
            {
                j1 = l.id;
            } else
            if (flag3)
            {
                j1 = l.gB;
            } else
            {
                j1 = l._fldif;
            }
            ((MenuItem) (obj1)).setTitle(j1);
        }
        if (g.a(context, "babel_enable_viral_flow_v1", true) && dcn.c().length > 0 && l1 != 2 && ay() == null)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0 && flag3)
        {
            if (!cg)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj2)).setVisible(flag2);
        } else
        {
            ((MenuItem) (obj2)).setVisible(false);
        }
        bU.a(menu, flag3, cg);
        obj2 = menu.findItem(h.eG);
        menuitem2 = menu.findItem(h.eK);
        obj1 = menu.findItem(h.eU);
        if (l1 == 2 && !g.e(d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj2 != null)
        {
            if (!flag && !cg)
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
            if (flag && !cg)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            menuitem2.setVisible(flag2);
        }
        obj2 = ap.d();
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
        obj2 = menu.findItem(h.fK);
        obj1 = ae();
        if ((obj1 == Boolean.TRUE || j1 != 0) && !cg)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj2)).setEnabled(flag2);
        if ((obj1 != Boolean.FALSE || j1 != 0) && !cg)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((MenuItem) (obj2)).setVisible(flag2);
        obj2 = menu.findItem(h.eF);
        if (obj2 != null)
        {
            boolean flag4;
            boolean flag5;
            if (obj1 == Boolean.TRUE)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (w() && ((dbt)binder.a(dbt)).a(getActivity(), aK))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (w() && eey.e())
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            flag6 = cr.a();
            if (flag4 || flag5 && flag6)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (aq.d() != 1)
            {
                eev.c("Conv", "hasParticipantPhoneNumber: Not 1:1 client conversation type");
                flag2 = false;
            } else
            if (!g.f(d()) && !g.e(d()))
            {
                eev.c("Conv", "hasParticipantPhoneNumber: Not Babel or SMS transport");
                flag2 = false;
            } else
            {
                flag2 = ap.g();
            }
            if (flag2 && j1 != 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            eev.c("Conv", (new StringBuilder(155)).append("hasHangoutsCallOption: ").append(flag3).append(" supportsPhoneCallsOverVoip: ").append(flag4).append(" supportsPhoneCallsOverPstn: ").append(flag5).append(" hasCellularService: ").append(flag6).append(" hasParticipantPhoneNumber: ").append(flag2).toString());
            if ((flag3 || j1 != 0) && !cg)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj2)).setVisible(flag2);
        }
        obj1 = menu.findItem(h.fB);
        if (obj1 != null)
        {
            if (obj != null || l1 == 2)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j1 != 0 && !cg)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((MenuItem) (obj1)).setVisible(flag2);
        }
        obj = menu.findItem(h.aF);
        if (obj != null)
        {
            flag2 = eep.a();
            ((MenuItem) (obj)).setVisible(flag2).setEnabled(flag2);
        }
        super.onPrepareOptionsMenu(menu);
        return;
    }

    public void onResume()
    {
        super.onResume();
        az();
        by.post(cf);
        by.postDelayed(cf, 31000L);
        if (((aqu)f).a() == null)
        {
            showEmptyViewProgress(getView());
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((MessageListItemView)iterator.next()).h()) { }
        bA.a(new awk(this));
        bA.a(new awl(this));
        if (an())
        {
            bA.a();
        }
        ao();
        egb.b = new awm(this);
        bj.addOnLayoutChangeListener(bk);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        boolean flag = true;
        super.onSaveInstanceState(bundle);
        ao.b(bundle);
        Object obj = aq.a();
        int i1 = aq.d();
        aux aaux[];
        int j1;
        if (obj != null && ((asa) (obj)).a != null)
        {
            obj = new aia(((asa) (obj)).a, i1, ((asa) (obj)).b);
            obj.d = true;
            obj.e = true;
        } else
        {
            aia aia1 = aq.b();
            obj = new aia(aia1.a, i1, aia1.c);
            obj.d = aia1.d;
            obj.e = aia1.e;
        }
        aaux = cm;
        j1 = aaux.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            aux aux1 = aaux[i1];
            ((aia) (obj)).l.add(Boolean.valueOf(aux1.a));
        }

        obj.g = aq.e();
        obj.h = bI;
        obj.i = aX;
        obj.j = aY;
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
        ((aqu)f).e_();
    }

    public void onStop()
    {
        super.onStop();
        RealTimeChatService.b(aP);
    }

    public cfz q()
    {
        return bH;
    }

    public void r()
    {
        bH = null;
    }

    public long s()
    {
        return bF;
    }

    public boolean t()
    {
        return g.f(d()) && !aow.a(O());
    }

    public boolean u()
    {
        return bb;
    }

    public boolean v()
    {
        return isResumed();
    }

    public boolean w()
    {
        return aK.aa();
    }

    public boolean x()
    {
        return !GcmStateReceiver.a;
    }

    public boolean y()
    {
        return !a(context);
    }

    public boolean z()
    {
        return g.d(d());
    }

    static 
    {
        hnc hnc = eev.e;
        aJ = (new int[] {
            h.t, h.eJ, h.eU, h.eK
        });
        ap();
        g.a(g.nU).a(new awn());
    }
}
