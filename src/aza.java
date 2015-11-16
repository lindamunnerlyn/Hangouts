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

public final class aza
{

    private static final boolean c = false;
    public final aoa a;
    String b;
    private final Context d;
    private final String e;
    private final boolean f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private final azj h;
    private final Collection i = new HashSet();
    private azg j;
    private final boolean k;
    private eew l;
    private final Comparator m = new aze(this);

    public aza(Context context, azj azj1, aoa aoa1, String s, boolean flag)
    {
        b = null;
        d = context;
        h = (azj)gdv.b("Expected non-null", azj1);
        a = (aoa)gdv.b("Expected non-null", aoa1);
        e = s;
        f = flag;
        k = ((dup)hlp.a(context, dup)).c();
        if (c || g.a(context, "babel_cve_logging", false))
        {
            l = new eew("cve");
            l.a("created");
        }
    }

    private asa a(Collection collection, asa asa1, int i1)
    {
        if (collection.size() != 1) goto _L2; else goto _L1
_L1:
        collection = (asa)collection.iterator().next();
_L4:
        return collection;
_L2:
        if (f || asa1.b == 1)
        {
            return asa1;
        }
        String s = eey.k(asa1.c);
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
                    asa1 = (asa)iterator.next();
                    s1 = eey.k(asa1.c);
                    if (l != null)
                    {
                        l.a("getSelected:toLegacyLoop");
                    }
                } while (!TextUtils.equals(s, s1));
                collection = asa1;
                if (asa1.b == i1)
                {
                    break label0;
                }
                collection = asa1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if (collection != null)
        {
            return collection;
        } else
        {
            eev.f("Babel", (new StringBuilder(55)).append("Could not find valid transport, preferred = ").append(i1).toString());
            return null;
        }
    }

    private static asa a(Collection collection, String s)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            asa asa1 = (asa)collection.next();
            if (TextUtils.equals(s, asa1.a))
            {
                return asa1;
            }
        }

        return null;
    }

    private azh a(Collection collection)
    {
        boolean flag = false;
        Integer integer = null;
        long l1 = 0L;
        int i1 = 2;
        Iterator iterator = collection.iterator();
        long l3 = 0L;
        while (iterator.hasNext()) 
        {
            ayc ayc1 = (ayc)iterator.next();
            long l2;
            boolean flag2;
            if (g.e(ayc1.b))
            {
                boolean flag1 = true;
                l2 = l3;
                flag = flag1;
                if (ayc1.g > l3)
                {
                    i1 = ayc1.b;
                    l2 = ayc1.g;
                    flag = flag1;
                }
            } else
            {
                l2 = l3;
            }
            if (ayc1.g > l1)
            {
                b = ayc1.a;
                l1 = ayc1.g;
                integer = Integer.valueOf(ayc1.b);
            }
            l3 = l2;
        }
        if (b == null)
        {
            b = ((ayc)collection.iterator().next()).a;
        }
        if (l3 != 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        return new azh(this, flag, flag2, i1, integer);
    }

    private static cfz a(cfz cfz1, aoz aoz1, boolean flag)
    {
label0:
        {
            if (aoz1.h != null)
            {
                Iterator iterator = aoz1.h.iterator();
                boolean flag1 = false;
                while (iterator.hasNext()) 
                {
                    cfz cfz2 = (cfz)iterator.next();
                    aoz1 = cfz2;
                    if (flag1)
                    {
                        break label0;
                    }
                    if (cfz2.equals(cfz1))
                    {
                        flag1 = true;
                    } else
                    {
                        aoz1 = cfz2;
                        if (!flag)
                        {
                            break label0;
                        }
                        aoz1 = cfz2;
                        if (TextUtils.isEmpty(cfz2.c))
                        {
                            break label0;
                        }
                        aoz1 = cfz2;
                        if (!cfz2.c.equals(cfz1.c))
                        {
                            break label0;
                        }
                        flag1 = true;
                    }
                }
            }
            aoz1 = null;
        }
        return aoz1;
    }

    static eew a(aza aza1)
    {
        return aza1.l;
    }

    private Collection a(String s, Collection collection, doy doy1)
    {
        gz gz1;
        cfz cfz1;
        aow aow1;
        azf azf1;
        Iterator iterator;
        if (l != null)
        {
            eew eew1 = l;
            int i1 = collection.size();
            eew1.a((new StringBuilder(28)).append("computeInternal: ").append(i1).toString());
        }
        gz1 = new gz();
        cfz1 = g.a(a.b(), eey.g(), null, null, null, null, null, Boolean.valueOf(false));
        aow1 = new aow(d, a.h());
        azf1 = new azf(l);
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
        obj2 = (ayc)iterator.next();
        if (l != null)
        {
            l.a("cI:loopStart");
        }
        obj1 = ((ayc) (obj2)).a;
        obj = aow1.f(((String) (obj1)));
        if (l != null)
        {
            l.a("getCI:getConvInfo");
        }
        aoz aoz1;
        aoz1 = ((aoz) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        aoz1 = ((aoz) (obj));
        if (!aow.a(((String) (obj1))))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj1 = RealTimeChatService.a(((String) (obj1)));
        aoz1 = ((aoz) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj = aow1.f(((String) (obj1)));
        aoz1 = ((aoz) (obj));
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        l.a("getCI:getConvInfoServer");
        aoz1 = ((aoz) (obj));
        cfz cfz2;
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
            eev.e("Babel", ">>>>>>>>>> got exception computing variants", s);
            return null;
        }
        if (aoz1 != null)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        s = ((ayc) (obj2)).a;
        doy1 = ((ayc) (obj2)).f;
        j1 = collection.size();
        eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 66 + String.valueOf(doy1).length())).append("Null conversationInfo for ").append(s).append("; merge key = ").append(doy1).append("; total count: ").append(j1).toString());
        return null;
        cfz2 = a(cfz1, aoz1, a.o());
        if (l != null)
        {
            l.a("cI:getParticipant");
        }
        if (!k) goto _L4; else goto _L3
_L3:
        if (cfz2 != null) goto _L6; else goto _L5
_L5:
        obj = null;
_L20:
        if (l != null)
        {
            l.a("cI:getContactDetails");
        }
        if (obj == null) goto _L4; else goto _L7
_L7:
        a(((bhv) (obj)), gz1);
        if (l != null)
        {
            l.a("cI:maintain");
        }
_L4:
        if (cfz2 == null) goto _L9; else goto _L8
_L8:
        if (!g.e(((ayc) (obj2)).b)) goto _L11; else goto _L10
_L10:
        flag = false;
        obj = d.getResources().getString(l.gs);
        if (!TextUtils.isEmpty(cfz2.c) && !((String) (obj)).equals(cfz2.c)) goto _L13; else goto _L12
_L12:
        obj = d.getResources().getString(l.sp);
        flag = true;
        obj1 = null;
_L23:
        s1 = ((ayc) (obj2)).a;
        j1 = ((ayc) (obj2)).b;
        s2 = cfz2.c;
        if (obj1 == null) goto _L15; else goto _L14
_L14:
        if (((azi) (obj1)).b == null) goto _L15; else goto _L16
_L16:
        obj2 = ((azi) (obj1)).b.b();
_L26:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1024;
        }
        obj1 = ((azi) (obj1)).a;
_L27:
        azf1.a(new asa(s1, j1, cfz2, ((String) (obj)), null, s2, ((String) (obj2)), aoz1, ((bhv) (obj1)), flag));
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
        if (TextUtils.isEmpty(cfz2.c)) goto _L18; else goto _L17
_L17:
        obj1 = aow1.b(cfz2.c, doy1);
        obj = obj1;
        if (l == null) goto _L20; else goto _L19
_L19:
        l.a("getDetails:phone");
        obj = obj1;
          goto _L20
_L18:
        if (TextUtils.isEmpty(cfz2.b())) goto _L20; else goto _L21
_L21:
        obj1 = doy1.a(cfz2.b());
        obj = obj1;
        if (l == null) goto _L20; else goto _L22
_L22:
        l.a("getDetails:gaia");
        obj = obj1;
          goto _L20
_L13:
        obj = eey.p(cfz2.c);
        obj1 = (azi)gz1.get(eey.k(cfz2.c));
          goto _L23
_L11:
label0:
        {
            if (TextUtils.isEmpty(cfz2.b()))
            {
                break label0;
            }
            azf1.a(new asa(((ayc) (obj2)).a, ((ayc) (obj2)).b, cfz2, null, cfz2.g, null, null, aoz1, null, false));
            if (l != null)
            {
                l.a("addVariantFromPandCI:gaiaMerge");
            }
        }
          goto _L24
        obj = String.valueOf(((ayc) (obj2)).a);
        if (((String) (obj)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_943;
        }
        obj = "empty gaia id for non-SMS transport type, conversation id = ".concat(((String) (obj)));
_L25:
        eev.f("Babel", ((String) (obj)));
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
            a(azf1, gz1, aow1, s);
            if (l != null)
            {
                l.a("cI:addMising");
            }
        }
        s = azf1.a();
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
            boolean flag5 = a.C();
            boolean flag6 = a.P();
            boolean flag2 = a.O();
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
                    asa asa1 = (asa)iterator.next();
                    boolean flag;
                    boolean flag3;
                    boolean flag4;
                    if (!asa1.h.i() && !g.a(asa1.h))
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                    if (asa1.b == 2)
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                    if (asa1.b == 3)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (asa1.a != null)
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
                        stringbuilder.append("gv/filtered ").append(asa1.a).append(flag5).append(";").append(flag4).append(";").append(flag3).append(";").append(flag2).append(";true;");
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
                    stringbuilder.append("carrier/filtered ").append(asa1.a).append(flag6).append(";").append(flag4).append(";true;").append(flag1).append(";").append(flag3).append(";");
                    j1 = 1;
                    iterator.remove();
                }
                i1 = j1;
            } while (true);
            if (i1 != 0)
            {
                eev.e("Babel", stringbuilder.toString());
                return collection;
            }
        }
        return collection;
    }

    static void a(aza aza1, Collection collection, String s, int i1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = true;
        obj = null;
        if (i1 == 2)
        {
            if (aza1.l != null)
            {
                aza1.l.a("compute group");
            }
            gdv.a(Integer.valueOf(1), Integer.valueOf(collection.size()));
            collection = (ayc)collection.iterator().next();
            collection = new asa(((ayc) (collection)).a, ((ayc) (collection)).b, null, null, null, null, null, null, null, false);
            s = new ArrayList(1);
            s.add(collection);
            aza1.a(((List) (s)), ((asa) (collection)));
            return;
        }
        if (aza1.k)
        {
            obj = doy.a();
        }
        if (aza1.l != null)
        {
            eew eew1 = aza1.l;
            Object obj1;
            if (obj == null)
            {
                obj1 = "refnull";
            } else
            {
                obj1 = "ref";
            }
            eew1.a(((String) (obj1)));
        }
        obj1 = aza1.a(s, collection, ((doy) (obj)));
        if (aza1.l != null)
        {
            aza1.l.a("computeInternal");
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        aza1.i.addAll(((Collection) (obj1)));
        if (obj != null)
        {
            ((doy) (obj)).b();
            if (aza1.l != null)
            {
                aza1.l.a("release");
            }
        }
        if (aza1.l != null)
        {
            obj = aza1.l;
            i1 = aza1.i.size();
            ((eew) (obj)).a((new StringBuilder(28)).append("computeAll done: ").append(i1).toString());
        }
        if (aza1.i.isEmpty())
        {
            i1 = collection.size();
            eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 54)).append("No variants! mergeKey=").append(s).append("; conversation count=").append(i1).toString());
            return;
        }
        break MISSING_BLOCK_LABEL_376;
        collection;
        if (obj != null)
        {
            ((doy) (obj)).b();
            if (aza1.l != null)
            {
                aza1.l.a("release");
            }
        }
        throw collection;
        collection = aza1.a(collection);
        if (aza1.l != null)
        {
            aza1.l.a("messageHistory");
        }
        i1 = ((flag1) ? 1 : 0);
        if (aza1.k)
        {
            if (aza1.e != null)
            {
                s = a(aza1.i, aza1.e);
                if (s != null)
                {
                    i1 = ((flag) ? 1 : 0);
                    if (g.e(((asa) (s)).b))
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (!aza1.f)
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
                if (((azh) (collection)).d != null)
                {
                    i1 = ((flag1) ? 1 : 0);
                    if (g.f(g.a(((azh) (collection)).d, 0)))
                    {
                        i1 = 0;
                    }
                }
            }
        }
        if (i1 != 0 && aza1.k && (((azh) (collection)).a || aza1.a()) && !((azh) (collection)).b && aza1.a.O())
        {
            aza1.g.post(new azc(aza1));
            return;
        } else
        {
            aza1.a(aza1.a.a(((azh) (collection)).c));
            return;
        }
    }

    private void a(azf azf1, gz gz1, aow aow1, String s)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = azf1.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            asa asa1 = (asa)iterator.next();
            if (l != null)
            {
                l.a("addMissing:loopStart");
            }
            if (g.e(asa1.b))
            {
                String s2 = eey.k(asa1.c);
                if (l != null)
                {
                    l.a("addMissing:toLegacy");
                }
                if (!hashmap.containsKey(s2))
                {
                    hashmap.put(s2, new HashSet());
                }
                ((HashSet)hashmap.get(s2)).add(Integer.valueOf(asa1.b));
                if (!gz1.containsKey(s2))
                {
                    gz1.put(s2, new azi(null, new bia(s2, null)));
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
                String s3 = aow1.a(null, s1);
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
                        cfz cfz1 = g.a(d, s1, null, null);
                        azi azi1 = (azi)gz1.get(s1);
                        azf1.a(new asa(null, g.a(integer, 0), cfz1, s1, null, s1, azi1.b.b(), null, azi1.a, TextUtils.isEmpty(s1)));
                        if (l != null)
                        {
                            l.a("addMissing:mergeVariant");
                        }
                    }
                }
            }
        }

    }

    private static void a(bhv bhv1, gz gz1)
    {
        bia bia1;
        for (Iterator iterator = bhv1.f().iterator(); iterator.hasNext(); gz1.put(eey.k(bia1.a), new azi(bhv1, bia1)))
        {
            bia1 = (bia)iterator.next();
        }

    }

    private void a(List list, asa asa1)
    {
        if (list.isEmpty())
        {
            return;
        }
        if (l != null)
        {
            l.a("finish bg");
        }
        g.post(new azd(this, list, asa1));
    }

    private boolean a()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext();)
        {
            if (g.e(((asa)iterator.next()).b))
            {
                return true;
            }
        }

        return false;
    }

    static azg b(aza aza1)
    {
        return aza1.j;
    }

    private void b()
    {
        String s;
        int i1;
        for (Iterator iterator = i.iterator(); iterator.hasNext(); eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 47)).append("skipping candidate variant: ").append(s).append("; type: ").append(i1).toString()))
        {
            asa asa1 = (asa)iterator.next();
            s = String.valueOf(asa1.a);
            i1 = asa1.b;
        }

    }

    static eew c(aza aza1)
    {
        aza1.l = null;
        return null;
    }

    static azj d(aza aza1)
    {
        return aza1.h;
    }

    public void a(int i1)
    {
        Object obj;
        if (i.size() == 1)
        {
            obj = (asa)i.iterator().next();
        } else
        if (e != null)
        {
            asa asa1 = a(i, e);
            if (asa1 == null)
            {
                obj = String.valueOf(e);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unexpected null variant matching conversationIdHint=".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unexpected null variant matching conversationIdHint=");
                }
                eev.f("Babel", ((String) (obj)));
                b();
            }
            obj = asa1;
        } else
        {
            asa asa2 = a(i, b);
            if (asa2 == null)
            {
                obj = String.valueOf(b);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unexpected null variant matching latestOrFirstConversationId=".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unexpected null variant matching latestOrFirstConversationId=");
                }
                eev.f("Babel", ((String) (obj)));
                b();
            }
            obj = asa2;
        }
        do
        {
            if (obj == null)
            {
                return;
            }
            Object obj1 = a(i, i1);
            obj = a(((Collection) (obj1)), ((asa) (obj)), i1);
            obj1 = new ArrayList(((Collection) (obj1)));
            Collections.sort(((List) (obj1)), m);
            if (l != null)
            {
                l.a("sorted");
            }
            a(((List) (obj1)), ((asa) (obj)));
            return;
        } while (true);
    }

    public void a(int i1, String s, Collection collection, azg azg)
    {
        j = azg;
        if (l != null)
        {
            l.a("started");
        }
        gdy.a(new azb(this, collection, s, i1));
    }

    static 
    {
        hnc hnc = eev.v;
    }
}
