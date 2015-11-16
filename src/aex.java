// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class aex
{

    private static final Map a;
    private static final Set b;
    private static final Map c;
    private static final Map d;
    private static final Set e = new HashSet(Arrays.asList(new String[] {
        "MOBILE", "\u643A\u5E2F\u96FB\u8A71", "\u643A\u5E2F", "\u30B1\u30A4\u30BF\u30A4", "\uFF79\uFF72\uFF80\uFF72"
    }));
    private static final Set f = new HashSet(Arrays.asList(new Character[] {
        Character.valueOf('['), Character.valueOf(']'), Character.valueOf('='), Character.valueOf(':'), Character.valueOf('.'), Character.valueOf(','), Character.valueOf(' ')
    }));
    private static final int g[] = {
        58, 59, 44, 32
    };
    private static final int h[] = {
        59, 58
    };

    public static int a(int i)
    {
        return !adr.e(i) ? 1 : 2;
    }

    public static Object a(Collection collection, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        int i = -1;
        s = null;
        int j;
        boolean flag;
        boolean flag1;
        if (collection != null)
        {
            Iterator iterator = collection.iterator();
            j = 0;
            flag = false;
            collection = s;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                s = (String)iterator.next();
                if (s != null)
                {
                    String s2 = s.toUpperCase();
                    if (s2.equals("PREF"))
                    {
                        j = 1;
                    } else
                    if (s2.equals("FAX"))
                    {
                        flag = true;
                    } else
                    {
                        if (s2.startsWith("X-") && i < 0)
                        {
                            s = s.substring(2);
                        }
                        if (s.length() != 0)
                        {
                            Integer integer = (Integer)c.get(s.toUpperCase());
                            if (integer != null)
                            {
                                int k = integer.intValue();
                                int l = s1.indexOf("@");
                                if (k == 6 && l > 0 && l < s1.length() - 1 || i < 0 || i == 0 || i == 7)
                                {
                                    i = integer.intValue();
                                }
                            } else
                            if (i < 0)
                            {
                                collection = s;
                                i = 0;
                            }
                        }
                    }
                }
            } while (true);
            flag1 = j;
            j = i;
        } else
        {
            flag1 = false;
            flag = false;
            collection = null;
            j = -1;
        }
        i = j;
        if (j < 0)
        {
            if (flag1)
            {
                i = 12;
            } else
            {
                i = 1;
            }
        }
        j = i;
        if (flag)
        {
            if (i == 1)
            {
                j = 5;
            } else
            if (i == 3)
            {
                j = 4;
            } else
            {
                j = i;
                if (i == 7)
                {
                    j = 13;
                }
            }
        }
        if (j == 0)
        {
            return collection;
        } else
        {
            return Integer.valueOf(j);
        }
    }

    public static String a(int i, String s, String s1, String s2)
    {
        return a(i, s, s1, s2, null, null);
    }

    public static String a(int i, String s, String s1, String s2, String s3, String s4)
    {
        StringBuilder stringbuilder;
        String as[];
        int j;
        j = 1;
        stringbuilder = new StringBuilder();
        as = new String[3];
        adr.d(i);
        JVM INSTR lookupswitch 2: default 48
    //                   4: 183
    //                   8: 137;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_183;
_L1:
        as[0] = s2;
        as[1] = s1;
        as[2] = s;
_L5:
        i = j;
        if (!TextUtils.isEmpty(s3))
        {
            stringbuilder.append(s3);
            i = 0;
        }
        j = 0;
        while (j < 3) 
        {
            s = as[j];
            int k = i;
            if (!TextUtils.isEmpty(s))
            {
                if (i != 0)
                {
                    i = 0;
                } else
                {
                    stringbuilder.append(' ');
                }
                stringbuilder.append(s);
                k = i;
            }
            j++;
            i = k;
        }
        break MISSING_BLOCK_LABEL_212;
_L3:
        if (a(new String[] {
            s
        }) && a(new String[] {
            s2
        })) goto _L1; else goto _L4
_L4:
        as[0] = s;
        as[1] = s1;
        as[2] = s2;
          goto _L5
        as[0] = s1;
        as[1] = s2;
        as[2] = s;
          goto _L5
        if (!TextUtils.isEmpty(s4))
        {
            if (i == 0)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append(s4);
        }
        return stringbuilder.toString();
    }

    public static String a(String s, String s1, String s2)
    {
        Object obj;
        int i;
        int l;
        obj = new StringBuilder();
        l = s.length();
        i = 0;
_L2:
        char c1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        c1 = s.charAt(i);
        if (c1 != '=' || i >= l - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        char c3 = s.charAt(i + 1);
        if (c3 != ' ' && c3 != '\t')
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(c3);
        i++;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(c1);
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        Object obj1 = ((StringBuilder) (obj)).toString();
        s = new StringBuilder();
        int k1 = ((String) (obj1)).length();
        ArrayList arraylist = new ArrayList();
        int j = 0;
        while (j < k1) 
        {
            char c2 = ((String) (obj1)).charAt(j);
            int i1;
            if (c2 == '\n')
            {
                arraylist.add(s.toString());
                s = new StringBuilder();
                i1 = j;
            } else
            if (c2 == '\r')
            {
                arraylist.add(s.toString());
                obj = new StringBuilder();
                i1 = j;
                s = ((String) (obj));
                if (j < k1 - 1)
                {
                    i1 = j;
                    s = ((String) (obj));
                    if (((String) (obj1)).charAt(j + 1) == '\n')
                    {
                        i1 = j + 1;
                        s = ((String) (obj));
                    }
                }
            } else
            {
                s.append(c2);
                i1 = j;
            }
            j = i1 + 1;
        }
        s = s.toString();
        if (s.length() > 0)
        {
            arraylist.add(s);
        }
        String as[] = (String[])arraylist.toArray(new String[0]);
        obj1 = new StringBuilder();
        int j1 = as.length;
        for (int k = 0; k < j1; k++)
        {
            obj = as[k];
            s = ((String) (obj));
            if (((String) (obj)).endsWith("="))
            {
                s = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
            }
            ((StringBuilder) (obj1)).append(s);
        }

        obj = ((StringBuilder) (obj1)).toString();
        TextUtils.isEmpty(((CharSequence) (obj)));
        try
        {
            s = ((String) (obj)).getBytes(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = String.valueOf(s1);
            if (s.length() != 0)
            {
                "Failed to decode: ".concat(s);
            } else
            {
                new String("Failed to decode: ");
            }
            s = ((String) (obj)).getBytes();
        }
        s1 = aez.a(s);
        s = s1;
_L6:
        try
        {
            s1 = new String(s, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1 = String.valueOf(s2);
            if (s1.length() != 0)
            {
                s1 = "Failed to encode: charset=".concat(s1);
            } else
            {
                s1 = new String("Failed to encode: charset=");
            }
            Log.e("vCard", s1);
            return new String(s);
        }
        return s1;
        s1;
        Log.e("vCard", "DecoderException is thrown.");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static List a(String s, int i)
    {
        ArrayList arraylist = new ArrayList();
        StringBuilder stringbuilder = new StringBuilder();
        int k = s.length();
        int j = 0;
        do
        {
            while (j < k) 
            {
                char c1 = s.charAt(j);
                Object obj;
                if (c1 == '\\' && j < k - 1)
                {
                    char c2 = s.charAt(j + 1);
                    if (adr.c(i))
                    {
                        if (c2 == 'n' || c2 == 'N')
                        {
                            obj = "\n";
                        } else
                        {
                            obj = String.valueOf(c2);
                        }
                    } else
                    if (adr.b(i))
                    {
                        if (c2 == 'n' || c2 == 'N')
                        {
                            obj = "\n";
                        } else
                        {
                            obj = String.valueOf(c2);
                        }
                    } else
                    {
                        adr.a(i);
                        if (c2 == '\\' || c2 == ';' || c2 == ':' || c2 == ',')
                        {
                            obj = String.valueOf(c2);
                        } else
                        {
                            obj = null;
                        }
                    }
                    if (obj != null)
                    {
                        stringbuilder.append(((String) (obj)));
                        j++;
                        obj = stringbuilder;
                    } else
                    {
                        stringbuilder.append(c1);
                        obj = stringbuilder;
                    }
                } else
                if (c1 == ';')
                {
                    arraylist.add(stringbuilder.toString());
                    obj = new StringBuilder();
                } else
                {
                    stringbuilder.append(c1);
                    obj = stringbuilder;
                }
                j++;
                stringbuilder = ((StringBuilder) (obj));
            }
            arraylist.add(stringbuilder.toString());
            return arraylist;
        } while (true);
    }

    public static boolean a(String s)
    {
        int i = s.length() % 3;
        if (s.length() >= 2 && (i == 1 || i == 0)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= s.length())
                {
                    break label1;
                }
                if (s.charAt(j) != '=')
                {
                    break label0;
                }
                j += 3;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private static transient boolean a(String as[])
    {
        as = Arrays.asList(as);
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        as = as.iterator();
_L3:
        String s;
        int j;
        do
        {
            if (!as.hasNext())
            {
                break MISSING_BLOCK_LABEL_121;
            }
            s = (String)as.next();
        } while (TextUtils.isEmpty(s));
        j = s.length();
_L4:
        int i;
        for (i = 0; i >= j;)
        {
            break MISSING_BLOCK_LABEL_116;
        }

        char c1 = s.charAt(i);
        boolean flag;
        if (' ' <= c1 && c1 <= '~' || c1 == '\r' || c1 == '\n')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        i = 0;
_L5:
        if (i == 0)
        {
            return false;
        }
          goto _L3
_L2:
        i++;
          goto _L4
        i = 1;
          goto _L5
        return true;
          goto _L4
    }

    public static final String b(String s, String s1, String s2)
    {
        if (s1.equalsIgnoreCase(s2))
        {
            return s;
        }
        s = Charset.forName(s1).encode(s);
        s1 = new byte[s.remaining()];
        s.get(s1);
        try
        {
            s = new String(s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = String.valueOf(s2);
            if (s.length() != 0)
            {
                s = "Failed to encode: charset=".concat(s);
            } else
            {
                s = new String("Failed to encode: charset=");
            }
            Log.e("vCard", s);
            return null;
        }
        return s;
    }

    static 
    {
        a = new HashMap();
        c = new HashMap();
        a.put(Integer.valueOf(9), "CAR");
        c.put("CAR", Integer.valueOf(9));
        a.put(Integer.valueOf(6), "PAGER");
        c.put("PAGER", Integer.valueOf(6));
        a.put(Integer.valueOf(11), "ISDN");
        c.put("ISDN", Integer.valueOf(11));
        c.put("HOME", Integer.valueOf(1));
        c.put("WORK", Integer.valueOf(3));
        c.put("CELL", Integer.valueOf(2));
        c.put("OTHER", Integer.valueOf(7));
        c.put("CALLBACK", Integer.valueOf(8));
        c.put("COMPANY-MAIN", Integer.valueOf(10));
        c.put("RADIO", Integer.valueOf(14));
        c.put("TTY-TDD", Integer.valueOf(16));
        c.put("ASSISTANT", Integer.valueOf(19));
        c.put("VOICE", Integer.valueOf(7));
        Object obj = new HashSet();
        b = ((Set) (obj));
        ((Set) (obj)).add("MODEM");
        b.add("MSG");
        b.add("BBS");
        b.add("VIDEO");
        obj = new HashMap();
        d = ((Map) (obj));
        ((Map) (obj)).put(Integer.valueOf(0), "X-AIM");
        d.put(Integer.valueOf(1), "X-MSN");
        d.put(Integer.valueOf(2), "X-YAHOO");
        d.put(Integer.valueOf(3), "X-SKYPE-USERNAME");
        d.put(Integer.valueOf(5), "X-GOOGLE-TALK");
        d.put(Integer.valueOf(6), "X-ICQ");
        d.put(Integer.valueOf(7), "X-JABBER");
        d.put(Integer.valueOf(4), "X-QQ");
        d.put(Integer.valueOf(8), "X-NETMEETING");
    }
}
