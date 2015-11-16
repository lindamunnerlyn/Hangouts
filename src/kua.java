// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class kua
{

    private static final kua d = new kua((byte)0);
    private final kvl a;
    private boolean b;
    private boolean c;

    private kua()
    {
        c = false;
        a = kvl.a(16);
    }

    private kua(byte byte0)
    {
        c = false;
        a = kvl.a(0);
        b();
    }

    private static int a(kvz kvz1, int i, Object obj)
    {
        int j = ktv.q(i);
        i = j;
        if (kvz1 == kvz.j)
        {
            kuq.a();
            i = j << 1;
        }
        return i + b(kvz1, obj);
    }

    static int a(kvz kvz1, boolean flag)
    {
        if (flag)
        {
            return 2;
        } else
        {
            return kvz1.b();
        }
    }

    private static Object a(Object obj)
    {
        Object obj1;
        if (obj instanceof kve)
        {
            obj1 = ((kve)obj).b();
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

    public static Object a(ktu ktu1, kvz kvz1)
    {
        kwf kwf1 = kwf.a;
        switch (kvy.a[kvz1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            return Double.valueOf(ktu1.b());

        case 2: // '\002'
            return Float.valueOf(ktu1.c());

        case 3: // '\003'
            return Long.valueOf(ktu1.e());

        case 4: // '\004'
            return Long.valueOf(ktu1.d());

        case 5: // '\005'
            return Integer.valueOf(ktu1.f());

        case 6: // '\006'
            return Long.valueOf(ktu1.g());

        case 7: // '\007'
            return Integer.valueOf(ktu1.h());

        case 8: // '\b'
            return Boolean.valueOf(ktu1.i());

        case 9: // '\t'
            return ktu1.l();

        case 10: // '\n'
            return Integer.valueOf(ktu1.m());

        case 11: // '\013'
            return Integer.valueOf(ktu1.o());

        case 12: // '\f'
            return Long.valueOf(ktu1.p());

        case 13: // '\r'
            return Integer.valueOf(ktu1.q());

        case 14: // '\016'
            return Long.valueOf(ktu1.r());

        case 15: // '\017'
            return kwf1.a(ktu1);

        case 16: // '\020'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");

        case 17: // '\021'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");

        case 18: // '\022'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
        }
    }

    public static kua a()
    {
        return new kua();
    }

    private static void a(ktv ktv1, kvz kvz1, int i, Object obj)
    {
        if (kvz1 == kvz.j)
        {
            kuq.a();
            ktv1.a(i, (kvb)obj);
            return;
        } else
        {
            ktv1.d(i, a(kvz1, false));
            a(ktv1, kvz1, obj);
            return;
        }
    }

    private static void a(ktv ktv1, kvz kvz1, Object obj)
    {
        switch (kub.b[kvz1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            ktv1.a(((Double)obj).doubleValue());
            return;

        case 2: // '\002'
            ktv1.a(((Float)obj).floatValue());
            return;

        case 3: // '\003'
            ktv1.b(((Long)obj).longValue());
            return;

        case 4: // '\004'
            ktv1.a(((Long)obj).longValue());
            return;

        case 5: // '\005'
            ktv1.b(((Integer)obj).intValue());
            return;

        case 6: // '\006'
            ktv1.c(((Long)obj).longValue());
            return;

        case 7: // '\007'
            ktv1.c(((Integer)obj).intValue());
            return;

        case 8: // '\b'
            ktv1.a(((Boolean)obj).booleanValue());
            return;

        case 9: // '\t'
            ktv1.a((kvb)obj);
            return;

        case 10: // '\n'
            ktv1.b((kvb)obj);
            return;

        case 11: // '\013'
            if (obj instanceof kts)
            {
                ktv1.a((kts)obj);
                return;
            } else
            {
                ktv1.a((String)obj);
                return;
            }

        case 12: // '\f'
            if (obj instanceof kts)
            {
                ktv1.a((kts)obj);
                return;
            } else
            {
                ktv1.b((byte[])obj);
                return;
            }

        case 13: // '\r'
            ktv1.d(((Integer)obj).intValue());
            return;

        case 14: // '\016'
            ktv1.f(((Integer)obj).intValue());
            return;

        case 15: // '\017'
            ktv1.d(((Long)obj).longValue());
            return;

        case 16: // '\020'
            ktv1.g(((Integer)obj).intValue());
            return;

        case 17: // '\021'
            ktv1.e(((Long)obj).longValue());
            return;

        case 18: // '\022'
            break;
        }
        if (obj instanceof kur)
        {
            ktv1.e(((kur)obj).a());
            return;
        } else
        {
            ktv1.e(((Integer)obj).intValue());
            return;
        }
    }

    public static void a(kuc kuc1, Object obj, ktv ktv1)
    {
        kvz kvz1;
        int i;
label0:
        {
            kvz1 = kuc1.b();
            i = kuc1.a();
            if (kuc1.d())
            {
                obj = (List)obj;
                if (kuc1.e())
                {
                    ktv1.d(i, 2);
                    i = 0;
                    for (kuc1 = ((List) (obj)).iterator(); kuc1.hasNext();)
                    {
                        i += b(kvz1, kuc1.next());
                    }

                    ktv1.r(i);
                    for (kuc1 = ((List) (obj)).iterator(); kuc1.hasNext(); a(ktv1, kvz1, kuc1.next())) { }
                } else
                {
                    for (kuc1 = ((List) (obj)).iterator(); kuc1.hasNext(); a(ktv1, kvz1, i, kuc1.next())) { }
                }
            } else
            {
                if (!(obj instanceof kuv))
                {
                    break label0;
                }
                a(ktv1, kvz1, i, ((kuv)obj).a());
            }
            return;
        }
        a(ktv1, kvz1, i, obj);
    }

    private static void a(kvz kvz1, Object obj)
    {
        boolean flag;
        flag = false;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        kub.a[kvz1.a().ordinal()];
        JVM INSTR tableswitch 1 9: default 76
    //                   1 91
    //                   2 99
    //                   3 107
    //                   4 115
    //                   5 123
    //                   6 131
    //                   7 139
    //                   8 158
    //                   9 177;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        break; /* Loop/switch isn't completed */
_L10:
        break MISSING_BLOCK_LABEL_177;
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
        if ((obj instanceof kts) || (obj instanceof byte[]))
        {
            flag = true;
        }
          goto _L11
_L9:
        if ((obj instanceof Integer) || (obj instanceof kur))
        {
            flag = true;
        }
          goto _L11
        if ((obj instanceof kvb) || (obj instanceof kuv))
        {
            flag = true;
        }
          goto _L11
    }

    private static boolean a(java.util.Map.Entry entry)
    {
label0:
        {
            kuc kuc1 = (kuc)entry.getKey();
            if (kuc1.c() != kwe.i)
            {
                break label0;
            }
            if (kuc1.d())
            {
                entry = ((List)entry.getValue()).iterator();
                do
                {
                    if (!entry.hasNext())
                    {
                        break label0;
                    }
                } while (((kvb)entry.next()).E_());
                return false;
            }
            entry = ((java.util.Map.Entry) (entry.getValue()));
            if (entry instanceof kvb)
            {
                if (!((kvb)entry).E_())
                {
                    return false;
                }
            } else
            if (entry instanceof kuv)
            {
                return true;
            } else
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static int b(kvz kvz1, Object obj)
    {
        switch (kub.b[kvz1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            ((Double)obj).doubleValue();
            return ktv.a();

        case 2: // '\002'
            ((Float)obj).floatValue();
            return ktv.b();

        case 3: // '\003'
            return ktv.g(((Long)obj).longValue());

        case 4: // '\004'
            return ktv.f(((Long)obj).longValue());

        case 5: // '\005'
            return ktv.m(((Integer)obj).intValue());

        case 6: // '\006'
            ((Long)obj).longValue();
            return ktv.c();

        case 7: // '\007'
            ((Integer)obj).intValue();
            return ktv.d();

        case 8: // '\b'
            ((Boolean)obj).booleanValue();
            return ktv.e();

        case 9: // '\t'
            return ktv.c((kvb)obj);

        case 12: // '\f'
            if (obj instanceof kts)
            {
                return ktv.b((kts)obj);
            } else
            {
                return ktv.c((byte[])obj);
            }

        case 11: // '\013'
            if (obj instanceof kts)
            {
                return ktv.b((kts)obj);
            } else
            {
                return ktv.b((String)obj);
            }

        case 13: // '\r'
            return ktv.n(((Integer)obj).intValue());

        case 14: // '\016'
            ((Integer)obj).intValue();
            return ktv.f();

        case 15: // '\017'
            ((Long)obj).longValue();
            return ktv.g();

        case 16: // '\020'
            return ktv.p(((Integer)obj).intValue());

        case 17: // '\021'
            return ktv.h(((Long)obj).longValue());

        case 10: // '\n'
            if (obj instanceof kuv)
            {
                return ktv.a((kuv)obj);
            } else
            {
                return ktv.d((kvb)obj);
            }

        case 18: // '\022'
            break;
        }
        if (obj instanceof kur)
        {
            return ktv.o(((kur)obj).a());
        } else
        {
            return ktv.o(((Integer)obj).intValue());
        }
    }

    private void b(java.util.Map.Entry entry)
    {
        kuc kuc1 = (kuc)entry.getKey();
        Object obj = entry.getValue();
        entry = ((java.util.Map.Entry) (obj));
        if (obj instanceof kuv)
        {
            entry = ((kuv)obj).a();
        }
        if (kuc1.d())
        {
            Object obj3 = a(kuc1);
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

            a.a(kuc1, obj1);
            return;
        }
        if (kuc1.c() == kwe.i)
        {
            Object obj2 = a(kuc1);
            if (obj2 == null)
            {
                a.a(kuc1, a(entry));
                return;
            }
            if (obj2 instanceof kve)
            {
                entry = kuc1.a((kve)obj2);
            } else
            {
                entry = kuc1.a(((kvb)obj2).i(), (kvb)entry).i();
            }
            a.a(kuc1, entry);
            return;
        } else
        {
            a.a(kuc1, a(entry));
            return;
        }
    }

    private static int c(java.util.Map.Entry entry)
    {
        Object obj;
        Object obj1;
        int i;
        i = 0;
        obj = (kuc)entry.getKey();
        obj1 = entry.getValue();
        if (((kuc) (obj)).c() != kwe.i || ((kuc) (obj)).d() || ((kuc) (obj)).e()) goto _L2; else goto _L1
_L1:
        if (!(obj1 instanceof kuv)) goto _L4; else goto _L3
_L3:
        int j = ktv.a(((kuc)entry.getKey()).a(), (kuv)obj1);
_L6:
        return j;
_L4:
        return ktv.f(((kuc)entry.getKey()).a(), (kvb)obj1);
_L2:
        int k;
label0:
        {
            entry = ((kuc) (obj)).b();
            k = ((kuc) (obj)).a();
            if (!((kuc) (obj)).d())
            {
                break label0;
            }
            if (((kuc) (obj)).e())
            {
                obj = ((List)obj1).iterator();
                for (i = 0; ((Iterator) (obj)).hasNext(); i += b(entry, ((Iterator) (obj)).next())) { }
                return ktv.q(k) + i + ktv.s(i);
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

    public Object a(kuc kuc1)
    {
        Object obj = a.get(kuc1);
        kuc1 = ((kuc) (obj));
        if (obj instanceof kuv)
        {
            kuc1 = ((kuv)obj).a();
        }
        return kuc1;
    }

    public void a(kua kua1)
    {
        for (int i = 0; i < kua1.a.c(); i++)
        {
            b(kua1.a.b(i));
        }

        for (kua1 = kua1.a.d().iterator(); kua1.hasNext(); b((java.util.Map.Entry)kua1.next())) { }
    }

    public void a(kuc kuc1, Object obj)
    {
        if (kuc1.d())
        {
            if (!(obj instanceof List))
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arraylist = new ArrayList();
            arraylist.addAll((List)obj);
            Object obj1;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); a(kuc1.b(), obj1))
            {
                obj1 = ((Iterator) (obj)).next();
            }

            obj = arraylist;
        } else
        {
            a(kuc1.b(), obj);
        }
        if (obj instanceof kuv)
        {
            c = true;
        }
        a.a(kuc1, obj);
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

    public void b(kuc kuc1, Object obj)
    {
        if (!kuc1.d())
        {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(kuc1.b(), obj);
        Object obj1 = a(kuc1);
        if (obj1 == null)
        {
            obj1 = new ArrayList();
            a.a(kuc1, obj1);
            kuc1 = ((kuc) (obj1));
        } else
        {
            kuc1 = (List)obj1;
        }
        kuc1.add(obj);
    }

    public boolean c()
    {
        return b;
    }

    public Object clone()
    {
        return d();
    }

    public kua d()
    {
        kua kua1 = new kua();
        for (int i = 0; i < a.c(); i++)
        {
            java.util.Map.Entry entry = a.b(i);
            kua1.a((kuc)entry.getKey(), entry.getValue());
        }

        java.util.Map.Entry entry1;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); kua1.a((kuc)entry1.getKey(), entry1.getValue()))
        {
            entry1 = (java.util.Map.Entry)iterator.next();
        }

        kua1.c = c;
        return kua1;
    }

    public Iterator e()
    {
        if (c)
        {
            return new kux(a.entrySet().iterator());
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
