// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kwj;
import kwk;
import kwm;
import kwq;
import kws;

public final class clear extends kwm
{

    private static volatile isInviterTrusted _emptyArray[];
    public Integer invitationType;
    public String inviterGaiaId;
    public String inviterPhoneNumber;
    public String inviterProfileName;
    public Boolean isGroupInvitation;
    public Boolean isInviterPstnParticipant;
    public Boolean isInviterTrusted;
    public String phoneNumber;
    public Boolean shouldAutoAccept;
    public Long timestamp;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kwq.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kwj kwj1)
    {
        return (new <init>()).mergeFrom(kwj1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kws.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        timestamp = null;
        inviterGaiaId = null;
        invitationType = null;
        inviterProfileName = null;
        shouldAutoAccept = null;
        phoneNumber = null;
        inviterPhoneNumber = null;
        isInviterPstnParticipant = null;
        isGroupInvitation = null;
        isInviterTrusted = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + kwk.e(1, timestamp.longValue()) + kwk.b(2, inviterGaiaId);
        int i = j;
        if (invitationType != null)
        {
            i = j + kwk.e(3, invitationType.intValue());
        }
        j = i;
        if (inviterProfileName != null)
        {
            j = i + kwk.b(4, inviterProfileName);
        }
        i = j;
        if (shouldAutoAccept != null)
        {
            shouldAutoAccept.booleanValue();
            i = j + (kwk.f(5) + 1);
        }
        j = i;
        if (phoneNumber != null)
        {
            j = i + kwk.b(6, phoneNumber);
        }
        i = j;
        if (inviterPhoneNumber != null)
        {
            i = j + kwk.b(7, inviterPhoneNumber);
        }
        j = i;
        if (isInviterPstnParticipant != null)
        {
            isInviterPstnParticipant.booleanValue();
            j = i + (kwk.f(8) + 1);
        }
        i = j;
        if (isGroupInvitation != null)
        {
            isGroupInvitation.booleanValue();
            i = j + (kwk.f(9) + 1);
        }
        j = i;
        if (isInviterTrusted != null)
        {
            isInviterTrusted.booleanValue();
            j = i + (kwk.f(10) + 1);
        }
        return j;
    }

    public isInviterTrusted mergeFrom(kwj kwj1)
    {
_L13:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   18: 129
    //                   24: 140
    //                   34: 186
    //                   40: 197
    //                   50: 211
    //                   58: 222
    //                   64: 233
    //                   72: 247
    //                   80: 261;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        timestamp = Long.valueOf(kwj1.e());
          goto _L13
_L4:
        inviterGaiaId = kwj1.j();
          goto _L13
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            invitationType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        inviterProfileName = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L7:
        shouldAutoAccept = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L8:
        phoneNumber = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        inviterPhoneNumber = kwj1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        isInviterPstnParticipant = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L11:
        isGroupInvitation = Boolean.valueOf(kwj1.i());
        continue; /* Loop/switch isn't completed */
_L12:
        isInviterTrusted = Boolean.valueOf(kwj1.i());
        if (true) goto _L13; else goto _L14
_L14:
    }

    public volatile kws mergeFrom(kwj kwj1)
    {
        return mergeFrom(kwj1);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.b(1, timestamp.longValue());
        kwk1.a(2, inviterGaiaId);
        if (invitationType != null)
        {
            kwk1.a(3, invitationType.intValue());
        }
        if (inviterProfileName != null)
        {
            kwk1.a(4, inviterProfileName);
        }
        if (shouldAutoAccept != null)
        {
            kwk1.a(5, shouldAutoAccept.booleanValue());
        }
        if (phoneNumber != null)
        {
            kwk1.a(6, phoneNumber);
        }
        if (inviterPhoneNumber != null)
        {
            kwk1.a(7, inviterPhoneNumber);
        }
        if (isInviterPstnParticipant != null)
        {
            kwk1.a(8, isInviterPstnParticipant.booleanValue());
        }
        if (isGroupInvitation != null)
        {
            kwk1.a(9, isGroupInvitation.booleanValue());
        }
        if (isInviterTrusted != null)
        {
            kwk1.a(10, isInviterTrusted.booleanValue());
        }
        super.writeTo(kwk1);
    }

    public Q()
    {
        clear();
    }
}
