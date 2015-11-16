// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class adu
{

    private static final Map i;
    private static final List s = Collections.unmodifiableList(new ArrayList(0));
    public List a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;
    public List g;
    public adx h;
    private final aed j;
    private List k;
    private List l;
    private List m;
    private List n;
    private adw o;
    private final int p;
    private final Account q;
    private List r;

    public adu()
    {
        this((byte)0);
    }

    private adu(byte byte0)
    {
        this(0xc0000000, null);
    }

    public adu(int i1, Account account)
    {
        j = new aed();
        p = i1;
        q = account;
    }

    private void a(int i1, String s1, String s2, boolean flag)
    {
        StringBuilder stringbuilder;
        boolean flag2;
        flag2 = false;
        if (a == null)
        {
            a = new ArrayList();
        }
        stringbuilder = new StringBuilder();
        s1 = s1.trim();
        if (i1 != 6 && !adt.f(p)) goto _L2; else goto _L1
_L1:
        s1 = new aeh(s1, i1, s2, flag);
        a.add(s1);
        return;
_L2:
        int k1;
        int l1;
        l1 = s1.length();
        k1 = 0;
_L4:
        char c1;
        boolean flag1;
        if (k1 >= l1)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = s1.charAt(k1);
        if (c1 != 'p' && c1 != 'P')
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(',');
        flag1 = true;
_L5:
        k1++;
        flag2 = flag1;
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            if (c1 != 'w' && c1 != 'W')
            {
                break label0;
            }
            stringbuilder.append(';');
            flag1 = true;
        }
          goto _L5
        if ('0' <= c1 && c1 <= '9') goto _L7; else goto _L6
_L6:
        flag1 = flag2;
        if (k1 != 0) goto _L5; else goto _L8
_L8:
        flag1 = flag2;
        if (c1 != '+') goto _L5; else goto _L7
_L7:
        stringbuilder.append(c1);
        flag1 = flag2;
          goto _L5
        if (!flag2)
        {
            int j1 = aez.a(p);
            s1 = new SpannableStringBuilder(stringbuilder.toString());
            PhoneNumberUtils.formatNumber(s1, j1);
            s1 = s1.toString();
        } else
        {
            s1 = stringbuilder.toString();
        }
        if (true) goto _L1; else goto _L9
_L9:
    }

    private void a(String s1)
    {
        if (d == null)
        {
            a(null, null, s1, null, 1, false);
            return;
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            aeg aeg1 = (aeg)iterator.next();
            if (aeg1.c == null)
            {
                aeg1.c = s1;
                return;
            }
        }

        a(null, null, s1, null, 1, false);
    }

    private void a(String s1, String s2, String s3, String s4, int i1, boolean flag)
    {
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(new aeg(s1, s2, s3, s4, 1, flag));
    }

    private void a(String s1, Collection collection)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2;
        s2 = s1;
        if (!s1.startsWith("sip:"))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s1.substring(4);
        if (s2.length() == 0) goto _L1; else goto _L3
_L3:
        byte byte0 = -1;
        Iterator iterator = null;
        s1 = null;
        byte byte1;
        boolean flag;
        if (collection != null)
        {
            iterator = collection.iterator();
            flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                collection = (String)iterator.next();
                String s3 = collection.toUpperCase();
                if (s3.equals("PREF"))
                {
                    flag = true;
                } else
                if (s3.equals("HOME"))
                {
                    byte0 = 1;
                } else
                if (s3.equals("WORK"))
                {
                    byte0 = 2;
                } else
                if (byte0 < 0)
                {
                    s1 = collection;
                    if (s3.startsWith("X-"))
                    {
                        s1 = collection.substring(2);
                    }
                    byte0 = 0;
                }
            } while (true);
        } else
        {
            flag = false;
            byte0 = -1;
            s1 = iterator;
        }
        byte1 = byte0;
        if (byte0 < 0)
        {
            byte1 = 3;
        }
        if (l == null)
        {
            l = new ArrayList();
        }
        l.add(new aek(s2, byte1, s1, flag));
        return;
    }

    private void a(List list)
    {
_L2:
        return;
        if (!TextUtils.isEmpty(j.g) || !TextUtils.isEmpty(j.i) || !TextUtils.isEmpty(j.h) || list == null) goto _L2; else goto _L1
_L1:
        int i1 = list.size();
        if (i1 <= 0) goto _L2; else goto _L3
_L3:
        if (i1 > 3)
        {
            i1 = 3;
        }
        if (((String)list.get(0)).length() <= 0) goto _L5; else goto _L4
_L4:
        int j1 = 1;
_L10:
        if (j1 >= i1) goto _L7; else goto _L6
_L6:
        if (((String)list.get(j1)).length() <= 0) goto _L9; else goto _L8
_L8:
        j1 = 0;
_L14:
        if (j1 != 0)
        {
            String as[] = ((String)list.get(0)).split(" ");
            i1 = as.length;
            if (i1 == 3)
            {
                j.g = as[0];
                j.i = as[1];
                j.h = as[2];
                return;
            }
            if (i1 == 2)
            {
                j.g = as[0];
                j.h = as[1];
                return;
            } else
            {
                j.h = (String)list.get(0);
                return;
            }
        }
          goto _L5
_L9:
        j1++;
          goto _L10
_L5:
        i1;
        JVM INSTR tableswitch 2 3: default 244
    //                   2 279
    //                   3 262;
           goto _L11 _L12 _L13
_L11:
        j.g = (String)list.get(0);
        return;
_L13:
        j.i = (String)list.get(2);
_L12:
        j.h = (String)list.get(1);
        if (true) goto _L11; else goto _L7
_L7:
        j1 = 1;
          goto _L14
    }

    private static void a(List list, aea aea1)
    {
        if (list != null && list.size() > 0)
        {
            aea1.a(((adz)list.get(0)).a());
            for (list = list.iterator(); list.hasNext(); aea1.a((adz)list.next())) { }
            aea1.c();
        }
    }

    private void a(List list, Map map, boolean flag)
    {
        String s1;
        StringBuilder stringbuilder;
        map = (Collection)map.get("SORT-AS");
        int i1;
        int j1;
        if (map != null && map.size() != 0)
        {
            if (map.size() > 1)
            {
                Object obj = String.valueOf(Arrays.toString(map.toArray()));
                if (((String) (obj)).length() != 0)
                {
                    "Incorrect multiple SORT_AS parameters detected: ".concat(((String) (obj)));
                } else
                {
                    new String("Incorrect multiple SORT_AS parameters detected: ");
                }
            }
            obj = aez.a((String)map.iterator().next(), p);
            map = new StringBuilder();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); map.append((String)((Iterator) (obj)).next())) { }
            s1 = map.toString();
        } else
        {
            s1 = null;
        }
        map = list;
        if (list == null)
        {
            map = s;
        }
        j1 = map.size();
        j1;
        JVM INSTR tableswitch 0 1: default 196
    //                   0 272
    //                   1 297;
           goto _L1 _L2 _L3
_L1:
        list = (String)map.get(0);
        stringbuilder = new StringBuilder();
        for (i1 = 1; i1 < j1; i1++)
        {
            if (i1 > 1)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append((String)map.get(i1));
        }

        break; /* Loop/switch isn't completed */
_L2:
        map = null;
        list = "";
_L5:
        if (d == null)
        {
            a(((String) (list)), ((String) (map)), null, s1, 1, flag);
            return;
        }
        break; /* Loop/switch isn't completed */
_L3:
        list = (String)map.get(0);
        map = null;
        continue; /* Loop/switch isn't completed */
        map = stringbuilder.toString();
        if (true) goto _L5; else goto _L4
_L4:
        for (Iterator iterator = d.iterator(); iterator.hasNext();)
        {
            aeg aeg1 = (aeg)iterator.next();
            if (aeg1.a == null && aeg1.b == null)
            {
                aeg1.a = list;
                aeg1.b = map;
                aeg1.d = flag;
                return;
            }
        }

        a(((String) (list)), ((String) (map)), null, s1, 1, flag);
        return;
    }

    private String c()
    {
        String s2 = null;
        if (TextUtils.isEmpty(j.f)) goto _L2; else goto _L1
_L1:
        String s1 = j.f;
_L4:
        s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        return s2;
_L2:
        if (!j.b())
        {
            s1 = aez.a(p, j.a, j.c, j.b, j.d, j.e);
        } else
        if (!j.c())
        {
            s1 = aez.a(p, j.g, j.i, j.h);
        } else
        if (b != null && b.size() > 0)
        {
            s1 = ((ady)b.get(0)).a;
        } else
        if (a != null && a.size() > 0)
        {
            s1 = ((aeh)a.get(0)).a;
        } else
        if (c != null && c.size() > 0)
        {
            s1 = ((aej)c.get(0)).a(p);
        } else
        {
            s1 = s2;
            if (d != null)
            {
                s1 = s2;
                if (d.size() > 0)
                {
                    s1 = ((aeg)d.get(0)).b();
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        j.k = c();
    }

    public void a(adu adu1)
    {
        if (r == null)
        {
            r = new ArrayList();
        }
        r.add(adu1);
    }

    public void a(aex aex1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        byte abyte0[];
        Map map;
        String s1;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        obj = null;
        obj1 = null;
        flag1 = false;
        flag2 = false;
        flag3 = false;
        flag = false;
        flag4 = true;
        flag5 = true;
        k1 = 1;
        s1 = aex1.a();
        map = aex1.b();
        obj2 = aex1.d();
        abyte0 = aex1.e();
        if (obj2 != null && ((List) (obj2)).size() != 0 || abyte0 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (obj2 != null)
        {
            int i1 = ((List) (obj2)).size();
            if (i1 > 1)
            {
                aex1 = new StringBuilder();
                Iterator iterator = ((List) (obj2)).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    aex1.append((String)iterator.next());
                    if (i1 - 1 > 0)
                    {
                        aex1.append(";");
                    }
                } while (true);
                aex1 = aex1.toString();
            } else
            if (i1 == 1)
            {
                aex1 = (String)((List) (obj2)).get(0);
            } else
            {
                aex1 = "";
            }
            aex1 = aex1.trim();
        } else
        {
            aex1 = null;
        }
        if (s1.equals("VERSION"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s1.equals("FN"))
        {
            j.f = aex1;
            return;
        }
        if (!s1.equals("NAME"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(j.f))
        {
            j.f = aex1;
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!s1.equals("N")) goto _L5; else goto _L4
_L4:
        if (!adt.b(p) || TextUtils.isEmpty(j.g) && TextUtils.isEmpty(j.i) && TextUtils.isEmpty(j.h)) goto _L7; else goto _L6
_L6:
        if (obj2 == null) goto _L1; else goto _L8
_L8:
        k1 = ((List) (obj2)).size();
        if (k1 <= 0) goto _L1; else goto _L9
_L9:
        int j1;
        j1 = k1;
        if (k1 > 5)
        {
            j1 = 5;
        }
        j1;
        JVM INSTR tableswitch 2 5: default 380
    //                   2 657
    //                   3 639
    //                   4 621
    //                   5 603;
           goto _L10 _L11 _L12 _L13 _L14
_L10:
        j.a = (String)((List) (obj2)).get(0);
        return;
_L7:
        aex1 = (Collection)map.get("SORT-AS");
        if (aex1 == null || aex1.size() == 0) goto _L6; else goto _L15
_L15:
        if (aex1.size() > 1)
        {
            obj = String.valueOf(Arrays.toString(aex1.toArray()));
            if (((String) (obj)).length() != 0)
            {
                "Incorrect multiple SORT_AS parameters detected: ".concat(((String) (obj)));
            } else
            {
                new String("Incorrect multiple SORT_AS parameters detected: ");
            }
        }
        aex1 = aez.a((String)aex1.iterator().next(), p);
        k1 = aex1.size();
        j1 = k1;
        if (k1 > 3)
        {
            j1 = 3;
        }
        j1;
        JVM INSTR tableswitch 2 3: default 532
    //                   2 583
    //                   3 566;
           goto _L16 _L17 _L18
_L16:
        j.g = (String)aex1.get(0);
          goto _L19
_L18:
        j.i = (String)aex1.get(2);
_L17:
        j.h = (String)aex1.get(1);
          goto _L16
_L14:
        j.e = (String)((List) (obj2)).get(4);
_L13:
        j.d = (String)((List) (obj2)).get(3);
_L12:
        j.c = (String)((List) (obj2)).get(2);
_L11:
        j.b = (String)((List) (obj2)).get(1);
          goto _L10
_L5:
        if (s1.equals("SORT-STRING"))
        {
            j.j = aex1;
            return;
        }
        if (s1.equals("NICKNAME") || s1.equals("X-NICKNAME"))
        {
            if (m == null)
            {
                m = new ArrayList();
            }
            m.add(new aee(aex1));
            return;
        }
        if (s1.equals("SOUND"))
        {
            obj = (Collection)map.get("TYPE");
            continue; /* Loop/switch isn't completed */
        }
          goto _L20
_L19:
        if (true) goto _L6; else goto _L21
_L21:
        if (obj == null || !((Collection) (obj)).contains("X-IRMC-N")) goto _L1; else goto _L22
_L22:
        a(aez.a(aex1, p));
        return;
_L20:
        if (!s1.equals("ADR")) goto _L24; else goto _L23
_L23:
        aex1 = ((List) (obj2)).iterator();
_L28:
        if (!aex1.hasNext()) goto _L26; else goto _L25
_L25:
        if (TextUtils.isEmpty((String)aex1.next())) goto _L28; else goto _L27
_L27:
        j1 = 0;
_L38:
        if (j1 == 0)
        {
            aex1 = (Collection)map.get("TYPE");
            int l1;
            if (aex1 != null)
            {
                obj1 = aex1.iterator();
                aex1 = null;
                j1 = -1;
                flag = false;
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    obj = (String)((Iterator) (obj1)).next();
                    abyte0 = ((String) (obj)).toUpperCase();
                    if (abyte0.equals("PREF"))
                    {
                        flag = true;
                    } else
                    if (abyte0.equals("HOME"))
                    {
                        aex1 = null;
                        j1 = 1;
                    } else
                    if (abyte0.equals("WORK") || abyte0.equalsIgnoreCase("COMPANY"))
                    {
                        aex1 = null;
                        j1 = 2;
                    } else
                    if (!abyte0.equals("PARCEL") && !abyte0.equals("DOM") && !abyte0.equals("INTL") && j1 < 0)
                    {
                        if (abyte0.startsWith("X-"))
                        {
                            aex1 = ((String) (obj)).substring(2);
                            j1 = 0;
                        } else
                        {
                            j1 = 0;
                            aex1 = ((aex) (obj));
                        }
                    }
                } while (true);
            } else
            {
                aex1 = null;
                j1 = -1;
                flag = false;
            }
            if (j1 < 0)
            {
                j1 = k1;
            }
            if (c == null)
            {
                c = new ArrayList(0);
            }
            c.add(aej.a(((List) (obj2)), j1, aex1, flag, p));
            return;
        }
          goto _L1
_L24:
        if (s1.equals("EMAIL"))
        {
            obj = (Collection)map.get("TYPE");
            if (obj != null)
            {
                obj2 = ((Collection) (obj)).iterator();
                flag = false;
                j1 = -1;
                obj = null;
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    obj1 = (String)((Iterator) (obj2)).next();
                    abyte0 = ((String) (obj1)).toUpperCase();
                    if (abyte0.equals("PREF"))
                    {
                        flag = true;
                    } else
                    if (abyte0.equals("HOME"))
                    {
                        j1 = 1;
                    } else
                    if (abyte0.equals("WORK"))
                    {
                        j1 = 2;
                    } else
                    if (abyte0.equals("CELL"))
                    {
                        j1 = 4;
                    } else
                    if (j1 < 0)
                    {
                        obj = obj1;
                        if (abyte0.startsWith("X-"))
                        {
                            obj = ((String) (obj1)).substring(2);
                        }
                        j1 = 0;
                    }
                } while (true);
            } else
            {
                flag = false;
                j1 = -1;
                obj = null;
            }
            k1 = j1;
            if (j1 < 0)
            {
                k1 = 3;
            }
            if (b == null)
            {
                b = new ArrayList();
            }
            b.add(new ady(aex1, k1, ((String) (obj)), flag));
            return;
        }
        if (s1.equals("ORG"))
        {
            aex1 = (Collection)map.get("TYPE");
            if (aex1 != null)
            {
                aex1 = aex1.iterator();
                do
                {
                    flag1 = flag;
                    if (!aex1.hasNext())
                    {
                        break;
                    }
                    if (((String)aex1.next()).equals("PREF"))
                    {
                        flag = true;
                    }
                } while (true);
            }
            a(((List) (obj2)), map, flag1);
            return;
        }
        if (s1.equals("TITLE"))
        {
            a(((String) (aex1)));
            return;
        }
        if (s1.equals("ROLE")) goto _L1; else goto _L29
_L29:
        if (!s1.equals("PHOTO") && !s1.equals("LOGO")) goto _L31; else goto _L30
_L30:
        aex1 = (Collection)map.get("VALUE");
        if (aex1 == null || !aex1.contains("URL"))
        {
            aex1 = (Collection)map.get("TYPE");
            if (aex1 != null)
            {
                obj1 = aex1.iterator();
                aex1 = null;
                flag = flag2;
                do
                {
                    obj = aex1;
                    flag1 = flag;
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    obj = (String)((Iterator) (obj1)).next();
                    if ("PREF".equals(obj))
                    {
                        flag = true;
                    } else
                    if (aex1 == null)
                    {
                        aex1 = ((aex) (obj));
                    }
                } while (true);
            } else
            {
                obj = null;
                flag1 = flag3;
            }
            if (k == null)
            {
                k = new ArrayList(1);
            }
            aex1 = new aei(((String) (obj)), abyte0, flag1);
            k.add(aex1);
            return;
        }
          goto _L1
_L31:
        if (!s1.equals("TEL")) goto _L33; else goto _L32
_L32:
        if (adt.c(p))
        {
            if (aex1.startsWith("sip:"))
            {
                j1 = 1;
                obj = null;
            } else
            if (aex1.startsWith("tel:"))
            {
                obj = aex1.substring(4);
                j1 = 0;
            } else
            {
                j1 = 0;
                obj = aex1;
            }
        } else
        {
            j1 = 0;
            obj = aex1;
        }
        if (j1 != 0)
        {
            a(((String) (aex1)), (Collection)map.get("TYPE"));
            return;
        }
        if (aex1.length() != 0)
        {
            obj2 = (Collection)map.get("TYPE");
            aex1 = ((aex) (aez.a(((Collection) (obj2)), ((String) (obj)))));
            if (aex1 instanceof Integer)
            {
                j1 = ((Integer)aex1).intValue();
                aex1 = ((aex) (obj1));
            } else
            {
                aex1 = aex1.toString();
                j1 = 0;
            }
            if (obj2 != null && ((Collection) (obj2)).contains("PREF"))
            {
                flag = flag4;
            } else
            {
                flag = false;
            }
            a(j1, ((String) (obj)), ((String) (aex1)), flag);
            return;
        }
          goto _L1
_L33:
        if (s1.equals("X-SKYPE-PSTNNUMBER"))
        {
            obj = (Collection)map.get("TYPE");
            if (obj != null && ((Collection) (obj)).contains("PREF"))
            {
                flag = flag5;
            } else
            {
                flag = false;
            }
            a(7, ((String) (aex1)), null, flag);
            return;
        }
        if (i.containsKey(s1))
        {
            l1 = ((Integer)i.get(s1)).intValue();
            obj = (Collection)map.get("TYPE");
            if (obj != null)
            {
                obj = ((Collection) (obj)).iterator();
                flag = false;
                j1 = -1;
                do
                {
                    k1 = j1;
                    flag1 = flag;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    obj1 = (String)((Iterator) (obj)).next();
                    if (((String) (obj1)).equals("PREF"))
                    {
                        flag = true;
                    } else
                    if (j1 < 0)
                    {
                        if (((String) (obj1)).equalsIgnoreCase("HOME"))
                        {
                            j1 = 1;
                        } else
                        if (((String) (obj1)).equalsIgnoreCase("WORK"))
                        {
                            j1 = 2;
                        }
                    }
                } while (true);
            } else
            {
                flag1 = false;
                k1 = -1;
            }
            j1 = k1;
            if (k1 < 0)
            {
                j1 = 1;
            }
            if (e == null)
            {
                e = new ArrayList();
            }
            e.add(new aec(l1, null, aex1, j1, flag1));
            return;
        }
        if (s1.equals("NOTE"))
        {
            if (g == null)
            {
                g = new ArrayList(1);
            }
            g.add(new aef(aex1));
            return;
        }
        if (s1.equals("URL"))
        {
            if (f == null)
            {
                f = new ArrayList(1);
            }
            f.add(new aem(aex1));
            return;
        }
        if (s1.equals("BDAY"))
        {
            h = new adx(aex1);
            return;
        }
        if (s1.equals("ANNIVERSARY"))
        {
            o = new adw(aex1);
            return;
        }
        if (s1.equals("X-PHONETIC-FIRST-NAME"))
        {
            j.h = aex1;
            return;
        }
        if (s1.equals("X-PHONETIC-MIDDLE-NAME"))
        {
            j.i = aex1;
            return;
        }
        if (s1.equals("X-PHONETIC-LAST-NAME"))
        {
            j.g = aex1;
            return;
        }
        if (!s1.equals("IMPP")) goto _L35; else goto _L34
_L34:
        if (aex1.startsWith("sip:"))
        {
            a(((String) (aex1)), (Collection)map.get("TYPE"));
            return;
        }
          goto _L1
_L35:
        if (!s1.equals("X-SIP"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(aex1)) goto _L1; else goto _L36
_L36:
        a(((String) (aex1)), (Collection)map.get("TYPE"));
        return;
        if (!s1.equals("X-ANDROID-CUSTOM")) goto _L1; else goto _L37
_L37:
        obj2 = aez.a(aex1, p);
        if (n == null)
        {
            n = new ArrayList();
        }
        obj1 = n;
        if (((List) (obj2)).size() < 2)
        {
            aex1 = (String)((List) (obj2)).get(0);
        } else
        {
            if (((List) (obj2)).size() < 16)
            {
                j1 = ((List) (obj2)).size();
            } else
            {
                j1 = 16;
            }
            aex1 = (String)((List) (obj2)).get(0);
            obj = ((List) (obj2)).subList(1, j1);
        }
        ((List) (obj1)).add(new adv(aex1, ((List) (obj))));
        return;
_L26:
        j1 = 1;
          goto _L38
    }

    public String b()
    {
        if (j.k == null)
        {
            j.k = c();
        }
        return j.k;
    }

    public String toString()
    {
        ael ael1 = new ael(this);
        ael1.a();
        ael1.a(aeb.a);
        ael1.a(j);
        ael1.c();
        a(a, ael1);
        a(b, ael1);
        a(c, ael1);
        a(d, ael1);
        a(e, ael1);
        a(k, ael1);
        a(f, ael1);
        a(l, ael1);
        a(m, ael1);
        a(g, ael1);
        a(n, ael1);
        if (h != null)
        {
            ael1.a(h.a());
            ael1.a(h);
            ael1.c();
        }
        if (o != null)
        {
            ael1.a(o.a());
            ael1.a(o);
            ael1.c();
        }
        ael1.b();
        return ael1.toString();
    }

    static 
    {
        HashMap hashmap = new HashMap();
        i = hashmap;
        hashmap.put("X-AIM", Integer.valueOf(0));
        i.put("X-MSN", Integer.valueOf(1));
        i.put("X-YAHOO", Integer.valueOf(2));
        i.put("X-ICQ", Integer.valueOf(6));
        i.put("X-JABBER", Integer.valueOf(7));
        i.put("X-SKYPE-USERNAME", Integer.valueOf(3));
        i.put("X-GOOGLE-TALK", Integer.valueOf(5));
        i.put("X-GOOGLE TALK", Integer.valueOf(5));
    }
}
