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

    private static volatile startType _emptyArray[];
    public String appId;
    public String startData;
    public Integer startType;

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
        appId = null;
        startData = null;
        startType = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (appId != null)
        {
            i = j + kwk.b(1, appId);
        }
        j = i;
        if (startData != null)
        {
            j = i + kwk.b(2, startData);
        }
        i = j;
        if (startType != null)
        {
            i = j + kwk.e(3, startType.intValue());
        }
        return i;
    }

    public startType mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 70
    //                   24: 81;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        appId = kwj1.j();
          goto _L6
_L4:
        startData = kwj1.j();
          goto _L6
_L5:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            startType = Integer.valueOf(j);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public volatile kws mergeFrom(kwj kwj1)
    {
        return mergeFrom(kwj1);
    }

    public void writeTo(kwk kwk1)
    {
        if (appId != null)
        {
            kwk1.a(1, appId);
        }
        if (startData != null)
        {
            kwk1.a(2, startData);
        }
        if (startType != null)
        {
            kwk1.a(3, startType.intValue());
        }
        super.writeTo(kwk1);
    }

    public ()
    {
        clear();
    }
}
