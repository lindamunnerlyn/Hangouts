// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class aym
{

    private static final boolean c = false;
    public final ani a;
    String b;
    private final Context d;
    private final String e;
    private final boolean f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private final ayv h;
    private final Collection i = new HashSet();
    private ays j;
    private final boolean k;
    private ebx l;
    private final Comparator m = new ayq(this);

    public aym(Context context, ayv ayv1, ani ani1, String s, boolean flag)
    {
        b = null;
        d = context;
        h = (ayv)gbh.b(ayv1);
        a = (ani)gbh.b(ani1);
        e = s;
        f = flag;
        k = ((drw)hgx.a(context, drw)).b();
        if (c || g.a(context, "babel_cve_logging", false))
        {
            l = new ebx("cve");
            l.a("created");
        }
    }

    private ark a(Collection collection, ark ark1, int i1)
    {
        if (collection.size() != 1) goto _L2; else goto _L1
_L1:
        collection = (ark)collection.iterator().next();
_L4:
        return collection;
_L2:
        if (f || ark1.b == 1)
        {
            return ark1;
        }
        String s = ebz.k(ark1.c);
        if (l != null)
        {
            l.a("getSelected:toLegacy");
        }
        Iterator iterator = collection.iterator();
        collection = null;
label0:
        do
        {
label1:
            {
                String s1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label1;
                    }
                    ark1 = (ark)iterator.next();
                    s1 = ebz.k(ark1.c);
                    if (l != null)
                    {
                        l.a("getSelected:toLegacyLoop");
                    }
                } while (!TextUtils.equals(s, s1));
                collection = ark1;
                if (ark1.b == i1)
                {
                    break label0;
                }
                collection = ark1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if (collection != null)
        {
            return collection;
        } else
        {
            ebw.f("Babel", (new StringBuilder(55)).append("Could not find valid transport, preferred = ").append(i1).toString());
            return null;
        }
    }

    private static ark a(Collection collection, String s)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            ark ark1 = (ark)collection.next();
            if (TextUtils.equals(s, ark1.a))
            {
                return ark1;
            }
        }

        return null;
    }

    private ayt a(Collection collection)
    {
        boolean flag = false;
        Integer integer = null;
        long l1 = 0L;
        int i1 = 2;
        Iterator iterator = collection.iterator();
        long l3 = 0L;
        while (iterator.hasNext()) 
        {
            axo axo1 = (axo)iterator.next();
            long l2;
            boolean flag2;
            if (g.e(axo1.b))
            {
                boolean flag1 = true;
                l2 = l3;
                flag = flag1;
                if (axo1.g > l3)
                {
                    i1 = axo1.b;
                    l2 = axo1.g;
                    flag = flag1;
                }
            } else
            {
                l2 = l3;
            }
            if (axo1.g > l1)
            {
                b = axo1.a;
                l1 = axo1.g;
                integer = Integer.valueOf(axo1.b);
            }
            l3 = l2;
        }
        if (b == null)
        {
            b = ((axo)collection.iterator().next()).a;
        }
        if (l3 != 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return new ayt(this, flag, flag2, i1, integer);
    }

    private static ceu a(ceu ceu1, aoh aoh1, boolean flag)
    {
label0:
        {
            if (aoh1.h != null)
            {
                Iterator iterator = aoh1.h.iterator();
                boolean flag1 = false;
                while (iterator.hasNext()) 
                {
                    ceu ceu2 = (ceu)iterator.next();
                    aoh1 = ceu2;
                    if (flag1)
                    {
                        break label0;
                    }
                    if (ceu2.equals(ceu1))
                    {
                        flag1 = true;
                    } else
                    {
                        aoh1 = ceu2;
                        if (!flag)
                        {
                            break label0;
                        }
                        aoh1 = ceu2;
                        if (TextUtils.isEmpty(ceu2.c))
                        {
                            break label0;
                        }
                        aoh1 = ceu2;
                        if (!ceu2.c.equals(ceu1.c))
                        {
                            break label0;
                        }
                        flag1 = true;
                    }
                }
            }
            aoh1 = null;
        }
        return aoh1;
    }

    static ebx a(aym aym1)
    {
        return aym1.l;
    }

    private Collection a(String s, Collection collection, dme dme1)
    {
        gz gz1;
        ceu ceu1;
        aoe aoe1;
        ayr ayr1;
        Iterator iterator;
        if (l != null)
        {
            ebx ebx1 = l;
            int i1 = collection.size();
            ebx1.a((new StringBuilder(28)).append("computeInternal: ").append(i1).toString());
        }
        gz1 = new gz();
        ceu1 = g.a(a.b(), ebz.g(), null, null, null, null, null, Boolean.valueOf(false));
        aoe1 = new aoe(d, a.h());
        ayr1 = new ayr(l);
        if (l != null)
        {
            l.a("cI:preloop");
        }
        iterator = collection.iterator();
_L9:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = (axo)iterator.next();
        if (l != null)
        {
            l.a("cI:loopStart");
        }
        obj1 = ((axo) (obj2)).a;
        obj = aoe1.f(((String) (obj1)));
        if (l != null)
        {
            l.a("getCI:getConvInfo");
        }
        aoh aoh1;
        aoh1 = ((aoh) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        aoh1 = ((aoh) (obj));
        if (!aoe.a(((String) (obj1))))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj1 = RealTimeChatService.a(((String) (obj1)));
        aoh1 = ((aoh) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj = aoe1.f(((String) (obj1)));
        aoh1 = ((aoh) (obj));
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        l.a("getCI:getConvInfoServer");
        aoh1 = ((aoh) (obj));
        ceu ceu2;
        String s1;
        String s2;
        int j1;
        boolean flag;
        try
        {
            if (l != null)
            {
                l.a("cI:convInfo");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel", ">>>>>>>>>> got exception computing variants", s);
            return null;
        }
        if (aoh1 != null)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        s = ((axo) (obj2)).a;
        dme1 = ((axo) (obj2)).f;
        j1 = collection.size();
        ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 66 + String.valueOf(dme1).length())).append("Null conversationInfo for ").append(s).append("; merge key = ").append(dme1).append("; total count: ").append(j1).toString());
        return null;
        ceu2 = a(ceu1, aoh1, a.q());
        if (l != null)
        {
            l.a("cI:getParticipant");
        }
        if (!k) goto _L4; else goto _L3
_L3:
        if (ceu2 != null) goto _L6; else goto _L5
_L5:
        obj = null;
_L20:
        if (l != null)
        {
            l.a("cI:getContactDetails");
        }
        if (obj == null) goto _L4; else goto _L7
_L7:
        a(((bhj) (obj)), gz1);
        if (l != null)
        {
            l.a("cI:maintain");
        }
_L4:
        if (ceu2 == null) goto _L9; else goto _L8
_L8:
        if (!g.e(((axo) (obj2)).b)) goto _L11; else goto _L10
_L10:
        flag = false;
        obj = d.getResources().getString(l.gJ);
        if (!TextUtils.isEmpty(ceu2.c) && !((String) (obj)).equals(ceu2.c)) goto _L13; else goto _L12
_L12:
        obj = d.getResources().getString(l.sW);
        flag = true;
        obj1 = null;
_L23:
        s1 = ((axo) (obj2)).a;
        j1 = ((axo) (obj2)).b;
        s2 = ceu2.c;
        if (obj1 == null) goto _L15; else goto _L14
_L14:
        if (((ayu) (obj1)).b == null) goto _L15; else goto _L16
_L16:
        obj2 = ((ayu) (obj1)).b.b();
_L26:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1024;
        }
        obj1 = ((ayu) (obj1)).a;
_L27:
        ayr1.a(new ark(s1, j1, ceu2, ((String) (obj)), null, s2, ((String) (obj2)), aoh1, ((bhj) (obj1)), flag));
        if (l != null)
        {
            l.a("addVariantFromPandCI:smsMerge");
        }
_L24:
        if (l != null)
        {
            l.a("cI:addFromPAndCI");
        }
          goto _L9
_L6:
        obj = null;
        if (TextUtils.isEmpty(ceu2.c)) goto _L18; else goto _L17
_L17:
        obj1 = aoe1.b(ceu2.c, dme1);
        obj = obj1;
        if (l == null) goto _L20; else goto _L19
_L19:
        l.a("getDetails:phone");
        obj = obj1;
          goto _L20
_L18:
        if (TextUtils.isEmpty(ceu2.b())) goto _L20; else goto _L21
_L21:
        obj1 = dme1.a(ceu2.b());
        obj = obj1;
        if (l == null) goto _L20; else goto _L22
_L22:
        l.a("getDetails:gaia");
        obj = obj1;
          goto _L20
_L13:
        obj = ebz.p(ceu2.c);
        obj1 = (ayu)gz1.get(ebz.k(ceu2.c));
          goto _L23
_L11:
label0:
        {
            if (TextUtils.isEmpty(ceu2.b()))
            {
                break label0;
            }
            ayr1.a(new ark(((axo) (obj2)).a, ((axo) (obj2)).b, ceu2, null, ceu2.g, null, null, aoh1, null, false));
            if (l != null)
            {
                l.a("addVariantFromPandCI:gaiaMerge");
            }
        }
          goto _L24
        obj = String.valueOf(((axo) (obj2)).a);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_943;
        }
        obj = "empty gaia id for non-SMS transport type, conversation id = ".concat(((String) (obj)));
_L25:
        ebw.f("Babel", ((String) (obj)));
          goto _L24
        obj = new String("empty gaia id for non-SMS transport type, conversation id = ");
          goto _L25
_L2:
        if (l != null)
        {
            l.a("cI:postLoop");
        }
        if (k)
        {
            a(ayr1, gz1, aoe1, s);
            if (l != null)
            {
                l.a("cI:addMising");
            }
        }
        s = ayr1.a();
        return s;
_L15:
        obj2 = null;
          goto _L26
        obj1 = null;
          goto _L27
    }

    private Collection a(Collection collection, int i1)
    {
        if (k)
        {
            boolean flag5 = a.E();
            boolean flag6 = a.S();
            boolean flag2 = a.R();
            StringBuilder stringbuilder;
            Iterator iterator;
            boolean flag1;
            if (!flag2 && flag5 && i1 == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag2 && flag6 && i1 == 3)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            stringbuilder = new StringBuilder();
            iterator = collection.iterator();
            i1 = 0;
label0:
            do
            {
                int j1;
label1:
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    ark ark1 = (ark)iterator.next();
                    boolean flag;
                    boolean flag3;
                    boolean flag4;
                    if (!ark1.h.i() && !g.a(ark1.h))
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (ark1.b == 2)
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (ark1.b == 3)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (ark1.a != null)
                    {
                        flag4 = true;
                    } else
                    {
                        flag4 = false;
                    }
                    if (j1 != 0)
                    {
                        if ((flag5 || flag4) && flag3)
                        {
                            j1 = i1;
                            if (!flag2)
                            {
                                break label1;
                            }
                        }
                        stringbuilder.append("gv/filtered ").append(ark1.a).append(flag5).append(";").append(flag4).append(";").append(flag3).append(";").append(flag2).append(";true;");
                        iterator.remove();
                        i1 = 1;
                        continue;
                    }
                    j1 = i1;
                    if (!flag)
                    {
                        break label1;
                    }
                    if (flag6 || flag4)
                    {
                        j1 = i1;
                        if (!flag1)
                        {
                            break label1;
                        }
                        j1 = i1;
                        if (!flag3)
                        {
                            break label1;
                        }
                    }
                    stringbuilder.append("carrier/filtered ").append(ark1.a).append(flag6).append(";").append(flag4).append(";true;").append(flag1).append(";").append(flag3).append(";");
                    j1 = 1;
                    iterator.remove();
                }
                i1 = j1;
            } while (true);
            if (i1 != 0)
            {
                ebw.e("Babel", stringbuilder.toString());
                return collection;
            }
        }
        return collection;
    }

    static void a(aym aym1, Collection collection, String s, int i1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        obj = null;
        if (i1 == 2)
        {
            if (aym1.l != null)
            {
                aym1.l.a("compute group");
            }
            gbh.a(Integer.valueOf(1), Integer.valueOf(collection.size()));
            collection = (axo)collection.iterator().next();
            collection = new ark(((axo) (collection)).a, ((axo) (collection)).b, null, null, null, null, null, null, null, false);
            s = new ArrayList(1);
            s.add(collection);
            aym1.a(((List) (s)), ((ark) (collection)));
            return;
        }
        if (aym1.k)
        {
            obj = dme.a();
        }
        if (aym1.l != null)
        {
            ebx ebx1 = aym1.l;
            Object obj1;
            if (obj == null)
            {
                obj1 = "refnull";
            } else
            {
                obj1 = "ref";
            }
            ebx1.a(((String) (obj1)));
        }
        obj1 = aym1.a(s, collection, ((dme) (obj)));
        if (aym1.l != null)
        {
            aym1.l.a("computeInternal");
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        aym1.i.addAll(((Collection) (obj1)));
        if (obj != null)
        {
            ((dme) (obj)).b();
            if (aym1.l != null)
            {
                aym1.l.a("release");
            }
        }
        if (aym1.l != null)
        {
            obj = aym1.l;
            i1 = aym1.i.size();
            ((ebx) (obj)).a((new StringBuilder(28)).append("computeAll done: ").append(i1).toString());
        }
        if (aym1.i.isEmpty())
        {
            i1 = collection.size();
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 54)).append("No variants! mergeKey=").append(s).append("; conversation count=").append(i1).toString());
            return;
        }
        break MISSING_BLOCK_LABEL_376;
        collection;
        if (obj != null)
        {
            ((dme) (obj)).b();
            if (aym1.l != null)
            {
                aym1.l.a("release");
            }
        }
        throw collection;
        collection = aym1.a(collection);
        if (aym1.l != null)
        {
            aym1.l.a("messageHistory");
        }
        i1 = ((flag1) ? 1 : 0);
        if (aym1.k)
        {
            if (aym1.e != null)
            {
                s = a(aym1.i, aym1.e);
                if (s != null)
                {
                    i1 = ((flag) ? 1 : 0);
                    if (g.e(((ark) (s)).b))
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (!aym1.f)
                        {
                            i1 = 1;
                        }
                    }
                } else
                {
                    i1 = 1;
                }
            } else
            {
                i1 = ((flag1) ? 1 : 0);
                if (((ayt) (collection)).d != null)
                {
                    i1 = ((flag1) ? 1 : 0);
                    if (g.f(g.a(((ayt) (collection)).d, 0)))
                    {
                        i1 = 0;
                    }
                }
            }
        }
        if (i1 != 0 && aym1.k && (((ayt) (collection)).a || aym1.a()) && !((ayt) (collection)).b && aym1.a.R())
        {
            aym1.g.post(new ayo(aym1));
            return;
        } else
        {
            aym1.a(aym1.a.a(((ayt) (collection)).c));
            return;
        }
    }

    private void a(ayr ayr1, gz gz1, aoe aoe1, String s)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = ayr1.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ark ark1 = (ark)iterator.next();
            if (l != null)
            {
                l.a("addMissing:loopStart");
            }
            if (g.e(ark1.b))
            {
                String s2 = ebz.k(ark1.c);
                if (l != null)
                {
                    l.a("addMissing:toLegacy");
                }
                if (!hashmap.containsKey(s2))
                {
                    hashmap.put(s2, new HashSet());
                }
                ((HashSet)hashmap.get(s2)).add(Integer.valueOf(ark1.b));
                if (!gz1.containsKey(s2))
                {
                    gz1.put(s2, new ayu(null, new bho(s2, null)));
                }
            }
        } while (true);
        for (Iterator iterator1 = gz1.keySet().iterator(); iterator1.hasNext();)
        {
            String s1 = (String)iterator1.next();
            if (l != null)
            {
                l.a("addMissing:loopStart2");
            }
            Object obj = new HashSet();
            ((Set) (obj)).add(Integer.valueOf(2));
            ((Set) (obj)).add(Integer.valueOf(3));
            if (hashmap.containsKey(s1))
            {
                ((Set) (obj)).removeAll((Collection)hashmap.get(s1));
            }
            if (!((Set) (obj)).isEmpty())
            {
                if (l != null)
                {
                    l.a("addMissing:reqMedEmpty");
                }
                String s3 = aoe1.a(null, s1);
                if (l != null)
                {
                    l.a("addMissing:mergeKey");
                }
                if (TextUtils.equals(s, s3))
                {
                    obj = ((Set) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        Integer integer = (Integer)((Iterator) (obj)).next();
                        ceu ceu1 = g.a(d, s1, null, null);
                        ayu ayu1 = (ayu)gz1.get(s1);
                        ayr1.a(new ark(null, g.a(integer, 0), ceu1, s1, null, s1, ayu1.b.b(), null, ayu1.a, TextUtils.isEmpty(s1)));
                        if (l != null)
                        {
                            l.a("addMissing:mergeVariant");
                        }
                    }
                }
            }
        }

    }

    private static void a(bhj bhj1, gz gz1)
    {
        bho bho1;
        for (Iterator iterator = bhj1.f().iterator(); iterator.hasNext(); gz1.put(ebz.k(bho1.a), new ayu(bhj1, bho1)))
        {
            bho1 = (bho)iterator.next();
        }

    }

    private void a(List list, ark ark1)
    {
        if (list.isEmpty())
        {
            return;
        }
        if (l != null)
        {
            l.a("finish bg");
        }
        g.post(new ayp(this, list, ark1));
    }

    private boolean a()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            if (g.e(((ark)iterator.next()).b))
            {
                return true;
            }
        }

        return false;
    }

    static ays b(aym aym1)
    {
        return aym1.j;
    }

    private void b()
    {
        String s;
        int i1;
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 47)).append("skipping candidate variant: ").append(s).append("; type: ").append(i1).toString()))
        {
            ark ark1 = (ark)iterator.next();
            s = String.valueOf(ark1.a);
            i1 = ark1.b;
        }

    }

    static ebx c(aym aym1)
    {
        aym1.l = null;
        return null;
    }

    static ayv d(aym aym1)
    {
        return aym1.h;
    }

    public void a(int i1)
    {
        Object obj;
        if (i.size() == 1)
        {
            obj = (ark)i.iterator().next();
        } else
        if (e != null)
        {
            ark ark1 = a(i, e);
            if (ark1 == null)
            {
                obj = String.valueOf(e);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unexpected null variant matching conversationIdHint=".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unexpected null variant matching conversationIdHint=");
                }
                ebw.f("Babel", ((String) (obj)));
                b();
            }
            obj = ark1;
        } else
        {
            ark ark2 = a(i, b);
            if (ark2 == null)
            {
                obj = String.valueOf(b);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unexpected null variant matching latestOrFirstConversationId=".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unexpected null variant matching latestOrFirstConversationId=");
                }
                ebw.f("Babel", ((String) (obj)));
                b();
            }
            obj = ark2;
        }
        do
        {
            if (obj == null)
            {
                return;
            }
            Object obj1 = a(i, i1);
            obj = a(((Collection) (obj1)), ((ark) (obj)), i1);
            obj1 = new ArrayList(((Collection) (obj1)));
            Collections.sort(((List) (obj1)), m);
            if (l != null)
            {
                l.a("sorted");
            }
            a(((List) (obj1)), ((ark) (obj)));
            return;
        } while (true);
    }

    public void a(int i1, String s, Collection collection, ays ays)
    {
        j = ays;
        if (l != null)
        {
            l.a("started");
        }
        gbk.a(new ayn(this, collection, s, i1));
    }

    static 
    {
        hik hik = ebw.v;
    }
}
