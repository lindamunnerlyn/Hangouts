// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class klx
{

    private static final klx d = new klx((byte)0);
    private final kni a;
    private boolean b;
    private boolean c;

    private klx()
    {
        c = false;
        a = kni.a(16);
    }

    private klx(byte byte0)
    {
        c = false;
        a = kni.a(0);
        b();
    }

    private static int a(knw knw1, int i, Object obj)
    {
        int j = kls.q(i);
        i = j;
        if (knw1 == knw.j)
        {
            kmn.a();
            i = j << 1;
        }
        return i + b(knw1, obj);
    }

    public static int a(knw knw1, boolean flag)
    {
        if (flag)
        {
            return 2;
        } else
        {
            return knw1.b();
        }
    }

    private static Object a(Object obj)
    {
        Object obj1;
        if (obj instanceof knb)
        {
            obj1 = ((knb)obj).b();
        } else
        {
            obj1 = obj;
            if (obj instanceof byte[])
            {
                obj = (byte[])obj;
                byte abyte0[] = new byte[obj.length];
                System.arraycopy(obj, 0, abyte0, 0, obj.length);
                return abyte0;
            }
        }
        return obj1;
    }

    public static Object a(klr klr, knw knw1)
    {
        return knu.a(klr, knw1, koc.a);
    }

    public static klx a()
    {
        return new klx();
    }

    private static void a(kls kls1, knw knw1, int i, Object obj)
    {
        if (knw1 == knw.j)
        {
            kmn.a();
            kls1.a(i, (kmy)obj);
            return;
        } else
        {
            kls1.d(i, a(knw1, false));
            a(kls1, knw1, obj);
            return;
        }
    }

    private static void a(kls kls1, knw knw1, Object obj)
    {
        switch (kly.b[knw1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            kls1.a(((Double)obj).doubleValue());
            return;

        case 2: // '\002'
            kls1.a(((Float)obj).floatValue());
            return;

        case 3: // '\003'
            kls1.b(((Long)obj).longValue());
            return;

        case 4: // '\004'
            kls1.a(((Long)obj).longValue());
            return;

        case 5: // '\005'
            kls1.b(((Integer)obj).intValue());
            return;

        case 6: // '\006'
            kls1.c(((Long)obj).longValue());
            return;

        case 7: // '\007'
            kls1.c(((Integer)obj).intValue());
            return;

        case 8: // '\b'
            kls1.a(((Boolean)obj).booleanValue());
            return;

        case 9: // '\t'
            kls1.a((kmy)obj);
            return;

        case 10: // '\n'
            kls1.b((kmy)obj);
            return;

        case 11: // '\013'
            if (obj instanceof klp)
            {
                kls1.a((klp)obj);
                return;
            } else
            {
                kls1.a((String)obj);
                return;
            }

        case 12: // '\f'
            if (obj instanceof klp)
            {
                kls1.a((klp)obj);
                return;
            } else
            {
                kls1.b((byte[])obj);
                return;
            }

        case 13: // '\r'
            kls1.d(((Integer)obj).intValue());
            return;

        case 14: // '\016'
            kls1.f(((Integer)obj).intValue());
            return;

        case 15: // '\017'
            kls1.d(((Long)obj).longValue());
            return;

        case 16: // '\020'
            kls1.g(((Integer)obj).intValue());
            return;

        case 17: // '\021'
            kls1.e(((Long)obj).longValue());
            return;

        case 18: // '\022'
            break;
        }
        if (obj instanceof kmo)
        {
            kls1.e(((kmo)obj).a());
            return;
        } else
        {
            kls1.e(((Integer)obj).intValue());
            return;
        }
    }

    public static void a(klz klz1, Object obj, kls kls1)
    {
        knw knw1;
        int i;
label0:
        {
            knw1 = klz1.b();
            i = klz1.a();
            if (klz1.d())
            {
                obj = (List)obj;
                if (klz1.e())
                {
                    kls1.d(i, 2);
                    i = 0;
                    for (klz1 = ((List) (obj)).iterator(); klz1.hasNext();)
                    {
                        i += b(knw1, klz1.next());
                    }

                    kls1.r(i);
                    for (klz1 = ((List) (obj)).iterator(); klz1.hasNext(); a(kls1, knw1, klz1.next())) { }
                } else
                {
                    for (klz1 = ((List) (obj)).iterator(); klz1.hasNext(); a(kls1, knw1, i, klz1.next())) { }
                }
            } else
            {
                if (!(obj instanceof kms))
                {
                    break label0;
                }
                a(kls1, knw1, i, ((kms)obj).a());
            }
            return;
        }
        a(kls1, knw1, i, obj);
    }

    private static void a(knw knw1, Object obj)
    {
        boolean flag;
        flag = false;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        kly.a[knw1.a().ordinal()];
        JVM INSTR tableswitch 1 9: default 76
    //                   1 90
    //                   2 98
    //                   3 106
    //                   4 114
    //                   5 122
    //                   6 130
    //                   7 138
    //                   8 157
    //                   9 176;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        break; /* Loop/switch isn't completed */
_L10:
        break MISSING_BLOCK_LABEL_176;
_L11:
        if (!flag)
        {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else
        {
            return;
        }
_L2:
        flag = obj instanceof Integer;
          goto _L11
_L3:
        flag = obj instanceof Long;
          goto _L11
_L4:
        flag = obj instanceof Float;
          goto _L11
_L5:
        flag = obj instanceof Double;
          goto _L11
_L6:
        flag = obj instanceof Boolean;
          goto _L11
_L7:
        flag = obj instanceof String;
          goto _L11
_L8:
        if ((obj instanceof klp) || (obj instanceof byte[]))
        {
            flag = true;
        }
          goto _L11
_L9:
        if ((obj instanceof Integer) || (obj instanceof kmo))
        {
            flag = true;
        }
          goto _L11
        if ((obj instanceof kmy) || (obj instanceof kms))
        {
            flag = true;
        }
          goto _L11
    }

    private static boolean a(java.util.Map.Entry entry)
    {
label0:
        {
            klz klz1 = (klz)entry.getKey();
            if (klz1.c() != kob.i)
            {
                break label0;
            }
            if (klz1.d())
            {
                entry = ((List)entry.getValue()).iterator();
                do
                {
                    if (!entry.hasNext())
                    {
                        break label0;
                    }
                } while (((kmy)entry.next()).C_());
                return false;
            }
            entry = ((java.util.Map.Entry) (entry.getValue()));
            if (entry instanceof kmy)
            {
                if (!((kmy)entry).C_())
                {
                    return false;
                }
            } else
            if (entry instanceof kms)
            {
                return true;
            } else
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int b(knw knw1, Object obj)
    {
        switch (kly.b[knw1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            ((Double)obj).doubleValue();
            return kls.a();

        case 2: // '\002'
            ((Float)obj).floatValue();
            return kls.b();

        case 3: // '\003'
            return kls.g(((Long)obj).longValue());

        case 4: // '\004'
            return kls.f(((Long)obj).longValue());

        case 5: // '\005'
            return kls.m(((Integer)obj).intValue());

        case 6: // '\006'
            ((Long)obj).longValue();
            return kls.c();

        case 7: // '\007'
            ((Integer)obj).intValue();
            return kls.d();

        case 8: // '\b'
            ((Boolean)obj).booleanValue();
            return kls.e();

        case 9: // '\t'
            return kls.c((kmy)obj);

        case 12: // '\f'
            if (obj instanceof klp)
            {
                return kls.b((klp)obj);
            } else
            {
                return kls.c((byte[])obj);
            }

        case 11: // '\013'
            if (obj instanceof klp)
            {
                return kls.b((klp)obj);
            } else
            {
                return kls.b((String)obj);
            }

        case 13: // '\r'
            return kls.n(((Integer)obj).intValue());

        case 14: // '\016'
            ((Integer)obj).intValue();
            return kls.f();

        case 15: // '\017'
            ((Long)obj).longValue();
            return kls.g();

        case 16: // '\020'
            return kls.p(((Integer)obj).intValue());

        case 17: // '\021'
            return kls.h(((Long)obj).longValue());

        case 10: // '\n'
            if (obj instanceof kms)
            {
                return kls.a((kms)obj);
            } else
            {
                return kls.d((kmy)obj);
            }

        case 18: // '\022'
            break;
        }
        if (obj instanceof kmo)
        {
            return kls.o(((kmo)obj).a());
        } else
        {
            return kls.o(((Integer)obj).intValue());
        }
    }

    private void b(java.util.Map.Entry entry)
    {
        klz klz1 = (klz)entry.getKey();
        Object obj = entry.getValue();
        entry = ((java.util.Map.Entry) (obj));
        if (obj instanceof kms)
        {
            entry = ((kms)obj).a();
        }
        if (klz1.d())
        {
            Object obj3 = a(klz1);
            Object obj1 = obj3;
            if (obj3 == null)
            {
                obj1 = new ArrayList();
            }
            Object obj4;
            for (entry = ((List)entry).iterator(); entry.hasNext(); ((List)obj1).add(a(obj4)))
            {
                obj4 = entry.next();
            }

            a.a(klz1, obj1);
            return;
        }
        if (klz1.c() == kob.i)
        {
            Object obj2 = a(klz1);
            if (obj2 == null)
            {
                a.a(klz1, a(entry));
                return;
            }
            if (obj2 instanceof knb)
            {
                entry = klz1.a((knb)obj2);
            } else
            {
                entry = klz1.a(((kmy)obj2).h(), (kmy)entry).i();
            }
            a.a(klz1, entry);
            return;
        } else
        {
            a.a(klz1, a(entry));
            return;
        }
    }

    private static int c(java.util.Map.Entry entry)
    {
        Object obj;
        Object obj1;
        int i;
        i = 0;
        obj = (klz)entry.getKey();
        obj1 = entry.getValue();
        if (((klz) (obj)).c() != kob.i || ((klz) (obj)).d() || ((klz) (obj)).e()) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof kms)) goto _L4; else goto _L3
_L3:
        int j = kls.a(((klz)entry.getKey()).a(), (kms)obj1);
_L6:
        return j;
_L4:
        return kls.f(((klz)entry.getKey()).a(), (kmy)obj1);
_L2:
        int k;
label0:
        {
            entry = ((klz) (obj)).b();
            k = ((klz) (obj)).a();
            if (!((klz) (obj)).d())
            {
                break label0;
            }
            if (((klz) (obj)).e())
            {
                obj = ((List)obj1).iterator();
                for (i = 0; ((Iterator) (obj)).hasNext(); i += b(entry, ((Iterator) (obj)).next())) { }
                return kls.q(k) + i + kls.s(i);
            }
            obj = ((List)obj1).iterator();
            do
            {
                j = i;
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                i += a(entry, k, ((Iterator) (obj)).next());
            } while (true);
        }
        if (true) goto _L6; else goto _L5
_L5:
        return a(entry, k, obj1);
    }

    public Object a(klz klz1)
    {
        Object obj = a.get(klz1);
        klz1 = ((klz) (obj));
        if (obj instanceof kms)
        {
            klz1 = ((kms)obj).a();
        }
        return klz1;
    }

    public void a(klx klx1)
    {
        for (int i = 0; i < klx1.a.c(); i++)
        {
            b(klx1.a.b(i));
        }

        for (klx1 = klx1.a.d().iterator(); klx1.hasNext(); b((java.util.Map.Entry)klx1.next())) { }
    }

    public void a(klz klz1, Object obj)
    {
        if (klz1.d())
        {
            if (!(obj instanceof List))
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arraylist = new ArrayList();
            arraylist.addAll((List)obj);
            Object obj1;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); a(klz1.b(), obj1))
            {
                obj1 = ((Iterator) (obj)).next();
            }

            obj = arraylist;
        } else
        {
            a(klz1.b(), obj);
        }
        if (obj instanceof kms)
        {
            c = true;
        }
        a.a(klz1, obj);
    }

    public void b()
    {
        if (b)
        {
            return;
        } else
        {
            a.a();
            b = true;
            return;
        }
    }

    public void b(klz klz1, Object obj)
    {
        if (!klz1.d())
        {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(klz1.b(), obj);
        Object obj1 = a(klz1);
        if (obj1 == null)
        {
            obj1 = new ArrayList();
            a.a(klz1, obj1);
            klz1 = ((klz) (obj1));
        } else
        {
            klz1 = (List)obj1;
        }
        klz1.add(obj);
    }

    public boolean c()
    {
        return b;
    }

    public Object clone()
    {
        return d();
    }

    public klx d()
    {
        klx klx1 = new klx();
        for (int i = 0; i < a.c(); i++)
        {
            java.util.Map.Entry entry = a.b(i);
            klx1.a((klz)entry.getKey(), entry.getValue());
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); klx1.a((klz)entry1.getKey(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

        klx1.c = c;
        return klx1;
    }

    public Iterator e()
    {
        if (c)
        {
            return new kmu(a.entrySet().iterator());
        } else
        {
            return a.entrySet().iterator();
        }
    }

    public boolean f()
    {
        for (int i = 0; i < a.c(); i++)
        {
            if (!a(a.b(i)))
            {
                return false;
            }
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext();)
        {
            if (!a((java.util.Map.Entry)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }

    public int g()
    {
        int j = 0;
        int i = 0;
        for (; j < a.c(); j++)
        {
            i += c(a.b(j));
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext();)
        {
            i += c((java.util.Map.Entry)iterator.next());
        }

        return i;
    }

}
