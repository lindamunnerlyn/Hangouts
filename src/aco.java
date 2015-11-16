// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class aco
{

    private static byte d[] = null;
    private static byte e[] = null;
    private ByteArrayInputStream a;
    private acn b;
    private ach c;

    public aco(byte abyte0[])
    {
        a = null;
        b = null;
        c = null;
        a = new ByteArrayInputStream(abyte0);
    }

    private static acn a(ByteArrayInputStream bytearrayinputstream)
    {
        acn acn1;
        boolean flag;
        if (bytearrayinputstream == null)
        {
            return null;
        }
        flag = true;
        acn1 = new acn();
_L32:
        if (!flag || bytearrayinputstream.available() <= 0) goto _L2; else goto _L1
_L1:
        int i;
        bytearrayinputstream.mark(1);
        i = f(bytearrayinputstream);
        if (i < 32 || i > 127) goto _L4; else goto _L3
_L3:
        bytearrayinputstream.reset();
        a(bytearrayinputstream, 0);
          goto _L5
_L4:
        i;
        JVM INSTR tableswitch 129 191: default 336
    //                   129 339
    //                   130 339
    //                   131 706
    //                   132 1567
    //                   133 632
    //                   134 558
    //                   135 827
    //                   136 827
    //                   137 926
    //                   138 1078
    //                   139 706
    //                   140 406
    //                   141 1269
    //                   142 632
    //                   143 558
    //                   144 558
    //                   145 558
    //                   146 558
    //                   147 754
    //                   148 558
    //                   149 558
    //                   150 754
    //                   151 339
    //                   152 706
    //                   153 558
    //                   154 754
    //                   155 558
    //                   156 558
    //                   157 827
    //                   158 706
    //                   159 632
    //                   160 1347
    //                   161 1428
    //                   162 558
    //                   163 558
    //                   164 1499
    //                   165 558
    //                   166 754
    //                   167 558
    //                   168 336
    //                   169 558
    //                   170 1517
    //                   171 558
    //                   172 1517
    //                   173 669
    //                   174 336
    //                   175 669
    //                   176 336
    //                   177 558
    //                   178 1558
    //                   179 669
    //                   180 558
    //                   181 754
    //                   182 754
    //                   183 706
    //                   184 706
    //                   185 706
    //                   186 558
    //                   187 558
    //                   188 558
    //                   189 706
    //                   190 706
    //                   191 558;
           goto _L5 _L6 _L6 _L7 _L8 _L9 _L10 _L11 _L11 _L12 _L13 _L7 _L14 _L15 _L9 _L10 _L10 _L10 _L10 _L16 _L10 _L10 _L16 _L6 _L7 _L10 _L16 _L10 _L10 _L11 _L7 _L9 _L17 _L18 _L10 _L10 _L19 _L10 _L16 _L10 _L5 _L10 _L20 _L10 _L20 _L21 _L5 _L21 _L5 _L10 _L22 _L21 _L10 _L16 _L16 _L7 _L7 _L7 _L10 _L10 _L10 _L7 _L7 _L10
_L6:
        acc acc3 = e(bytearrayinputstream);
        if (acc3 != null)
        {
            String s = new String(acc3.b());
            int j = s.indexOf("/");
            Object obj = s;
            if (j > 0)
            {
                obj = s.substring(0, j);
            }
            byte abyte0[];
            NullPointerException nullpointerexception1;
            try
            {
                acc3.a(((String) (obj)).getBytes());
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                return null;
            }
            try
            {
                acn1.b(acc3, i);
            }
            catch (NullPointerException nullpointerexception) { }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(52)).append(i).append("is not Encoded-String-Value header field!");
                return null;
            }
        }
          goto _L5
_L14:
        j = f(bytearrayinputstream);
        switch (j)
        {
        default:
            try
            {
                acn1.a(j, i);
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(71)).append("Set invalid Octet value: ").append(j).append(" into the header filed: ").append(i);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(37)).append(i).append("is not Octet header field!");
                return null;
            }
            break;

        case 137: 
        case 138: 
        case 139: 
        case 140: 
        case 141: 
        case 142: 
        case 143: 
        case 144: 
        case 145: 
        case 146: 
        case 147: 
        case 148: 
        case 149: 
        case 150: 
        case 151: 
            return null;
        }
          goto _L5
_L10:
        j = f(bytearrayinputstream);
        try
        {
            acn1.a(j, i);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(71)).append("Set invalid Octet value: ").append(j).append(" into the header filed: ").append(i);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(37)).append(i).append("is not Octet header field!");
            return null;
        }
          goto _L5
_L9:
        try
        {
            acn1.a(g(bytearrayinputstream), i);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(44)).append(i).append("is not Long-Integer header field!");
            return null;
        }
          goto _L5
_L21:
        try
        {
            acn1.a(h(bytearrayinputstream), i);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(44)).append(i).append("is not Long-Integer header field!");
            return null;
        }
          goto _L5
_L7:
        abyte0 = a(bytearrayinputstream, 0);
        if (abyte0 != null)
        {
            try
            {
                acn1.a(abyte0, i);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception1) { }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(43)).append(i).append("is not Text-String header field!");
                return null;
            }
        }
          goto _L5
_L16:
        nullpointerexception1 = e(bytearrayinputstream);
        if (nullpointerexception1 != null)
        {
            try
            {
                acn1.a(nullpointerexception1, i);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception1) { }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(52)).append(i).append("is not Encoded-String-Value header field!");
                return null;
            }
        }
          goto _L5
_L11:
        d(bytearrayinputstream);
        int k = f(bytearrayinputstream);
        long l1;
        long l2;
        try
        {
            l1 = g(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(44)).append(i).append("is not Long-Integer header field!");
            return null;
        }
        l2 = l1;
        if (129 == k)
        {
            l2 = l1 + System.currentTimeMillis() / 1000L;
        }
        try
        {
            acn1.a(l2, i);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(44)).append(i).append("is not Long-Integer header field!");
            return null;
        }
          goto _L5
_L12:
        d(bytearrayinputstream);
        Object obj1;
        if (128 == f(bytearrayinputstream))
        {
            acc acc2 = e(bytearrayinputstream);
            obj1 = acc2;
            if (acc2 != null)
            {
                String s1 = new String(acc2.b());
                int l = s1.indexOf("/");
                obj1 = s1;
                if (l > 0)
                {
                    obj1 = s1.substring(0, l);
                }
                try
                {
                    acc2.a(((String) (obj1)).getBytes());
                }
                // Misplaced declaration of an exception variable
                catch (ByteArrayInputStream bytearrayinputstream)
                {
                    return null;
                }
                obj1 = acc2;
            }
        } else
        {
            try
            {
                obj1 = new acc("insert-address-token".getBytes());
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(52)).append(i).append("is not Encoded-String-Value header field!");
                return null;
            }
        }
        try
        {
            acn1.a(((acc) (obj1)), 137);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(52)).append(i).append("is not Encoded-String-Value header field!");
            return null;
        }
          goto _L5
_L13:
        int i1;
        bytearrayinputstream.mark(1);
        i1 = f(bytearrayinputstream);
        if (i1 < 128) goto _L24; else goto _L23
_L23:
        if (128 != i1) goto _L26; else goto _L25
_L25:
        try
        {
            acn1.a("personal".getBytes(), 138);
        }
        catch (NullPointerException nullpointerexception4) { }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(43)).append(i).append("is not Text-String header field!");
            return null;
        }
          goto _L5
_L26:
        if (129 != i1) goto _L28; else goto _L27
_L27:
        acn1.a("advertisement".getBytes(), 138);
          goto _L5
_L28:
        if (130 != i1) goto _L30; else goto _L29
_L29:
        acn1.a("informational".getBytes(), 138);
          goto _L5
_L30:
        if (131 != i1) goto _L5; else goto _L31
_L31:
        acn1.a("auto".getBytes(), 138);
          goto _L5
_L24:
        bytearrayinputstream.reset();
        byte abyte1[] = a(bytearrayinputstream, 0);
        if (abyte1 != null)
        {
            try
            {
                acn1.a(abyte1, 138);
            }
            catch (NullPointerException nullpointerexception2) { }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(43)).append(i).append("is not Text-String header field!");
                return null;
            }
        }
          goto _L5
_L15:
        int j1 = bytearrayinputstream.read() & 0x7f;
        try
        {
            acn1.a(j1, 141);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(71)).append("Set invalid Octet value: ").append(j1).append(" into the header filed: ").append(i);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(37)).append(i).append("is not Octet header field!");
            return null;
        }
          goto _L5
_L17:
        d(bytearrayinputstream);
        acc acc1;
        try
        {
            h(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(32)).append(i).append(" is not Integer-Value");
            return null;
        }
        acc1 = e(bytearrayinputstream);
        if (acc1 != null)
        {
            try
            {
                acn1.a(acc1, 160);
            }
            catch (NullPointerException nullpointerexception3) { }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(52)).append(i).append("is not Encoded-String-Value header field!");
                return null;
            }
        }
          goto _L5
_L18:
        d(bytearrayinputstream);
        try
        {
            h(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(32)).append(i).append(" is not Integer-Value");
            return null;
        }
        try
        {
            acn1.a(g(bytearrayinputstream), 161);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(44)).append(i).append("is not Long-Integer header field!");
            return null;
        }
          goto _L5
_L19:
        d(bytearrayinputstream);
        f(bytearrayinputstream);
        e(bytearrayinputstream);
          goto _L5
_L20:
        d(bytearrayinputstream);
        f(bytearrayinputstream);
        try
        {
            h(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            (new StringBuilder(32)).append(i).append(" is not Integer-Value");
            return null;
        }
          goto _L5
_L22:
        a(bytearrayinputstream, ((SparseArray) (null)));
          goto _L5
_L8:
        SparseArray sparsearray = new SparseArray();
        byte abyte2[] = a(bytearrayinputstream, sparsearray);
        if (abyte2 != null)
        {
            try
            {
                acn1.a(abyte2, 132);
            }
            catch (NullPointerException nullpointerexception5) { }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                (new StringBuilder(43)).append(i).append("is not Text-String header field!");
                return null;
            }
        }
        e = (byte[])sparsearray.get(153);
        d = (byte[])sparsearray.get(131);
        flag = false;
_L5:
        if (true) goto _L32; else goto _L2
_L2:
        return acn1;
    }

    private static boolean a(ByteArrayInputStream bytearrayinputstream, acp acp1, int i)
    {
        int k = bytearrayinputstream.available();
        int j = i;
        do
        {
            if (j <= 0)
            {
                break;
            }
            int l = bytearrayinputstream.read();
            j--;
            if (l > 127)
            {
                switch (l)
                {
                default:
                    if (-1 == b(bytearrayinputstream, j))
                    {
                        Log.e("PduParser", "Corrupt Part headers");
                        return false;
                    }
                    break;

                case 142: 
                    byte abyte0[] = a(bytearrayinputstream, 0);
                    if (abyte0 != null)
                    {
                        acp1.c(abyte0);
                    }
                    j = i - (k - bytearrayinputstream.available());
                    continue;

                case 192: 
                    byte abyte1[] = a(bytearrayinputstream, 1);
                    if (abyte1 != null)
                    {
                        acp1.b(abyte1);
                    }
                    j = i - (k - bytearrayinputstream.available());
                    continue;

                case 174: 
                case 197: 
                    if (adh.a().v())
                    {
                        j = d(bytearrayinputstream);
                        bytearrayinputstream.mark(1);
                        l = bytearrayinputstream.available();
                        int i1 = bytearrayinputstream.read();
                        if (i1 == 128)
                        {
                            acp1.d(acp.a);
                        } else
                        if (i1 == 129)
                        {
                            acp1.d(acp.b);
                        } else
                        if (i1 == 130)
                        {
                            acp1.d(acp.c);
                        } else
                        {
                            bytearrayinputstream.reset();
                            acp1.d(a(bytearrayinputstream, 0));
                        }
                        if (l - bytearrayinputstream.available() < j)
                        {
                            if (bytearrayinputstream.read() == 152)
                            {
                                acp1.h(a(bytearrayinputstream, 0));
                            }
                            i1 = bytearrayinputstream.available();
                            if (l - i1 < j)
                            {
                                j -= l - i1;
                                bytearrayinputstream.read(new byte[j], 0, j);
                            }
                        }
                        j = i - (k - bytearrayinputstream.available());
                    }
                    continue;
                }
                j = 0;
            } else
            if (l >= 32 && l <= 127)
            {
                byte abyte2[] = a(bytearrayinputstream, 0);
                byte abyte3[] = a(bytearrayinputstream, 0);
                if ("Content-Transfer-Encoding".equalsIgnoreCase(new String(abyte2)))
                {
                    acp1.f(abyte3);
                }
                j = i - (k - bytearrayinputstream.available());
            } else
            {
                if (-1 == b(bytearrayinputstream, j))
                {
                    Log.e("PduParser", "Corrupt Part headers");
                    return false;
                }
                j = 0;
            }
        } while (true);
        if (j != 0)
        {
            Log.e("PduParser", "Corrupt Part headers");
            return false;
        } else
        {
            return true;
        }
    }

    private static byte[] a(ByteArrayInputStream bytearrayinputstream, int i)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int j;
        int k;
        bytearrayinputstream.mark(1);
        j = bytearrayinputstream.read();
        if (1 == i && 34 == j)
        {
            bytearrayinputstream.mark(1);
        } else
        if (i == 0 && 127 == j)
        {
            bytearrayinputstream.mark(1);
        } else
        {
            bytearrayinputstream.reset();
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        k = bytearrayinputstream.read();
_L14:
        if (-1 == k || k == 0) goto _L2; else goto _L1
_L1:
        if (i != 2) goto _L4; else goto _L3
_L3:
        if (k >= 33 && k <= 126) goto _L6; else goto _L5
_L5:
        j = 0;
_L12:
        if (j != 0)
        {
            bytearrayoutputstream.write(k);
        }
_L8:
        k = bytearrayinputstream.read();
        continue; /* Loop/switch isn't completed */
_L6:
        switch (k)
        {
        default:
            j = 1;
            break;

        case 34: // '"'
        case 40: // '('
        case 41: // ')'
        case 44: // ','
        case 47: // '/'
        case 58: // ':'
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
        case 64: // '@'
        case 91: // '['
        case 92: // '\\'
        case 93: // ']'
        case 123: // '{'
        case 125: // '}'
            j = 0;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        boolean flag;
        if ((k < 32 || k > 126) && (k < 128 || k > 255))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L10:
        if (flag)
        {
            bytearrayoutputstream.write(k);
        }
        if (true) goto _L8; else goto _L7
_L7:
        switch (k)
        {
        case 11: // '\013'
        case 12: // '\f'
        default:
            flag = false;
            break;

        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
            flag = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (bytearrayoutputstream.size() > 0)
        {
            return bytearrayoutputstream.toByteArray();
        }
        break MISSING_BLOCK_LABEL_378;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
        return null;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private static byte[] a(ByteArrayInputStream bytearrayinputstream, SparseArray sparsearray)
    {
        int i;
        bytearrayinputstream.mark(1);
        i = bytearrayinputstream.read();
        bytearrayinputstream.reset();
        i &= 0xff;
        if (i >= 32) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        i = d(bytearrayinputstream);
        j = bytearrayinputstream.available();
        bytearrayinputstream.mark(1);
        k = bytearrayinputstream.read();
        bytearrayinputstream.reset();
        k &= 0xff;
        if (k < 32 || k > 127) goto _L4; else goto _L3
_L3:
        byte abyte0[] = a(bytearrayinputstream, 0);
_L19:
        j = i - (j - bytearrayinputstream.available());
        if (j <= 0) goto _L6; else goto _L5
_L5:
        Integer integer;
        integer = Integer.valueOf(j);
        k = bytearrayinputstream.available();
        i = integer.intValue();
_L18:
        if (i <= 0) goto _L8; else goto _L7
_L7:
        int l;
        l = bytearrayinputstream.read();
        i--;
        l;
        JVM INSTR lookupswitch 7: default 204
    //                   129: 446
    //                   131: 295
    //                   133: 585
    //                   137: 295
    //                   138: 400
    //                   151: 585
    //                   153: 400;
           goto _L9 _L10 _L11 _L12 _L11 _L13 _L12 _L13
_L9:
        if (-1 == b(bytearrayinputstream, i))
        {
            Log.e("PduParser", "Corrupt Content-Type");
        } else
        {
            i = 0;
        }
          goto _L14
_L4:
        if (k <= 127) goto _L16; else goto _L15
_L14:
        if (true) goto _L18; else goto _L17
_L17:
_L15:
        k = bytearrayinputstream.read() & 0x7f;
        if (k < acm.a.length)
        {
            abyte0 = acm.a[k].getBytes();
        } else
        {
            bytearrayinputstream.reset();
            abyte0 = a(bytearrayinputstream, 0);
        }
          goto _L19
_L16:
        Log.e("PduParser", "Corrupt content-type");
        abyte0 = acm.a[0].getBytes();
_L21:
        return abyte0;
_L11:
        bytearrayinputstream.mark(1);
        i = f(bytearrayinputstream);
        bytearrayinputstream.reset();
        if (i > 127)
        {
            i = bytearrayinputstream.read() & 0x7f;
            if (i < acm.a.length)
            {
                sparsearray.put(131, acm.a[i].getBytes());
            }
        } else
        {
            byte abyte1[] = a(bytearrayinputstream, 0);
            if (abyte1 != null && sparsearray != null)
            {
                sparsearray.put(131, abyte1);
            }
        }
        i = bytearrayinputstream.available();
        i = integer.intValue() - (k - i);
          goto _L18
_L13:
        byte abyte2[] = a(bytearrayinputstream, 0);
        if (abyte2 != null && sparsearray != null)
        {
            sparsearray.put(153, abyte2);
        }
        i = bytearrayinputstream.available();
        i = integer.intValue() - (k - i);
          goto _L18
_L10:
        bytearrayinputstream.mark(1);
        i = f(bytearrayinputstream);
        bytearrayinputstream.reset();
        if (i > 32 && i < 127 || i == 0)
        {
            byte abyte3[] = a(bytearrayinputstream, 0);
            try
            {
                sparsearray.put(129, Integer.valueOf(aca.a(new String(abyte3))));
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                Log.e("PduParser", Arrays.toString(abyte3), unsupportedencodingexception);
                sparsearray.put(129, Integer.valueOf(0));
            }
        } else
        {
            i = (int)h(bytearrayinputstream);
            if (sparsearray != null)
            {
                sparsearray.put(129, Integer.valueOf(i));
            }
        }
        i = bytearrayinputstream.available();
        i = integer.intValue() - (k - i);
          goto _L18
_L12:
        byte abyte4[] = a(bytearrayinputstream, 0);
        if (abyte4 != null && sparsearray != null)
        {
            sparsearray.put(151, abyte4);
        }
        i = bytearrayinputstream.available();
        i = integer.intValue() - (k - i);
          goto _L18
_L8:
        if (i != 0)
        {
            Log.e("PduParser", "Corrupt Content-Type");
        }
_L6:
        if (j >= 0) goto _L21; else goto _L20
_L20:
        Log.e("PduParser", "Corrupt MMS message");
        return acm.a[0].getBytes();
_L2:
        if (i <= 127)
        {
            return a(bytearrayinputstream, 0);
        }
        return acm.a[bytearrayinputstream.read() & 0x7f].getBytes();
          goto _L18
    }

    private static int b(ByteArrayInputStream bytearrayinputstream, int i)
    {
        int k = bytearrayinputstream.read(new byte[i], 0, i);
        int j = k;
        if (k < i)
        {
            j = -1;
        }
        return j;
    }

    private static ach b(ByteArrayInputStream bytearrayinputstream)
    {
        ach ach1;
        int j;
        int k;
        if (bytearrayinputstream == null)
        {
            return null;
        }
        k = c(bytearrayinputstream);
        ach1 = new ach();
        j = 0;
_L13:
        byte abyte0[];
        int i;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        int l = c(bytearrayinputstream);
        i = c(bytearrayinputstream);
        abyte0 = new acp();
        int i1 = bytearrayinputstream.available();
        if (i1 <= 0)
        {
            return null;
        }
        Object obj = new SparseArray();
        byte abyte2[] = a(bytearrayinputstream, ((SparseArray) (obj)));
        if (abyte2 != null)
        {
            abyte0.e(abyte2);
        } else
        {
            abyte0.e(acm.a[0].getBytes());
        }
        abyte2 = (byte[])((SparseArray) (obj)).get(151);
        if (abyte2 != null)
        {
            abyte0.g(abyte2);
        }
        obj = (Integer)((SparseArray) (obj)).get(129);
        if (obj != null)
        {
            abyte0.a(((Integer) (obj)).intValue());
        }
        l -= i1 - bytearrayinputstream.available();
        if (l > 0)
        {
            if (!a(bytearrayinputstream, abyte0, l))
            {
                return null;
            }
        } else
        if (l < 0)
        {
            return null;
        }
        if (abyte0.e() == null && abyte0.i() == null && abyte0.j() == null && abyte0.c() == null)
        {
            abyte0.c(Long.toOctalString(System.currentTimeMillis()).getBytes());
        }
        if (i <= 0) goto _L2; else goto _L1
_L1:
        Object obj1;
        byte abyte3[];
        abyte3 = new byte[i];
        obj1 = new String(abyte0.g());
        bytearrayinputstream.read(abyte3, 0, i);
        if (!((String) (obj1)).equalsIgnoreCase("application/vnd.wap.multipart.alternative")) goto _L4; else goto _L3
_L3:
        obj1 = b(new ByteArrayInputStream(abyte3)).a(0);
_L10:
        boolean flag;
        if (d == null && e == null)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        if (e != null)
        {
            abyte0 = ((acp) (obj1)).c();
            byte abyte4[];
            String s;
            if (abyte0 != null && Arrays.equals(e, abyte0))
            {
                flag = false;
            } else
            {
                flag = true;
            }
        } else
        {
            if (d == null)
            {
                break MISSING_BLOCK_LABEL_455;
            }
            byte abyte1[] = ((acp) (obj1)).g();
            if (abyte1 == null || !Arrays.equals(d, abyte1))
            {
                break MISSING_BLOCK_LABEL_455;
            }
            flag = false;
        }
_L11:
        if (!flag)
        {
            ach1.b(((acp) (obj1)));
        } else
        {
            ach1.a(((acp) (obj1)));
        }
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        abyte4 = abyte0.h();
        obj1 = abyte3;
        if (abyte4 == null) goto _L6; else goto _L5
_L5:
        s = new String(abyte4);
        if (!s.equalsIgnoreCase("base64")) goto _L8; else goto _L7
_L7:
        obj1 = abz.a(abyte3);
_L6:
        if (obj1 == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L8:
        obj1 = abyte3;
        if (s.equalsIgnoreCase("quoted-printable"))
        {
            obj1 = acs.a(abyte3);
        }
        if (true) goto _L6; else goto _L9
_L9:
        abyte0.a(((byte []) (obj1)));
_L2:
        obj1 = abyte0;
          goto _L10
        flag = true;
          goto _L11
        return ach1;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private static int c(ByteArrayInputStream bytearrayinputstream)
    {
        int j = 0;
        int k = bytearrayinputstream.read();
        int i = k;
        if (k == -1)
        {
            return k;
        }
        while ((i & 0x80) != 0) 
        {
            j = j << 7 | i & 0x7f;
            int l = bytearrayinputstream.read();
            i = l;
            if (l == -1)
            {
                return l;
            }
        }
        return i & 0x7f | j << 7;
    }

    private static int d(ByteArrayInputStream bytearrayinputstream)
    {
        int i = bytearrayinputstream.read() & 0xff;
        if (i <= 30)
        {
            return i;
        }
        if (i == 31)
        {
            return c(bytearrayinputstream);
        } else
        {
            throw new RuntimeException("Value length > LENGTH_QUOTE!");
        }
    }

    private static acc e(ByteArrayInputStream bytearrayinputstream)
    {
        bytearrayinputstream.mark(1);
        int i = bytearrayinputstream.read() & 0xff;
        if (i == 0)
        {
            return null;
        }
        bytearrayinputstream.reset();
        if (i < 32)
        {
            d(bytearrayinputstream);
            i = bytearrayinputstream.read() & 0x7f;
        } else
        {
            i = 0;
        }
        bytearrayinputstream = a(bytearrayinputstream, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        return new acc(i, bytearrayinputstream);
        bytearrayinputstream = new acc(bytearrayinputstream);
        return bytearrayinputstream;
        bytearrayinputstream;
        return null;
    }

    private static int f(ByteArrayInputStream bytearrayinputstream)
    {
        return bytearrayinputstream.read() & 0xff;
    }

    private static long g(ByteArrayInputStream bytearrayinputstream)
    {
        int j = bytearrayinputstream.read() & 0xff;
        if (j > 8)
        {
            throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
        }
        long l = 0L;
        for (int i = 0; i < j; i++)
        {
            l = (l << 8) + (long)(bytearrayinputstream.read() & 0xff);
        }

        return l;
    }

    private static long h(ByteArrayInputStream bytearrayinputstream)
    {
        bytearrayinputstream.mark(1);
        int i = bytearrayinputstream.read();
        bytearrayinputstream.reset();
        if (i > 127)
        {
            return (long)(bytearrayinputstream.read() & 0x7f);
        } else
        {
            return g(bytearrayinputstream);
        }
    }

    public acd a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        acn acn1;
        int i;
        b = a(a);
        if (b == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = b.a(140);
        acn1 = b;
        if (acn1 == null)
        {
            i = 0;
        } else
        {
label0:
            {
                i = acn1.a(140);
                if (acn1.a(141) != 0)
                {
                    break label0;
                }
                i = 0;
            }
        }
_L5:
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (128 != j && 132 != j)
        {
            break; /* Loop/switch isn't completed */
        }
        c = b(a);
        if (c == null) goto _L1; else goto _L3
_L3:
        switch (j)
        {
        default:
            return null;

        case 128: 
            return new acx(b, c);

        case 129: 
            return new acw(b);

        case 130: 
            return new acf(b);

        case 131: 
            return new acg(b);

        case 132: 
            acv acv1 = new acv(b, c);
            byte abyte0[] = acv1.g();
            if (abyte0 != null)
            {
                String s = new String(abyte0);
                if (s.equals("application/vnd.wap.multipart.mixed") || s.equals("application/vnd.wap.multipart.related") || s.equals("application/vnd.wap.multipart.alternative"))
                {
                    return acv1;
                }
                if (s.equals("application/vnd.wap.multipart.alternative"))
                {
                    acp acp1 = c.a(0);
                    c.a();
                    c.b(acp1);
                    return acv1;
                }
            }
            break;

        case 134: 
            return new acb(b);

        case 133: 
            return new aby(b);

        case 136: 
            return new act(b);

        case 135: 
            return new acu(b);
        }
        continue; /* Loop/switch isn't completed */
label1:
        {
            switch (i)
            {
            default:
                i = 0;
                break label1;

            case 128: 
                if (acn1.b(132) == null)
                {
                    i = 0;
                } else
                if (acn1.c(137) == null)
                {
                    i = 0;
                } else
                {
                    if (acn1.b(152) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 129: 
                if (acn1.a(146) == 0)
                {
                    i = 0;
                } else
                {
                    if (acn1.b(152) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 130: 
                if (acn1.b(131) == null)
                {
                    i = 0;
                } else
                if (-1L == acn1.e(136))
                {
                    i = 0;
                } else
                if (acn1.b(138) == null)
                {
                    i = 0;
                } else
                if (-1L == acn1.e(142))
                {
                    i = 0;
                } else
                {
                    if (acn1.b(152) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 131: 
                if (acn1.a(149) == 0)
                {
                    i = 0;
                } else
                {
                    if (acn1.b(152) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 132: 
                if (acn1.b(132) == null)
                {
                    i = 0;
                } else
                {
                    if (-1L != acn1.e(133))
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 134: 
                if (-1L == acn1.e(133))
                {
                    i = 0;
                } else
                if (acn1.b(139) == null)
                {
                    i = 0;
                } else
                if (acn1.a(149) == 0)
                {
                    i = 0;
                } else
                {
                    if (acn1.d(151) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 133: 
                if (acn1.b(152) != null)
                {
                    break label1;
                }
                i = 0;
                break;

            case 136: 
                if (-1L == acn1.e(133))
                {
                    i = 0;
                } else
                if (acn1.c(137) == null)
                {
                    i = 0;
                } else
                if (acn1.b(139) == null)
                {
                    i = 0;
                } else
                if (acn1.a(155) == 0)
                {
                    i = 0;
                } else
                {
                    if (acn1.d(151) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;

            case 135: 
                if (acn1.c(137) == null)
                {
                    i = 0;
                } else
                if (acn1.b(139) == null)
                {
                    i = 0;
                } else
                if (acn1.a(155) == 0)
                {
                    i = 0;
                } else
                {
                    if (acn1.d(151) != null)
                    {
                        break label1;
                    }
                    i = 0;
                }
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        i = 1;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L1; else goto _L6
_L6:
    }

}
